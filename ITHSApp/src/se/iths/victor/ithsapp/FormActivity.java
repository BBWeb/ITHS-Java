package se.iths.victor.ithsapp;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends ActionBarActivity {
	private Button saveButton;
	private EditText nameEdit;
	private EditText birthYearEdit;
	private EditText occupationEdit;
	private EditText phoneNumberEdit;
	private PersonModel person;
	private Uri newPhoto;
	
	private static final int REQUEST_CODE_IMAGE = 100;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        
        nameEdit = (EditText) findViewById(R.id.name_edit);
        birthYearEdit = (EditText) findViewById(R.id.birth_year_edit);
        occupationEdit = (EditText) findViewById(R.id.occupation_edit);
        phoneNumberEdit = (EditText) findViewById(R.id.phone_number_edit);
        
        person = new PersonModel(getSharedPreferences(PersonModel.PREFERENCES, 0));
        
        nameEdit.setText(person.getName());
        birthYearEdit.setText(person.getBirthYear());
        occupationEdit.setText(person.getOccupation());
        phoneNumberEdit.setText(person.getPhoneNumber());
        
        saveButton = (Button) findViewById(R.id.save_button);
        saveButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				person.setName(nameEdit.getEditableText().toString());
				person.setBirthYear(birthYearEdit.getEditableText().toString());
				person.setOccupation(occupationEdit.getEditableText().toString());
				person.setPhoneNumber(phoneNumberEdit.getEditableText().toString());
				
				person.save();
				FormActivity.this.finish();
			}
        	
        });
        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.form_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    		case R.id.action_camera:
    			Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    			newPhoto = Uri.fromFile(createImageFile());
    			cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, newPhoto);
    			startActivityForResult(cameraIntent, REQUEST_CODE_IMAGE);
    			return true;
    		default:
    			return super.onOptionsItemSelected(item);
    	}
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	if(requestCode == REQUEST_CODE_IMAGE) {
    		if(resultCode == RESULT_OK) {;
    			File file = new File(person.getPicture().getPath());
    			file.delete();
    			person.setUri(newPhoto);
    			person.save();
    		}
    	}
    }
    
    private File createImageFile() {
        // Create an image file name
    	File storDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "ITHSpics");
    	
    	if(!storDir.exists()) {
    		if(!storDir.mkdirs()) {
    			Log.d("CAMERA", "Failed to create directory");
    		}
    	}
    	
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "iths" + timeStamp;
		try {
			File image = File.createTempFile(imageFileName, ".jpeg", storDir);
			return image;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
}

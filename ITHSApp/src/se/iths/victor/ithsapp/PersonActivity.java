package se.iths.victor.ithsapp;

import java.io.File;
import java.io.IOException;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonActivity extends ActionBarActivity {
	private PersonModel person;
	private TextView nameText;
	private TextView birthYearText;
	private TextView occupationText;
	private TextView phoneNumberText;
	private ImageView profileImage;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        
        nameText = (TextView) findViewById(R.id.name);
        birthYearText = (TextView) findViewById(R.id.birth_year);
        occupationText = (TextView) findViewById(R.id.occupation);
        phoneNumberText = (TextView) findViewById(R.id.phone_number);
        profileImage = (ImageView) findViewById(R.id.profile_image);
        
        if(Transfer.getInstance().getCurrentPerson() != null) {
        	person = Transfer.getInstance().getCurrentPerson();
        	Transfer.getInstance().setCurrentPerson(null);
        } else {
        	person = new PersonModel(-1, "", "", "", "", Uri.parse(""));
        }
        
    }

    @Override
    protected void onResume() {
    	super.onResume();
    	
        nameText.setText(person.getName());
        birthYearText.setText(person.getBirthYear());
        occupationText.setText(person.getOccupation());
        phoneNumberText.setText(person.getPhoneNumber());
        
        if(!person.getPicture().toString().equals("")) {
        	File file = new File(person.getPicture().getPath());
    		BitmapFactory.Options options = new BitmapFactory.Options();
    		options.inSampleSize = 4;
    		Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    		
    		try {
    			ExifInterface exif = new ExifInterface(file.getAbsolutePath());
    			int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
    			Matrix matrix = new Matrix();
    			if(orientation == 3) {
    				matrix.postRotate(180);
    			} else if(orientation == 6) {
    				matrix.postRotate(90);
    			} else if(orientation == 8) {
    				matrix.postRotate(-90);
    			}
    			bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    		} catch (IOException e) {
    			e.printStackTrace();
    		}

    		profileImage.setImageBitmap(bitmap);
        }
        
		
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.iths_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    		case R.id.action_change_profile:
    			Intent intent = new Intent(PersonActivity.this, FormActivity.class);
    			Transfer.getInstance().setCurrentPerson(person);
    			startActivity(intent);
    			return true;
    		default:
    			return super.onOptionsItemSelected(item);
    	}
    }
    
}

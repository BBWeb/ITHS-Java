package se.iths.victor.ithsapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends Activity {
	private Button saveButton;
	private EditText nameEdit;
	private EditText birthYearEdit;
	private EditText occupationEdit;
	private EditText phoneNumberEdit;
	private PersonModel person;
	
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
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_form, menu);
        return true;
    }
}

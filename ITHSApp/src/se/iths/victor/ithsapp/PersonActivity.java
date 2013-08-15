package se.iths.victor.ithsapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class PersonActivity extends ActionBarActivity {
	private PersonModel person;
	private TextView nameText;
	private TextView birthYearText;
	private TextView occupationText;
	private TextView phoneNumberText;
	private Button changeButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        
        nameText = (TextView) findViewById(R.id.name);
        birthYearText = (TextView) findViewById(R.id.birth_year);
        occupationText = (TextView) findViewById(R.id.occupation);
        phoneNumberText = (TextView) findViewById(R.id.phone_number);
        
        person = new PersonModel(getSharedPreferences(PersonModel.PREFERENCES, 0));
    }

    @Override
    protected void onResume() {
    	super.onResume();
    	
    	person.fetch();
    	
        nameText.setText(person.getName());
        birthYearText.setText(person.getBirthYear());
        occupationText.setText(person.getOccupation());
        phoneNumberText.setText(person.getPhoneNumber());
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
    			startActivity(intent);
    			return true;
    		default:
    			return super.onOptionsItemSelected(item);
    	}
    }
    
}

package se.iths.victor.ithsapp;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class ContactsActivity extends ListActivity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        
        ArrayList<PersonModel> persons = PersonModel.loadPersons(this);
        ITHSAdapter adapter = new ITHSAdapter(this, R.layout.contact_item, persons);
        setListAdapter(adapter);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.contacts_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	ArrayList<PersonModel> persons = PersonModel.loadPersons(this);
    	ITHSAdapter adapter = new ITHSAdapter(this, R.layout.contact_item, persons);
        setListAdapter(adapter);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    		case R.id.action_change_profile:
    			Intent intent = new Intent(ContactsActivity.this, FormActivity.class);
    			startActivity(intent);
    			return true;
    		default:
    			return super.onOptionsItemSelected(item);
    	}
    }

}

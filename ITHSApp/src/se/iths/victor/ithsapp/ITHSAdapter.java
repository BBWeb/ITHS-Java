package se.iths.victor.ithsapp;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ITHSAdapter extends ArrayAdapter<PersonModel> {
	private ArrayList<PersonModel> persons;
	private Activity activity;

	public ITHSAdapter(Activity activity, int textViewResourceId, ArrayList<PersonModel> persons) {
		super(activity, textViewResourceId, persons);
		this.persons = persons;
		this.activity = activity;
	}
	
	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		if(convertView == null) {
			convertView = activity.getLayoutInflater().inflate(R.layout.contact_item, null);
		}
		
		convertView.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(activity, PersonActivity.class);
				Transfer.getInstance().setCurrentPerson(persons.get(position));
				activity.startActivity(intent);
			}
		});
		
		TextView name = (TextView) convertView.findViewById(R.id.name);
		name.setText(persons.get(position).getName());
		
		return convertView;
	}

}

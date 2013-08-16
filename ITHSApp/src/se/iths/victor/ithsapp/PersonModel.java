package se.iths.victor.ithsapp;

import java.net.URI;

import android.content.SharedPreferences;
import android.net.Uri;

public class PersonModel {
	private String name;
	private String birthYear;
	private String occupation;
	private String phoneNumber; // So we can use +
	private SharedPreferences sharedPreferences; // so we can save
	private Uri picture;
	
	public static final String NAME = "NAME";
	public static final String BIRTH_YEAR = "BIRTH_YEAR";
	public static final String OCCUPATION = "OCCUPATION";
	public static final String PHONE_NUMBER = "PHONE_NUMBER";
	public static final String PICTURE = "PICTURE";
	public static final String PREFERENCES = "PERSON";
	
	public PersonModel(SharedPreferences sharedPreferences) {
		this.sharedPreferences = sharedPreferences;
		fetch();
	}

	public void save() {
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString(NAME, name);
		editor.putString(BIRTH_YEAR, birthYear);
		editor.putString(OCCUPATION, occupation);
		editor.putString(PHONE_NUMBER, phoneNumber);
		editor.putString(PICTURE, picture.toString());
		
		// To actually save things
		editor.commit();
	}
	
	public Uri getPicture() {
		return picture;
	}
	
	public void setUri(Uri picture) {
		this.picture = picture;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void fetch() {
		name = sharedPreferences.getString(NAME, "");
		birthYear = sharedPreferences.getString(BIRTH_YEAR, "2000");
		occupation = sharedPreferences.getString(OCCUPATION, "");
		phoneNumber = sharedPreferences.getString(PHONE_NUMBER, "");
		picture = Uri.parse(sharedPreferences.getString(PICTURE, ""));
	}
	
	
}

package se.iths.victor.ithsapp;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class PersonModel {
	private int id;
	private String name;
	private String birthYear;
	private String occupation;
	private String phoneNumber; // So we can use +
	private Uri picture;
	
	public static final String NAME = "NAME";
	public static final String BIRTH_YEAR = "BIRTH_YEAR";
	public static final String OCCUPATION = "OCCUPATION";
	public static final String PHONE_NUMBER = "PHONE_NUMBER";
	public static final String PICTURE = "PICTURE";
	public static final String PREFERENCES = "PERSON";
	
	public static final String GET_PERSONS = "SELECT rowid,* FROM persons;";
	
	public PersonModel(int id, String name, String birthYear, String occupation, String phoneNumber, Uri picture) {
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.occupation = occupation;
		this.phoneNumber = phoneNumber;
		this.picture = picture;
	}
	
	public static ArrayList<PersonModel> loadPersons(Context context) {
		ArrayList<PersonModel> persons = new ArrayList<PersonModel>();
		DBHelper dbHelper = new DBHelper(context);
		SQLiteDatabase db = dbHelper.getReadableDatabase();
		
		Cursor result = db.rawQuery(GET_PERSONS, null);
		
		if(result.getCount() > 0) {
			result.moveToFirst();
			do {
				persons.add(new PersonModel(result.getInt(0),
											result.getString(1),
											result.getString(2),
											result.getString(3),
											result.getString(4),
											Uri.parse(result.getString(5))));
			} while(result.moveToNext());
		}
		
		result.close();
		db.close();
		return persons;
	}
	
	public void save(Context context) {
		DBHelper dbHelper = new DBHelper(context);
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		
		if(id == -1) {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append("INSERT INTO persons (name, birthYear, occupation, phoneNumber, picture)");
			strBuilder.append(" VALUES(\"" + name + "\",\"" + birthYear + "\",\"");
			strBuilder.append(occupation + "\",\"" + phoneNumber + "\",\"" + picture.toString() + "\");");
			db.execSQL(strBuilder.toString());
			
			Cursor result = db.rawQuery("select last_insert_rowid()", null);
			result.moveToFirst();
			id = result.getInt(0);
			result.close();
		} else {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append("UPDATE persons SET");
			strBuilder.append(" name = \"" + name + "\", birthYear = \"" + birthYear + "\",");
			strBuilder.append(" occupation = \"" + occupation + "\", phoneNumber = \"" + phoneNumber + "\", picture = \"" + picture.toString() + "\"");
			strBuilder.append(" WHERE rowid = " + id);
			db.execSQL(strBuilder.toString());
		}
		
		db.close();
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

}

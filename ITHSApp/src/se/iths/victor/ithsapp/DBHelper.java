package se.iths.victor.ithsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
	private final static String CREATE_TABLES = "CREATE TABLE persons (" +
												"name VARCHAR(64), " +
												"birthYear VARCHAR(4), " + 
												"occupation VARCHAR(20), " +
												"phoneNumber VARCHAR(20), " + 
												"picture VARCHAR(255) );"; 
	
	public DBHelper(Context context) {
		super(context, "ITHSAppDB", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_TABLES);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}

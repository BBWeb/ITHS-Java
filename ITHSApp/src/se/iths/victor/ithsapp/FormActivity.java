package se.iths.victor.ithsapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FormActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_form, menu);
        return true;
    }
}

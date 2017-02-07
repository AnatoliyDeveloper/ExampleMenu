package com.devandroid.examplemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_items, menu);

		return true;
	}

	public void onAbout(MenuItem item){
		Toast.makeText(this, "About author", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()){

			case R.id.settings:
				Toast.makeText(this, "You choose Settings", Toast.LENGTH_SHORT).show();
				return true;

//			case R.id.about:
//				Toast.makeText(this, "You choose About author", Toast.LENGTH_SHORT).show();
//				return true;

			case R.id.site:
				Toast.makeText(this, "You choose Site", Toast.LENGTH_SHORT).show();
				return true;

		}

		return super.onOptionsItemSelected(item);
	}
}

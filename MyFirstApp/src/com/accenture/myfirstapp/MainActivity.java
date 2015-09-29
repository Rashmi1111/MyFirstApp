package com.accenture.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	Button Login;
	EditText Name,Password;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Login = (Button)findViewById(R.id.button1);
		Name = (EditText)findViewById(R.id.editText1);
		Password = (EditText)findViewById(R.id.editText2);
		
		}
	
	public void OnClickLogin(View view){
		
		if(Name.getText().toString().equals("user") && Password.getText().toString().equals("123") ){
			
			Intent intent = new Intent(this,SecondActivity.class);
			startActivity(intent);
			
		}
		else{
			Toast.makeText(this,"Wrong Credentials",Toast.LENGTH_LONG).show();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

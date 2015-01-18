package com.example.apa;


import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
//import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	static final String str="This is Logcat";
	ActionBar ab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ismis);
		//ab = getActionBar();
		//ab.hide();
	}

	public void clicked(View v){
		setContentView(R.layout.sample_form);
	}
	public void clicked2(View v){
		setContentView(R.layout.ismis);
	}
	

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("Im in ","on destroy");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("Im in ","on pause");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("Im in ","on restart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("Im in ","on resume");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d("Im in ","on start");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("Im in ","on stop");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void handle(View v){
		Toast.makeText(this, "Toast Short Length", Toast.LENGTH_SHORT).show();
	}
	
	public void handle2(View v){
		Toast t = Toast.makeText(this, "Toast Long Length", Toast.LENGTH_LONG);
		t.setGravity(Gravity.CENTER, 0, 0);
		t.show();
	}
	
	public void handleItem1(){
		Toast.makeText(this, "Say Hello!", Toast.LENGTH_SHORT).show();
	}
	
	public void handleItem2(){
		Toast.makeText(this, "They ain't us coz they hate us!", Toast.LENGTH_SHORT).show();
	}
	
	public void handleItem3(){
		Toast.makeText(this, "Android is awesome!", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.item1:
	        	handleItem1();
	        	return true;
	        case R.id.item2:
	        	handleItem2();
	        	return true;
	        case R.id.item3:
	        	handleItem3();
	        	return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

}

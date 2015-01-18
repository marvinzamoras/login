package com.example.apa;

import android.app.Application;
import android.util.Log;

public class AppController extends Application{
	@Override
	public void onCreate(){
		super.onCreate();
	}
	
	public void displayLog(){
		Log.d("Hi ","Hello D");
		Log.e("Hi ","Hello E");
		Log.w("Hi ","Hello W");
		Log.v("Hi ","Hello V");
		Log.i("Hi ","Hello I");
	}
	
	
}

package com.vinilearning.thovn.start;

import com.vinilearning.thovn.factory.ThoFactory;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				ThoFactory thoFactory = ThoFactory.getInstance(SplashScreen.this);
				thoFactory.generation100ThoVn();
			}
		}, 1500);
	}
}

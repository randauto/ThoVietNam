package com.vinilearning.thovn.start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.vinilearning.thovn.MainActivity;
import com.vinilearning.thovn.factory.ThoFactory;

public class SplashScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				ThoFactory thoFactory = ThoFactory
						.getInstance(SplashScreen.this);
				ThoFactory.lstThoVn = thoFactory.generation100ThoVn();
				Log.i("Tong so","" + ThoFactory.lstThoVn.size());

				startActivity(new Intent(SplashScreen.this, MainActivity.class));

			}
		}, 1500);
	}
}

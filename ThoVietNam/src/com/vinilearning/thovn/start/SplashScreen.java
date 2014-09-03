package com.vinilearning.thovn.start;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import com.vinilearning.thovn.MainActivity;
import com.vinilearning.thovn.R;
import com.vinilearning.thovn.factory.ThoFactory;

public class SplashScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);

		TextView tv = (TextView) findViewById(R.id.textView1);
		try {
			PackageInfo pInfo = getPackageManager().getPackageInfo(
					getPackageName(), PackageManager.GET_META_DATA);
			String version = pInfo.versionName;
			tv.setText(getString(R.string.version) + "" + version);
		} catch (NameNotFoundException e1) {
			Log.e(this.getClass().getSimpleName(), "Name not found", e1);
		}

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				ThoFactory thoFactory = ThoFactory
						.getInstance(SplashScreen.this);
				ThoFactory.lstThoVn = thoFactory.generation100ThoVn();
				Log.i("Tong so", "" + ThoFactory.lstThoVn.size());

				startActivity(new Intent(SplashScreen.this, MainActivity.class));
				finish();
			}
		}, 1500);
	}
}

package com.vinilearning.thovn;

import android.app.Application;

import com.vinilearning.thovn.utils.T;

public class ThoApplication extends Application {
	public static boolean isDebug = false;

	@Override
	public void onCreate() {
		super.onCreate();
		T.init(this);
	}
}

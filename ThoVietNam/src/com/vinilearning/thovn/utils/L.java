package com.vinilearning.thovn.utils;

import android.util.Log;

import com.vinilearning.thovn.ThoApplication;

/**
 * The Class Log.
 */
public class L {

	private static final String TAG = "NFCDaily";

	public static void d(String tag, String msg) {
		if (ThoApplication.isDebug) {
			Log.d(tag, "" + msg);
		}
	}

	public static void d(String msg) {
		if (ThoApplication.isDebug) {
			Log.d(TAG, "" + msg);
		}
	}

	public static void i(String tag, String msg) {
		if (ThoApplication.isDebug) {
			Log.i(tag, "" + msg);
		}
	}

	public static void i(String msg) {
		if (ThoApplication.isDebug) {
			Log.i(TAG, "" + msg);
		}
	}

	public static void v(String tag, String msg) {
		if (ThoApplication.isDebug) {
			Log.v(tag, "" + msg);
		}
	}

	public static void v(String msg) {
		if (ThoApplication.isDebug) {
			Log.v(TAG, "" + msg);
		}
	}

	public static void w(String tag, String msg) {
		if (ThoApplication.isDebug) {
			Log.w(tag, "" + msg);
		}
	}

	public static void w(String msg) {
		if (ThoApplication.isDebug) {
			Log.w(TAG, "" + msg);
		}
	}

	public static void e(String tag, String msg) {
		if (ThoApplication.isDebug && !msg.contains("with a size of")) {
			Log.e(tag, "" + msg);
		}
	}

	public static void e(String msg) {
		if (ThoApplication.isDebug && !msg.contains("with a size of")) {
			Log.e(TAG, "" + msg);
		}
	}

}

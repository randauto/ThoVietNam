package com.vinilearning.finance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends ActionBarActivity {
	private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().requestFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
	}

	private void initView() {
		webView = (WebView) findViewById(R.id.webView);
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);

		webView.loadUrl("file:///android_asset/tralaisuat.html");
		webView.setWebViewClient(new InsideWebviewClient());
	}

	class InsideWebviewClient extends WebViewClient {

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			setProgressBarIndeterminateVisibility(true);
			return super.shouldOverrideUrlLoading(view, url);
		}

		@Override
		public void onPageFinished(WebView view, String url) {
			setProgressBarIndeterminateVisibility(false);
			super.onPageFinished(view, url);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		switch (id) {
		case R.id.action_about:
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(getString(R.string.about_us)));
			startActivity(i);
			break;

		case R.id.action_search:
			if (webView != null) {
				webView.loadUrl("file:///android_asset/tralaisuat.html");
			}
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}

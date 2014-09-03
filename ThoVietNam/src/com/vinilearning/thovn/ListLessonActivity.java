package com.vinilearning.thovn;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vinilearning.thovn.factory.ThoFactory;

public class ListLessonActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_lesson_layout);
		String values[] = new String[ThoFactory.lstThoVn.size()];
		for (int i = 0; i < ThoFactory.lstThoVn.size(); i++) {
			values[i] = getString(R.string.lesson) + (i + 1) + ": "
					+ ThoFactory.lstThoVn.get(i).getTenbai();
		}

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, values);

		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Intent intent = new Intent(ListLessonActivity.this, MainActivity.class);
		intent.putExtra("pos", position);
		setResult(RESULT_OK, intent);
		finish();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}

package com.xinyusoft.xinyusofthqlib.ui.select;

import com.xinyusoft.xinyusofthqlib.R;
import com.xinyusoft.xinyusofthqlib.R.id;
import com.xinyusoft.xinyusofthqlib.R.layout;
import com.xinyusoft.xinyusofthqlib.R.menu;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.EditText;

public class HistoryActivity extends Activity {
	EditText et_startTime;
	EditText et_endTime;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xinyusoft_activity_history);
		et_startTime = (EditText) findViewById(R.id.et_startTime);
		et_endTime = (EditText) findViewById(R.id.et_endTime);
		
		et_startTime.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 new DatePickerDialog(HistoryActivity.this,
						 new OnDateSetListener() {
							
							@Override
							public void onDateSet(DatePicker view, int year, int monthOfYear,
									int dayOfMonth) {
								// TODO Auto-generated method stub
								et_startTime.setText(year+"-"+monthOfYear+"-"+dayOfMonth);
							}
						},
						 2015,
						 1,
						 1).show();
			}
		});
	}

	
}

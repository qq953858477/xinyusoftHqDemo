package com.xinyusoft.xinyusofthqlib.ui.trade;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.xinyusoft.xinyusofthqlib.R;

/**
 * 交易的撤单
 * 
 * @author Administrator
 *
 */
public class TradeChedanActivity extends Activity implements View.OnClickListener {

	private RelativeLayout back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.xinyusoft_activity_trade_chedan);

		initView();
	}

	private void initView() {
		back = (RelativeLayout) findViewById(R.id.include_back);
		back.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if(id == R.id.include_back) {
			finish();
		}
	}
}

package com.xinyusoft.xinyusofthqlib.ui.trade;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.xinyusoft.xinyusofthqlib.R;

public class TradeCancelYumaiActivity extends Activity implements View.OnClickListener {

    private RelativeLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xinyusoft_activity_trade_cancel_yumai);

        inintView();
    }

    private void inintView() {
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

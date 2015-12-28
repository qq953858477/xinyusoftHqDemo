package com.xinyusoft.xinyusofthqlib.ui.trade;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xinyusoft.xinyusofthqlib.R;

public class TradeYinlianActivity extends Activity implements View.OnClickListener {

    private TextView btn_ok;
    private RadioButton rb_tosecurity;
    private RadioButton rb_tobank;
    private TextView tv_pwd;
    private EditText ed_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xinyusoft_activity_trade_yinlian);

        initView();
    }

    private void initView() {
        btn_ok = (TextView) findViewById(R.id.trade_yinlian_btn_ok);
        btn_ok.setOnClickListener(this);
        rb_tosecurity = (RadioButton) findViewById(R.id.trade_yinlian_tosecurity);
        rb_tosecurity.setOnClickListener(this);

        rb_tobank = (RadioButton) findViewById(R.id.trade_yinlian_tobank);
        rb_tobank.setOnClickListener(this);

        tv_pwd = (TextView) findViewById(R.id.trade_yinlian_tv_pwd);
        ed_pwd = (EditText) findViewById(R.id.trade_yinlian_ed_pwd);
        RelativeLayout back = (RelativeLayout) findViewById(R.id.include_back);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.trade_yinlian_btn_ok) {
            Toast.makeText(this,"点击了确定", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.trade_yinlian_tobank) {
            changeView();
        } else if(id == R.id.trade_yinlian_tosecurity) {
            changeView();
        } else if(id == R.id.include_back) {
            finish();
        }
    }

    private void changeView() {
        if(rb_tosecurity.isChecked()) {   //true代表获取焦点是银行转证券
            tv_pwd.setText("银行密码");
            ed_pwd.setHint("请输入银行密码");
        } else {
            tv_pwd.setText("资金密码");
            ed_pwd.setHint("请输入资金密码");
        }
    }
}

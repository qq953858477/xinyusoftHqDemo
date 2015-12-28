package com.xinyusoft.xinyusofthqlib.ui.trade;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xinyusoft.xinyusofthqlib.R;


public class TradeBuyOrSellActivity extends Activity implements OnClickListener {

    private static final int BUY_TYPE = 0;  //买
    private static final int SELL_TYPE = 1;  //卖
    private static final int YUMAI_TYPE = 2;  //预埋类型 因为只有一个界面，所以这个统筹为一个类型
    private static final int YUMAI_BUY_TYPE = 3;  //卖
    private static final int YUMAI_SELL_TYPE = 4;  //卖
    private RadioButton btn_buy; // 单选框 买
    private RadioButton btn_sell; // 单选框 卖
    private TextView tv_price; // 标题的股票价格
    private EditText ed_price; // edit 股票价格
    private TextView buyorsell_tv_shijia_wait; // 市价 显示的
    private TextView buyorsell_tv_shijia_ok; // 市价 隐藏的
    private TextView buyorsell_tv_count; // 标题的股票数量
    private EditText buyorsell_et_count; // edit 股票数量
    private TextView buyorsell_tv_max; // 最大可卖/买
    private TextView buyorsell_xiadan; // 下单的按钮
    private LinearLayout buyorsell_ll_shijia_wait;  //整体市价的布局，未点击（点击和未点击就是做个隐藏和不隐藏）
    private LinearLayout buyorsell_ll_shijia_ok;     //整体市价的布局，已点击
    private TextView yumaidan_cancel;
    private int type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xinyusoft_activity_trade_buyorsell);
        type = getIntent().getIntExtra("type", 0);
        initView();
        if (type == YUMAI_TYPE) {  //如果等于预埋类型，先加载预埋买
            changeType(YUMAI_BUY_TYPE);
        } else {
            changeType(type);
        }

    }

    private void changeType(int type) {
        if (type == SELL_TYPE) { // 从快速卖出进入，需要换界面
            btn_buy.setChecked(false);
            btn_buy.setTextColor(getResources().getColor(R.color.xinyusoft_buyorsell_noaml_radiobtn));
            btn_sell.setChecked(true);
            btn_sell.setTextColor(getResources().getColor(R.color.my_white));
            tv_price.setText("卖出价格");
            ed_price.setHint("请输入卖出价格");
            buyorsell_tv_shijia_wait.setText("市价卖出");
            buyorsell_tv_shijia_ok.setText("市价卖出");
            buyorsell_tv_count.setText("卖出数量");
            buyorsell_et_count.setHint("请输入卖出数量");
            buyorsell_tv_max.setText("最大可卖：");
            buyorsell_xiadan.setBackgroundResource(R.drawable.buyorsell_sell_btn);
            yumaidan_cancel.setVisibility(View.INVISIBLE);
        } else if (type == BUY_TYPE) {
            btn_buy.setChecked(true);
            btn_buy.setTextColor(getResources().getColor(R.color.my_white));
            btn_sell.setChecked(false);
            btn_sell.setTextColor(getResources().getColor(R.color.xinyusoft_buyorsell_noaml_radiobtn));
            tv_price.setText("买入价格");
            ed_price.setHint("请输入买入价格");
            buyorsell_tv_shijia_wait.setText("市价买入");
            buyorsell_tv_shijia_ok.setText("市价买入");
            buyorsell_tv_count.setText("买入数量");
            buyorsell_et_count.setHint("请输入买入数量");
            buyorsell_tv_max.setText("最大可买：");
            buyorsell_xiadan.setBackgroundResource(R.drawable.buyorsell_buy_btn);
            yumaidan_cancel.setVisibility(View.INVISIBLE);
        } else if (type == YUMAI_BUY_TYPE) {   //预埋买
            btn_buy.setChecked(true);
            btn_buy.setText("预埋买");
            btn_buy.setTextColor(getResources().getColor(R.color.my_white));
            btn_sell.setChecked(false);
            btn_sell.setText("预埋卖");
            btn_sell.setTextColor(getResources().getColor(R.color.xinyusoft_buyorsell_noaml_radiobtn));
            tv_price.setText("预埋价格");
            ed_price.setHint("请输入预埋价格");
            buyorsell_tv_shijia_wait.setText("市价预埋");
            buyorsell_tv_shijia_ok.setText("市价预埋");
            buyorsell_tv_count.setText("预埋数量");
            buyorsell_et_count.setHint("请输入预埋数量");
            buyorsell_tv_max.setText("最大预埋：");
            buyorsell_xiadan.setBackgroundResource(R.drawable.buyorsell_buy_btn);
            yumaidan_cancel.setVisibility(View.VISIBLE);
        } else if (type == YUMAI_SELL_TYPE) {  //预埋卖
            btn_buy.setChecked(false);
            btn_buy.setText("预埋买");
            btn_buy.setTextColor(getResources().getColor(R.color.xinyusoft_buyorsell_noaml_radiobtn));
            btn_sell.setChecked(true);
            btn_sell.setText("预埋卖");
            btn_sell.setTextColor(getResources().getColor(R.color.my_white));
            tv_price.setText("预埋价格");
            ed_price.setHint("请输入预埋价格");
            buyorsell_tv_shijia_wait.setText("市价预埋");
            buyorsell_tv_shijia_ok.setText("市价预埋");
            buyorsell_tv_count.setText("预埋数量");
            buyorsell_et_count.setHint("请输入预埋数量");
            buyorsell_tv_max.setText("最大预埋：");
            buyorsell_xiadan.setBackgroundResource(R.drawable.buyorsell_sell_btn);
            yumaidan_cancel.setVisibility(View.VISIBLE);
        }
    }

    private void initView() {
        btn_buy = (RadioButton) findViewById(R.id.buyorsell_buy_btn);
        btn_buy.setOnClickListener(this);
        btn_sell = (RadioButton) findViewById(R.id.buyorsell_sell_btn);
        btn_sell.setOnClickListener(this);
        tv_price = (TextView) findViewById(R.id.TextView1_price);
        ed_price = (EditText) findViewById(R.id.buyorsell_edit_price);
        buyorsell_tv_shijia_wait = (TextView) findViewById(R.id.buyorsell_tv_shijia_wait);
        buyorsell_tv_shijia_ok = (TextView) findViewById(R.id.buyorsell_tv_shijia_ok);
        buyorsell_tv_count = (TextView) findViewById(R.id.buyorsell_tv_count);
        buyorsell_et_count = (EditText) findViewById(R.id.buyorsell_et_count);
        buyorsell_tv_max = (TextView) findViewById(R.id.buyorsell_tv_max);
        buyorsell_xiadan = (TextView) findViewById(R.id.buyorsell_xiadan);
        buyorsell_xiadan.setOnClickListener(this);
        buyorsell_ll_shijia_wait = (LinearLayout) findViewById(R.id.buyorsell_ll_shijia_wait);
        buyorsell_ll_shijia_wait.setOnClickListener(this);
        buyorsell_ll_shijia_ok = (LinearLayout) findViewById(R.id.buyorsell_ll_shijia_ok);
        buyorsell_ll_shijia_ok.setOnClickListener(this);
        RelativeLayout buyorsell_rl_back = (RelativeLayout) findViewById(R.id.buyorsell_rl_back);
        buyorsell_rl_back.setOnClickListener(this);
        yumaidan_cancel = (TextView) findViewById(R.id.yumaidan_cancel);
        yumaidan_cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.buyorsell_buy_btn) {
            if (type == YUMAI_TYPE) {
                changeType(YUMAI_BUY_TYPE);
            } else {
                changeType(BUY_TYPE);
            }
        } else if (id == R.id.buyorsell_sell_btn) {
            if (type == YUMAI_TYPE) {
                changeType(YUMAI_SELL_TYPE);
            } else {
                changeType(SELL_TYPE);
            }

        } else if (id == R.id.buyorsell_ll_shijia_wait) { // 点击市价买入/卖出的时候
            buyorsell_ll_shijia_wait.setVisibility(View.INVISIBLE);
            ed_price.setVisibility(View.INVISIBLE);
            buyorsell_ll_shijia_ok.setVisibility(View.VISIBLE);
        } else if (id == R.id.buyorsell_ll_shijia_ok) { // 点击市价买入/卖出的时候
            buyorsell_ll_shijia_wait.setVisibility(View.VISIBLE);
            ed_price.setVisibility(View.VISIBLE);
            buyorsell_ll_shijia_ok.setVisibility(View.INVISIBLE);
        } else if (id == R.id.buyorsell_rl_back) {
            finish();
        } else if (id == R.id.yumaidan_cancel) {
            Intent intent = new Intent(this, TradeCancelYumaiActivity.class);
            startActivity(intent);

        } else if (id == R.id.buyorsell_xiadan) {  //下单
            if (type == BUY_TYPE || type == SELL_TYPE) {
                if (btn_buy.isChecked()) {  //如果预埋买被选中
                    Toast.makeText(this, "点击了买入", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "点击了卖出", Toast.LENGTH_SHORT).show();
                }
            } else if (type == YUMAI_TYPE) {
                if (btn_buy.isChecked()) {  //如果预埋买被选中
                    Toast.makeText(this, "点击了预埋买", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "点击了预埋卖", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

}

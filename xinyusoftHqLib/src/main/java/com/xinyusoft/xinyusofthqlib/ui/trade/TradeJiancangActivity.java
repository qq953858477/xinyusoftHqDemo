package com.xinyusoft.xinyusofthqlib.ui.trade;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.xinyusoft.xinyusofthqlib.R;
import com.xinyusoft.xinyusofthqlib.adapter.TradeJiancangAdapter;
import com.xinyusoft.xinyusofthqlib.bean.JiancangBean;

/**
 * Created by zzy on 2015/12/24.
 */
public class TradeJiancangActivity extends Activity implements View.OnClickListener{

    private RelativeLayout back;
    private TextView fenchenggu;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xinyusoft_activity_trade_jiancang);


        initView();
    }

    private void initView() {
        back = (RelativeLayout) findViewById(R.id.include_back);
        back.setOnClickListener(this);
        fenchenggu = (TextView) findViewById(R.id.xinyusoft_jiancang_fenchenggu);
        TextView  tv_prompt  = (TextView) findViewById(R.id.trade_jiancang_tv_show);
        fenchenggu.setOnClickListener(this);
        listView = (ListView) findViewById(R.id.trade_jiancang_lv);
        List<JiancangBean> list = new ArrayList<JiancangBean>();
        list.add(new JiancangBean("和谐多是"));
        list.add(new JiancangBean("和谐多2"));
        if(list != null) {
            tv_prompt.setVisibility(View.INVISIBLE);
        } else {
            tv_prompt.setVisibility(View.VISIBLE);
        }
        TradeJiancangAdapter adapter = new TradeJiancangAdapter(this,R.layout.xinyusoft_item_jiancang_listview,list);
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.include_back) {
            finish();
        } else if(id == R.id.xinyusoft_jiancang_fenchenggu) {
            Toast.makeText(this,"添加分成股",Toast.LENGTH_SHORT).show();
        }
    }
}

package com.xinyusoft.xinyusofthqlib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

import com.xinyusoft.xinyusofthqlib.adapter.MainAdapter;
import com.xinyusoft.xinyusofthqlib.fragment.PropertyFragment;
import com.xinyusoft.xinyusofthqlib.fragment.SelectFragment;
import com.xinyusoft.xinyusofthqlib.fragment.TradeFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
	private ViewPager viewpager;
	private RadioGroup radiogroup;
	private RadioButton rb_property;
	private RadioButton rb_deal;
	private RadioButton rb_select;
	private TextView tv_property;
	private TextView tv_deal;
	private TextView tv_select;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xinyusoft_activity_main);
		init();   //初始化24热hhg的

		radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId == R.id.radio_property){
					viewpager.setCurrentItem(0);
					tv_property.setVisibility(View.VISIBLE);
					tv_deal.setVisibility(View.INVISIBLE);
					tv_select.setVisibility(View.INVISIBLE);
				}else if(checkedId == R.id.radio_deal){
					viewpager.setCurrentItem(1);
					tv_property.setVisibility(View.INVISIBLE);
					tv_deal.setVisibility(View.VISIBLE);
					tv_select.setVisibility(View.INVISIBLE);
				}else if(checkedId == R.id.radio_select){
					viewpager.setCurrentItem(2);
					tv_property.setVisibility(View.INVISIBLE);
					tv_deal.setVisibility(View.INVISIBLE);
					tv_select.setVisibility(View.VISIBLE);
				}
			}
		});
		
		
		viewpager.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				if(arg0 == 0){
					rb_property.setSelected(true);
					tv_property.setVisibility(View.VISIBLE);
					tv_deal.setVisibility(View.INVISIBLE);
					tv_select.setVisibility(View.INVISIBLE);
				}else if(arg0 == 1){
					rb_deal.setSelected(true);
					tv_property.setVisibility(View.INVISIBLE);
					tv_deal.setVisibility(View.VISIBLE);
					tv_select.setVisibility(View.INVISIBLE);
				}else if(arg0 == 2){
					rb_select.setSelected(true);
					tv_property.setVisibility(View.INVISIBLE);
					tv_deal.setVisibility(View.INVISIBLE);
					tv_select.setVisibility(View.VISIBLE);
				}
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	
	
	private void init() {
		viewpager = (ViewPager) findViewById(R.id.main_viewpager);
		radiogroup = (RadioGroup) findViewById(R.id.main_radioGroup);
		rb_property = (RadioButton) findViewById(R.id.radio_property);
		rb_deal = (RadioButton) findViewById(R.id.radio_deal);
		rb_select = (RadioButton) findViewById(R.id.radio_select);
		tv_property = (TextView) findViewById(R.id.tv_property);
		tv_deal = (TextView) findViewById(R.id.tv_deal);
		tv_select = (TextView) findViewById(R.id.tv_select);
		List<Fragment> list= new ArrayList<Fragment>();
		list.add(new PropertyFragment());
		list.add(new TradeFragment());
		list.add(new SelectFragment());
		viewpager.setAdapter(new MainAdapter(getSupportFragmentManager(), list));
	}

	
}

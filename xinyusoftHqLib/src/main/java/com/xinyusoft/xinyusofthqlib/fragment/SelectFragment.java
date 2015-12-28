package com.xinyusoft.xinyusofthqlib.fragment;

import com.xinyusoft.xinyusofthqlib.R;
import com.xinyusoft.xinyusofthqlib.ui.select.ChengjiaoActivity;
import com.xinyusoft.xinyusofthqlib.ui.select.ChicangActivity;
import com.xinyusoft.xinyusofthqlib.ui.select.HistoryActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class SelectFragment extends Fragment{
	View view;
	RelativeLayout chicang;
	RelativeLayout chengjiao;
	RelativeLayout weituo;
	RelativeLayout history_chengjiao;
	RelativeLayout history_weituo;
	RelativeLayout gistory_liushui;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.xinyusoft_fragment_select,null);
		init();
		return view;
	
	
	}




	private void init() {
		chicang = (RelativeLayout) view.findViewById(R.id.chicang_relative);
		chengjiao = (RelativeLayout) view.findViewById(R.id.chengjiao_relative);
		weituo = (RelativeLayout) view.findViewById(R.id.weituo_relative);
		history_chengjiao = (RelativeLayout) view.findViewById(R.id.history_chengjiao_relative);
		history_weituo = (RelativeLayout) view.findViewById(R.id.history_weituo_relative);
		gistory_liushui = (RelativeLayout) view.findViewById(R.id.history_liushui_relative);
	
		chicang.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new  Intent();
				intent.putExtra("tag", "chicang");
				intent.setClass(getActivity(), ChicangActivity.class);
				startActivity(intent);
			}
		});
		chengjiao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new  Intent();
				intent.putExtra("tag", "chengjiao");
				intent.setClass(getActivity(), ChengjiaoActivity.class);
				startActivity(intent);
			}
		});
		weituo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new  Intent();
				intent.putExtra("tag", "weituo");
				intent.setClass(getActivity(), ChengjiaoActivity.class);
				startActivity(intent);
			}
		});
		history_chengjiao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new  Intent();
				intent.putExtra("tag", "history_chengjiao");
				intent.setClass(getActivity(), HistoryActivity.class);
				startActivity(intent);
			}
		});
		
		history_weituo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new  Intent();
				intent.putExtra("tag", "history_weituo");
				intent.setClass(getActivity(), HistoryActivity.class);
				startActivity(intent);
			}
		});
		gistory_liushui.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new  Intent();
				intent.putExtra("tag", "history_liushui");
				intent.setClass(getActivity(), HistoryActivity.class);
				startActivity(intent);
			}
		});
	}
	
	
	
	
	
}
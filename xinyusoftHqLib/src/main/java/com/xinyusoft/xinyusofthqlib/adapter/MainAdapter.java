package com.xinyusoft.xinyusofthqlib.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MainAdapter extends FragmentPagerAdapter{
	
	List<Fragment> list;
	
	public MainAdapter(FragmentManager fm,List<Fragment> list) {
		super(fm);
		// TODO Auto-generated constructor stub
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}
	
	
	


}

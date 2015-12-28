package com.xinyusoft.xinyusofthqlib.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.xinyusoft.xinyusofthqlib.R;
import com.xinyusoft.xinyusofthqlib.bean.JiancangBean;

/**
 * Created by zzy on 2015/12/24.
 */
public class TradeJiancangAdapter extends ArrayAdapter<JiancangBean> {

    private int resourceId;
    private List Lists;

    public TradeJiancangAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        resourceId = resource;
        Lists = objects;
    }

    @Override
    public int getCount() {
        return Lists.size();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        JiancangBean jiancangBean = getItem(position);
        View view = convertView;
        if(view == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        } else {

        }
        TextView name = (TextView) view.findViewById(R.id.jiancang_stock_name);
        name.setText(jiancangBean.getName());
        return view;
    }
}

package com.xinyusoft.xinyusofthqlib.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.xinyusoft.xinyusofthqlib.R;
import com.xinyusoft.xinyusofthqlib.ui.trade.TradeBuyOrSellActivity;
import com.xinyusoft.xinyusofthqlib.ui.trade.TradeChedanActivity;
import com.xinyusoft.xinyusofthqlib.ui.trade.TradeJiancangActivity;
import com.xinyusoft.xinyusofthqlib.ui.trade.TradeQingcangActivity;
import com.xinyusoft.xinyusofthqlib.ui.trade.TradeYinlianActivity;


public class TradeFragment extends Fragment implements OnClickListener {

	private View view;


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.xinyusoft_fragment_trade, container, false);
		initView();
		return view;
	}

	private void initView() {

		RelativeLayout trade_quickbuy_rl = (RelativeLayout) view.findViewById(R.id.trade_quickbuy_rl);
		trade_quickbuy_rl.setOnClickListener(this);
		RelativeLayout trade_quicksell_rl = (RelativeLayout) view.findViewById(R.id.trade_quicksell_rl);
		trade_quicksell_rl.setOnClickListener(this);
		RelativeLayout trade_chedan_rl = (RelativeLayout) view.findViewById(R.id.trade_chedan_rl);
		trade_chedan_rl.setOnClickListener(this);
		RelativeLayout trade_yumaidan_rl = (RelativeLayout) view.findViewById(R.id.trade_yumaidan_rl);
		trade_yumaidan_rl.setOnClickListener(this);
		RelativeLayout trade_tiaocang_rl = (RelativeLayout) view.findViewById(R.id.trade_tiaocang_rl);
		trade_tiaocang_rl.setOnClickListener(this);
		RelativeLayout trade_qingcang_rl = (RelativeLayout) view.findViewById(R.id.trade_qingcang_rl);
		trade_qingcang_rl.setOnClickListener(this);
		RelativeLayout trade_zhuanzhang_rl = (RelativeLayout) view.findViewById(R.id.trade_zhuanzhang_rl);
		trade_zhuanzhang_rl.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		Intent intent = null;
		if(id == R.id.trade_quickbuy_rl) {
			intent = new Intent(getActivity(), TradeBuyOrSellActivity.class);
			intent.putExtra("type", 0);

		} else if(id == R.id.trade_quicksell_rl) {
			intent = new Intent(getActivity(), TradeBuyOrSellActivity.class);
			intent.putExtra("type", 1);

		} else if(id == R.id.trade_chedan_rl) {
			intent = new Intent(getActivity(), TradeChedanActivity.class);
		} else if(id == R.id.trade_yumaidan_rl) {
			intent = new Intent(getActivity(), TradeBuyOrSellActivity.class);
            intent.putExtra("type", 2);
		} else if(id == R.id.trade_tiaocang_rl) {
			intent = new Intent(getActivity(), TradeJiancangActivity.class);
		} else if(id == R.id.trade_qingcang_rl) {
			intent = new Intent(getActivity(), TradeQingcangActivity.class);
		} else if(id == R.id.trade_zhuanzhang_rl) {
			intent = new Intent(getActivity(), TradeYinlianActivity.class);
		}
		getActivity().startActivity(intent);
	}
	
}

package com.wieght;
//-Author: Mark Lee x11435992

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class UB_explained extends Activity{
	ExpandableListView ubexplained;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ub_explained);
		 ubexplained = (ExpandableListView)findViewById(R.id.expandableListEx1);
		ubexplained.setAdapter(new AdapterEx1(this));;
	}
}

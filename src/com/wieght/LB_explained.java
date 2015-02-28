package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class LB_explained extends Activity{
	ExpandableListView lbexplained;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lb_explained);
		 lbexplained = (ExpandableListView)findViewById(R.id.expandableListEx3);
		lbexplained.setAdapter(new AdapterEx3(this));;
	}
}

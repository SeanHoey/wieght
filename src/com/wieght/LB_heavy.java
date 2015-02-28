package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class LB_heavy extends Activity{
	ExpandableListView lbheavy;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lb_heavy);
		 lbheavy = (ExpandableListView)findViewById(R.id.expandableListML9);
		lbheavy.setAdapter(new AdapterML9(this));;
	}
}
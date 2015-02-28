package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class LB_moderate extends Activity{
	ExpandableListView lbmoderate;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lb_moderate);
		 lbmoderate = (ExpandableListView)findViewById(R.id.expandableListML8);
		lbmoderate.setAdapter(new AdapterML8(this));;
	}
}

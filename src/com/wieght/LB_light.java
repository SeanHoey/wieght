package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class LB_light extends Activity{
	ExpandableListView lblight;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lb_light);
		 lblight = (ExpandableListView)findViewById(R.id.expandableListML7);
		lblight.setAdapter(new AdapterML7(this));;
	}
}

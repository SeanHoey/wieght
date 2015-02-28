package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;




public class UB_light extends Activity{
	
	ExpandableListView ublight;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ub_light);
		 ublight = (ExpandableListView)findViewById(R.id.expandableListML1);
		ublight.setAdapter(new AdapterML1(this));;
	}

}
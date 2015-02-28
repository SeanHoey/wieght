package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class UB_moderate extends Activity{
	ExpandableListView ubmod;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ub_moderate);
		 ubmod = (ExpandableListView)findViewById(R.id.expandableListML2);
		ubmod.setAdapter(new AdapterML2(this));;
	}
}

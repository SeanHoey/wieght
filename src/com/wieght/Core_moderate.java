package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class Core_moderate extends Activity{
	ExpandableListView coremoderate;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.core_moderate);
		 coremoderate = (ExpandableListView)findViewById(R.id.expandableListML5);
		coremoderate.setAdapter(new AdapterML5(this));;
	}
}

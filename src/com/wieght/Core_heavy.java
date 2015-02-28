package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class Core_heavy extends Activity{
ExpandableListView coreheavy;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.core_heavy);
		 coreheavy = (ExpandableListView)findViewById(R.id.expandableListML6);
		coreheavy.setAdapter(new AdapterML6(this));;
	}
}

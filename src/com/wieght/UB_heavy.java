package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class UB_heavy extends Activity{
	ExpandableListView ubheavy;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ub_heavy);
		 ubheavy = (ExpandableListView)findViewById(R.id.expandableListML3);
		ubheavy.setAdapter(new AdapterML3(this));;
	}
}

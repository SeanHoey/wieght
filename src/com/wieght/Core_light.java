package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class Core_light extends Activity{
	ExpandableListView corelight;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.core_light);
		 corelight = (ExpandableListView)findViewById(R.id.expandableListML4);
		corelight.setAdapter(new AdapterML4(this));;
	}
}
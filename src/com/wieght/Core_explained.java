package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;

import android.os.Bundle;

import android.widget.ExpandableListView;

public class Core_explained extends Activity{	
ExpandableListView  coreexplained;

		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.core_explained);
		 coreexplained = (ExpandableListView)findViewById(R.id.expandableListEx2);
		coreexplained.setAdapter(new AdapterEx2(this));;
	}
}

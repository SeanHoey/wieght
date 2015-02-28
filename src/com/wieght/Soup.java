package com.wieght;
//author sean hoey x11000759
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

public class Soup extends Activity {
	ExpandableListView exv1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.soup);
		exv1 = (ExpandableListView)findViewById(R.id.expandableListView1);
		exv1.setAdapter(new MyAdapter6(this));;
		Button next = (Button) findViewById(R.id.back6);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Diet.class);
                startActivity(myIntent);
            }
	            

	        });
}
}

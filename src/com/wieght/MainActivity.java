package com.wieght;
//author sean hoey x11000759
import com.wieght.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;




public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState){
	      super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bonus);
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),BMI.class);
                startActivity(myIntent);
            }

        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),TimerActivity.class);
                startActivity(myIntent);
            }

        });
			
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Achievements.class);
                startActivity(myIntent);
            }

        });
	
	}
		
	
	
 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}

}


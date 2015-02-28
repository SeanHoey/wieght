package com.wieght;

//author sean hoey x11000759

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class General extends Activity {
 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.general);

		Button next = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
           int r=(int) ((Math.random() * 9) +1);
            	
                Intent myIntent = new Intent();
              switch(r){
              case 1:
                	myIntent.setClass(view.getContext(),Tip1.class);
                	break;
                case 2:
                	myIntent.setClass(view.getContext(),Tip2.class);
                	break;
               case 3:
                	myIntent.setClass(view.getContext(),Tip3.class);
                	break;
                case 4:
                	myIntent.setClass(view.getContext(),Tip4.class);
                	break;
               case 5:
                	myIntent.setClass(view.getContext(),Tip5.class);
                	break;
                case 6:
                	myIntent.setClass(view.getContext(),Tip6.class);
                	break;
                case 7:
                	myIntent.setClass(view.getContext(),Tip7.class);
                	break;
                case 8:
                	myIntent.setClass(view.getContext(),Tip8.class);
                	break;
                case 9:
                	myIntent.setClass(view.getContext(),Tip9.class);
                	break;
               case 10:
                	myIntent.setClass(view.getContext(),Tip10.class);
                	break;
                }
                startActivity(myIntent);  
            }
            
            
	        });
	}
        
}
	



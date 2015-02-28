package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LowerBody {
	public class WorkoutRoutines extends Activity {
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.lower_body);
		 Button lb_light = (Button) findViewById(R.id.button14);
		    lb_light.setOnClickListener(new View.OnClickListener(){
		    	public void onClick(View view){
		    		Intent myIntent = new Intent(view.getContext(),LB_light.class);
		    		startActivity(myIntent);
		    	}
		    });
	    
	    	
	    
	    Button lb_moderate = (Button) findViewById(R.id.button15);
	    lb_moderate.setOnClickListener(new View.OnClickListener(){
	    	public void onClick(View view){
	    		Intent myIntent = new Intent(view.getContext(),LB_moderate.class);
	    		startActivity(myIntent);
	    	}
	    });
	    
	    Button lb_heavy = (Button) findViewById(R.id.button16);
	    lb_heavy.setOnClickListener(new View.OnClickListener(){
	    	public void onClick(View view){
	    		Intent myIntent = new Intent(view.getContext(),LB_heavy.class);
	    		startActivity(myIntent);
	    	}
	    
	    });
		}
	 
	    public boolean onCreateOptionsMenu(Menu menu) {
	       getMenuInflater().inflate(R.menu.workout_routine, menu);
	        return true;
	    }
	    	
	    
	    }
}

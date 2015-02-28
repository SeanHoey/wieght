package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class CoreWorkout {
	public class WorkoutRoutines extends Activity {
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.core_workout);
		 Button core_light = (Button) findViewById(R.id.button11);
		    core_light.setOnClickListener(new View.OnClickListener(){
		    	public void onClick(View view){
		    		Intent myIntent = new Intent(view.getContext(),Core_light.class);
		    		startActivity(myIntent);
		    	}
		    });
	    
	    	
	    
	    Button core_moderate = (Button) findViewById(R.id.button12);
	    core_moderate.setOnClickListener(new View.OnClickListener(){
	    	public void onClick(View view){
	    		Intent myIntent = new Intent(view.getContext(),Core_moderate.class);
	    		startActivity(myIntent);
	    	}
	    });
	    
	    Button core_heavy = (Button) findViewById(R.id.button13);
	    core_heavy.setOnClickListener(new View.OnClickListener(){
	    	public void onClick(View view){
	    		Intent myIntent = new Intent(view.getContext(),Core_heavy.class);
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

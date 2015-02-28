package com.wieght;
//-Author: Mark Lee x11435992
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpperBody {
	public class WorkoutRoutines extends Activity {
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.upper_body);
	        Button ublight = (Button) findViewById(R.id.button8);
		    ublight.setOnClickListener(new View.OnClickListener(){
		    	public void onClick(View view){
		    		Intent myIntent = new Intent(view.getContext(),UB_light.class);
		    		startActivity(myIntent);
		    	}
		    });
	    
	    	
	    
	    Button ubmoderate = (Button) findViewById(R.id.button9);
	    ubmoderate.setOnClickListener(new View.OnClickListener(){
	    	public void onClick(View view){
	    		Intent myIntent = new Intent(view.getContext(),UB_moderate.class);
	    		startActivity(myIntent);
	    	}
	    });
	    
	    Button ubheavy = (Button) findViewById(R.id.button10);
	    ubheavy.setOnClickListener(new View.OnClickListener(){
	    	public void onClick(View view){
	    		Intent myIntent = new Intent(view.getContext(),UB_heavy.class);
	    		startActivity(myIntent);
	    	}
	    
	    });
		}
	 
	    
	    
	    }
}

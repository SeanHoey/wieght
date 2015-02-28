package com.wieght;
//-Author: Mark Lee x11435992
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class WorkoutRoutines extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_routine);
	 Button ub = (Button) findViewById(R.id.button5);
	    ub.setOnClickListener(new View.OnClickListener(){
	    	public void onClick(View view){
	    		Intent myIntent = new Intent(view.getContext(),UpperBody.class);
	    		startActivity(myIntent);
	    	}
	    });
    
    	
    
    Button cw = (Button) findViewById(R.id.button6);
    cw.setOnClickListener(new View.OnClickListener(){
    	public void onClick(View view){
    		Intent myIntent = new Intent(view.getContext(),CoreWorkout.class);
    		startActivity(myIntent);
    	}
    });
    
    Button lb = (Button) findViewById(R.id.button7);
    lb.setOnClickListener(new View.OnClickListener(){
    	public void onClick(View view){
    		Intent myIntent = new Intent(view.getContext(),LowerBody.class);
    		startActivity(myIntent);
    	}
    
    });
	}
 
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.workout_routine, menu);
        return true;
    }
    	
    
    }
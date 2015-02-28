package com.wieght;
//-Author: Mark Lee x11435992
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Exercise extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);
        Button wr = (Button) findViewById(R.id.button1);
        wr.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		Intent myIntent = new Intent(view.getContext(),WorkoutRoutines.class);
        		startActivity(myIntent);
        	}
        });
        
        Button we = (Button) findViewById(R.id.button2);
        we.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view){
        		Intent myIntent = new Intent(view.getContext(),WorkoutsExplained.class);
        		startActivity(myIntent);
        	}
        });
        

 
        Button bmi = (Button) findViewById(R.id.bmi);
        bmi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),BMI.class);
                startActivity(myIntent);
            }

        });
      
            }

      
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.exercise, menu);
        return true;
    }
}

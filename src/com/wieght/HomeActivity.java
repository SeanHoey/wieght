package com.wieght;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/*
 * @Author Jason Hanratty
 * x11450868
 */

public class HomeActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button b1 = (Button) findViewById(R.id.dietbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Diet.class);
                startActivity(myIntent);
            }
	            

	        });
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),General.class);
                startActivity(myIntent);
            }
	            

	        });
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),MainActivity.class);
                startActivity(myIntent);
            }
	            

	        });
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),Diet.class);
                startActivity(myIntent);
            }
	            

	        });
      
        ImageView image1 = (ImageView)findViewById(R.id.imageView1);
	    image1.setOnClickListener(new View.OnClickListener() {
	    
	    	 public void onClick(View v) {
	             
	             Intent i = new Intent(getApplicationContext(), StartActivity.class);
	             startActivity(i);
	         }
	     });
	    
	  //  TextView name = (TextView) findViewById(R.id.textView1); //this will display info from db
        /*toast login success
        Toast.makeText(getApplicationContext(), 
                "Login Successful! Welcome Guest!", Toast.LENGTH_SHORT).show(); 
    */
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
        

}
}


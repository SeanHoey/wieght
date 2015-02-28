package com.wieght;
//author sean hoey x11000759
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diet extends Activity {
	
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_diet);
			Button back = (Button) findViewById(R.id.back);
	        back.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(),MainActivity.class);
	                startActivity(myIntent);
	            }
		            

		        });
	        Button button = (Button) findViewById(R.id.boven);
	        button.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(),Fish.class);
	                startActivity(myIntent);
	            }
		            

		        });
	        Button button2 = (Button) findViewById(R.id.bbake);
	        button2.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(),Bake.class);
	                startActivity(myIntent);
	            }
		            

		        });
	        Button button3 = (Button) findViewById(R.id.bcake);
	        button3.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(),Cake.class);
	                startActivity(myIntent);
	            }
		            

		        });
	        Button button4 = (Button) findViewById(R.id.blow);
	        button4.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(),Low.class);
	                startActivity(myIntent);
	            }
		            

		        });
	        Button button5 = (Button) findViewById(R.id.bmeatball);
	        button5.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(),Meatball.class);
	                startActivity(myIntent);
	            }
		            

		        });
	        Button button6 = (Button) findViewById(R.id.bsoup);
	        button6.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(),Soup.class);
	                startActivity(myIntent);
	            }
		            

		        });
	        Button button7 = (Button) findViewById(R.id.bsummer);
	        button7.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	                Intent myIntent = new Intent(view.getContext(),Summer.class);
	                startActivity(myIntent);
	            }
		            

		        });
		}

	     
	}




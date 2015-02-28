package com.wieght;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

/*
 * @Author Jason Hanratty
 * x11450868
 */

public class TimerActivity extends Activity {
   /** Called when the activity is first created. */
	long timeWhenStopped =0;
	
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_timer);
      
       final Chronometer myChronometer = (Chronometer)findViewById(R.id.chronometer);
       Button buttonStart = (Button)findViewById(R.id.buttonstart);
       Button buttonStop = (Button)findViewById(R.id.buttonstop);
       Button buttonReset = (Button)findViewById(R.id.buttonreset);
      
       buttonStart.setOnClickListener(new Button.OnClickListener(){
   
   public void onClick(View v) {
    // TODO Auto-generated method stub
	   myChronometer.setBase(SystemClock.elapsedRealtime()+timeWhenStopped);
    myChronometer.start();
   }});
      
       buttonStop.setOnClickListener(new Button.OnClickListener(){

   public void onClick(View v) {
    // TODO Auto-generated method stub
	   timeWhenStopped = myChronometer.getBase() - SystemClock.elapsedRealtime();
    myChronometer.stop();
   }});
      
       buttonReset.setOnClickListener(new Button.OnClickListener(){

   public void onClick(View v) {
    // TODO Auto-generated method stub
    myChronometer.setBase(SystemClock.elapsedRealtime());
    myChronometer.stop();
    timeWhenStopped = 0;
   }});  
   }
}

//code adapted from http://android-er.blogspot.ie/2010/06/android-chronometer.html

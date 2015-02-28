package com.wieght;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

/*
 * @Author Jason Hanratty
 * x11450868
 */

public class Achievements extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
    }
public CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
	
   
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	
    	CheckBox cb1 = ( CheckBox ) findViewById( R.id.checkBox1 );
    	cb1.setOnCheckedChangeListener(new OnCheckedChangeListener()
    	{
    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    	    {
    	        if ( isChecked )
    	        {
    	        	Toast.makeText(getApplicationContext(), "Congratulations! You have been awarded an achievement!", Toast.LENGTH_SHORT).show();
    	        }

    	    }
    	});
    	
    	CheckBox cb2 = ( CheckBox ) findViewById( R.id.checkBox2 );
    	cb2.setOnCheckedChangeListener(new OnCheckedChangeListener()
    	{
    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    	    {
    	        if ( isChecked )
    	        {
    	        	Toast.makeText(getApplicationContext(), "Congratulations! You have been awarded an achievement!", Toast.LENGTH_SHORT).show();
    	        }

    	    }
    	});
    	
    	CheckBox cb3 = ( CheckBox ) findViewById( R.id.checkBox3 );
    	cb3.setOnCheckedChangeListener(new OnCheckedChangeListener()
    	{
    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    	    {
    	        if ( isChecked )
    	        {
    	        	Toast.makeText(getApplicationContext(), "Congratulations! You have been awarded an achievement!", Toast.LENGTH_SHORT).show();
    	        }

    	    }
    	});
    	
    	CheckBox cb4 = ( CheckBox ) findViewById( R.id.checkBox4 );
    	cb4.setOnCheckedChangeListener(new OnCheckedChangeListener()
    	{
    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    	    {
    	        if ( isChecked )
    	        {
    	        	Toast.makeText(getApplicationContext(), "Congratulations! You have been awarded an achievement!", Toast.LENGTH_SHORT).show();
    	        }

    	    }
    	});
    	
    	CheckBox cb5 = ( CheckBox ) findViewById( R.id.checkBox5 );
    	cb5.setOnCheckedChangeListener(new OnCheckedChangeListener()
    	{
    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    	    {
    	        if ( isChecked )
    	        {
    	        	Toast.makeText(getApplicationContext(), "Congratulations! You have been awarded an achievement!", Toast.LENGTH_SHORT).show();
    	        }

    	    }
    	});
    	
    	CheckBox cb6 = ( CheckBox ) findViewById( R.id.checkBox6 );
    	cb6.setOnCheckedChangeListener(new OnCheckedChangeListener()
    	{
    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    	    {
    	        if ( isChecked )
    	        {
    	        	Toast.makeText(getApplicationContext(), "Congratulations! You have been awarded an achievement!", Toast.LENGTH_SHORT).show();
    	        }

    	    }
    	});
    	
    	CheckBox cb7 = ( CheckBox ) findViewById( R.id.checkBox7 );
    	cb7.setOnCheckedChangeListener(new OnCheckedChangeListener()
    	{
    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    	    {
    	        if ( isChecked )
    	        {
    	        	Toast.makeText(getApplicationContext(), "Congratulations! You have been awarded an achievement!", Toast.LENGTH_SHORT).show();
    	        }

    	    }
    	});
    	
        getMenuInflater().inflate(R.menu.activity_achievements, menu);
        return true;
        
      
    
}
}


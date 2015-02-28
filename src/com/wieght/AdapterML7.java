package com.wieght;
//-Author: Mark Lee x11435992
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AdapterML7 extends BaseExpandableListAdapter{
	
	private Context context;
	String []parent={"Basic muscle building","Easy fat burning","Light toning"};
	String [][]child={
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Shadow kicking for 1 minute",
				"",
				"Main workout:",
				"Lunges			 	x10",
				"Squats				x10",
				"Calve lifts	 	x10",
				"Front kicks		x10 each leg",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"				
			},
				
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Shadow kicking for 1 minute",
				"",
				"Main workout:",
				"Front kicks		x10 each leg",
				"Side kicks			x10 each leg",
				"Squats				x10",
				"Jog on spot		x30secs",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"
			},
			{

				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Shadow kicking for 1 minute",
				"",
				"Main workout:",
				"Weighted squats 	x10",
				"Lunges		 		x20",
				"Weighted leg lifts	x10",
				"Jog on spot		x30secs",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"
			},
			
	};

	public AdapterML7(LB_light context) {
		// TODO Auto-generated constructor stub
		this.context=context;
	}


	
	public Object getChild(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public long getChildId(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public View getChildView(int arg0, int arg1, boolean arg2, View arg3,
			ViewGroup arg4) {
		// TODO Auto-generated method stub
		TextView tv=new TextView(context);
		tv.setText(child[arg0][arg1]);
		tv.setTextColor(Color.BLACK);
		return tv;
	}

	
	public int getChildrenCount(int arg0) {
		// TODO Auto-generated method stub
		return child[arg0].length;
	}


	public Object getGroup(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return parent.length;
	}


	public long getGroupId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}


	public View getGroupView(int arg0, boolean arg1, View arg2, ViewGroup arg3) {
		// TODO Auto-generated method stub
		TextView tv1=new TextView(context);
		tv1.setText(parent[arg0]);
		tv1.setPadding(40, 0, 0, 0);
		tv1.setTextColor(Color.WHITE);
		tv1.setBackgroundColor(Color.BLACK);
		return tv1;
		
	}

	
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

}


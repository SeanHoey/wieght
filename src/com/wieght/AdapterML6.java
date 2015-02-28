package com.wieght;
//-Author: Mark Lee x11435992
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AdapterML6 extends BaseExpandableListAdapter{
	
	private Context context;
	String []parent={"Advanced muscle building","Extreme fat burn","Heavy conditioning"};
	String [][]child={
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Core stretches for 1 minute",
				"",
				"Main workout:",
				"Regular sit-ups	x50",
				"Cross sit-ups		x50",
				"Leg lifts 			x30",
				"Plank				3 minutes",
				"Left-side plank	3 minutes",
				"Right-side plank	3 minutes",
				"Back crunch		x30",
				"Regular sit-ups	x40",
				"Leg lifts			x20",
				"Plank				x30secs",				
				"",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"				
			},
				
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Core stretches for 1 minute",
				"",
				"Main workout:",
				"Side crunch		x50 each side",
				"Fast sit-ups		x60",
				"Fast leg lifts		x60",
				"Plank				3 minutes",
				"Regular sit-ups 	x30",
				"Cross sit-ups 		x30",
				"Plank				2 minutes",
				"Side crunch		x25 each side",
				"Regular sit-ups	x20",
				"Fast sit-ups		x30",
				"Leg lifts 			x20",
				"Plank				1 minute",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"
			},
			{

				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Core stretches for 1 minute",
				"",
				"Main workout:",
				"Left-side plank	3 minutes",
				"Right-side plank	3 minutes",
				"Plank				3 minutes",
				"Leg lifts			x50",
				"Regular sit-ups	x50",
				"Cross sit-ups		x50",
				"Leg lifts 			x25",
				"Plank				2 minutes",
				"Regular sit-ups 	x25",
				"Cross sit-ups 		x25",
				"Side crunch		x25 each side",
				"Fast sit-ups		x30",
				"Fast leg lifts		x30",
				"Plank				1 minute",
			},
			
	};

	public AdapterML6(Core_heavy context) {
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


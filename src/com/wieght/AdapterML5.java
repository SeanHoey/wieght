package com.wieght;
//-Author: Mark Lee x11435992
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AdapterML5 extends BaseExpandableListAdapter{
	
	private Context context;
	String []parent={"Intermediate muscle building","Moderate fat burning","Toning"};
	String [][]child={
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Core stretches for 1 minute",
				"",
				"Main workout:",
				"Regular sit-ups	x20",
				"Cross sit-ups		x20",
				"Leg lifts 			x20",
				"Plank				1 minute",
				"Left-side plank	1 minute",
				"Right-side plank	1 minute",
				"Back crunch		x20",
				"Regular sit-ups	x20",
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
				"Side crunch		x20 each side",
				"Fast sit-ups		x20",
				"Fast leg lifts		x20",
				"Plank				1 minute",
				"Regular sit-ups 	x10",
				"Cross sit-ups 		x10",
				"Plank				1 minute",
				"Side crunch		x20 each side",
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
				"Left-side plank	1 minute",
				"Right-side plank	1 minute",
				"Plank				1 minute",
				"Leg lifts			x25",
				"Regular sit-ups	x30",
				"Cross sit-ups		x30",
				"Leg lifts 			x30",
				"Plank				1 minute",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"
			},
	};

	public AdapterML5(Core_moderate context) {
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


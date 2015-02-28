package com.wieght;
//-Author: Mark Lee x11435992
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AdapterML3 extends BaseExpandableListAdapter{
	
	private Context context;
	String []parent={"Advanced muscle building","Extreme fat burn","Heavy conditioning"};
	String [][]child={
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Shadow boxing for 3 minutes",
				"",
				"Main workout:",
				"Regular press-ups 	x30",
				"Chair dips 		x30",
				"Dumbbell curls 	x30",
				"Diamond press-ups	x30",
				"Shoulder lifts 	x20",
				"Chin-ups	 		x20",
				"Dumbbell curls 	x20",
				"Diamond press-ups	x20",
				"Bench press	 	x20",
				"Heavy curls 		x20",
				"Dumbbell press 	x20",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"				
			},
				
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"",
				"Main workout:",
				"Shadow boxing		4 minutes",
				"Light curls		x40",
				"Fast press-ups		x30",
				"Shadow boxing		3 minutes",
				"Fast press-ups 	x20",
				"Shadow boxing 		2 minutes",
				"Fast press-ups 	x10",
				"Shadow boxing 		1 minute",
				"Light curls		x25",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"
			},
			{

				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Shadow boxing for 3 minutes",
				"",
				"Main workout:",
				"Heavy curls	 	x30",
				"Chair dips 		x30",
				"Shoulder lifts 	x30",
				"Dumbbell jacks	x30",
				"Regular press-ups 	x40",
				"Chin-ups 			x20",
				"Heavy curls	 	x20",
				"Diamond press-ups	x20",
				"Regular press-ups 	x20",
				"Chin-ups	 		x10",
				"Shoulder lifts		x20",
				"Shadow boxing		5 minutes",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"
			},
			
	};

	public AdapterML3(UB_heavy context) {
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

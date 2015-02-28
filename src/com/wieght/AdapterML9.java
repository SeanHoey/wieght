package com.wieght;
//-Author: Mark Lee x11435992
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AdapterML9 extends BaseExpandableListAdapter{
	
	private Context context;
	String []parent={"Advanced muscle building","Extreme fat burn","Heavy conditioning"};
	String [][]child={
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Shadow kicking for 3 minutes",
				"",
				"Main workout:",
				"Lunges			 	x50",
				"Squats				x50",
				"Calve lifts	 	x30",
				"Front kicks		x50 each leg",
				"Weighted squats 	x25",
				"Lunges		 		x30",
				"Weighted leg lifts	x30",
				"Jog on spot		2 minutes",
				"1 mile jog",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"				
			},
				
			{
				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Shadow kicking for 3 minutes",
				"",
				"Main workout:",
				"Front kicks		x50 each leg",
				"Side kicks			x50 each leg",
				"Squats				x30",
				"Jog on spot		2 minutes",
				"Lunges			 	x25",
				"Squats				x25",
				"Calve lifts	 	x25",
				"Front kicks		x25 each leg",
				"1 mile jog",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"
			},
			{

				"*Need help? Check out the Workouts explained page.",
				"",
				"Warm-up:",
				"Light stretches for 1 minute",
				"Shadow kicking for 3 minutes",
				"",
				"Main workout:",
				"Weighted squats 	x30",
				"Lunges		 		x30",
				"Weighted leg lifts	x30",
				"Front kicks		x50 each leg",
				"Side kicks			x50 each leg",
				"Squats				x50",
				"Jog on spot		3 minutes",
				"1 mile jog",
				"",
				"Cooldown:",
				"Full stretches		x20secs each"
			},
			
	};

	public AdapterML9(LB_heavy context) {
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

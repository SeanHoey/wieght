package com.wieght;
//-Author: Mark Lee x11435992
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AdapterEx1 extends BaseExpandableListAdapter{
	
	private Context context;
	String []parent={"Press-ups","Chair dips","Curls","Press","Dumbbell jacks","Shoulder lifts","Shadow boxing",};
	String [][]child={
			{
				"Regular press-ups:",
				"On an area of flat ground, position yourself with your legs shoulder width apart and your arms spread horizontal to each other. Lower your body slowly until your chest touches the ground, then slowly rise again.",
				"",
				"Diamond press-ups:",
				"Like Regular press-ups, only you must make a Diamond shape with your hands as this focuses the workout on your triceps.",
				"",
				"Fast press-ups:",
				"Exactly the same as Regular press-ups, only this workout focuses more on burning fat than building muscle."
			},
				
			{
				"Chair dips require one piece of equipment, a chair. Facing away from the chair, grip the chair with your hands, extend your legs forwards and support your body weight. Slowly lower your body until you feel the burn on your triceps, then rise again."
			},
			{
				"Dumbbell curls:",
				"Dumbbell curls are best done sitting down. Spread your legs to a comfortable distance, place the elbow of your arm on the inside of your thigh, the opposite arm should be resting on the opposite knee for support. Then, slowly curl the Dumbbell until you feel the crunch.",
				"",
				"Heavy curls:",
				"Exactly the same process as Regular curls, but focus on heavy weights and slow movement.",
				"",
				"Light curls:",
				"Exactly the same process as Regular curls, but focus on light weights and fast movement."
			},
			{
				"Bench press:",
				"Using a bench and Barbell, Grip both ends of the bar evenly, keep the weight steady and slowly press it down to your chest and back up again. You may need someone to spot you for this.",
				"",
				"Dumbbell press",
				"The exact same as the Bench press only you use Dumbbells."
			},
			{
				"These are done by resting a barbell on your shoulder, as you would during a squat, and slowly lifting the bar over your head, fully extending your arms."
			},
			{
				"A simple, but effective workout. Simply get into a fighting stance and box the air. Try different fighting combos for added benefits to different muscle groups."
			},
			
	};

	public AdapterEx1(UB_explained context) {
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

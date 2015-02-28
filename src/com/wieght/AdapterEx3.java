package com.wieght;
//-Author: Mark Lee x11435992
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AdapterEx3 extends BaseExpandableListAdapter{
	
	private Context context;
	String []parent={"Lunges","Squats","Calve lifts","Kicks","Jogging","Shadow kicking",};
	String [][]child={
			{
				"A classic footballer's workout, lunges are performed by placing your hand on your hips and extending one leg forward while you keep the other leg stretched out behind. You should feel the burn on your upper thighs."
			},
				
			{
				"To properly squat, place your feet shoulder width apart, place your hand to the sides of your head and lower your body into the squat position until you feel the burn, then slowly return to your oringinal stance."
			},
			{
				"Place one hand on a wall and stand on the tips of your toes on one leg at a time, you should feel the burn in your calve muscle."
			},
			{
				"Front kicks:",
				"In fighting stance, stand with your leading leg turned slightly outward, then carry your rear leg forward and extend into a direct, forward kick.",
				"",
				"Side kicks",
				"With the flat of your forearm leaning against a wall, turn the foot closest to the wall towards the wall. Then, leaning towards the wall, lift your leg up to your abdomen and extend fully outward."
			},
			{
				"Spot jogging:",
				"Lift your knees forward as high as you can in a kicking motion.",
				"",
				"Regular jogging:",
				"Set yourself up a jogging route that will suit you and always breath in through your nose and out through your mouth."
			},
			{
				"The same concept as Shadow boxing, but you will be focusing purely on kicks. A good opportunity to practice those side and front kicks."
			},		
	};

	public AdapterEx3(LB_explained context) {
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

package com.wieght;
//-Author: Mark Lee x11435992
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class AdapterEx2 extends BaseExpandableListAdapter{

	private Context context;
	String []parent={"Sit-ups","Leg lifts","Planks","Back crunch","Side crunch",};
	String [][]child={
			{
				"Regular sit-ups",
				"Lying on a mat for back support, bend your knees slightly, put your hands to the side of your head and raise your body until you feel a crunch in your abdomen. ",
				"",
				"Cross sit-ups",
				"Essentially the same as a Regular sit-up, only you twist your left arm to your right knee, and visa versa, during the crunch.",
				"",
				"Fast sit-ups",
				"The same as Regular sit-ups, but at more of a pace to focus on fat burning."
			},
				
			{
				"Leg lifts are performed by lying flat on your back, keeping your legs fully extended and raising them until your body meets a 90 degree angle."
			},
			{
				"Plank:",
				"Using your feet and the flats of your forearms, lie down face first on the ground, raise your body by lifting it with your feet and forearms. Hold for an effective core workout. ",
				"",
				"Side plank:",
				"Like a regular Plank, only you do it on one side instead of both arms down."
			},
			{
				"The back crunch is performed by lying flat on your face, putting your hands to the sides of your head and raising both your abdomen and legs off the ground. Great for strenghtening back muscle."
			},
			{
				"The side crunch is a standing crunch in which you place one hand on the back of your head and you slowly crunch the opposite side of your abdomen until you can't reach any further. "
			}
	};

	public AdapterEx2(Core_explained context) {
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

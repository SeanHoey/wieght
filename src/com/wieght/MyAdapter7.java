package com.wieght;
//author sean hoey x11000759
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter7 extends BaseExpandableListAdapter {
	private Context context;
	String []parent={"details","Ingredients","Method","nutrition"};
	String [][]child={
			{
				"serves 4",
				"Prep 5 mins",
				"Cook 10 mins",
				"Vegetarian",
			
			},
			
			{
				"3 tbsp olive oil",
				"3 fat garlic cloves , finely chopped",
				"1 red chilli , deseeded and finely chopped",
				"zest 2 lemons",
				"400g pasta",
				"200g fresh or frozen peas",
				"20g pack basil"
				
			},
			{
				"Heat 1 tbsp oil in a frying pan and cook the garlic and chilli for a couple of mins until very lightly golden. Stir in the zest.",
				"Cook the pasta, adding the peas for the final 2 mins. Drain, then tip everything back into the saucepan. Tip in the garlic, chilli and lemon, scraping in any bits stuck to the pan. Tear in the basil, season and add the remaining olive oil. Stir well."
			},
			{
				"462 kcalories,",
				"protein 15g,",
				"carbohydrate 82g,",
				"fat 11g,",
				"saturated fat 2g,",
				"fibre 6g,",
				"sugar 4g,",
				" salt 0.03g"
			}
	};

	public MyAdapter7(Summer context) {
		// TODO Auto-generated constructor stub
		this.context=context;
	}


	@Override
	public Object getChild(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int arg0, int arg1, boolean arg2, View arg3,
			ViewGroup arg4) {
		// TODO Auto-generated method stub
		TextView tv=new TextView(context);
		tv.setText(child[arg0][arg1]);
		tv.setTextColor(Color.BLACK);
		return tv;
	}

	@Override
	public int getChildrenCount(int arg0) {
		// TODO Auto-generated method stub
		return child[arg0].length;
	}

	@Override
	public Object getGroup(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return parent.length;
	}

	@Override
	public long getGroupId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getGroupView(int arg0, boolean arg1, View arg2, ViewGroup arg3) {
		// TODO Auto-generated method stub
		TextView tv1=new TextView(context);
		tv1.setText(parent[arg0]);
		tv1.setPadding(40, 0, 0, 0);
		tv1.setTextColor(Color.WHITE);
		tv1.setBackgroundColor(Color.BLACK);
		return tv1;
		
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

}

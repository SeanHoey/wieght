package com.wieght;
//author sean hoey x11000759
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter2 extends BaseExpandableListAdapter {
	private Context context;
	String []parent={"details","Ingredients","Method","nutrition"};
	String [][]child={
			{
				"serves 8",
				"Prep 15 mins",
				"Cook 45 mins",
				"Source of vitamin C",
			
			},
			
			{
				"600ml chicken or vegetable stock",
				"1kg potatoes , thinly sliced",
				"6 leeks , thinly sliced into rounds",
				"25g butter",
				"3-4 rashers streaky bacon , snipped",
				"3 tbsp double cream (optional)",
				
			},
			{
				"Heat oven to 200C/fan 180C/gas 6. Put the stock in a large pan, bring to the boil, then add the potatoes and the leeks. Bring back to the boil for 5 mins, then drain well, reserving the stock in a jug.",
				"Meanwhile, butter a large baking dish. Layer up the potatoes and leeks higgledypiggledy, seasoning as you go, then scatter the bacon over the top. Season well, pour over 200ml of the reserved stock, then spoon over the cream (if using) and cover with foil. Can be made up to 1 day ahead and chilled. Bake for 40 mins, uncovering halfway through so that the bacon crisps."
			},
			{
				"153 kcalories,",
				"protein 5g,",
				"carbohydrate 24g,",
				"fat 5 g,",
				"saturated fat 2g,",
				"fibre 4g,",
				"sugar 3g,",
				"salt 0.35g"
			}
	};

	public MyAdapter2(Bake context) {
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

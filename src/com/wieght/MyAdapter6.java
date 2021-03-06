package com.wieght;
//author sean hoey x11000759
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter6 extends BaseExpandableListAdapter {
	private Context context;
	String []parent={"details","Ingredients","Method","nutrition"};
	String [][]child={
			{
				"serves 4",
				"Prep 10 mins",
				"Cook 25 mins",
				"Vegetarian",
			
			},
			
			{
				"2 tsp cumin seeds",
				"large pinch chilli flakes",
				"1 tbsp olive oil",
				"1 red onion , chopped",
				"140g red split lentils",
				"850ml vegetable stock or water",
				"400g can tomatoes , whole or chopped",
				"200g carton chickpeas or � a can, rinsed and drained (freeze leftovers)",
				"small bunch coriander , roughly chopped (save a few leaves, to serve)",
				"4 tbsp 0% Greek yogurt , to serve",
				
			},
			{
				"Heat a large saucepan and dry-fry the cumin seeds and chilli flakes for 1 min, or until they start to jump around the pan and release their aromas. Add the oil and onion, and cook for 5 mins. Stir in the lentils, stock and tomatoes, then bring to the boil. Simmer for 15 mins until the lentils have softened.",
				"Whizz the soup with a stick blender or in a food processor until it is a rough pur�e, pour back into the pan and add the chickpeas. Heat gently, season well and stir in the coriander. Finish with a dollop of yogurt and coriander leaves."
			},
			{
				"222 kcalories,",
				"protein 13g,",
				"carbohydrate 33g,",
				"fat 5g,",
				"saturated fat 0g,",
				"fibre 6g,",
				"sugar 6g,",
				"salt 0.87g"
			}
	};

	public MyAdapter6(Soup context) {
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

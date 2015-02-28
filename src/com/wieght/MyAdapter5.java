package com.wieght;
//author sean hoey x11000759
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter5 extends BaseExpandableListAdapter {
	private Context context;
	String []parent={"details","Ingredients","Method","nutrition"};
	String [][]child={
			{
				"serves 4",
				"Prep 10 mins",
				"Cook 20 mins"
			},
			
			{
				"400g pack lean minced lamb",
				"3 garlic cloves , crushed",
				"2 tsp cumin",
				"300g basmati rice",
				"enough lamb or vegetable stock to cover the rice, from a cube is fine",
				"300g frozen peas",
				"zest 2 lemon , juice of 1",
				"",
				"FOR THE CUCUMBER YOGURT",
				"1/2 cucumber , finely chopped or grated",
				"150ml pot mild natural yogurt",
				"small bunch mint , leaves torn",
				
				
			},
			{
				"Mix the lamb with half the garlic and 1 tsp of the cumin, then season and shape into about 16 balls -it's easier if you wet your hands. Heat a large frying pan (with a lid for later), then fry the meatballs for about 8 mins until golden and cooked through. Remove from the pan, set aside, then tip in the rice, final tsp of cumin and remaining garlic. Fry for 30 secs, stirring, then pour in enough stock to cover. Cover and simmer for 10 mins or until almost all of the liquid is absorbed.",
				"Stir in the peas, return the meatballs to the pan, then warm through for a few mins until the peas are tender. Meanwhile mix the cucumber, yogurt and half the mint together, then season. To finish the pilaf, stir in the lemon zest and juice with some seasoning and the remaining mint. Serve with a good dollop of the cooling cucumber yogurt."
			},
			{
				"496 kcalories,",
				"protein 33g,",
				"carbohydrate 72g,",
				"fat 10g,",
				"saturated fat 4g,",
				"fibre 4g,",
				"sugar 5g,",
				"salt 1.34g"
			}
	};

	public MyAdapter5(Meatball context) {
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

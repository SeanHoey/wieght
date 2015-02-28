package com.wieght;
//author sean hoey x11000759
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class myAdapter extends BaseExpandableListAdapter {
	private Context context;
	String []parent={"Details","Ingredients","Method","nutrition"};
	String [][]child={
			{
				"Serves 4",
				"Prep 15 mins",
				"Cook 40 mins",
				
			},
			{
				"880g/ 1lb 12 oz floury potato , scrubbed and cut into chips",
				"2 tbsp olive oil",
				"50g fresh breadcrumbs",
				"zest 1 lemon",
				"2 tbsp chopped flat-leaf parsley",
				"4 x 140g/5oz thick sustainable white fish fillets",
				"200g/ 7oz cherry tomato"
			},
			{
				"Heat oven to 220C/200C fan/gas 7. Pat chips dry on kitchen paper, then lay in a single layer on a large baking tray. Drizzle with half the olive oil and season with salt. Cook for 40 mins, turning after 20 mins, so they cook evenly.",
				"Mix the breadcrumbs with the lemon zest and parsley, then season well. Top the cod evenly with the breadcrumb mixture, then drizzle .0with the remaining oil. Put in a roasting tin with the cherry tomatoes, then bake in the oven for the final 10 mins of the chips' cooking time."
			},
			{
				"366 kcalories,",
				" protein 32g,",
				"carbohydrate 43g,",
				"fat 7g,",
				"saturated fat 1g,",
				"fibre 4g,",
				"sugar 3g,",
				"salt 0.5g"
			}
	};

	public myAdapter(Fish context) {
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

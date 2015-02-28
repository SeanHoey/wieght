package com.wieght;
//author sean hoey x11000759
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class MyAdapter3 extends BaseExpandableListAdapter {
	private Context context;
	String []parent={"details","Ingredients","Method","nutrition"};
	String [][]child={
			{
				"serves 8",
				"Prep 30 mins",
				"Cook 20 mins",
				"Plus chilling"
			
			},
			
			{
				"softened butter , for greasing",
				"3 large eggs",
				"85g caster sugar",
				"70g plain flour",
				"1 tbsp cornflour",
				"2 tbsp cocoa",
				"½ tsp baking powder",
				"",
				"FOR THE ICING AND FILLING",
				"25g dark chocolate , chopped (don't use 75% chocolate, or the icing will be bitter)",
				"1 tbsp strong black coffee",
				"100g light soft cheese",
				"100g 0% Greek yogurt",
				"2 tbsp icing sugar",
				"",
				"TO DECORATE",
				"15g dark chocolate , chopped"
				
			},
			{
				"Heat oven to 180C/160C fan/gas 4. Lightly butter and line the bases of 2 x 18cm sandwich tins with baking paper. Whisk the eggs and sugar until light and fluffy, about 5 mins with a tabletop mixer or 10 mins using an electric hand whisk. The mixture will have increased greatly in volume and be thick enough to leave a trail on the surface when the whisk blades are lifted.",
				"Sift the flour, cornflour, cocoa and baking powder over the surface and fold in gently using a large metal spoon. Divide between the tins, gently spreading the mixture to the edges, then bake for 15-20 mins until the cakes are well risen, have begun to shrink away from the sides of the tins and spring back when gently pressed. Leave to cool in the tins for 5 mins, then turn out onto a rack.",
				"To decorate, microwave the chocolate and coffee together on Medium for 20-30 secs until the chocolate has melted. Gently stir until smooth, then cool slightly. Beat the soft cheese with the yogurt and icing sugar until smooth, then spoon half the mixture into a small bowl stir in the melted chocolate and set aside. Place one cake on a serving plate and spread with the yogurt mixture. Cover with the other cake, then spread the chocolate yogurt mixture over the top.",
				"To finish, microwave the 15g chocolate on Medium for about 20 secs until melted. Stir gently until smooth, then drizzle all over the cake.",
			},
			{
				"180 kcalories,",
				"protein 5g,",
				"carbohydrate 27g,",
				"fat 7g,",
				"saturated fat 3g,",
				"fibre 1g,",
				"sugar 18g,",
				"salt 0.33g"
			}
	};

	public MyAdapter3(Cake context) {
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

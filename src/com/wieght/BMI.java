package com.wieght;
//-Author: Mark Lee x11435992

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;


public class BMI extends Activity
{
  EditText enterHeight;
  EditText enterWeight;
  EditText bmiCalculated;
  Button bmiButton;
  double x=0;
  double y=0;
  double z=0;
  
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.bmi);
      initControls();
  }
  private void initControls()
  {
      enterHeight=(EditText)findViewById(R.id.enterHeight);
      enterWeight=(EditText)findViewById(R.id.enterWeight);
      bmiCalculated=(EditText)findViewById(R.id.bmiCalculated);
      bmiButton=(Button)findViewById(R.id.bmiButton);
      bmiButton.setOnClickListener(new Button.OnClickListener()
      {public void onClick
      (View  v) { calculate();}});
  }
  private void calculate()
  {
      x=Double.parseDouble(enterHeight.getText().toString());
      y=Double.parseDouble(enterWeight.getText().toString());
      z=y/(x*x);
      bmiCalculated.setText(Double.toString(z));
  }
}


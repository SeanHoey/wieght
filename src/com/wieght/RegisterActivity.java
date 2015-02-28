package com.wieght;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
 
/*
 * @Author Jason Hanratty
 * x11450868
 */

public class RegisterActivity extends Activity
{
    EditText editTextUserName,editTextPassword,editTextConfirmPassword;//,editAge, editHeight, editWeight;
    Button btnCreateAccount;
 
    LoginDataBaseAdapter loginDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
 
        // get Instance  of Database Adapter
        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();
 
        // Get References of Views
        editTextUserName=(EditText)findViewById(R.id.editTextUserName);
        editTextPassword=(EditText)findViewById(R.id.editTextPassword);
        editTextConfirmPassword=(EditText)findViewById(R.id.editTextConfirmPassword);
        //editAge=(EditText)findViewById(R.id.editAge);
        //editHeight=(EditText)findViewById(R.id.editHeight);
        //editWeight=(EditText)findViewById(R.id.editWeight);
        
        btnCreateAccount=(Button)findViewById(R.id.buttonCreateAccount);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
 
        public void onClick(View v) {
            // TODO Auto-generated method stub
 
            String userName=editTextUserName.getText().toString();
            String password=editTextPassword.getText().toString();
            String confirmPassword=editTextConfirmPassword.getText().toString();
            //String age=editAge.getText().toString();
            //String height=editHeight.getText().toString();
            //String weight=editWeight.getText().toString();
 
            // check if any of the fields are vacant
            if(userName.equals("")||password.equals("")||confirmPassword.equals(""))//||editAge.equals("")||editHeight.equals("")||editWeight.equals(""))
            {
                    Toast.makeText(getApplicationContext(), "Please ensure all fields are filled in", Toast.LENGTH_LONG).show();
                    return;
            }
            // check if both password matches
            if(!password.equals(confirmPassword))
            {
                Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
                return;
            }
            else
            {
                // Save the Data in Database
                loginDataBaseAdapter.insertEntry(userName, password);//, age, weight, height);
                Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_LONG).show();
                //setContentView(R.layout.activity_start); for some reason this causes app to stop working
            }
        }
    });
}
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
 
        loginDataBaseAdapter.close();
    }
}

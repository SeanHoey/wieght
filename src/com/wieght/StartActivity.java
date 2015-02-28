package com.wieght;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
 
/*
 * @Author Jason Hanratty
 * x11450868
 */

public class StartActivity extends Activity 
{
    Button btnSignIn,btnSignUp;
    LoginDataBaseAdapter loginDataBaseAdapter;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_start);
 
         // create a instance of SQLite Database
         loginDataBaseAdapter=new LoginDataBaseAdapter(this);
         loginDataBaseAdapter=loginDataBaseAdapter.open();
 
         // Get The Reference Of Buttons
         btnSignIn=(Button)findViewById(R.id.buttonSignIn);
         btnSignUp=(Button)findViewById(R.id.buttonSignUp);
 
        // Set OnClick Listener on SignUp button 
        btnSignUp.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // TODO Auto-generated method stub
 
            /// Create Intent for SignUpActivity and Start The Activity
            Intent intentSignUP=new Intent(getApplicationContext(),RegisterActivity.class);
            startActivity(intentSignUP);
            }
        });
    }
    // Method to handleClick Event of Sign In Button`
    
    public void signIn(View V)
       {
            final Dialog dialog = new Dialog(StartActivity.this);
            dialog.setContentView(R.layout.activity_login);
            dialog.setTitle("Login");
       
            // get the References of views
            final  EditText editTextUserName=(EditText)dialog.findViewById(R.id.editTextUserNameToLogin);
            final  EditText editTextPassword=(EditText)dialog.findViewById(R.id.editTextPasswordToLogin);
 
            Button btnSignIn=(Button)dialog.findViewById(R.id.buttonSignIn);
       
            // Set On ClickListener
            btnSignIn.setOnClickListener(new View.OnClickListener() {
 
                public void onClick(View v) {
                    // get The User name and Password
                    String userName=editTextUserName.getText().toString();
                    String password=editTextPassword.getText().toString();
 
                    // fetch the Password form database for respective user name
                    String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);
 
                    // check if the Stored password matches with  Password entered by user
                    if(password.equals(storedPassword))
                    {
                        Toast.makeText(StartActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                        Intent myIntent = new Intent(v.getContext(),HomeActivity.class);
    	                startActivity(myIntent);
                    }
                    else
                    {
                        Toast.makeText(StartActivity.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
                        
                    }
                }
            });
 
            dialog.show();
    }
 
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close The Database
        loginDataBaseAdapter.close();
    }
}

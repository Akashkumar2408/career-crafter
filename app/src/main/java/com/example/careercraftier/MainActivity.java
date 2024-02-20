package com.example.careercraftier;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public  EditText username,userpassword ;
   public Button login ;
   public TextView incorrect;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        userpassword=(EditText) findViewById(R.id.userpassword);
        login=(Button) findViewById(R.id.loginapp);
        incorrect=(TextView) findViewById(R.id.incorrect);
        DBhelper dBhelper=new DBhelper(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user=username.getText().toString();
                String password=userpassword.getText().toString();

                if (user.equals("")||password.equals(""))
                {
                    Toast.makeText(MainActivity.this, "fill all fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    boolean loginresult=dBhelper.checkuserpassword(user,password);
                    if (loginresult == true)
                    {
                        Intent intent=new Intent(getApplicationContext(),Main_page.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "wrong id password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public void onRegisterClick(View view) {
        Intent intent= new Intent(MainActivity.this,studentsignuppage.class);
        startActivity(intent);
    }
}
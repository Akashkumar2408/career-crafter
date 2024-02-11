package com.example.careercraftier;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   public  EditText username ;
   public EditText userpassword;
   public Button login ;
   public TextView incorrect;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        userpassword=findViewById(R.id.userpassword);
        login=findViewById(R.id.loginapp);
        incorrect=findViewById(R.id.incorrect);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String enterusername=username.getText().toString();
               String enterpassword=userpassword.getText().toString();
                if (enterusername.equals("admin") && enterpassword.equals("admin"))
                {
                    Intent nextpage;
                    nextpage=new Intent(MainActivity.this,com.example.careercraftier.Main_page.class);
                    startActivity(nextpage);
                }
                else
               {
                 incorrect.setText("incorrect id and password");
               }
            }
        });
    }
    public void onRegisterClick(View view) {
        Intent intent= new Intent(MainActivity.this,studentsignuppage.class);
        startActivity(intent);
    }
}
package com.example.careercraftier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class studentsignuppage extends AppCompatActivity {

    EditText username,userpassword,userrepassword;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentsignuppage);

        username=(EditText)findViewById(R.id.username);
        userpassword=(EditText)findViewById(R.id.userpassword);
        userrepassword=(EditText)findViewById(R.id.userrepassword);
        submit=(Button)findViewById(R.id.submitstudent);
        DBhelper dBhelper=new DBhelper(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user=username.getText().toString();
                String password=userpassword.getText().toString();
                String repassword=userrepassword.getText().toString();

                if (user.equals("")||password.equals("")||repassword.equals(""))
                {
                    Toast.makeText(studentsignuppage.this, "fill all fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (password.equals(repassword))
                    {
                        boolean checkuserresult= dBhelper.checkuser(user);
                        if (checkuserresult == false)
                        {
                            boolean reresult=dBhelper.insert(user,password);
                            if (reresult== true)
                            {
                                Toast.makeText(studentsignuppage.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);

                            }
                            else
                            {
                                Toast.makeText(studentsignuppage.this,"Registration failed",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(studentsignuppage.this, "user alrady exists", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(studentsignuppage.this, "passwords are not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }
}
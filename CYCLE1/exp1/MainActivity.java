package com.example.logapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String VALID_USR_NAME="user";
    private static final String VALID_PWD="pass";
    private EditText username;
    private EditText password;
    private Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.uname);
        password=findViewById(R.id.pwd);

        loginbtn=findViewById(R.id.lbtn);
        loginbtn.setOnClickListener(view ->{
            String entereduname=username.getText().toString().trim();
            String enteredpwd=password.getText().toString().trim();
            if(entereduname.isEmpty()||enteredpwd.isEmpty()) {
                showToast("please enter user or pass");
            }
            else if(isValid(entereduname,enteredpwd)) {
                showToast("LOgin success");

            }else{
                showToast("invalid cred");
            }
        });
    }
    public boolean isValid(String euname, String epwd){
    return VALID_USR_NAME.equals(euname) && VALID_PWD.equals(epwd);
    }
    private void showToast(String msg){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();}
}


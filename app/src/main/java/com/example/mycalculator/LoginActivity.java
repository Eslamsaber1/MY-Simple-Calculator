package com.example.mycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity{
    Button button_ok,button_cancel;
    EditText user,pass;
    String correct_pass="1213";
    String correct_user="eslam@gmail.com";
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_layout);

        button_ok = findViewById(R.id.ok_btn);
        button_cancel = findViewById(R.id.cancel_btn);
        user = findViewById(R.id.editTextUser);
        pass = findViewById(R.id.editTextPass);
        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input_user_name;
                input_user_name = user.getText().toString();
                String input_password;
                input_password = pass.getText().toString();
                if (input_user_name.equalsIgnoreCase(correct_user) && input_password.equalsIgnoreCase(correct_pass)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    user.setError("user name is wrong");
                    pass.setError("password is wrong");
                }
            }
        });
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setText("");
                pass.setText("");
            }
        });

    }

}

package com.example.michal.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity  implements OnClickListener {
    private Button mLoginButton;
    private EditText mEmailEditText;
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginButton = (Button) findViewById(R.id.login_btn);
        mEmailEditText = (EditText) findViewById(R.id.login_et);
        mPasswordEditText = (EditText) findViewById(R.id.password_et);
        mLoginButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String email = mEmailEditText.getText().toString();
        String password = mPasswordEditText.getText().toString();
        if (isLoginValid(email, password)) {
            Intent intent = new Intent(this,MenuForTodayActivity.class);
            startActivity(intent);
        }
    }
    private boolean isLoginValid(String email,String password) {
        return !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password) && password.equals("haslo");
    }
}

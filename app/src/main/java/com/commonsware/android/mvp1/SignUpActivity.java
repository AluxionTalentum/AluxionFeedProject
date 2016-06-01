package com.commonsware.android.mvp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends Activity {
    public Button linkLogin;
    public Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getActionBar().hide();
        linkLogin = (Button) findViewById(R.id.linkLogin);
        btn_signup = (Button) findViewById(R.id.btn_signup);

/*
      linkLogin.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });*/
    }

    public void irLogin (View view){
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);
    }
    public void crearCuenta2 (View view){
        Intent intent = new Intent(SignUpActivity.this, FeedActivity.class);
        startActivity(intent);
}
}

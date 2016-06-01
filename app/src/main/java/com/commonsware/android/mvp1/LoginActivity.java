package com.commonsware.android.mvp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Esta actividad es la función del Login, que se podría implementar a través de un servidor.

public class LoginActivity extends Activity {

    public Button botonLogin;
    public Button textLoginNewAcccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Con esto escondo la barra de título de la aplicación
        getActionBar().hide();
        botonLogin = (Button) findViewById(R.id.botonLogin);
        textLoginNewAcccount = (Button) findViewById(R.id.textLoginNewAcccount);

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, FeedActivity.class);
                startActivity(intent);
            }
        });
    }
    public void crearCuenta(View v) {
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}

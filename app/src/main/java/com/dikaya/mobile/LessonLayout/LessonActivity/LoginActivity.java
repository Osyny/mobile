package com.dikaya.mobile.LessonLayout.LessonActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dikaya.mobile.R;

public class LoginActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle stage){
//        super.onCreate(stage);
//
//        setContentView(R.layout.activity_login);
//
//        Button btn  = (Button) findViewById(R.id.btnLogin);
//
//        btn.setOnClickListener(view -> {
//
//            Intent container = new Intent(this,ProfileActivity.class);
//
//            EditText txtLogin = (EditText) findViewById(R.id.txtLoginLogin);
//            EditText txtPassword = (EditText) findViewById(R.id.txtLoginPassword);
//
//            container.putExtra("login",txtLogin.getText());
//            container.putExtra("password",txtPassword.getText());
//
//            startActivity(container);
//        });
//
//        TextView lblRegistered = (TextView)findViewById(R.id.lblRegister);
//    }

    public static final String LOGIN = "LoginActivity_login";

    public static final String PASSWORD = "LoginActivity_password";


    public static final String REGIME = "LoginActivityregime";

    protected void onCreate(Bundle stage){
        super.onCreate(stage);

        setContentView(R.layout.activity_login);

        Button btn  = (Button) findViewById(R.id.btnLogin);

        btn.setOnClickListener(view -> {

            Intent container = new Intent(this,ProfileActivity.class);

            EditText txtLogin = (EditText) findViewById(R.id.txtLoginLogin);
            EditText txtPassword = (EditText) findViewById(R.id.txtPass);


            container.putExtra(LOGIN,txtLogin.getText().toString());
            container.putExtra(PASSWORD,txtPassword.getText().toString());
            container.putExtra(REGIME,ProfileActivity.REGIME_PROFILE);

            startActivity(container);
        });


        TextView lblRegistered = (TextView)findViewById(R.id.lblRegister);
        lblRegistered.setOnClickListener(view -> {

            Intent container = new Intent(this,ProfileActivity.class);

            container.putExtra(REGIME,ProfileActivity.REGIME_REGISTER);

            startActivity(container);

        });
    }
}

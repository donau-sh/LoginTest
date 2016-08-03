package de.gm_w.android.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText)findViewById(R.id.editUsername);
        final EditText etPassword = (EditText)findViewById(R.id.editPassword);
        final Button bLogin = (Button) findViewById(R.id.buttonLogin);
        final TextView registerLink = (TextView)findViewById(R.id.textViewRegisterHere);

        // click register link will open up the register page
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this,
                        RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}

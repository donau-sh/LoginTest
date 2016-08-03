package de.gm_w.android.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etAge = (EditText)findViewById(R.id.editAge);
        final EditText etName = (EditText)findViewById(R.id.editName);
        final EditText etUsername = (EditText)findViewById(R.id.editUsername);
        final EditText etPassword = (EditText)findViewById(R.id.editPassword);
        final Button bRegister = (Button) findViewById(R.id.buttonRegister);
    }
}

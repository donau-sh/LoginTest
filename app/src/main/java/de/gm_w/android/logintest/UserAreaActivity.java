package de.gm_w.android.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText)findViewById(R.id.editUsername);
        final EditText etAge = (EditText)findViewById(R.id.editAge);
        final TextView welcomeMessage = (TextView)findViewById(R.id.textViewWelcomeMsg);
    }
}

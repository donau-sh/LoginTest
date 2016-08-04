package de.gm_w.android.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        // retrieve the data
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", -1);

        EditText etUsername = (EditText)findViewById(R.id.editTextUsername);
        EditText etAge = (EditText)findViewById(R.id.editAge);
        TextView tvWelcomeMessage = (TextView)findViewById(R.id.textViewWelcomeMsg);

        String message = name + "welcome to your user area";
        tvWelcomeMessage.setText(message);
        etUsername.setText(username);
        etAge.setText(age + "");
    }
}

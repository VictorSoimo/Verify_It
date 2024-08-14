package com.food.real_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup userTypeRadioGroup;
    private RadioButton radioUser, radioAdmin;
    private Button btnRegister, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        // Find views by ID
        userTypeRadioGroup = findViewById(R.id.select_usertype);
        radioUser = findViewById(R.id.rb_user);
        radioAdmin = findViewById(R.id.rb_admin);
        btnRegister = findViewById(R.id.register_button);
        btnLogin = findViewById(R.id.login_button);

        // Register Button Click Listener
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = userTypeRadioGroup.getCheckedRadioButtonId();
                if (selectedId == R.id.rb_user) {
                    // Navigate to User Registration
                    Intent intent = new Intent(MainActivity.this, UserRegistrationActivity.class);
                    startActivity(intent);
                } else if (selectedId == R.id.rb_admin) {
                    // Navigate to Admin Registration
                    Intent intent = new Intent(MainActivity.this, AdminRegistrationActivity.class);
                    startActivity(intent);
                }
            }
        });

        // Login Button Click Listener
        /*
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Login Page
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

         */
    }
}

package com.food.real_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class UserRegistrationActivity extends AppCompatActivity {

    private EditText idNumberInput, emailInput, passwordInput, confirmPasswordInput;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_registration);

        // Initialize views
        idNumberInput = findViewById(R.id.email_input);
        emailInput = findViewById(R.id.id_number_input);
        passwordInput = findViewById(R.id.password_input);
        confirmPasswordInput = findViewById(R.id.confirm_password_input);
        registerButton = findViewById(R.id.register_user_btn);

        // Set up button click listener
        registerButton.setOnClickListener(v -> {
            String idNumber = idNumberInput.getText().toString();
            String email = emailInput.getText().toString();
            String password = passwordInput.getText().toString();
            String confirmPassword = confirmPasswordInput.getText().toString();

            if (password == confirmPassword) {
                // Proceed to store in the database
            //  saveToDatabase(idNumber, email, password)
            } else {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

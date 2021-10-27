package com.khalnayak.login;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {


    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    "(?=.*[@#$%^&+=])" +
                    "(?=\\S+$)" +
                    ".{4,}" +
                    "$");

    private static  final Pattern User_Pattern =
            Pattern.compile("^[a-zA-Z0-9._-]{3,}$");


    private static  final Pattern EMAIL_ADDRESS =
            Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");


    private TextInputLayout name;
    private TextInputLayout password;
    private TextInputLayout email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
    }


    private boolean validateUser() {

        String userInput = name.getEditText().getText().toString().trim();

        if (userInput.isEmpty()) {
            name.setError("Enter username.");
            return false;
        }
        else if (!User_Pattern.matcher(userInput).matches()) {
            name.setError("Use minimum three letters and numbers.");
            return false;
        } else {
            name.setError(null);
            return true;
        }
    }

    private boolean validateEmail() {

        String emailInput = email.getEditText().getText().toString().trim();

        if (emailInput.isEmpty()) {
            email.setError("Enter email.");
            return false;
        }

        else if (!EMAIL_ADDRESS.matcher(emailInput).matches()) {
            email.setError("Please enter a valid email.");
            return false;
        } else {
            email.setError(null);
            return true;
        }
    }



    private boolean validatePassword() {
        String passwordInput = password.getEditText().getText().toString().trim();

        if (passwordInput.isEmpty()) {
            password.setError("Enter password.");
            return false;
        }

        else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
            password.setError("Password must have special chars.");
            return false;
        } else {
            password.setError(null);
            return true;
        }
    }

    public void confirmInput(View v) {
        if (!validateUser() | !validatePassword() | !validateEmail()) {
            return;
        }

        String input = "User Name: " + name.getEditText().getText().toString();

        input += "Email: " + email.getEditText().getText().toString();

        input += "Password: " + password.getEditText().getText().toString();

        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();

    }
}

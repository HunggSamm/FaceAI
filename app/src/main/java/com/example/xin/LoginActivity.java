package com.example.xin;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView userNameTextView = findViewById(R.id.userNameTextView);
        EditText userNameEditText = findViewById(R.id.userNameEditText);
        EditText userPassEditText = findViewById(R.id.userPassEditText);
        Button loginButton = findViewById(R.id.loginButton);

        // Nhận tên người dùng từ Intent
        Intent intent = getIntent();
        String userName = intent.getStringExtra("USERNAME");
        String pass = intent.getStringExtra("PASSWORD");
        userNameEditText.setText(userName);
        userPassEditText.setText(pass);
        loginButton.setOnClickListener(v -> {
            // Xử lý đăng nhập tại đây
        });
    }
}

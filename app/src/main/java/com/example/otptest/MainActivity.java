package com.example.otptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button_Login = (Button) findViewById(R.id.Button_Login);
        Button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editUserId = (EditText) findViewById(R.id.editUserId);
                EditText editUserPw = (EditText) findViewById(R.id.editUserPassword);

                if (editUserId.length() > 0 && editUserPw.length() > 0) {
                    Intent intent = new Intent(getApplicationContext(), GoogleOtpInfoActivity.class);
                    intent.putExtra("USER_ID", editUserId.getText().toString());
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "id/pw를 제대로 입력하세요.", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }

    public void doLogin(View v) {
    }


}
package com.example.otptest;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InputOtpActivity extends AppCompatActivity {

    String mAppKEy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_otp);

        Intent intent = getIntent();
        mAppKEy = intent.getExtras().getString("APP_KEY");

        Button Button_OTP = (Button) findViewById(R.id.Button_OTP);
        Button_OTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editOtpNum = (EditText) findViewById(R.id.editOtpNum);
                if(editOtpNum.length()!=6){
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "6자리를 입력해주세요.", Toast.LENGTH_LONG);
                    toast.show();
                    return;
                }
                String otpRandomNumber = editOtpNum.getText().toString();
                GoogleOTP otp = new GoogleOTP();
                boolean bOtpCheck = otp.checkCode(otpRandomNumber, mAppKEy);
                if (bOtpCheck) {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "인증되었습니다.", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "인증실패. OTP번호를 다시 확인해주세요.", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }


}
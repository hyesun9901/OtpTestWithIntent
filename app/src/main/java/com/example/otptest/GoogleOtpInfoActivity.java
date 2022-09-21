package com.example.otptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class GoogleOtpInfoActivity extends AppCompatActivity {
    String mUserID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_otp_info);

        Intent intent = getIntent();
        mUserID = intent.getExtras().getString("USER_ID");

        String companyURL = "softcamptest.com"; //안드로이드 빌드 시 세팅되어있는 bundle name같은거 가져오면될듯

        GoogleOTP otp = new GoogleOTP();
        HashMap<String, String> map = otp.generate(mUserID, companyURL);

           //사용자에게 알려줄 Url과 encodekey
//        String url = map.get("url");
//        TextView editURL = (TextView) findViewById(R.id.editURL);
//        editURL.setText(url);

        String googleOtpAppkey = map.get("encodedKey");
        TextView editSecretKey = (TextView) findViewById(R.id.textViewUserPrivateKey);
        editSecretKey.setText(googleOtpAppkey);

        Button Button_complete = (Button) findViewById(R.id.Button_complete);
        Button_complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv_SecretKey = (TextView) findViewById(R.id.textViewUserPrivateKey);

                if (tv_SecretKey.getText().toString().length() > 0) {
                    Intent intent = new Intent(getApplicationContext(), InputOtpActivity.class);
                    intent.putExtra("APP_KEY", tv_SecretKey.getText().toString());
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "Google OTP 로직에서 오류난듯?", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


        //누르고 있으면 클립보드에 App key를 복사해줌
        TextView textView = (TextView) findViewById(R.id.textViewUserPrivateKey);
        String id = textView.getText().toString();
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipboardManager cManager = (ClipboardManager)  getApplicationContext().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData cData = ClipData.newPlainText("text", textView.getText());
                cManager.setPrimaryClip(cData);
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, "클립보드에 복사됨!!", Toast.LENGTH_LONG);
                toast.show();

                return true;
            }
        });

    }

    public void goToInputOtpActivity(View v) {
    }
}
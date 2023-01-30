package com.example.bwcovidcentral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mRegBtn, mLogInBtn, mStatsBtn, mTestingSites, mVaccineSites, mqrScanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRegBtn= findViewById(R.id.regBtn);
        mLogInBtn= findViewById(R.id.loginBtn);
        mStatsBtn= findViewById(R.id.statsBtn);
        mTestingSites= findViewById(R.id.testingS);
        mVaccineSites= findViewById(R.id.vaccineS);
        mqrScanner= findViewById(R.id.qrScanner);

        mRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        mLogInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        mStatsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CovidStats.class);
                startActivity(intent);
            }
        });
        mqrScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScanQrActivity.class);
                startActivity(intent);
            }
        });
        mTestingSites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/search/clinics/@-24.5972141,25.8850548,13z/data=!3m1!4b1?hl=en");
            }
        });
        mVaccineSites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/search/clinics/@-24.5972141,25.8850548,13z/data=!3m1!4b1?hl=en");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
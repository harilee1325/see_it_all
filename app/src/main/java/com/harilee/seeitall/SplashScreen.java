package com.harilee.seeitall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.harilee.seeitall.RegisterLogin.LoginPage;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(()
                -> startActivity(new Intent(SplashScreen.this, LoginPage.class)), 2000);
    }
}

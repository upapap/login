package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.loginpage.R;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIMEOUT = 2000;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageview = findViewById(R.id.imageView2);
        imageview.setImageResource(R.drawable.symbol_1);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run(){
                Intent intent = new Intent(SplashActivity.this, com.example.loginpage.MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIMEOUT);


    }
}
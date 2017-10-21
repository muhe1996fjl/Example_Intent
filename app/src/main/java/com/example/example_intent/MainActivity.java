package com.example.example_intent;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SkipToActivity2(View view){
        Intent intent_actvity2 = new Intent();
        intent_actvity2.setAction("android.intent.action.skiptoActivity2");
        startActivity(intent_actvity2);
    }

    public void OpenBrower(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jianshu.com")));
    }

}

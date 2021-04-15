package com.example.projek2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AppsDetail extends AppCompatActivity {

    TextView tv2Template1, tv2Template2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps_detail);

        tv2Template1 = findViewById(R.id.tv2_template1);
        tv2Template2 = findViewById(R.id.tv2_template2);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        String judul = getIntent().getStringExtra("judul_apps");
        String desc = getIntent().getStringExtra("desc_apps");

        setDataActivity(judul, desc);
    }
    private void setDataActivity(String judul, String desc){
        tv2Template1.setText(judul);
        tv2Template2.setText(desc);
    }
}
package com.example.projek2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvApps;
    private ArrayList<AppsModel> listApps = new ArrayList<>();
    private Button btnTemplate1, btnTemplate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvApps = findViewById(R.id.rv_apps);
        rvApps.setHasFixedSize(true);
        listApps.addAll(AppsData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rvApps.setLayoutManager(new LinearLayoutManager(this));
        AppsAdapter appsAdapter = new AppsAdapter(this);
        appsAdapter.setAppsModels(listApps);
        rvApps.setAdapter(appsAdapter);
    }
}
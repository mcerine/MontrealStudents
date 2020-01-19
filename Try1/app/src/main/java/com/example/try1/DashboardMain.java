package com.example.try1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DashboardMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_main);
    }

    public void sendDashboardMain(View view){
        Intent intent = new Intent(this, DashboardMain.class);
        startActivity(intent);
    }
}

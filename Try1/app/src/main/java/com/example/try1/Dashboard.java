package com.example.try1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void sendProgram(View view){
        Intent intent = new Intent(this, Program.class);
        startActivity(intent);
    }

    public void sendResources(View view){
        Intent intent = new Intent(this, Resources.class);
        startActivity(intent);
    }

    public void sendClasses(View view){
        Intent intent = new Intent(this, Classes.class);
        startActivity(intent);
    }

    public void sendTuition(View view){
        Intent intent = new Intent(this, Tuition.class);
        startActivity(intent);
    }
}

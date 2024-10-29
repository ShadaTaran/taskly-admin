package com.example.tasklyadmin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainMenu extends AppCompatActivity {
    private ImageButton buttonUser;
    private ImageButton buttonView;
    private ImageButton buttonStat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        buttonUser = (ImageButton)findViewById(R.id.userbtn);
        buttonView = (ImageButton)findViewById(R.id.viewtaskbtn);
        buttonStat = (ImageButton)findViewById(R.id.statbtn);

        buttonUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, UserManagement.class);
                startActivity(intent);
            }
        });

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, TaskManagement.class);
                startActivity(intent);
            }
        });

        buttonStat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, StatisticPage.class);
                startActivity(intent);
            }
        });
    }
}

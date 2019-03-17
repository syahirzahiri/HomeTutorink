package com.as.hometutorink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JobListSecondary extends AppCompatActivity {

    Button job_primary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_list_secondary);

        job_primary = findViewById(R.id.primarybtnlist);

        job_primary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSecondary = new Intent(JobListSecondary.this,JobListPrimary.class);
                startActivity(toSecondary);
            }
        });


    }
}
package com.example.androidattendancesystem.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.androidattendancesystem.R;


public class HomeActivity extends AppCompatActivity {

    LinearLayout lyt_student_attendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lyt_student_attendance=findViewById(R.id.lyt_student_attendance);

        lyt_student_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), AttendanceActivity.class);
                startActivity(intent);
            }
        });
    }
}

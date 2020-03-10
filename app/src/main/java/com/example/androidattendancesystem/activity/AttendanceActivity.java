package com.example.androidattendancesystem.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidattendancesystem.R;
import com.example.androidattendancesystem.adarper.AttendenceAdapter;
import com.example.androidattendancesystem.model.AttendenceModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceActivity extends AppCompatActivity {

    private List<AttendenceModel> attendenceModelArrayList = new ArrayList<>();
    private RecyclerView rv_student_list;
    private AttendenceAdapter mAdapter;
    TextView txt_date;
    final Context context = this;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence);

        rv_student_list = findViewById(R.id.rv_student_list);
        btn_submit = findViewById(R.id.btn_submit);

        txt_date =findViewById(R.id.txt_date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd ");
        String currentDateandTime = sdf.format(new Date());
        txt_date.setText("Date: "+currentDateandTime);



        mAdapter = new AttendenceAdapter(attendenceModelArrayList, getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv_student_list.setLayoutManager(mLayoutManager);
        rv_student_list.setItemAnimator(new DefaultItemAnimator());
        rv_student_list.setAdapter(mAdapter);

        prepareMovieData();


        btn_submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom);
                dialog.setTitle("Title...");

                LinearLayout cancel,confirm;

                cancel = dialog.findViewById(R.id.cancel);
                confirm = dialog.findViewById(R.id.confirm);
                // if button is clicked, close the custom dialog
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                confirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

    }

    private void prepareMovieData() {
        AttendenceModel attendenceModel = new AttendenceModel("Papia Reza", 1, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Harun-Or-Rashid", 3, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Samim Hossain", 4, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Tanveer Islam", 5, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Md. Sohel Rana", 6, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Md. Rezaul Karim", 7, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Md. Anisul Islam", 8, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Rebeka Sultana", 9, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Md. Abdul Motin", 9, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);

        attendenceModel = new AttendenceModel("Aklima Akter", 9, false, false, false, false);
        attendenceModelArrayList.add(attendenceModel);


        //mAdapter.notifyDataSetChanged();
    }
}
package com.example.androidattendancesystem.adarper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidattendancesystem.R;
import com.example.androidattendancesystem.model.AttendenceModel;

import java.util.List;

public class AttendenceAdapter extends RecyclerView.Adapter<AttendenceAdapter.ViewHolder> {
    private List<AttendenceModel> attendenceModels;
    private Context mActivity;


    // RecyclerView recyclerView;
    public AttendenceAdapter(List<AttendenceModel> attendenceModels, Context mActivity) {
        this.attendenceModels = attendenceModels;
        this.mActivity = mActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_student_attendence, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final AttendenceModel attendenceModel = attendenceModels.get(position);
        holder.student_name.setText(attendenceModel.getName());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mActivity, "" + attendenceModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return attendenceModels.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView student_name;


        public ViewHolder(View itemView) {
            super(itemView);

            this.student_name = itemView.findViewById(R.id.student_name);

        }

    }


}
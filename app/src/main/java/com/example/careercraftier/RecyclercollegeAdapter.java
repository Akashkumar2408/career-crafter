package com.example.careercraftier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclercollegeAdapter extends RecyclerView.Adapter<RecyclercollegeAdapter.collegeViewHolder> {

    Context context;
    ArrayList<post_layout_data> arrpost;
    public RecyclercollegeAdapter(Context context, ArrayList<post_layout_data> arrpost) {
        this.context=context;
        this.arrpost=arrpost;
    }

    @NonNull
    @Override
    public collegeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.post_layout,parent,false);
        collegeViewHolder collegeViewHolder=new collegeViewHolder(view);
        return collegeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull collegeViewHolder holder, int position) {
        holder.imgcollege.setImageResource(arrpost.get(position).collegeimg);
        holder.txtcollegename.setText(arrpost.get(position).collegename);
        holder.txtcollegestate.setText(arrpost.get(position).collegestate);
        holder.txtcollegecity.setText(arrpost.get(position).collegecity);
        holder.txtcollegeaddres.setText(arrpost.get(position).collegeaddress);
        holder.Txtcollegecontact.setText(arrpost.get(position).collegecontact);

    }

    @Override
    public int getItemCount() {
        return arrpost.size();
    }

    public class collegeViewHolder extends RecyclerView.ViewHolder {

        TextView txtcollegename,txtcollegestate,txtcollegecity,txtcollegeaddres,Txtcollegecontact;
        ImageView imgcollege;
        public collegeViewHolder(@NonNull View itemView) {
            super(itemView);
            txtcollegename=itemView.findViewById(R.id.collegename);
            txtcollegestate=itemView.findViewById(R.id.collegestate);
            txtcollegecity=itemView.findViewById(R.id.collegecity);
            txtcollegeaddres=itemView.findViewById(R.id.collegeaddress);
            Txtcollegecontact=itemView.findViewById(R.id.collegecontact);
            imgcollege=itemView.findViewById(R.id.collegeimg);

        }
    }

}

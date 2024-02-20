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

public class RecyclercollegeAdapter extends RecyclerView.Adapter<RecyclercollegeAdapter.ViewHolder> {

    Context context;
    ArrayList<post_layout_data>arrposts;
    public RecyclercollegeAdapter(Context context, ArrayList<post_layout_data> arrposts) {
        this.context=context;
        this.arrposts=arrposts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.post_layout,parent,false);
        ViewHolder ViewHolder=new ViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgcollege.setImageResource(arrposts.get(position).collegeimg);
        holder.txtcollegename.setText(arrposts.get(position).collegename);
        holder.txtcollegestate.setText(arrposts.get(position).collegestate);
        holder.txtcollegecity.setText(arrposts.get(position).collegecity);
        holder.txtcollegeaddres.setText(arrposts.get(position).collegeaddress);
        holder.Txtcollegecontact.setText(arrposts.get(position).collegecontact);
    }

    @Override
    public int getItemCount() {
        return arrposts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtcollegename,txtcollegestate,txtcollegecity,txtcollegeaddres,Txtcollegecontact;
        ImageView imgcollege;
        public ViewHolder(@NonNull View itemView) {
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

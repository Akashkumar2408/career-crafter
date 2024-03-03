package com.example.careercraftier;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class collegeslist extends AppCompatActivity {

    ArrayList<post_layout_data> arrposts=new ArrayList<>();
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collegeslist);

        RecyclerView recyclerView=findViewById(R.id.recyclpost);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrposts.add(new post_layout_data(R.drawable.tn1,"T N Rao college","Gujarat","rajkot",
                "behind Saurashtra University, Saurashtra University Campus, Munjka, Rajkot, Gujarat 360005","0281 297 0471"));
        arrposts.add(new post_layout_data(R.drawable.marwadi,"Marwadi University","Gujarat","rajkot",
                "Marwadi University, Rajkot, Gujarat 360003","+91-0281-2563445"));
        arrposts.add(new post_layout_data(R.drawable.atmiya1,"Atmiya college","Gujarat","rajkot",
                "Atmiya University \"Yogidham Gurukul\" Kalawad Road, Rajkot-360005 Gujarat","+91-0281-2563445"));
        arrposts.add(new post_layout_data(R.drawable.tn1,"T N Rao college","Gujarat","rajkot",
                "behind Saurashtra University, Saurashtra University Campus, Munjka, Rajkot, Gujarat 360005","0281 297 0471"));
        arrposts.add(new post_layout_data(R.drawable.marwadi,"Marwadi University","Gujarat","rajkot",
                "Marwadi University, Rajkot, Gujarat 360003","+91-0281-2563445"));
        arrposts.add(new post_layout_data(R.drawable.atmiya1,"Atmiya college","Gujarat","rajkot",
                "Atmiya University \"Yogidham Gurukul\" Kalawad Road, Rajkot-360005 Gujarat","+91-0281-2563445"));
        arrposts.add(new post_layout_data(R.drawable.tn1,"T N Rao college","Gujarat","rajkot",
                "behind Saurashtra University, Saurashtra University Campus, Munjka, Rajkot, Gujarat 360005","0281 297 0471"));
        arrposts.add(new post_layout_data(R.drawable.marwadi,"Marwadi University","Gujarat","rajkot",
                "Marwadi University, Rajkot, Gujarat 360003","+91-0281-2563445"));
        arrposts.add(new post_layout_data(R.drawable.atmiya1,"Atmiya college","Gujarat","rajkot",
                "Atmiya University \"Yogidham Gurukul\" Kalawad Road, Rajkot-360005 Gujarat","+91-0281-2563445"));



        RecyclercollegeAdapter collegeAdapter=new RecyclercollegeAdapter(this,arrposts);
        recyclerView.setAdapter(collegeAdapter);

    }

}
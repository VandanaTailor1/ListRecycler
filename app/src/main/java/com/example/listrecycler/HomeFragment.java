package com.example.listrecycler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    List<String> list=new ArrayList<>();
    List<String> list1=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v= inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = v.findViewById(R.id.recycle);
        LinearLayoutManager mg=new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(mg);

        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");
        list.add("Name1");


        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");
        list1.add("msg");

        ListRecycle rs=new ListRecycle(getContext(),list,list1);
        recyclerView.setAdapter(rs);
        return v;
    }
}
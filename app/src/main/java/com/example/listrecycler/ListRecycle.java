package com.example.listrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListRecycle extends RecyclerView.Adapter<ListRecycle.RecylerViewHolder> {
     Context context;
     List<String> list;
    List<String> list1;

    public ListRecycle(Context context,List<String> list,List<String> list1) {
        this.context = context;
        this.list=list;
        this.list1=list1;
    }

    @NonNull
    @Override
    public RecylerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
    RecylerViewHolder rs=new RecylerViewHolder(v);
        return rs;
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerViewHolder holder, int position) {
         holder.txt1.setText(list.get(position));
        holder.txt2.setText(list1.get(position));
    }

    @Override
    public int getItemCount() {
       return list.size();
    }

    public class RecylerViewHolder extends RecyclerView.ViewHolder{
      TextView txt1;
      TextView txt2;
        public RecylerViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.second);
            txt2=itemView.findViewById(R.id.third);
        }
    }
}

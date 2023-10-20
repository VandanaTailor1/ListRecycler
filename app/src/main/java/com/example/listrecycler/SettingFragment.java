package com.example.listrecycler;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SettingFragment extends Fragment {
    Button button;

    EditText edt1;
    EditText edt2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v= inflater.inflate(R.layout.fragment_setting, container, false);

      button=v.findViewById(R.id.loginButton);
      edt1=v.findViewById(R.id.email);
      edt2=v.findViewById(R.id.password);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent =new Intent(getContext(),DataActivity.class);
              intent.putExtra("name",edt1.getText().toString());
              intent.putExtra("name1",edt2.getText().toString());
              startActivity(intent);
          }
      });

        return  v;
    }
}
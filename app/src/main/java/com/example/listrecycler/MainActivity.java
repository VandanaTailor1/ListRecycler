package com.example.listrecycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
          ImageView imgv;
          DrawerLayout drw;
          BottomNavigationView bottom;
          NavigationView navigation;
          int progress=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loadFragment(new HomeFragment());
       bottom=findViewById(R.id.bottom);
       navigation =findViewById(R.id.navbar);
        drw=findViewById(R.id.drawer);
        imgv =findViewById(R.id.img);
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  drw.openDrawer(GravityCompat.START);
            }
        });

       navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               if(item.getItemId()==R.id.person){
                   loadFragment(new HomeFragment());
                   drw.closeDrawer(GravityCompat.START);
               } else if (item.getItemId()==R.id.event) {
                   loadFragment(new SettingFragment());
                   drw.closeDrawer(GravityCompat.START);
               } else if (item.getItemId()==R.id.group) {
                    loadFragment(new PersonFragment());
                   drw.closeDrawer(GravityCompat.START);
               }
               return false;
           }
       });

     bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
         @Override
         public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             if(item.getItemId()==R.id.setting){
               loadFragment(new SettingFragment());
             } else if (item.getItemId()==R.id.person) {
                 loadFragment(new HomeFragment());
             }else if(item.getItemId()==R.id.home){
                 loadFragment(new HomeFragment());
             }
             return false;
         }
     });
    }
    private void loadFragment(Fragment fragment){
        FragmentManager fm=  getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("start","Start the Mathod");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resume","Resume call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("paush","Paush the method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop","Stop the method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("restart","Restart the method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy","Destroy ");
    }
}
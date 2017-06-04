package com.example.arrayadapternew;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DetailFragment detailFragment=new DetailFragment();
        SampleFragment sampleFragment=new SampleFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentManager fragmentManager1=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.samplelayout,sampleFragment).commit();
        fragmentManager1.beginTransaction().replace(R.id.detaillayout,detailFragment).commit();
    }
}

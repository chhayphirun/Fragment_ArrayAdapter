package com.example.arrayadapternew;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment extends Fragment {

ArrayList<String>         list=new ArrayList<>();

    public SampleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list.add("Window 10");
        list.add("Mac OS");
        list.add("Linux");
        list.add("IOS");
        list.add("Andorid");
        list.add("Window 10");
        list.add("Mac OS");
        list.add("Linux");
        list.add("IOS");
        list.add("Andorid");
        list.add("Window 10");
        list.add("Mac OS");
        list.add("Linux");
        list.add("IOS");
        list.add("Andorid");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,list);
        ListView lvdata= (ListView) view.findViewById(R.id.lvdata);
        lvdata.setAdapter(adapter);
        final DetailFragment detailFragment=new DetailFragment();

        lvdata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            detailFragment.updateText((String) parent.getItemAtPosition(position));

            }
        });



    }
}

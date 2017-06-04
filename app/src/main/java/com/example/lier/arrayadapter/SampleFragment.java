package com.example.lier.arrayadapter;


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


    public SampleFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sample, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView lvdata;
        final ArrayList<String> data=new ArrayList<>();
        data.add("Window10");
        data.add("Max OS");
        data.add("ANDORID");
        data.add("IOS");
        data.add("Window10");
        data.add("Max OS");
        data.add("ANDORID");
        data.add("IOS");
        data.add("Window10");
        data.add("Max OS");
        data.add("ANDORID");
        data.add("IOS");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,data);
        lvdata= (ListView) view.findViewById(R.id.lvData);
        lvdata.setAdapter(adapter);
        final DetailFragment detailFragment=new DetailFragment();
//        final FragmentManager fragmentManager=getFragmentManager();
        lvdata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*Bundle bundle=new Bundle();
                bundle.putString("Itemselect",dataselected);
                detailFragment.setArguments(bundle);*/

                detailFragment.updateText1(data.get(position));
//                    fragmentManager.beginTransaction().replace(R.id.detaillayout,detailFragment).commit();


            }
        });

    }
}

package com.example.lier.arrayadapter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
    static TextView tvdetail;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_detail, container, false);
        // Inflate the layout for this fragment
        tvdetail= (TextView) view.findViewById(R.id.tvdetail);
        Bundle bundle=getArguments();

        if(bundle!=null){
            if(bundle.getString("Itemselect")!=null){
                tvdetail.setText(bundle.getString("Itemselect"));
            }
        }

                return view;
    }
    protected void updateText1(String brand){
        tvdetail.setText(brand);


    }


}

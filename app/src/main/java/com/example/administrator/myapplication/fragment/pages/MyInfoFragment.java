package com.example.administrator.myapplication.fragment.pages;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;


public class MyInfoFragment extends Fragment {
View view ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view==null) {
            view=inflater.inflate(R.layout.fragment_my_info, null);
        }
        return view;
    }

}

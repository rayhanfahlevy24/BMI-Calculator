package com.binus.bmicalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Result extends Fragment {

    TextView result;

    public Result() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        result = view.findViewById(R.id.textViewResult);

        Bundle bundle = getArguments();
        int userWeight = bundle.getInt("weight");
        int userHeight = bundle.getInt("height");

        double userBmi = (userWeight * 1000) / (userHeight * userHeight);

        result.setText("Your BMI is: " + userBmi);

        return view;

    }
}
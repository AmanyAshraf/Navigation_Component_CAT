package com.pactise.navigationcomponentcat.UI.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pactise.navigationcomponentcat.R;


public class WelcomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcom, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView =view.findViewById(R.id.tv1);
        TextView textView1 =view.findViewById(R.id.tv2);
        String username =WelcomeFragmentArgs.fromBundle(getArguments()).getUsername();
        String password =WelcomeFragmentArgs.fromBundle(getArguments()).getPassword();
        textView.setText(username);
        textView1.setText(password);

    }
}
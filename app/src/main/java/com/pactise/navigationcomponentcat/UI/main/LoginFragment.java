package com.pactise.navigationcomponentcat.UI.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.pactise.navigationcomponentcat.R;


public class LoginFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText username =view.findViewById(R.id.et1);
        EditText password =view.findViewById(R.id.et2);
        Button button =view.findViewById(R.id.btn_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=  username.getText().toString();
                String pass=  password.getText().toString();
              NavDirections action= LoginFragmentDirections.actionLoginFragmentToWelcomFragment(name,pass);
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}
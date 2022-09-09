package com.example.myapplication.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.myapplication.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private View root;

    private String ss="";

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        ss=""+index;
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, final ViewGroup container,
            Bundle savedInstanceState) {

        if(ss.equals("1")){
            root = inflater.inflate(R.layout.fragment_main, container, false);
            final TextView textView = root.findViewById(R.id.section_label);
            textView.setText("diarias");
        }
        if(ss.equals("2")){
            root = inflater.inflate(R.layout.mensuales, container, false);
            final TextView textView = root.findViewById(R.id.section_label);
            textView.setText("mensual");
        }
        if(ss.equals("3")){
            root = inflater.inflate(R.layout.anuales, container, false);
            final TextView textView = root.findViewById(R.id.section_label);
            textView.setText("anual");
        }
        return root;
    }

    public void diarias(View root){

    }
    public void mensual(View root){

    }
    public void anual(View root){

    }

}
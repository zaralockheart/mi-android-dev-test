package com.miandroidchallenge.ucoppp.miandroidchallenge.ui.unselecteddetailsfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.miandroidchallenge.ucoppp.miandroidchallenge.R;

public class UnselectedDetailsFragment extends Fragment {

    public static UnselectedDetailsFragment newInstance() {

        Bundle args = new Bundle();

        UnselectedDetailsFragment fragment = new UnselectedDetailsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_unselected_details, container, false);
    }
}

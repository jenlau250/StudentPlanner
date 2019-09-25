package com.jen.android.studentplanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StudentPlannerFragment extends Fragment {

    private static final String TAG = "StudentPlannerFragment";

    private RecyclerView mHomeRecyclerView;

    public static StudentPlannerFragment newInstance() {
        return new StudentPlannerFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_student_planner, container, false);
        mHomeRecyclerView = v.findViewById(R.id.student_recycler_view);
        mHomeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }

}

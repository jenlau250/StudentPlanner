package com.jen.android.studentplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class StudentPlannerActivity extends SingleFragmentActivity {
//
//    public static Intent newIntent(Context context) {
//        return new Intent(context, StudentPlannerActivity.class);
//    }

    @Override
    protected Fragment createFragment() {
        return StudentPlannerFragment.newInstance();
    }



}
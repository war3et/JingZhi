package com.shanghai.jingzhi.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shanghai.jingzhi.R;
import com.shanghai.jingzhi.jingzhiutils.Log;

/**
 * Created by zhaowenyun on 16/5/30.
 */
public class F_L_C extends Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = view == null ? inflater.inflate(R.layout.f_l_c,null):view;
        Log.d("F_L_C-onCreateView,view-"+view);
        return view;
    }
}

package com.example.mobileappdevelop.fragmentdemo.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mobileappdevelop.fragmentdemo.R;

/**
 * Created by Mobile App Develop on 27-7-16.
 */
public class StartFragment extends Fragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e("VIVZ", "on Create fragment");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("VIVZ", "on CreateView Fragment");
        return inflater.inflate(R.layout.start_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.e("VIVZ", "on Activity Create Fragment");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e("VIVZ", "on Start Fragment");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e("VIVZ", "on Resume Fragment");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e("VIVZ", "on Pause Fragment");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.e("VIVZ", "on Save Fragment");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.e("VIVZ", "on Stop Fragment");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e("VIVZ", "on DestroyView Fragment");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e("VIVZ", "on Destroy Fragment");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e("VIVZ", "on Detach Fragment");
        super.onDetach();
    }
}

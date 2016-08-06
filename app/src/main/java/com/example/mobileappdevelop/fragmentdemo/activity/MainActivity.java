package com.example.mobileappdevelop.fragmentdemo.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mobileappdevelop.fragmentdemo.R;
import com.example.mobileappdevelop.fragmentdemo.fragment.FragmentOne;
import com.example.mobileappdevelop.fragmentdemo.fragment.FragmentTwo;
import com.example.mobileappdevelop.fragmentdemo.fragment.StartFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StartFragment startFragment = new StartFragment();
        fragmentTransaction.replace(R.id.myFragment, startFragment);
        fragmentTransaction.commit();


    }

    public void replace(View view) {
        Fragment newFragemnt;
        switch (view.getId()) {
            case R.id.btnOne:
                newFragemnt = new FragmentOne();
                break;
            case R.id.btnTwo:
                newFragemnt = new FragmentTwo();
                break;

            default:
                newFragemnt = new StartFragment();
                break;
        }

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.replace(R.id.myFragment, newFragemnt);
        fragmentTransaction.commit();
    }
}

package com.example.mobileappdevelop.fragmentdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mobileappdevelop.fragmentdemo.R;
import com.example.mobileappdevelop.fragmentdemo.activity.Team;
import com.example.mobileappdevelop.fragmentdemo.activity.TeamAdapter;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 27-7-16.
 */
public class FragmentTwo extends Fragment {

    ListView listView;
    ArrayList<Team> teams;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_row, container, false);
        listView = (ListView) rootView.findViewById(R.id.TeamListView);

        Team  team = new Team();
        teams = team.getAllTeam();
        ArrayAdapter<Team> teamAdapter;
        teamAdapter = new TeamAdapter(getActivity(), teams);
        return rootView;
    }

}

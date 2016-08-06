package com.example.mobileappdevelop.fragmentdemo.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mobileappdevelop.fragmentdemo.R;

import java.util.ArrayList;

/**
 * Created by AL ASIF on 8/6/2016.
 */
public class TeamAdapter extends ArrayAdapter<Team> {
public TeamAdapter(Context context, ArrayList<Team> teams) {
        super(context, R.layout.list_row, teams);
        this.context = context;
        this.teams = teams;
        }

private Context context;
private ArrayList<Team> teams;

private class viewHolder{
    TextView teamNameText ;
    TextView teamPhone ;
    TextView teamEmail ;
    ImageView teamPic ;
}



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder vi = new viewHolder();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row, null,true);

            vi.teamNameText = (TextView) convertView.findViewById(R.id.dayTextView);
            vi.teamPhone = (TextView) convertView.findViewById(R.id.upperTemperatureTextView);
            vi.teamEmail = (TextView) convertView.findViewById(R.id.lowerTemperatureTextView);
            vi.teamPic = (ImageView) convertView.findViewById(R.id.weatherImageTextView);
            convertView.setTag(vi);
        }
        else{
            vi = (viewHolder) convertView.getTag();
        }

        vi.teamNameText.setText(teams.get(position).getTeamNameText());
        vi.teamPic.setImageResource(teams.get(position).getTeamImageId());
        vi.teamPhone.setText(teams.get(position).getTeamPhoneText());
        vi.teamEmail.setText(teams.get(position).getTeamEmailText());
        return convertView;
    }

}

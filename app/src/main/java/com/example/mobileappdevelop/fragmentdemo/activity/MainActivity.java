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

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ForecastServiceAPI forecastServiceAPI;


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

    private void networkLibraryInitialize() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        forecastServiceAPI = retrofit.create(ForecastServiceAPI.class);

    }

    public void getForecastData() {
        Call<ForecastResponse> forecastCall = forecastServiceAPI.getAllPoet();
        forecastCall.enqueue(new Callback<ForecastResponse>() {
            @Override
            public void onResponse(Call<ForecastResponse> call, Response<ForecastResponse> response) {
//                ForecastResponse forecastResponse = response.body();
//                List<ForecastResponse.Forecast> alltimes = forecastResponse.Forecast.g
            }

            @Override
            public void onFailure(Call<ForecastResponse> call, Throwable t) {

            }
        });
    }

}



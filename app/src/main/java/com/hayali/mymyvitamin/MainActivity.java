package com.hayali.mymyvitamin;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private MediaPlayer mediaPlayer;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaPlayer = MediaPlayer.create(this, R.raw.sound_click);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1707823485728314/8630698321");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());



        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
               .build();



        mAdView.loadAd(adRequest);


    }




    public void gofruit(View view) {


        intent = new Intent(getApplicationContext(), ActivityFruitandVegit.class);
        intent.putExtra("id", 1);
        startActivity(intent);
        mediaPlayer.start();
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });
    }







    public void govigeti(View view) {

        intent = new Intent(getBaseContext(), ActivityFruitandVegit.class);
        intent.putExtra("id", 2);
        startActivity(intent);
        mediaPlayer.start();
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });
    }

    public void godrinks(View view) {

        intent = new Intent(getBaseContext(), ActivityFruitandVegit.class);
        intent.putExtra("id", 3);
        startActivity(intent);
        mediaPlayer.start();

    }


    public void gomeat(View view) {

        intent = new Intent(getBaseContext(), ActivityFruitandVegit.class);
        intent.putExtra("id", 4);
        startActivity(intent);
        mediaPlayer.start();

    }

    public void gopills(View view) {


        intent = new Intent(getBaseContext(), ActivityFruitandVegit.class);
        intent.putExtra("id", 5);
        startActivity(intent);
        mediaPlayer.start();

    }

    public void gomlegumes(View view) {

        intent = new Intent(getBaseContext(), ActivityFruitandVegit.class);
        intent.putExtra("id", 6);
        startActivity(intent);
        mediaPlayer.start();

    }


    public void goeggs(View view) {

        intent = new Intent(getBaseContext(), ActivityFruitandVegit.class);
        intent.putExtra("id", 7);
        startActivity(intent);
        mediaPlayer.start();

    }

    public void goother(View view) {

        intent = new Intent(getBaseContext(), ActivityFruitandVegit.class);
        intent.putExtra("id", 8);
        startActivity(intent);
        mediaPlayer.start();

    }

}



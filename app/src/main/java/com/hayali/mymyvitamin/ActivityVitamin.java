package com.hayali.mymyvitamin;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class ActivityVitamin extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        listView = findViewById(R.id.seeting);

        Intent ut = getIntent();
        String sn = ut.getStringExtra("id");

        if (sn.equals(getResources().getString(R.string.apple))) {
            String[] apple = getResources().getStringArray(R.array.apple);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, apple);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.banana))) {
            String[] banana = getResources().getStringArray(R.array.banana);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, banana);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.pomegranate))) {
            String[] pomegranate = getResources().getStringArray(R.array.pomegranate);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, pomegranate);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.grib))) {
            String[] grib = getResources().getStringArray(R.array.grib);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, grib);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.orange))) {
            String[] orange = getResources().getStringArray(R.array.orange);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, orange);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.Pineapple))) {
            String[] pineapple = getResources().getStringArray(R.array.Pineapple);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, pineapple);
            listView.setAdapter(adapter);
        } else if (sn.equals(getResources().getString(R.string.lemon))) {
            String[] lemon = getResources().getStringArray(R.array.lemon);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, lemon);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.melon))) {
            String[] melon = getResources().getStringArray(R.array.melon);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, melon);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.olives))) {
            String[] olives = getResources().getStringArray(R.array.olives);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, olives);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.peach))) {
            String[] peach = getResources().getStringArray(R.array.peach);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, peach);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.quince))) {
            String[] quince = getResources().getStringArray(R.array.quince);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, quince);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.Strawberries))) {
            String[] strawberries = getResources().getStringArray(R.array.Strawberries);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, strawberries);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.watermelon))) {
            String[] watermelon = getResources().getStringArray(R.array.watermelon);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, watermelon);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.kiwi))) {
            String[] kiwi = getResources().getStringArray(R.array.kiwi);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, kiwi);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.blueberry))) {
            String[] blueberry = getResources().getStringArray(R.array.blueberry);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, blueberry);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.carrots))) {
            String[] carrots = getResources().getStringArray(R.array.carrots);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, carrots);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.cherries))) {
            String[] cherries = getResources().getStringArray(R.array.cherries);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, cherries);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.coconut))) {
            String[] coconut = getResources().getStringArray(R.array.Coconut);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, coconut);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.dates))) {
            String[] dates = getResources().getStringArray(R.array.Dates);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, dates);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.avocado))) {
            String[] Avocado = getResources().getStringArray(R.array.avocado);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Avocado);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.apricot))) {
            String[] Apricot = getResources().getStringArray(R.array.apricot);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Apricot);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.tamarind))) {
            String[] Tamarind = getResources().getStringArray(R.array.tamarind);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Tamarind);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.pear))) {
            String[] Pear = getResources().getStringArray(R.array.Pear);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Pear);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.figs))) {
            String[] Figs = getResources().getStringArray(R.array.Figs);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Figs);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.mango))) {
            String[] Mango = getResources().getStringArray(R.array.Mango);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Mango);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.plum))) {
            String[] Plum = getResources().getStringArray(R.array.plum);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Plum);
            listView.setAdapter(adapter);


            //vegetable


        } else if (sn.equals(getResources().getString(R.string.tmato))) {
            String[] Tomatoes = getResources().getStringArray(R.array.Tomatoes);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Tomatoes);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.batata))) {
            String[] Potato = getResources().getStringArray(R.array.Potato);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Potato);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.bathngan))) {
            String[] Aubergine = getResources().getStringArray(R.array.Aubergine);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Aubergine);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.green_beans))) {
            String[] greenbeans = getResources().getStringArray(R.array.greenbeans);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, greenbeans);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.onions))) {
            String[] Onions = getResources().getStringArray(R.array.Onions);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Onions);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.okra))) {
            String[] Okra = getResources().getStringArray(R.array.Okra);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Okra);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.zucchini))) {
            String[] zucchini = getResources().getStringArray(R.array.zucchini);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, zucchini);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.cauliflowe))) {
            String[] cauliflower = getResources().getStringArray(R.array.cauliflower);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, cauliflower);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.celery))) {
            String[] celery = getResources().getStringArray(R.array.celery);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, celery);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.cowpea))) {
            String[] cowpeanc = getResources().getStringArray(R.array.cowpeanc);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, cowpeanc);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.hotpepper))) {
            String[] hotpapper = getResources().getStringArray(R.array.hotpapper);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, hotpapper);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.peas))) {
            String[] peas = getResources().getStringArray(R.array.peas);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, peas);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.brocoli))) {
            String[] Broccoli = getResources().getStringArray(R.array.Broccoli);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Broccoli);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.ginger))) {
            String[] Ginger = getResources().getStringArray(R.array.ginger);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Ginger);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.reedbeets))) {
            String[] Reedbeets = getResources().getStringArray(R.array.reedbeats);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Reedbeets);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.pumpkin))) {
            String[] pumpkin = getResources().getStringArray(R.array.pumpkin);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, pumpkin);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.garlic))) {
            String[] Garlic = getResources().getStringArray(R.array.garlic);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Garlic);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.cucumber))) {
            String[] Cucumber = getResources().getStringArray(R.array.cucumber);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Cucumber);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.spinach))) {
            String[] Spinach = getResources().getStringArray(R.array.spinach);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Spinach);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.green_paper))) {
            String[] Greenpapper = getResources().getStringArray(R.array.Greenpapper);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Greenpapper);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.lettuce))) {
            String[] Lettuce = getResources().getStringArray(R.array.Lettuce);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Lettuce);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.basil))) {
            String[] Basil = getResources().getStringArray(R.array.Basil);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Basil);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.radish))) {
            String[] Radish = getResources().getStringArray(R.array.Radish);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Radish);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.turnip))) {
            String[] Turnip = getResources().getStringArray(R.array.Turnip);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Turnip);
            listView.setAdapter(adapter);


            //meat
        } else if (sn.equals(getResources().getString(R.string.freshfish))) {
            String[] Fish = getResources().getStringArray(R.array.fish);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Fish);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.freshchicken))) {
            String[] Chicken = getResources().getStringArray(R.array.chicken);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Chicken);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.beef))) {
            String[] Beef = getResources().getStringArray(R.array.beef);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Beef);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.beefveal))) {
            String[] Beefveal = getResources().getStringArray(R.array.beefveal);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Beefveal);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.dearmeat))) {
            String[] Dearmeat = getResources().getStringArray(R.array.dearmeat);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Dearmeat);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.shapemeat))) {
            String[] Shapemeat = getResources().getStringArray(R.array.shapemeat);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Shapemeat);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.turkeymeat))) {
            String[] Turkeymeat = getResources().getStringArray(R.array.turkeymeat);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Turkeymeat);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.ostrichmeat))) {
            String[] Ostrichmeat = getResources().getStringArray(R.array.ostrichmeat);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Ostrichmeat);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.quailmeat))) {
            String[] Quailmeat = getResources().getStringArray(R.array.quailmeat);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Quailmeat);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.hamburger))) {
            String[] Hamberger = getResources().getStringArray(R.array.Hamberger);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Hamberger);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.chickenthighs))) {
            String[] Chickenthighs = getResources().getStringArray(R.array.Chickenthighs);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Chickenthighs);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.chickenbreast))) {
            String[] Chickenbreast = getResources().getStringArray(R.array.Chickenbreast);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Chickenbreast);
            listView.setAdapter(adapter);


            //drinks


        } else if (sn.equals(getResources().getString(R.string.tea))) {
            String[] Tea = getResources().getStringArray(R.array.tea);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Tea);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.coffee))) {
            String[] Coffee = getResources().getStringArray(R.array.coffee);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Coffee);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.waterr))) {
            String[] Water = getResources().getStringArray(R.array.water);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Water);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.orangejuic))) {
            String[] Orangejuice = getResources().getStringArray(R.array.orangejuice);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Orangejuice);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.lemonade))) {
            String[] Lemonejuise = getResources().getStringArray(R.array.lemonejuice);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Lemonejuise);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.alcohol))) {
            String[] Alchool = getResources().getStringArray(R.array.Alchool);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Alchool);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.icecream))) {
            String[] Icecream = getResources().getStringArray(R.array.Icecream);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Icecream);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.tomatojuic))) {
            String[] Tomatojuice = getResources().getStringArray(R.array.Tomatojuice);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Tomatojuice);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.carrotjuic))) {
            String[] Carrotjuice = getResources().getStringArray(R.array.Carrotjuice);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Carrotjuice);
            listView.setAdapter(adapter);
        } else if (sn.equals(getResources().getString(R.string.pomegranatejuic))) {
            String[] Pomegranatejuic = getResources().getStringArray(R.array.Pomegranatejuic);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Pomegranatejuic);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.hotchocolate))) {
            String[] Hotchclate = getResources().getStringArray(R.array.Hotchclate);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Hotchclate);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.pepsi))) {
            String[] Cola = getResources().getStringArray(R.array.Cola);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Cola);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.redbull))) {
            String[] Redbull = getResources().getStringArray(R.array.Redbull);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Redbull);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.cappuccino))) {
            String[] Cappuccino = getResources().getStringArray(R.array.Cappuccino);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Cappuccino);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.grapejuice))) {
            String[] Grapejuice = getResources().getStringArray(R.array.Grapejuice);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Grapejuice);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.pineapplejuice))) {
            String[] Pineapplejuice = getResources().getStringArray(R.array.Pineapplejuice);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Pineapplejuice);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.mangojuic))) {
            String[] Mangojuice = getResources().getStringArray(R.array.Mangojuice);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Mangojuice);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.molasses))) {
            String[] Molasses = getResources().getStringArray(R.array.Molasses);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Molasses);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.applejuic))) {
            String[] Applejuice = getResources().getStringArray(R.array.Applejuice);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Applejuice);
            listView.setAdapter(adapter);


            //legumes


        } else if (sn.equals(getResources().getString(R.string.wheat))) {
            String[] Wheat = getResources().getStringArray(R.array.wheat);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Wheat);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.barley))) {
            String[] Barley = getResources().getStringArray(R.array.Barley);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Barley);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.corn))) {
            String[] Corn = getResources().getStringArray(R.array.Corn);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Corn);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.groats))) {
            String[] Groats = getResources().getStringArray(R.array.Groats);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Groats);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.rice))) {
            String[] Rise = getResources().getStringArray(R.array.Rise);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Rise);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.spaghetti))) {
            String[] Spaghetti = getResources().getStringArray(R.array.Spaghetti);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Spaghetti);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.sesame))) {
            String[] Sesame = getResources().getStringArray(R.array.Sesame);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Sesame);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.millet))) {
            String[] Millet = getResources().getStringArray(R.array.Millet);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Millet);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.blackpepper))) {
            String[] Blackpepper = getResources().getStringArray(R.array.Blackpepper);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Blackpepper);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.cardamom))) {
            String[] Cardamom = getResources().getStringArray(R.array.Cardamom);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Cardamom);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.raisin))) {
            String[] Raisin = getResources().getStringArray(R.array.Raisin);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Raisin);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.sunflower))) {
            String[] Sunflower = getResources().getStringArray(R.array.Sunflower);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Sunflower);
            listView.setAdapter(adapter);


            //legumes

        } else if (sn.equals(getResources().getString(R.string.lentil))) {
            String[] Lentil = getResources().getStringArray(R.array.Lentil);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Lentil);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.chickpeas))) {
            String[] Chickpeas = getResources().getStringArray(R.array.Chickpeas);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Chickpeas);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.blackbeans))) {
            String[] Blackbeans = getResources().getStringArray(R.array.Blackbeans);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Blackbeans);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.whitebeans))) {
            String[] Whitebeans = getResources().getStringArray(R.array.Whitebeans);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Whitebeans);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.peanuts))) {
            String[] Peanuts = getResources().getStringArray(R.array.peanuts);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Peanuts);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.soybeans))) {
            String[] Soybeans = getResources().getStringArray(R.array.Soybeans);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Soybeans);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.cumin))) {
            String[] Cumin = getResources().getStringArray(R.array.Cumin);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Cumin);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.mash))) {
            String[] Mash = getResources().getStringArray(R.array.Mash);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Mash);
            listView.setAdapter(adapter);


            // eggs and cheese


        } else if (sn.equals(getResources().getString(R.string.boiledeggs))) {
            String[] Boiledeggs = getResources().getStringArray(R.array.boiledeggs);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Boiledeggs);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.honey))) {
            String[] Honey = getResources().getStringArray(R.array.honey);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Honey);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.milk))) {
            String[] Milk = getResources().getStringArray(R.array.milk);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Milk);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.sheepmilk))) {
            String[] ShapeMilk = getResources().getStringArray(R.array.Shapemilk);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, ShapeMilk);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.peanutbutter))) {
            String[] peanutbutter = getResources().getStringArray(R.array.peanutbutter);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, peanutbutter);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.mothermilk))) {
            String[] Mothermilk = getResources().getStringArray(R.array.Mothermilk);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Mothermilk);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.cheese))) {
            String[] Cheese = getResources().getStringArray(R.array.Cheese);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Cheese);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.friedeggs))) {
            String[] friedeggs = getResources().getStringArray(R.array.friedeggs);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, friedeggs);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.duckeggs))) {
            String[] Duckeggs = getResources().getStringArray(R.array.Duckeggs);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Duckeggs);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.buttermilk))) {
            String[] Buttermilk = getResources().getStringArray(R.array.Buttermilk);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Buttermilk);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.butter))) {
            String[] Butter = getResources().getStringArray(R.array.Butter);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Butter);
            listView.setAdapter(adapter);


            //other


        } else if (sn.equals(getResources().getString(R.string.oil))) {
            String[] Oil = getResources().getStringArray(R.array.Oil);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Oil);
            listView.setAdapter(adapter);
        } else if (sn.equals(getResources().getString(R.string.fishoil))) {
            String[] FishOil = getResources().getStringArray(R.array.FishOil);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, FishOil);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.salt))) {
            String[] Salt = getResources().getStringArray(R.array.Salt);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Salt);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.sugar))) {
            String[] Sugar = getResources().getStringArray(R.array.Sugar);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Sugar);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.cinnamon))) {
            String[] cinnamon = getResources().getStringArray(R.array.cinnamon);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, cinnamon);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.spices))) {
            String[] Spices = getResources().getStringArray(R.array.spices);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Spices);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.sesameoil))) {
            String[] Sesameoil = getResources().getStringArray(R.array.Sesameoil);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Sesameoil);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.oliveoil))) {
            String[] Oliveooil = getResources().getStringArray(R.array.oliveoil);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Oliveooil);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.almonds))) {
            String[] Almonds = getResources().getStringArray(R.array.almonds);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Almonds);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.nut))) {
            String[] Nut = getResources().getStringArray(R.array.Nut);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Nut);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.pistachios))) {
            String[] Pistachio = getResources().getStringArray(R.array.Pistachio);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Pistachio);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.hazelnut))) {
            String[] Hazelnut = getResources().getStringArray(R.array.Hazelnut);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Hazelnut);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.vinger))) {
            String[] Vinger = getResources().getStringArray(R.array.Vinger);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Vinger);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.pizza))) {
            String[] Pizza = getResources().getStringArray(R.array.Pizza);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Pizza);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.Falafel))) {
            String[] Falafe = getResources().getStringArray(R.array.Falafel);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Falafe);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.potatochips))) {
            String[] PotatoChips = getResources().getStringArray(R.array.PotatoChips);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, PotatoChips);
            listView.setAdapter(adapter);

        } else if (sn.equals(getResources().getString(R.string.chocolate))) {
            String[] Chocolate = getResources().getStringArray(R.array.chocolate);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Chocolate);
            listView.setAdapter(adapter);


        } else if (sn.equals(getResources().getString(R.string.caviar))) {
            String[] Caviar = getResources().getStringArray(R.array.caviar);

            adapter = new ArrayAdapter<>(getBaseContext(), R.layout.split_vitamin, R.id.sport, Caviar);
            listView.setAdapter(adapter);


        }
    }
}
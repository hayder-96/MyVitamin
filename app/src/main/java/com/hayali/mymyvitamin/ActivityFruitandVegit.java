package com.hayali.mymyvitamin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;


public class ActivityFruitandVegit extends AppCompatActivity {

    private ListView listView;
    private Intent intent;
    private int numberid;
    private ArrayList arrayList;
    private AdbterFruitandVegit m;
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitand_vegit);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



        listView = findViewById(R.id.listfrut);

        searchView = findViewById(R.id.searchv);

        intent = getIntent();
        numberid = intent.getIntExtra("id", -1);

        if (numberid == 1) {

            arrayList = new ArrayList();

            arrayList.add(new NameFruitandViget(getResources().getString(R.string.apple), getResources().getDrawable(R.drawable.apple)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.banana), getResources().getDrawable(R.drawable.banana)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.pomegranate), getResources().getDrawable(R.drawable.rman)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.grib), getResources().getDrawable(R.drawable.grabes)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.orange), getResources().getDrawable(R.drawable.orange)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.Pineapple), getResources().getDrawable(R.drawable.ananas)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.lemon), getResources().getDrawable(R.drawable.lemon)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.melon), getResources().getDrawable(R.drawable.melon)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.olives), getResources().getDrawable(R.drawable.olives)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.peach), getResources().getDrawable(R.drawable.peache)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.pear), getResources().getDrawable(R.drawable.pear)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.quince), getResources().getDrawable(R.drawable.quince)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.watermelon), getResources().getDrawable(R.drawable.watermelon)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.Strawberries), getResources().getDrawable(R.drawable.strawberries)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.kiwi), getResources().getDrawable(R.drawable.kiwi)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.blueberry), getResources().getDrawable(R.drawable.blueberry)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.carrots), getResources().getDrawable(R.drawable.carrots)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cherries), getResources().getDrawable(R.drawable.cherries)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.coconut), getResources().getDrawable(R.drawable.coconut)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.dates), getResources().getDrawable(R.drawable.dates)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.figs), getResources().getDrawable(R.drawable.figs)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.avocado), getResources().getDrawable(R.drawable.avocado)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.apricot), getResources().getDrawable(R.drawable.apricot)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.tamarind), getResources().getDrawable(R.drawable.tamarind)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.mango), getResources().getDrawable(R.drawable.mango)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.plum), getResources().getDrawable(R.drawable.plum)));


            m = new AdbterFruitandVegit(arrayList, this);

            listView.setAdapter(m);

        } else if (numberid == 2) {

            arrayList = new ArrayList();


            arrayList.add(new NameFruitandViget(getResources().getString(R.string.tmato), getResources().getDrawable(R.drawable.tmato)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.batata), getResources().getDrawable(R.drawable.ptato)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.bathngan), getResources().getDrawable(R.drawable.bathngan)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cucumber), getResources().getDrawable(R.drawable.kheaer)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.green_paper), getResources().getDrawable(R.drawable.pepper)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.onions), getResources().getDrawable(R.drawable.onions)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.okra), getResources().getDrawable(R.drawable.okra)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.garlic), getResources().getDrawable(R.drawable.garlic)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.green_beans), getResources().getDrawable(R.drawable.greenbeans)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.zucchini), getResources().getDrawable(R.drawable.zucchini)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.brocoli), getResources().getDrawable(R.drawable.broccoli)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cauliflowe), getResources().getDrawable(R.drawable.cauliflower)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.celery), getResources().getDrawable(R.drawable.celery)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cowpea), getResources().getDrawable(R.drawable.cowpea)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.ginger), getResources().getDrawable(R.drawable.ginger)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.hotpepper), getResources().getDrawable(R.drawable.hotpepper)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.peas), getResources().getDrawable(R.drawable.peas)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.pumpkin), getResources().getDrawable(R.drawable.pumpkin)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.reedbeets), getResources().getDrawable(R.drawable.redbeets)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.spinach), getResources().getDrawable(R.drawable.spinach)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.lettuce), getResources().getDrawable(R.drawable.lettuce)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.basil), getResources().getDrawable(R.drawable.basil)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.radish), getResources().getDrawable(R.drawable.radish)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.turnip), getResources().getDrawable(R.drawable.turnip)));


            m = new AdbterFruitandVegit(arrayList, this);


            listView.setAdapter(m);

        } else if (numberid == 3) {
            arrayList = new ArrayList();
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.waterr), getResources().getDrawable(R.drawable.water)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.tea), getResources().getDrawable(R.drawable.cuptea)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.coffee), getResources().getDrawable(R.drawable.coffee)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.orangejuic), getResources().getDrawable(R.drawable.orangejuice)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.applejuic), getResources().getDrawable(R.drawable.applejuice)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.carrotjuic), getResources().getDrawable(R.drawable.carrotjuice)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.molasses), getResources().getDrawable(R.drawable.molasses)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.lemonade), getResources().getDrawable(R.drawable.lemonade)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.mangojuic), getResources().getDrawable(R.drawable.mangojuice)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.pineapplejuice), getResources().getDrawable(R.drawable.pineapplejuice)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.alcohol), getResources().getDrawable(R.drawable.alcohol)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.pomegranatejuic), getResources().getDrawable(R.drawable.pomegranatejuice)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.redbull), getResources().getDrawable(R.drawable.redbull)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cappuccino), getResources().getDrawable(R.drawable.cappuccino)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.hotchocolate), getResources().getDrawable(R.drawable.hotchocolate)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.icecream), getResources().getDrawable(R.drawable.icecream)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.grapejuice), getResources().getDrawable(R.drawable.grapejuice)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.pepsi), getResources().getDrawable(R.drawable.pepsi)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.tomatojuic), getResources().getDrawable(R.drawable.tomatojuice)));


            m = new AdbterFruitandVegit(arrayList, this);


            listView.setAdapter(m);

        } else if (numberid == 4) {
            arrayList = new ArrayList();

            arrayList.add(new NameFruitandViget(getResources().getString(R.string.freshchicken), getResources().getDrawable(R.drawable.chicken)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.freshfish), getResources().getDrawable(R.drawable.fish)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.shapemeat), getResources().getDrawable(R.drawable.shapemeat)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.beef), getResources().getDrawable(R.drawable.beef)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.dearmeat), getResources().getDrawable(R.drawable.deermeat)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.beefveal), getResources().getDrawable(R.drawable.beefveal)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.quailmeat), getResources().getDrawable(R.drawable.quailmeat)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.hamburger), getResources().getDrawable(R.drawable.hamburger)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.turkeymeat), getResources().getDrawable(R.drawable.turkeymeat)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.ostrichmeat), getResources().getDrawable(R.drawable.ostrichmeat)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.chickenthighs), getResources().getDrawable(R.drawable.chickenthighs)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.chickenbreast), getResources().getDrawable(R.drawable.chickenbreast)));


            m = new AdbterFruitandVegit(arrayList, this);


            listView.setAdapter(m);

        } else if (numberid == 5) {

            arrayList = new ArrayList();
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.wheat), getResources().getDrawable(R.drawable.wheat)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.barley), getResources().getDrawable(R.drawable.barley)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.corn), getResources().getDrawable(R.drawable.corn)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.groats), getResources().getDrawable(R.drawable.groats)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.millet), getResources().getDrawable(R.drawable.millet)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.rice), getResources().getDrawable(R.drawable.rice)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.spaghetti), getResources().getDrawable(R.drawable.spaghetti)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.sesame), getResources().getDrawable(R.drawable.sesame)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.blackpepper), getResources().getDrawable(R.drawable.blackpepper)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cardamom), getResources().getDrawable(R.drawable.cardamom)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.raisin), getResources().getDrawable(R.drawable.raisins)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.sunflower), getResources().getDrawable(R.drawable.sunflower)));


            m = new AdbterFruitandVegit(arrayList, this);

            listView.setAdapter(m);


        } else if (numberid == 6) {

            arrayList = new ArrayList();
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.lentil), getResources().getDrawable(R.drawable.lentil)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.whitebeans), getResources().getDrawable(R.drawable.whitebeans)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.mash), getResources().getDrawable(R.drawable.mash)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.blackbeans), getResources().getDrawable(R.drawable.blackbeans)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.chickpeas), getResources().getDrawable(R.drawable.chickpeas)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.soybeans), getResources().getDrawable(R.drawable.soybeans)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.peanuts), getResources().getDrawable(R.drawable.peanuts)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cumin), getResources().getDrawable(R.drawable.cumin)));

            m = new AdbterFruitandVegit(arrayList, this);

            listView.setAdapter(m);


        } else if (numberid == 7) {

            arrayList = new ArrayList();

            arrayList.add(new NameFruitandViget(getResources().getString(R.string.boiledeggs), getResources().getDrawable(R.drawable.boiledeggs)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.mothermilk), getResources().getDrawable(R.drawable.mothermilk)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.friedeggs), getResources().getDrawable(R.drawable.friedeggs)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.honey), getResources().getDrawable(R.drawable.honey)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.milk), getResources().getDrawable(R.drawable.milk)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.duckeggs), getResources().getDrawable(R.drawable.duckeggs)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.peanutbutter), getResources().getDrawable(R.drawable.peanutbutter)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.sheepmilk), getResources().getDrawable(R.drawable.sheepmilk)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cheese), getResources().getDrawable(R.drawable.whitecheese)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.buttermilk), getResources().getDrawable(R.drawable.buttermilk)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.butter), getResources().getDrawable(R.drawable.butter)));


            m = new AdbterFruitandVegit(arrayList, this);

            listView.setAdapter(m);

        } else if (numberid == 8) {
            arrayList = new ArrayList();


            arrayList.add(new NameFruitandViget(getResources().getString(R.string.cinnamon), getResources().getDrawable(R.drawable.cinnamon)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.fishoil), getResources().getDrawable(R.drawable.fishoil)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.oil), getResources().getDrawable(R.drawable.oil)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.oliveoil), getResources().getDrawable(R.drawable.oliveoil)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.salt), getResources().getDrawable(R.drawable.salt)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.sugar), getResources().getDrawable(R.drawable.sugar)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.spices), getResources().getDrawable(R.drawable.spices)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.sesameoil), getResources().getDrawable(R.drawable.sesameoil)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.nut), getResources().getDrawable(R.drawable.nut)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.almonds), getResources().getDrawable(R.drawable.almonds)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.hazelnut), getResources().getDrawable(R.drawable.hazelnut)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.vinger), getResources().getDrawable(R.drawable.vinegar)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.pistachios), getResources().getDrawable(R.drawable.pistachios)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.pizza), getResources().getDrawable(R.drawable.pizza)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.Falafel), getResources().getDrawable(R.drawable.falafel)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.potatochips), getResources().getDrawable(R.drawable.chips)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.chocolate), getResources().getDrawable(R.drawable.chocolate)));
            arrayList.add(new NameFruitandViget(getResources().getString(R.string.caviar), getResources().getDrawable(R.drawable.caviar)));


            m = new AdbterFruitandVegit(arrayList, this);

            listView.setAdapter(m);

        }
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                m.getFilter().filter(newText);
                return false;
            }
        });
    }
}

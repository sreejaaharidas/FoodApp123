package com.example.myecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myecommerce.adapters.AllRestaurentAdapter;
import com.example.myecommerce.adapters.Exclusive;
import com.example.myecommerce.adapters.OfferAdapter;
import com.example.myecommerce.models.AllRestaurentModels;
import com.example.myecommerce.models.ExcluiveModels;
import com.example.myecommerce.models.OffersModels;

import java.util.ArrayList;
import java.util.List;

public class RestaurentActivity extends AppCompatActivity {

    RecyclerView recyclerViewOffers;
    List<OffersModels> offersModels;
    OfferAdapter offerAdapter;

    RecyclerView recyclerViewExclusive;
    List<ExcluiveModels> excluiveModels;
    Exclusive exclusiveAdapter;

    RecyclerView recyclerViewAllRestaurents;
    List<AllRestaurentModels> allRestaurentModels;
    AllRestaurentAdapter allRestaurentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurent);

        getOffers();

        getAllExclusive();
        getAllRestaurentsData();
    }

    private void getAllExclusive() {
        recyclerViewExclusive = findViewById(R.id.rec_exc);
        recyclerViewExclusive.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        excluiveModels = new ArrayList<>();
        excluiveModels.add(new ExcluiveModels(R.drawable.food1));
        excluiveModels.add(new ExcluiveModels(R.drawable.food2));
        excluiveModels.add(new ExcluiveModels(R.drawable.food3));
        excluiveModels.add(new ExcluiveModels(R.drawable.food4));
        excluiveModels.add(new ExcluiveModels(R.drawable.food1));
        excluiveModels.add(new ExcluiveModels(R.drawable.food2));
        excluiveModels.add(new ExcluiveModels(R.drawable.food3));
        excluiveModels.add(new ExcluiveModels(R.drawable.food4));


        exclusiveAdapter = new Exclusive(excluiveModels);
        recyclerViewExclusive.setAdapter(exclusiveAdapter);
    }

    private void getAllRestaurentsData() {
        recyclerViewAllRestaurents = findViewById(R.id.rec_all_res);
        recyclerViewAllRestaurents.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerViewAllRestaurents.setHasFixedSize(true);

        allRestaurentModels = new ArrayList<>();
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food4));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food3));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food3));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food2));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food1));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food4));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food3));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food3));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food2));
        allRestaurentModels.add(new AllRestaurentModels(R.drawable.food1));



        allRestaurentAdapter = new AllRestaurentAdapter(allRestaurentModels);
        recyclerViewAllRestaurents.setAdapter(allRestaurentAdapter);
    }

    private void getOffers() {
        recyclerViewOffers = findViewById(R.id.rec_offer);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewOffers.setHasFixedSize(true);

        offersModels = new ArrayList<>();
        offersModels.add(new OffersModels(R.drawable.img15));
        offersModels.add(new OffersModels(R.drawable.img16));
        offersModels.add(new OffersModels(R.drawable.img19));
        offersModels.add(new OffersModels(R.drawable.img18));
        offerAdapter = new OfferAdapter(offersModels, this);
        recyclerViewOffers.setAdapter(offerAdapter);
    }
}
package com.example.activity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetDatasevice service = activity1.getActivity1().create(GetDatasevice.class);
        Call<PokemonPojo> call = service.getPokemonObj();

        call.enqueue(new Callback<PokemonPojo>() {
            @Override
            public void onResponse(Call<PokemonPojo> call, Response<PokemonPojo> response) {

                PokemonPojo pojo = response.body();

                try {
                    pokearray = new ArrayList<>(pojo.getPokemon());
                    generateData(pokearray);

                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }

            }




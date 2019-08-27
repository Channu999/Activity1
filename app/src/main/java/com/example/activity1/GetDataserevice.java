package com.example.activity1;

import java.util.List;

public class GetDataserevice {

    @GET("Vy2abloQD")
    Call<List<Pokemon>> getPokemons();

    @GET("E14trR2lD")
    Call<PokemonPojo> getPokemonObj();
}


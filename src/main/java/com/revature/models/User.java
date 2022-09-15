package com.revature.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private int totalBadge;
    private List<Pokemon> listOfPokemon;

    public User() {
        setListOfPokemon(new ArrayList<>());
    }

    
    public User(String name) {
        this();
        this.name = name;
    }
    
    public User(int id, String name, int totalBadge) {
        this();
        this.id = id;
        this.name = name;
        this.totalBadge = totalBadge;
    }
    
    public List<Pokemon> getListOfPokemon() {
        return listOfPokemon;
    }

    public void setListOfPokemon(List<Pokemon> listOfPokemon) {
        this.listOfPokemon = listOfPokemon;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTotalBadge() {
        return totalBadge;
    }
    public void setTotalBadge(int totalBadge) {
        this.totalBadge = totalBadge;
    }

    
}

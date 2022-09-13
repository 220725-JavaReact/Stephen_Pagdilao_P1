package com.revature.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PokemonTest {
    @Test
    public void Name_Should_Save_Valid_Data(){
        //Arrange
        String expectedName = "Pikachu";
        Pokemon poketest = new Pokemon();
        
        //Act
        poketest.setName(expectedName);

        //Assert
        assertEquals(expectedName, poketest.getName());
    }    
}

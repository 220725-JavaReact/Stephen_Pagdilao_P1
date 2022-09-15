package com.revature.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.revature.dao.Dao;
import com.revature.models.Pokemon;
import com.revature.models.User;

public class UserService {
    
    private Dao<User> userDao;
    private Dao<Pokemon> pokeDao;

    public UserService(Dao<User> userDao, Dao<Pokemon> pokeDao) {
        this.userDao = userDao;
        this.pokeDao = pokeDao;
    }

    public User getUserPokemon(int userId){
        List<User> listOfUser = userDao.getAllInstance();
        List<Pokemon> listOfPoke = pokeDao.getAllInstance();

        Optional<User> foundUser = listOfUser.stream()
            .filter(user -> user.getId()==userId)
            .findFirst();
        
        if (foundUser.isPresent()) {
            User existUser = foundUser.get();
            
            existUser.setListOfPokemon(listOfPoke.stream()
                .filter(poke -> poke.getTrainid()==existUser.getId())
                .collect(Collectors.toList()));

            return existUser;
        }
        else {
            return new User("User was not found");
        }
    }
}

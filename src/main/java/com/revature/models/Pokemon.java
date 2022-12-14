package com.revature.models;

//POJO classes
public class Pokemon {
    private int id;
    private String name;
    private String img;
    private int level;
    private int health;
    private int damage;
    private int trainid;

    public Pokemon() { }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Pokemon(int id, String name, String img, int level, int health, int damage, int trainid) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.trainid = trainid;
    }

    public int getTrainid() {
        return trainid;
    }

    public void setTrainid(int trainid) {
        this.trainid = trainid;
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
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }


    //toString() converts the object into a string representation of the object
    @Override
    public String toString() {
        return "Pokemon [damage=" + damage + ", health=" + health + ", id=" + id + ", level=" + level + ", name=" + name
                + "]";
    }
}

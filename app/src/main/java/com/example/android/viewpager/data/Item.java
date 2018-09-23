package com.example.android.viewpager.data;

public class Item {

    public static enum Ranks {
        VEGETABLE, MILK, CEREALS, WATER,
        ALCOHOL,BREAD,HOUSEHOLDS, OIL, MEAT, DUNNO
    }

    private String name;
    private double cost;
    private double amount;
    private Ranks rank;

    public Item(String name, double cost, double amount, Ranks rank){
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        this.rank = rank;
    }

    public String getName(){ return name; }
    public double getCost(){ return  cost; }
    public double getAmount(){ return amount; }
    public Ranks getRank(){ return rank; }
    public void setName(String name){ this.name = name; }
    public void setCost(float cost){ this.cost = cost; }
    public void setAmount(float amount){ this.amount = amount; }
    public void setRank(Ranks rank){ this.rank = rank;}


}

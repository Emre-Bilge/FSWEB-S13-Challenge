package org.example.enums;

public enum Plan {
    BASIC("basic plan",10);


    private final String name;
    private final int price;

Plan(String name , int price){
    this.name=name;
    this.price=price;
}


    public String getName(){
    return this.name;
}

public int getPrice(){
    return this.price;
}

}

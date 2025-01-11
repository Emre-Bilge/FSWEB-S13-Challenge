package org.example;

import org.example.enums.Plan;

public class Healthplan {

    private int id;
    private String name ;
    private Plan plan;


    public Healthplan(int id , String name , Plan plan){
        this.id=id;
        this.name=name;
        this.plan=plan;

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Plan getPlan(){
        return this.plan;
    }

    public void setPlan(Plan plan){
        this.plan=plan;
    }

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan.getName() + " (" + plan.getPrice() + " USD)" +
                '}';
    }
}

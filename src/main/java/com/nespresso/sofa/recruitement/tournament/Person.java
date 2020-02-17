package com.nespresso.sofa.recruitement.tournament;

public class Person {

    public String name;
    public int hit_points;
    public Weapon righthand;
    public Weapon lefthand;

    public Person(String name, int hit_points, Weapon righthand, Weapon lefthand){
        this.name = name;
        this.hit_points = hit_points;
        this.righthand = righthand;
        this.lefthand = lefthand;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(){

    }

    public int hitPoints(){
        return hit_points;
    }

    public void setHitPoint(int hit_points){
        if(hit_points < 0)
            this.hit_points = 0;
        else
            this.hit_points = hit_points;
    }

    public void reduceHisPoint(Person enemy){
        enemy.setHitPoint(enemy.hit_points -= this.righthand.getDamage());
    }

    public void engage(Person enemy){
        while((this.hitPoints() > 0) && (enemy.hitPoints() > 0)){
            this.reduceHisPoint(enemy);
            enemy.reduceHisPoint(this);
        }
    }
    /*
    public Person equip(String buckler){
        return this;
    }
    */

}

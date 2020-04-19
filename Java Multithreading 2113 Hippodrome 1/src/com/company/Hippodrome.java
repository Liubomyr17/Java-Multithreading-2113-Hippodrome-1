package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List horses) {
        this.horses = horses;
    }

    public void move() {

    }

    public void print() {

    }

    public void run() {
        for (int i=0; i<100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public Horse getWinner(){
        double maxDistance = 0.0;
        for (Horse horse : this.horses){
            if (horse.getDistance()>maxDistance){
                maxDistance = horse.getDistance();
            }
        }
        Horse horse = null;
        for (Horse hors : this.horses){
            if (hors.getDistance()==maxDistance){
                horse = hors;
                break;
            }

        }
        return horse;
    }

    public void printWinner() {
        Horse horse = getWinner();
        System.out.println("Winner is "+horse.getName()+"!");
    }

    public static void main(String[] args) {
        List<Horse> horseList = new ArrayList<>();
        horseList.add(new Horse("Horse1", 3, 0));
        horseList.add(new Horse("Horse2", 3, 0));
        horseList.add(new Horse("Horse3", 3, 0));
        game = new Hippodrome(horseList);
        game.run();
        game.printWinner();
    }
}

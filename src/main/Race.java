package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;
import javax.swing.*;
import static java.lang.Thread.sleep;


public class Race<winner> {
    public static void main(String[] args) throws InterruptedException {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.getTortoise().start();
        String winner = null;
        sleep(30000L);
        {
            if (tortoise.getTimeByTortoise() < rabbit.getTimeByRabbit()) {
                winner = " Tortoise wins the race!";
            }
            else if (tortoise.getTimeByTortoise() == rabbit.getTimeByRabbit()) {
                winner = "No one wins the race!";
            }
            else {
                winner = "Rabbit wins the race!";
            }
            JOptionPane.showMessageDialog(null, winner);
        }
    }
}

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
        sleep(20000L);
        {
            if (tortoise.getTimeTakenByTortoise() < rabbit.getTimeTakenByRabbit()) {
                winner = " Tortoise wins the race!";
            }
            else if (tortoise.getTimeTakenByTortoise() == rabbit.getTimeTakenByRabbit()) {
                winner = "No one wins the race!";
            }
            else {
                winner = "Rabbit wins the race";
            }
            JOptionPane.showMessageDialog(null, winner);
        }
    }
}

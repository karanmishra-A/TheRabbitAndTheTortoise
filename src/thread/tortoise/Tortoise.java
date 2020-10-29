package thread.tortoise;
import javax.swing.*;

public class Tortoise extends Thread {
    private static final int MILESTONES = 5;

    private final Thread tortoise;
    private float timeByTortoiseToCompleteRace = 0f;

    public Tortoise() {
        this.tortoise = new Thread(this, "tortoise");
    }

    public float getTimeByTortoise() {
        return timeByTortoiseToCompleteRace;
    }

    public void setTimeByTortoise(float timeByTortoiseToCompleteRace) {
        this.timeByTortoiseToCompleteRace = timeByTortoiseToCompleteRace;
    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    timeByTortoiseToCompleteRace = timeByTortoiseToCompleteRace + 3;
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    timeByTortoiseToCompleteRace = timeByTortoiseToCompleteRace + 3;
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    timeByTortoiseToCompleteRace = timeByTortoiseToCompleteRace + 3;
                    break;
                case 3:
                    System.out.println("The tortoise has reached the Big Oak Tree!");
                    timeByTortoiseToCompleteRace = timeByTortoiseToCompleteRace + 3;
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    timeByTortoiseToCompleteRace = timeByTortoiseToCompleteRace + 3;
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
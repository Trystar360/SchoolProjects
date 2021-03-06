package craps;
/**
 * By: Tristan Frederick
 * Date: 2-21-18
 * Craps assignment 
 * 
 */

public class CrapsGame {

    private int points = 0;
    public int processRoll(int x) {
        int win;
        if (points == 0) { 
            switch (x) {
                case 7:
                case 11:
                    win = 1;
                    break;
                case 2:
                case 3:
                case 12:
                    win = -1;
                    break;
                default:
                    win = 0;
                    points = x;
            }
        } else {
            if (x == points) {
                win = 1;
                points = 0;
            } else if (x == 7) {
                win = -1;
                points = 0;
            } else {
                win = 0;
            }
        }
        return win;
    }

    public int getPoint() {
        return points;
    }
}

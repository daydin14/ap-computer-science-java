/**
 * main.java
 * David
 * Title: Stair climber
 * Description:	Robot will climb stairs while picking up beepers
 */
package kareltherobot;

public class mainstair implements Directions {

    public static void task() {
        ur_Robot Karel = new ur_Robot(1, 1, East, 0);
        //  Karel.climbStair();
        //  Karel.pickBeeper();
        //  Karel.climbStair();
        //  Karel.pickBeeper();
        //  Karel.climbStair();
        //  Karel.pickBeeper();
        Karel.turnOff();
    }

    // Main entry point
    static public void main(String[] args) {
        World.setDelay(50);
        World.readWorld("stairs.txt");
        task();
    }
}

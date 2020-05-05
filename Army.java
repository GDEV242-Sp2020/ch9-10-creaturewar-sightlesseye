import java.util.ArrayList;
import java.util.Random;

/**
 * An Army is a grouping of any number of any types of units. Armies fight 
 * other armies to the death, in a turn-based, one person at a time manner,
 * for some reason.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Army
{
    private ArrayList<Creature> units;
    private Random randy;
    private int[] roster;

    /**
     * Constructor for objects of class Army. Creates an empty Army.
     */
    public Army()
    {
        units = new ArrayList<Creature>();
        randy = new Random();
        roster = new int[]{0,0,0,0,0,0};
    }
    
    /**
     * Constructor for objects of class Army. Creates an Army with a 
     * number of randomized units, equal to the parameter recieved.
     * 
     * @param numUnits number of units in the Army
     */
    public Army(int numUnits) {
        units = new ArrayList<Creature>();
        roster = new int[]{0,0,0,0,0,0};
        randy = new Random();
        recruit(numUnits);
    }
    
    /**
     * Fills an Army with random units, using a d20-style random number 
     * generator.
     * 
     * 1: Critical Failure! Generic Creature (5% chance)
     * 2-8: Human (40% chance)
     * 9-12: Elf (20% chance)
     * 13-16: Demon (20% chance)
     * 17-19: Cyberdemon (15% chance)
     * 20: Critical Success! Balrog (5% chance)
     * 
     * @param numUnits number of units to add into the Army
     */
    public void recruit(int numUnits) {
        for(int i = 0; i < numUnits; i++) {
            int j = randy.nextInt(20)+1;
            //System.out.println("Rolled a " + j + "!");
            if(j == 1) {
                //System.out.println("Adding a Generic Creature, I guess...\n");
                roster[0]++;
                units.add(new Creature(5,5));
            } else if(j <= 8) {
                //System.out.println("Adding a Human.\n");
                roster[1]++;
                units.add(new Human());
            } else if(j <= 12) {
                //System.out.println("Adding a Elf.\n");
                roster[2]++;
                units.add(new Elf());
            } else if(j <= 16) {
                //System.out.println("Adding a Demon.\n");
                roster[3]++;
                units.add(new Demon());
            } else if(j <= 19) {
                //System.out.println("Adding a Cyberdemon. Nice!\n");
                roster[4]++;
                units.add(new Cyberdemon());
            } else {
                //System.out.println("Adding a Balrog! Destroy your enemies!\n");
                roster[5]++;
                units.add(new Balrog());
            }
        }
    }
    
    /**
     * Prints out the "roster" of what units are in the Army.
     */
    public void printRoster()
    {
        System.out.println("" + roster[0] + " Generic Creature(s), " + roster[1] + " Human(s), " + roster[2]
                            + " Elf(s), " + roster[3] + " Demon(s), " + roster[4] + " Cyberdemon(s), \n"
                            + "and last but certainly not least, " + roster[5] + " Balrog(s)!\n");
    }

    /**
     * Return the army's current fighter. If everyone is knocked out, return null.
     * 
     * @return  creature who is currently fighting, or null
     */
    public Creature currentFighter()
    {
        Creature ret = null;
        int i = 0;
        while(ret == null && i < units.size()) {
            Creature thisOne = units.get(i);
            if(thisOne.isAlive()) {
                ret = thisOne;
            } else {
                i++;
            }
        }
        return ret;
    }

}

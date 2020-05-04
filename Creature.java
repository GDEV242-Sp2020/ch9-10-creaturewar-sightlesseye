import java.util.Random;

/**
 * Creature is a unit of an army. Each has hitpoints to keep them 
 * "alive," and strength to determine how powerful their attacks
 * are.
 * No accessor for strength or hp.
 * 
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Creature
{
    //these variables determine the maximums and minimums that the values can be initialized at
    private int MAX_STR;
    private int MAX_HP;
    private int MIN_STR;
    private int MIN_HP;

    private int hp;
    private int strength;
    private Random randy;

    /**
     * No args constructor for the Creature class.
     */
    public Creature(){
        MAX_STR = 10;
        MAX_HP = 10;
        MIN_STR = 10;
        MIN_HP = 10;

        hp = 10;
        strength = 10;
        randy = new Random();
    }

    /**
     * Constructor for the Creature class.
     * 
     * @param hitpoints int value to initialize hp at.
     * @param str int value to initialize strength at.
     * If either value is below 5, it is initialized to 5.
     */
    public Creature(int hitpoints, int str){
        if(hp < 5) {
            hp = 5;
            MAX_HP = 5;
        } else {
            hp = hitpoints;
            MAX_HP = hitpoints;
        }

        if(strength < 5) {
            strength = 5;
            MAX_STR = 5;
        } else {
            MAX_STR = str;
            strength = str;
        }

        MIN_STR = 5;
        MIN_HP = 5;

        randy = new Random();
    }

    /**
     * Sets the maximum strength possible.
     * 
     * @param int value to set MAX_STR to
     */
    public void setMAX_STR(int str) {
        MAX_STR = str;
    }

    /**
     * Sets the maximum hp possible.
     * 
     * @param int value to set MAX_HP to
     */
    public void setMAX_HP(int hitpoints) {
        MAX_HP = hitpoints;
    }

    /**
     * Sets the minimum hp possible.
     * 
     * @param int value to set MIN_STR to
     */
    public void setMIN_STR(int str) {
        MIN_STR = str;
    }

    /**
     * Sets the minimum hp possible.
     * 
     * @param int value to set MIN_HP to
     */
    public void setMIN_HP(int hitpoints) {
        MIN_HP = hitpoints;
    }

    /**
     * Sets HP.
     * 
     * @param int value to set hp to
     */
    public void setHP(int hitpoints) {
        hp = hitpoints;
    }

    /**
     * Sets Strength.
     * 
     * @param int value to set strength to
     */
    public void setStrength(int str) {
        strength = str;
    }

    /**
     * Lowers the unit's health by the amount of damage taken.
     *
     * @param  damage amount to lower hp by
     */
    public void takeWound(int damage)
    {
        hp -= damage;
    }

    /**
     * Tests whether or not a unit's stats were initialized within the maximum and minimum bounds.
     *
     * @return  boolean whether or not unit was initialized properly
     */
    public boolean unitTest()
    {
        boolean ret = true;
        System.out.println("HP: " + hp + ".\nMaximum HP: " + MAX_HP + ".\nMinimum HP: " + MIN_HP + ".");
        if(hp > MAX_HP || hp < MIN_HP) {
            System.out.println("HP is not within acceptable boundaries.\n");
            ret = false;
        } else {
            System.out.println("HP initialized properly!\n");
        }
        System.out.println("Strength: " + strength + ".\nMaximum Strength: " + MAX_STR + ".\nMinimum Strength: " + MIN_STR + ".");
        if(strength > MAX_STR || strength < MIN_STR) {
            System.out.println("Strength is not within acceptable boundaries.\n");
            ret = false;
        } else {
            System.out.println("Strength initialized properly!\n");
        }
        if(ret) {
            System.out.println("Unit was properly initialized!\nEnd test.\n");
        } else {
            System.out.println("Unit was NOT properly initialized.\nEnd test.\n");
        }
        return ret;
    }

    /**
     * Deals damage to other units, and reduces their hit points.
     * @return int number of hp to reduce
     */
    public int damage(){
        return randy.nextInt(strength);
    }

    /**
     * Checks whether or not a unit is alive, determining by the amount 
     * of hp they have left.
     * @return boolean true if unit is alive
     */
    public boolean isAlive() {
        return hp > 0;
    }
}

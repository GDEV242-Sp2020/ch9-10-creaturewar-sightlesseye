import java.util.Random;

/**
 * Write a description of class Human here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Human extends Creature
{
    private static final int MAX_STR = 18;
    private static final int MAX_HP = 30;
    private static final int MIN_STR = 5;
    private static final int MIN_HP = 8;

    private int hp;
    private int strength;
    private Random randy;
   
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        
        randy = new Random();
        hp = randy.nextInt(23) + 8;
        strength = randy.nextInt(14) + 5;
    }

    /**
     * Damage dealt by a human.
     * @return  int value of damage dealt
     */
    public int damage()
    {
        return super.damage();
    }
}

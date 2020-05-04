import java.util.Random;

/**
 * Write a description of class Cyberdemon here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Cyberdemon extends Creature
{
    private static final int MAX_STR = 40;
    private static final int MAX_HP = 100;
    private static final int MIN_STR = 20;
    private static final int MIN_HP = 25;

    private int hp;
    private int strength;
    private Random randy;
   
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        randy = new Random();
        hp = randy.nextInt(76) + 25;
        strength = randy.nextInt(21) + 20;
    }

    /**
     * Damage dealt by a Cyberdemon.
     * @return  int value of damage dealt
     */
    public int damage()
    {
        return super.damage();
    }
}

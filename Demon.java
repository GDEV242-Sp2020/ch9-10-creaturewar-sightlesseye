import java.util.Random;

/**
 * Write a description of class Demon here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Demon extends Creature
{
    private static final int MAX_STR = 18;
    private static final int MAX_HP = 25;
    private static final int MIN_STR = 5;
    private static final int MIN_HP = 8;

    private int hp;
    private int strength;
    private Random randy;
   
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        randy = new Random();
        hp = randy.nextInt(18) + 8;
        strength = randy.nextInt(14) + 5;
    }

    /**
     * Damage dealt by a Demon. Has a 5% chance to crit and deal
     * 50 extra damage.
     * @return  int value of damage dealt
     */
    public int damage()
    {
        if(randy.nextInt(20) == 1) {
            return super.damage() + 50;
        }
        return super.damage();
    }
}

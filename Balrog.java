import java.util.Random;

/**
 * Write a description of class Balrog here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Balrog extends Creature
{
    private static final int MAX_STR = 100;
    private static final int MAX_HP = 200;
    private static final int MIN_STR = 50;
    private static final int MIN_HP = 80;

    private int hp;
    private int strength;
    private Random randy;
   
    /**
     * Constructor for objects of class Balrog.
     */
    public Balrog()
    {
        randy = new Random();
        hp = randy.nextInt(121) + 80;
        strength = randy.nextInt(51) + 50;
    }

    /**
     * Damage dealt by a Balrog. Attacks twice.
     * @return  int value of damage dealt
     */
    public int damage()
    {
        return super.damage() + super.damage();
    }
}

import java.util.Random;

/**
 * Write a description of class Elf here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Elf extends Creature
{
    private static final int MAX_STR = 18;
    private static final int MAX_HP = 25;
    private static final int MIN_STR = 5;
    private static final int MIN_HP = 8;

    private int hp;
    private int strength;
    private Random randy;
   
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        randy = new Random();
        hp = randy.nextInt(18) + 8;
        strength = randy.nextInt(14) + 5;
    }

    /**
     * Damage dealt by an Elf.
     * 10% chance to crit and deal double damage
     * @return  int value of damage dealt
     */
    public int damage()
    {
        if(randy.nextInt(10) == 1) {
            return super.damage()*2;
        }
        return super.damage();
    }
}

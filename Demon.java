import java.util.Random;

/**
 * Write a description of class Demon here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Demon extends Creature
{
    private Random randy;
   
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        setMAX_STR(18);
        setMAX_HP(25);
        setMIN_STR(5);
        setMIN_HP(8);
        randy = new Random();
        setHP(randy.nextInt(18) + 8);
        setStrength(randy.nextInt(14) + 5);
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

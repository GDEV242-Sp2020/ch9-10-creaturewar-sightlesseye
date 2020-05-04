import java.util.Random;

/**
 * Write a description of class Cyberdemon here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Cyberdemon extends Creature
{
    private Random randy;
   
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        setMAX_STR(40);
        setMAX_HP(100);
        setMIN_STR(20);
        setMIN_HP(25);
        randy = new Random();
        setHP(randy.nextInt(76) + 25);
        setStrength(randy.nextInt(21) + 20);
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

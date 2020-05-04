import java.util.Random;

/**
 * Write a description of class Human here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Human extends Creature
{
    private Random randy;
   
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        setMAX_STR(18);
        setMAX_HP(30);
        setMIN_STR(5);
        setMIN_HP(8);
        randy = new Random();
        setHP(randy.nextInt(23) + 8);
        setStrength(randy.nextInt(14) + 5);
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

import java.util.Random;

/**
 * Write a description of class Balrog here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Balrog extends Creature
{
    private Random randy;
   
    /**
     * Constructor for objects of class Balrog.
     */
    public Balrog()
    {
        setMAX_STR(100);
        setMAX_HP(200);
        setMIN_STR(50);
        setMIN_HP(80);
        randy = new Random();
        setHP(randy.nextInt(121) + 80);
        setStrength(randy.nextInt(51) + 50);
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

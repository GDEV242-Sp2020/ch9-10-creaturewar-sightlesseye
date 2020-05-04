import java.util.Random;

/**
 * Write a description of class Elf here.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class Elf extends Creature
{
    private Random randy;
   
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
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

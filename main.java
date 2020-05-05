import java.util.ArrayList;

/**
 * Main tester class.
 *
 * @author Ryan Canuel
 * @version Spring 2020
 */
public class main
{
    private Human testHuman;
    private Elf testElf;
    private Demon testDemon;
    private Cyberdemon testCyberdemon;
    private Balrog testBalrog;

    /**
     *  A group of 5 creatures, one of each race.
     */
    public main() {
        testHuman = new Human();
        testElf = new Elf();
        testDemon = new Demon();
        testCyberdemon = new Cyberdemon();
        testBalrog = new Balrog();
    }

    /**
     * Main method. 
     */
    public static void main(String cheese[]) {
        wageWar(50);
    }

    /**
     * Tests unit initialization by creating 10 groups of 5 units, and seeing 
     * whether or not each unit's stats are within the acceptable minimums and maximums
     */
    public static void testInitialization()
    {
        ArrayList<main> collection = new ArrayList<main>();
        //create and instantiate 10 groups of one of each race
        for(int i = 0; i < 10; i++) { 
            collection.add(new main());
            System.out.println("Added a group of creatures to the collection. \n"+
                "Groups added: " + (i+1) + "\n");
        }
        //then iterate through the list,and test whether or not each is working properly
        boolean success = true; //boolean shows whether or not the full list was successful
        for(main george : collection) {
            //System.out.println("Begin unit test: Human.");
            success = success && george.testHuman.unitTest();
            //System.out.println("Begin unit test: Elf.");
            success = success && george.testElf.unitTest();
            //System.out.println("Begin unit test: Demon.");
            success = success && george.testDemon.unitTest();
            //System.out.println("Begin unit test: Cyberdemon.");
            success = success && george.testCyberdemon.unitTest();
            //System.out.println("Begin unit test: Balrog.");
            success = success && george.testBalrog.unitTest();
        }
        //did it work?
        if(success) {
            System.out.println("All units created successfully!");
        } else {
            System.out.println("One or more units not successfully created.");
        }
    }

    /**
     * Tests army related things.
     */
    public static void wageWar(int units)
    {
        System.out.println("\nIt's finally time for the main event that you all have been waiting for!\n"
            + "Team Red versus Team Blue!\n"
            + "\n"
            + "[audience applause]\n");
        System.out.println("First off, Team Red's roster!\n");
        Army red = new Army(units);
        red.printRoster();
        System.out.println("And now, Team Blue's roster!\n");
        Army blue = new Army(units);
        blue.printRoster();

        System.out.println("And they're off!\nThis battle's gonna be a good one!");
        int minutes = 0;
        while(red.currentFighter() != null && blue.currentFighter() != null) {
            int dam = red.currentFighter().damage();
            red.currentFighter().takeWound(blue.currentFighter().damage());
            blue.currentFighter().takeWound(dam);
            minutes++;
        }
        System.out.println("\n[" + minutes + " minutes of sword clashing and eldritch blasting later]");
        System.out.println("The dust is settling...\n");
        if(red.currentFighter() == null) {
            System.out.println("...and it seems like the Blue Team is victorius! \nCongratulations, Blue Team!\n");
        } else {
            System.out.println("...and it turns out the Red Team is victorius! \nCongratulations, Red Team!\n");
        }
        System.out.println("");
        System.out.println("~");
        System.out.println("");
    }

}

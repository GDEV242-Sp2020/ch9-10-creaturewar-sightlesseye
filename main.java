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
     * Constructor. Initializes all fields/unit types.
     */
    public main() {
        testHuman = new Human();
        testElf = new Elf();
        testDemon = new Demon();
        testCyberdemon = new Cyberdemon();
        testBalrog = new Balrog();
    }
    
    /**
     * Main method. Tests an arraylist filled with 10 instances of each 
     * race, to make sure that none of them have health or strength that 
     * is too high or too low.
     */
    public static void main(String cheese[]) {
        ArrayList<main> collection = new ArrayList<main>();
        
        //create and instantiate 10 groups of one of each race
        // for(int i = 0; i < 10; i++) { 
            // collection.add(new main());
            // System.out.println("Added a group of creatures to the collection. \n"+
            // "Groups added: " + (i+1) + "\n");
        // }
        
        //then iterate through the list,and test whether or not each is working properly
        main george = new main();
        boolean success = true; //boolean shows whether or not the full list was successful
        
        System.out.println("Begin unit test: Human.");
        success = success && george.testHuman.unitTest();
        
        System.out.println("Begin unit test: Elf.");
        success = success && george.testElf.unitTest();
        
        System.out.println("Begin unit test: Demon.");
        success = success && george.testDemon.unitTest();
        
        System.out.println("Begin unit test: Cyberdemon.");
        success = success && george.testCyberdemon.unitTest();
        
        System.out.println("Begin unit test: Balrog.");
        success = success && george.testBalrog.unitTest();
        
        if(success) {
            System.out.println("All units created successfully!");
        } else {
            System.out.println("One or more units not successfully reated.");
        }
    }
    
    
}

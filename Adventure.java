import java.lang.Thread;
import java.util.Scanner;
import java.util.Arrays;

public class Adventure {

    private String name;
    private String companion;
    private String companionType;
    private int suitcases;
    public static final int MAX_SUITCASES = 2;
    private String[] decor = {"California sleek, modern minimalism", 
                                "Wisconsin retro/vintage space age",
                                "Michican chic",
                                "Minnesota dumpster fire"};
    private String decorChoice;
    private char excitement;
    Scanner input = new Scanner(System.in);

    public void beginAdventure() throws InterruptedException{
        bootup();
        askName();
        checkExcitement();
        checkSuitcase();
        askAboutCompanion();
        chooseDecor();
        launchRocket();
    }

    public void bootup() throws InterruptedException {
        System.out.println("Your adventure awaits. Start engines!");
        Thread.sleep(1000);
        System.out.println("Five!");
        Thread.sleep(1000);
        System.out.println("Four!");
        Thread.sleep(1000);
        System.out.println("Three!");
        Thread.sleep(1000);
        System.out.println("Two!");
        Thread.sleep(1000);
        System.out.println("One!");
    }

    public void askName() {
        System.out.println("Hi there. What is your name?");
        name = input.next();
        System.out.println("Welcome, " + name + "! This is your Mars Adventure.");
        System.out.println("Yesterday, you received a call from your good friend at NASA. \n" +
        "They need someone to go to Mars this weekend, and you've been chosen.");
    }

    public void checkExcitement() {
        System.out.println("Are you excited? Type Y or N");
        excitement = input.next().charAt(0);   
        if (Character.toUpperCase(excitement) == 'Y') {
            System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
        } else {
            System.out.println("Well, ready or not, here we go!");
        }
    }

    public void checkSuitcase() {
        System.out.println("It's time to pack for your trip to Mars.");
        System.out.println("How many suitcases do you plan to bring?");
        suitcases = input.nextInt();
        if (suitcases > MAX_SUITCASES) {
            System.out.println("That's way too many. You'll have to pack more lightly.");
        } else {
            System.out.println("Go you! Don't forget your toothbrush.");
        }
    }

    public void askAboutCompanion() {
        System.out.println("You're allowed to bring one companion animal with you.");
        System.out.println("What kind of companion animal would you like to bring?");
        companionType = input.next();

        System.out.println("What is your companion's name?");
        companion = input.next();

        System.out.println("Cool, so you are bringing " + companion + " the " + companionType + ".");
    }

    public void chooseDecor() {
        System.out.println("NASA has a interior design team offering to outfit your space ship.");
        System.out.println("You have a couple of options for the interior decor of your ship.");
        System.out.println("Your options are:");

        for (int i=0; i<decor.length; i++) {
            System.out.println((i+1) + ". " + decor[i]);
        }

        System.out.println("Enter the number of your decor choice.");
        decorChoice = decor[input.nextInt()-1];
        System.out.println("Oooh, " + decorChoice + "... that is going to look great.");
    }   
    
    public void launchRocket() throws InterruptedException {
        System.out.println("I can see it now:");
        Thread.sleep(1000);
        System.out.println(name + " and " + companion + " surfing the celestial abyss ... \n" +
        "in a " + decorChoice + " spaceship. \n" +
        name + "-- the day is here! \n" +
        "You crawl into the spaceship with " + companion + "\n" +
        "Brace for take off!");

        int countdown = 5;
        while (countdown > 0) {
            System.out.println(countdown + " ...");
            countdown--;
            Thread.sleep(1000);
        }
        System.out.println(" * LIFTOFF * ");
    }
}
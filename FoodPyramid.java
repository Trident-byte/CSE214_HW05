import java.util.Scanner;

/**
 * The <code>FoodPyramid</code> hosts the main method
 * and the primary way for the user to interact with
 * the OrganismTree.
 *
 * @author Brian Chau
 *    email brian.chau@stonybrook.edu
 *    Stony Brook ID: 116125954
 *    Recitation: 02
 **/

public class FoodPyramid {
    /**
     * The main method runs the program and prompts the menu below,
     * and it allows various functions to be performed on your
     * constructed ternary tree.
     *
     * @param args
     *    Arguments given in the command line before running
     */
    public static void main(String[] args){
        OrganismTree tree;
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        System.out.print("What is the name of the apex predator?: ");
        String apexPredator = input.nextLine().strip();
        OrganismNode newNode = new OrganismNode(apexPredator);
        askOrganismType(input, newNode);
        System.out.println("\n\nConstructing food pyramid. . .");
        printMenu();
        while(isRunning){
            System.out.print("Please select an option: ");
            String command = input.nextLine().strip().toLowerCase();
            if(command.equals("q")){
                isRunning = false;
            }
        }
        input.close();
    }

    private static void printMenu(){
        System.out.println("Menu:\n");
        System.out.println("(PC) - Create New Plant Child");
        System.out.println("(AC) - Create New Animal Child");
        System.out.println("(RC) - Remove Child");
        System.out.println("(P) - Print Out Cursor’s Prey");
        System.out.println("(C) - Print Out Food Chain");
        System.out.println("(F) - Print Out Food Pyramid at Cursor");
        System.out.println("(LP) - List All Plants Supporting Cursor");
        System.out.println("(R) - Reset Cursor to Root");
        System.out.println("(M) - Move Cursor to Child");
        System.out.println("(Q) - Quit");
    }

    private static void askOrganismType(Scanner input, OrganismNode newNode){
        System.out.print("Is the organism an herbivore / a carnivore / an omnivore? (H / C / O): ");
        String type = input.nextLine();
        if(type.equals("C")){
            newNode.setIsCarnivore(true);
        }
        else if(type.equals("H")){
            newNode.setIsHerbivore(true);
        }
        else if(type.equals("O")){
            newNode.setIsPlant(true);
        }
    }
}

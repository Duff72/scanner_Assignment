import java.util.Scanner;

public class scannerAssignment {

    public static void greeting(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);

    }
    public static void helloThere(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String status = scanner.nextLine();
        System.out.println("Wow - Interesting. Tell me more about yourself!");
        String more = scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");
    }
    public static void superhero(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String heroName = scanner.nextLine();
        System.out.println("What is their superpower?");
        String power = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + heroName + ", who had the power of " + power);
        System.out.println("As they grew older, " + heroName + " saw that the world needed them.");
        System.out.println(heroName +  " used their ability to " + power + " to save the world.");

    }

    public static void variableInputs(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Enter a double: ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter a boolean value: ");
        boolean bool = scanner.nextBoolean();
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + number);
        System.out.println("Your double is " + number2);
        System.out.println("Your boolean is " + bool);
    }

    public static void main(String[] args) {
        greeting(args);
        helloThere(args);
        superhero(args);
        variableInputs(args);
    }

}
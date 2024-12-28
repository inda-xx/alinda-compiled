public class Exercise2TernaryOperatorMysteries {

    public static void main(String[] args) {
        // Ternary operator explanation
        System.out.println("The ternary operator (? :) allows conditional assignment in a concise manner.");
        System.out.println("Syntax: condition ? valueIfTrue : valueIfFalse");
        System.out.println("Use cases include simplifying simple if-else statements.");

        // Rewriting if-else statement using a ternary operator
        int balance = 100;
        String message = (balance > 0) ? "Player is in the game!" : "Player is out of the game!";
        System.out.println(message);

        // Advantages and pitfalls
        System.out.println("Advantages of using the ternary operator include concise code and inline assignments.");
        System.out.println("Pitfalls include reduced readability if overused or nested, leading to unclear code.");
    }
}
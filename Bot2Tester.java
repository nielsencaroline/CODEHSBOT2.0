import java.util.Scanner;

public class Bot2Tester{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hello. ");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        
        Bot2 botTwo = new Bot2(name); //why only include name, not other parameters?
        botTwo.greeting();
        
        System.out.println("What is your favorite animal?");
        String animal = input.nextLine();
        botTwo.favoriteAnimal(animal);
        
        System.out.println("Where do you live? ");
        String homePlace = input.nextLine();
        botTwo.home(homePlace);
        
        System.out.println("What is your favorite number? ");
        int favNumber = input.nextInt();
        botTwo.favoriteNumber(favNumber);
        
        botTwo.goodbye();
        
        
    }
}
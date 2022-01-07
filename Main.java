import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pear , apple , tomato, eggplant,banana;
        double totalCost;

        double perKgofpear = 2.14;
        double perKgofapple =3.67;
        double perKgoftomato = 1.11;
        double perKgofeggplant = 5;
        double perKgofbanana = 0.95;

        Scanner input = new Scanner(System.in);
        System.out.println("How many kilograms is Pear ? :  ");
        pear = input.nextDouble();
        System.out.println("How  many kilograms is Apple ? : ");
        apple = input.nextDouble();
        System.out.println("How many kilograms  is Tomato ? : ");
        tomato = input.nextDouble();
        System.out.println("How many kilograms is Eggplant ? : ");
        eggplant = input.nextDouble();
        System.out.println("How many kilograms is Banana ? : ");
        banana = input.nextDouble();

        totalCost = (pear * perKgofpear + apple * perKgofapple + tomato * perKgoftomato + eggplant * perKgofeggplant + banana * perKgofbanana);
        System.out.println("Total cost is : "+  totalCost);

    }
}

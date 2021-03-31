package CapgeminiTraining.Java.Assignment2;

import javafx.scene.transform.Scale;

import java.util.Calendar;
import java.util.Scanner;

/**
 *  Develop an application for Dessert shop. The application should allow owner to add items like Candy, Cookie or Ice Cream in the shop storage. Also customers should be able to place an order.
 *
 * DessertItem is an abstract class having an abstract method getCost(). Every dessert item has tax associated. Candy item is sold in dollar currency, Cookie in Euro currency & Ice Cream in Rupees currency. The sub classes are supposed to override these methods. When we run the application, it should ask us our role i.e. owner or customer. If role is owner, we should be able to add dessert items in our storage. If role is customer, then we should be able to place an order. The currency conversion rates are:
 *
 * 1 dollar = 60 rupees.
 *
 * 1 euro = 70 rupees.
 *
 * Specifications:-
 *
 * abstract class DesertItem {
 *
 *     abstract public int getCost();
 * }
 * class Candy extends DesertItem {
 *     public int addCandies(int candies){}
 * }
 * class Cookie extends DesertItem {
 *     public int addCookies(int candies){}
 * }
 * class IceCream extends DesertItem {
 *     public int addIceCreams(int candies){}
 * }
 * public class Assignment2Q7 {
 *     public static void main(String[] args) {}
 *     private void selectRoles(){}
 *     private void roles(String role){}
 *     private void addItems() {}
 *     private void addItemsOperation(int choice) {}
 *     private void placeOrder() {}
 *     private void placeOrderOperation(int choice) {}
 * }
 */
abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
    int TotalCandies=0;
    int DollarInRupee = 1;
    // 1 dollor = 60 rupees
    public int addCandies(int candies){
        this.TotalCandies+=candies;
        return  TotalCandies;
    }

    @Override
    public int getCost() {
        return TotalCandies*DollarInRupee;
    }
}
class Cookie extends DesertItem {
    int TotalCookies=0;
    int EuroInRupee =70;
    public int addCookies(int cookies){

        TotalCookies +=cookies;
        return  TotalCookies;
    }

    @Override
    public int getCost() {
        return TotalCookies*EuroInRupee ;
    }
}
class IceCream extends DesertItem {
    int totalIceCream=0;
    public int addIceCreams(int iceCreams){
        totalIceCream+=iceCreams;
        return totalIceCream;
    }
    @Override
    public int getCost() {
        return 0;
    }
}
public class Assignment2Q7 {
    Scanner sc = new Scanner(System.in);
    private void selectRoles(){

        System.out.println("Enter your role  customer or owner");

        String role;
        role = sc.next();

        roles(role);
    }
    private void roles(String role){
        if(role.toUpperCase().equals("CUSTOMER")){
            placeOrder();
        }
        else if(role.toUpperCase().equals("OWNER"))
            addItems();
        else
            System.out.println("Please enter valid details!");
    }
    private void addItems() {
        System.out.println("Choose itmes to be added :");
        System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
        System.out.println("Enter your choice: ");
        int ch;
        ch = sc.nextInt();
        addItemsOperation(ch);
    }
    private void addItemsOperation(int choice) {

            switch (choice) {
                case 1:
                    Candy candy = new Candy();
                    System.out.println("Enter the amount of candies to be added ");
                    int amount;
                    amount = sc.nextInt();
                    int total = candy.addCandies(amount);
                    System.out.println("Candies added succesfully and totaly availabe are" + total);
                    break;
                case 2:
                    Cookie cookie = new Cookie();
                    System.out.println("Enter the amount of cookies to be added ");
                    //int amount;
                    amount = sc.nextInt();
                    total = cookie.addCookies(amount);
                    System.out.println("Cookies added succesfully and total  availabe are" + total);
                    break;
                case 3:
                    IceCream iceCream = new IceCream();
                    System.out.println("Enter the amount of Ice Cream to be added ");
                    //int amount;
                    amount = sc.nextInt();
                    total = iceCream.addIceCreams(amount);
                    System.out.println("Ice Creams added succesfully and total availabe are: " + total);
                default:
                    System.out.println("please enter valid number!");
                    break;
            }


    }
    private void placeOrder() {
        System.out.println("Choose itmes to be placed :");
        System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
        System.out.println("Enter your choice: ");
        int ch;
        ch = sc.nextInt();
        placeOrderOperation(ch);
    }
    private void placeOrderOperation(int choice) {
        switch (choice) {
            case 1:
                Candy candy = new Candy();
                System.out.println("Enter the amount of candies to be placed ");

                int total = candy.getCost();
                System.out.println("Candies placed succesfully and total cost is " + total);
                break;
            case 2:
                Cookie cookie = new Cookie();
                System.out.println("Enter the amount of cookies to be placed ");//int amount;

                total = cookie.getCost();
                System.out.println("Cookies placed succesfully and total  cost is " + total);
                break;
            case 3:
                IceCream iceCream = new IceCream();
                System.out.println("Enter the amount of Ice Cream to be added ");

                total = iceCream.getCost();
                System.out.println("Ice Creams placed succesfully and total cost is : " + total);
            default:
                System.out.println("please enter valid number!");
                break;
        }

    }
    public static void main(String[] args) {
        Assignment2Q7 assignment2Q7 = new Assignment2Q7();
        assignment2Q7.selectRoles();


    }

}



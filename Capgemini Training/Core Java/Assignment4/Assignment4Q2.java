package CapgeminiTraining.Java.Assignment4;

import java.util.ArrayList;

/**
 * Q2. Write an application using lambda expressions to print Orders having 2 criteria implemented:
 * 1) order price more than 10000
 * 2) order status is ACCEPTED or COMPLETED.
 */



public class Assignment4Q2 {
    /*
    @Override
    public String toString() {
        return "Assignment4Q2{" +
                "totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                '}';
    }
*/
    public Assignment4Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private int totalPrice;
    private String status;

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
        ArrayList<Assignment4Q2> listOrders = new ArrayList<>();


        for(Assignment4Q2 order:orders){
            if((order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED"))&& order.getTotalPrice()>1000){
                System.out.println("Inside if");
                Assignment4Q2 or = new Assignment4Q2(order.getTotalPrice(),order.getStatus());
                listOrders.add(or);
            }
        }

        return listOrders;
    }
    public static void main(String[] args) {
        Assignment4Q2 a1 = new Assignment4Q2(10001,"ACCEPTED");
        Assignment4Q2 a2 = new Assignment4Q2(1000,"ACCEPTED");
        Assignment4Q2 a3 = new Assignment4Q2(10500,"COMPLETED");
        Assignment4Q2 a4 = new Assignment4Q2(100,"ACCEPTED");
        Assignment4Q2 a5 = new Assignment4Q2(10002,"ACCEPTED");
        Assignment4Q2 a6 = new Assignment4Q2(10005,"REJECTED");
        Assignment4Q2 a7 = new Assignment4Q2(50000,"COMPLETED");

        ArrayList<Assignment4Q2> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        list.add(a7);
        System.out.println(list);
        System.out.println(listOfOrders(list));



    }
}
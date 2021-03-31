package CapgeminiTraining.Java.Assignment1;


import java.util.ArrayList;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        ArrayList<Integer> armstrongNumbersList = new ArrayList<>();
        for(int i = min;i<=max;i++){
            if(armstrongCheck(i))
                armstrongNumbersList.add(i);

        }

        int [] arrayOfArmNumber = new int[armstrongNumbersList.size()];
        int i=0;

       for(Integer ele:armstrongNumbersList){
           arrayOfArmNumber[i] =ele;
           i++;
       }
         return  arrayOfArmNumber;
    }
    public boolean armstrongCheck(int num){
        int n = num;
        int d=0;
        while(n>0){
            d++;
            n = n/10;
        }
        //System.out.println(d);
        int n1 = num;
        int arm =0;
        while(n1>0){
            int remainder = n1%10;
            arm =arm+ (int)Math.pow(remainder,d);
            n1 = n1/10;
        }

        if(num==arm)
            return true;
        else
            return false;
    }
}
public class Assignment1Q2 {
    public static void main(String[] args) {
        int min =100;
        int max=999;

        ArmstrongNumBetweenRange armstrongNumBetweenRange = new ArmstrongNumBetweenRange();
        int [] res = armstrongNumBetweenRange.armstrongNumbersInRange(min,max);

        for(int i:res){
            System.out.print(i+" ");
        }
    }
}

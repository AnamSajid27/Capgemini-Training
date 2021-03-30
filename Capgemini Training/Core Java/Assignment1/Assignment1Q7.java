package CapgeminiTraining.Java.Assignment1;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){

        // using linear search to find the element in the array
        boolean valueFound=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==toCheckValue)
                valueFound=true;
        }

        // returning the result stored in the valueFound variable
        return valueFound;
    }
}

public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int valueToCheck = 19;

        // Creating reference variable of SearchArray class which will act as a object at runtime
        SearchArray searchArray = new SearchArray();

        // passing array and the value to be search in that array to searchArray method present in Search array class
        if (searchArray.searchArray(arr, valueToCheck)) {
            System.out.println("element is present in the array");
        } else {
            System.out.println("element is not present in the array");
        }
    }
}

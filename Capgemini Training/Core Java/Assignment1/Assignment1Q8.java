package CapgeminiTraining.Java.Assignment1;

class BubbleSort{

    public int[] bubbleSort(int arr[]) {

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){

                    // swapping the elements
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

        // creating the reference variable fo class BubbleSort
        BubbleSort bubbleSort = new BubbleSort();

        // passing unsorted array toh the bubblesort method of class BubbleSort which returns the sorted array
        int sortedArray[] =bubbleSort.bubbleSort(arr);

        // printing the sorted array
        for(int i:sortedArray){
            System.out.print(i+" ");
        }
    }
}

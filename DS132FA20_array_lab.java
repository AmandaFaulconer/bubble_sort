//Bubble Sort Array
//Amanda Faulconer

package ds132fa20_array_lab;

import java.util.Arrays;
import java.util.Scanner;

//Create an array with the array size of 100;
class ArrBubbleSort{
    
    private static int[] arr;
    // nElems - number of elements - keeps track of the data
    private static int nElems;
    
    //constructor - name of the class
    ArrBubbleSort(int Max){
        arr = new int[Max];
    }
    
    public void insert(int value){
        arr[nElems] = value;
        nElems++;
    }
    
    public void displayArray(){
        for(int c = 0; c < nElems; c++){
            System.out.print(arr[c] + " ");
        }
        System.out.println("\n");
    }
    
//Write the bubble sort and sort the array.
    public void bubbleSort(){
	int temp = 0;
        for(int c = 0; c < nElems -1; c++){
            for(int i  = 0; i < nElems - 1; i++){
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i+1] = temp;
                }
            }
        }
    }
        
//Write the bubble sort to display the data in descending order    
    public void bubbleSortDes(){
        int temp = 0;
        for(int c = 0; c < nElems; c++){
            for(int i = 0; i < (nElems - 1); i++){
                for(int j = 0; j < nElems - i - 1; j++){
                    if(arr[j] < arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;                    
                    }
                }
            }
        }  
    }
    
//Insert a new piece of data - user gets to choose.    
    public void userInsert(){
 
        int user = 0;
        
        Scanner addnum = new Scanner(System.in);
        System.out.println("What number would you like to add?  ");
        user = Integer.parseInt(addnum.nextLine());
        for (int c = 0; c < nElems; c++){           
            arr[nElems] = nElems;
        }
        arr[nElems] = nElems;
        nElems++;        
    }
    
//Delete a piece of data - user gets to choose.    
    public void userDelete(){
        
        int Position = 0;
        
        Scanner delete = new Scanner(System.in);
        System.out.println("What position would you like to delete? ");
        Position = Integer.parseInt(delete.nextLine());
        for(int c = 0; c < nElems; c++){
            arr[nElems] = arr[c+1];
        }       
        nElems--;    
    }
    
}// end of ArrayBubbleSort class


public class DS132FA20_array_lab {

    public static void main(String[] args) {
        // TODO code application logic here
        
//Create an array with the array size of 100;        
        int MaxSize = 100;
        ArrBubbleSort myArray;
        
        myArray = new ArrBubbleSort(MaxSize);

// Fill the first 10 spots with non duplicating data     

        myArray.insert(90);
        myArray.insert(60);
        myArray.insert(40);
        myArray.insert(70);
        myArray.insert(50);
        myArray.insert(10);
        myArray.insert(30);
        myArray.insert(0);
        myArray.insert(20);
        myArray.insert(80);
        
        myArray.displayArray();   
        
        myArray.bubbleSort();
        myArray.displayArray();
        
        myArray.bubbleSortDes();
        myArray.displayArray();
        
        myArray.userInsert();
        myArray.displayArray();
        
        myArray.userDelete();
        myArray.displayArray();        
        
    }
    
}

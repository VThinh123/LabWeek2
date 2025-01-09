package com.mycompany.mylab211.Week1;

import java.util.Random;


public class LinearSearch {
    private int array[];

    public LinearSearch() {
        this.array = array;
    }


    void addValue(int value){
        array = new int[value];
        Random rd = new Random();
        for(int i = 0; i<array.length; i++){
            array[i] =rd.nextInt(array.length);
        }
    }
    
    void showArray(){
        for(int i =0; i< array.length; i++){
            System.out.print(array[i]+ ", ");
        }
    }
    
    int searchValue(int value){
        for(int i = 0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
       return -1; 
    }   
}

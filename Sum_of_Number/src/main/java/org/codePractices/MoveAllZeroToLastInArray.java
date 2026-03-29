package org.codePractices;

public class MoveAllZeroToLastInArray {

        public static void main(String[] args) {
            int[] arr = {0,1,3,4,5,60,0,2,0,3};
            int intertPosition = 0;

            for (int i = 0 ; i < arr.length ; i++){
                if(arr[i] != 0){
                    arr[intertPosition] = arr[i];
                    intertPosition++;
                }
            }


            for ( int i = intertPosition; i < arr.length; i++){
                arr[i]= 0;

            }

            for (int num : arr){
                System.out.print(num + " ");
            }
        }
    }


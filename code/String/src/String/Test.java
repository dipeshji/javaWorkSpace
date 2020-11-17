package String;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Test {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        int[] arr1 = new int[6];
        int[] arr2 = new int[6];
        int[] arr3 = new int[6];
        int j = 0;
        int count = 0;
        int sum = 0;
        int rowCount = 0;
        while(j<arr.length){
            for(int i = 0; i < arr.length; i++ ){
            if(arr[j][i] != 0) count ++;
            else if(count>0) count=0;
            j = i == 5 
                ? j++
                : j;
            if(count == 3 && rowCount == 0){
                for(int l=0; l<arr.length; l++){
                    arr1[i] = arr[j][i];
                }
                rowCount++;
            }else if(count == 1){
                for(int l=0; l<arr.length; l++){
                    arr2[l] = arr[j][l];
                }
            }else if(count == 3 && rowCount > 0){
                for(int l=0; l<arr.length; l++){
                    arr3[l] = arr[j][l];
                }
                rowCount=0;
                int localSum = 0;
                for(int l = 0; l<arr.length; l++){
                    localSum += arr1[l] + arr2[l] + arr3[l];
                }
               sum = localSum>sum
               ?localSum
               :sum;
            }
        }
        }
        System.out.println(sum);
        
    }
}

package DSA;

import java.util.Scanner;

public class CeilingOfLetter {
    public static void main(String[] args) {
        char[] arr = {'c','j','l','n'};
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a single character ");
        String target = sc.next();
        System.out.println("Letter greater than or equal to the input : "+smallestLetter(arr,target));
    }
    /*
    this function return the ceiling of a character :-
            any character of list is  greater than or equal to the target character

    if character does not found :-
            returns the fist element
     */
    static char smallestLetter(char[] arr,String target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target.charAt(0) > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }
        return arr[start ];
    }
}

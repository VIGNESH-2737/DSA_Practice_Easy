import java.util.*;
class TwoPointerEasy{

  public static boolean hasPairWithSum(int[] arr,int target){
    for(int pointerA = 0; pointerA < arr.length; pointerA++)
      for(int pointerB = 0; pointerB < arr.length; pointerB++)
            if(pointerA != pointerB && (arr[pointerA]+arr[pointerB]) == target)
                return true; 

    return false;      
  }
  
  public static int[] reverse(int[] arr){
    int len = arr.length;
    int temp = 0;
    for(int index = 0; index < arr.length/2; index++){
      temp = arr[index];
      arr[index] = arr[len-1-index];
      arr[len-1-index] = temp;
    }
    return arr;
  }
  
  public static boolean isPalindrome(int[] arr){
    int len = arr.length;
    for(int index = 0; index < arr.length/2; index++){
      if(arr[index] != arr[len-1-index])
            return false;
    }
    return true;
  }
  
  public static int[] moveZerosToEnd(int[] arr){
    int insertPos = 0;
    for(int num : arr){
        if(num != 0)
            arr[insertPos++] = num;
    }
    while(insertPos < arr.length){
        arr[insertPos++] = 0;
    }
    return arr;
  }
  
  public static void main(String[] args) {
    //1
    int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;
        System.out.println("Has pair with sum: " + hasPairWithSum(arr, target));

    //2
    int[] arr1 = {1, 2, 3, 4, 5};
        reverse(arr1);
        System.out.println("Reversed array: " + Arrays.toString(arr1));

    //3
    int[] arr3 = {1, 2, 3, 2, 1};
        System.out.println("Is array palindrome: " + isPalindrome(arr3));

    //4
     int[] arr4 = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr4);
        System.out.println("Modified array: " + Arrays.toString(arr4));

    // //5
    // int[] a = {1, 3, 5};
    //     int[] b = {2, 4, 6};
    //     int[] merged = merge(a, b);
    //     System.out.println("Merged array: " + Arrays.toString(merged));
    }
}

class RecursionEasy{
  // 1. Factorial of N numbers.
  public static int findFactorial(int n){
    if(n == 0 || n == 1)
        return 1;
    return n*findFactorial(n-1);
  }
  // 3. Print numbers from 1 to N.
  public static void printNumbers(int n){
        if(n == 0)
          return;
        printNumbers(n-1);
        System.out.print(n +" ");
        return;
    }
// 2. Find Sum
  public static int sum(int n){
      if(n == 1)
        return n;
      return n + sum (n-1);
  }
// 4.String reverse
  public static String reverse(String input){
    int len = input.length();
    if(len == 0)
        return input;
    
      return reverse(input.substring(1))+ input.charAt(0);
  }
// 5. Fibonacci
  public static int fib(int n){
      if(n == 0 || n == 1){
          return n;
      }
      return fib(n-1) + fib(n-2);
  }

  //6. CountDown
  public static void countDown(int n){
      if(n == 0)
        return;
      System.out.print(n+" ");
      countDown(n-1);
  }

  //7. count digits
  public static int countDigits(int num){
    if(num == 0){
      return 0;
    }
    return 1 + countDigits(num/10);
  }
  
  //8 power of number
  public static double power(double x, int n){
      if(n == 0){
          return 1;
      }
      
      if(n == 1){
          return x;
      }
      
      return x*power(x, n-1);
  }
  
  //9 check Palindrome
  public static boolean isPalindrome(String str){
      str = str.toLowerCase();
      str = str.replaceAll("[^a-zA-Z0-9]", "");
      if(str.length() <= 1){
          return true;
      }
      if(str.charAt(0) == str.charAt(str.length()-1)){
          return isPalindrome(str.substring(1, str.length()-1));
      }else{
          return false;
      }
  }
  
  // 10. GCD Eucliedian Algorithm
  public static int gcd(int a, int b){
      if(b == 0){
          return a;
      }
      return (b, a%b);
  }

  // 11. print array elements using array.
  public static void rec(int[] arr){
        rec(arr, arr.length-1);
    }
    // left to right
    public static void rec(int[] arr, int index){
        if(index < 0)
            return;
            
        rec(arr, index-1);
        System.out.print(arr[index]+" ");

      //right to left
      //System.out.print(arr[index]+" ");
      //rec(arr, index-1);
        
        return;
    }
  
    
  
  
  public static void main(String[] args) {
        int n = 5;
    //1
        System.out.println("Factorial of " + n + " is: " + findFactorial(n));
    //2
        System.out.println("Sum of first " + n + " numbers is: " + sum(n));
    //3
        System.out.print("Numbers from 1 to " + n + ": ");
        printNumbers(n);

    //4 
        String input = "hello";
        System.out.println("Reversed string: " + reverse(input));

    //5 
       // int n = 6;
        System.out.println("Fibonacci number at index " + n + " is: " + fib(n));

    //6
        System.out.print("Countdown: ");
        countDown(n);

    //7 
        int num = 12345;
        System.out.println("Number of digits in " + num + ": " + countDigits(num));
        
    //8
        double x1 = 2.0;
        int n1 = 3;
        System.out.println(x1 + "^" + n1 + ": " + power(x1, n1));
    
    //9
        String s = "madam";
        String s1 = "A man, a plan, a canal, Panama";
        System.out.println("Is '" + s + "' a palindrome? " + isPalindrome(s));
        
    //10
    int a1 = 48, b1 = 18;
    System.out.println("GCD of " + a1 + " and " + b1 + ": " + gcd(a1, b1));

        
    }
}

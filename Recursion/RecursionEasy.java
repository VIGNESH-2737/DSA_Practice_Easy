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
          return 1;
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
    }
}

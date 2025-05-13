// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class RopeCut {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        int n = 5;
        int a = 1;
        int b = 5;
        int c = 2;
        System.out.println(ropeCutting(n,a,b,c));
    }
    
    public static int ropeCutting(int n, int a, int b, int c){
        if(n == 0)
            return 0;
            
        if(n < 0)
            return -1;
            
        int result = Math.max(  ropeCutting(n-a,a,b,c),
                                Math.max(ropeCutting(n-a,a,b,c),
                                ropeCutting(n-a,a,b,c))  );
            
        if(result == -1)
            return -1;
        
        
        return result+1;
    }
}

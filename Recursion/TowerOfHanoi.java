import java.util.*;
class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();

        System.out.println("\nTower of Hanoi Solution:");
        solveHanoi(n, 'A', 'B', 'C'); // A is source, B is auxiliary, C is destination

        scanner.close();
    }
    
    public static void solveHanoi(int n, char source,char destination, char auxilary){
        
        if(n == 1){
            System.out.println("Move 1 disk from "+source+" to "+destination);
            return;
        }
            
        solveHanoi(n-1, source, auxilary, destination);
        System.out.println("Move "+n+" disk from "+source+" to "+destination);
        solveHanoi(n-1, auxilary, destination, source);
        
    }
}

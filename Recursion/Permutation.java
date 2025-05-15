import java.util.*;
public class Permutation {
  public static void permute(int ind, int[] arr, List<Integer> temp, List<List<Integer>> res, boolean[] visi){
    if(ind == arr.length){
      res.add(new ArrayList(temp));
      System.out.println(temp);
      return;
    }
    for(int i = 0 ; i < arr.length; i++){
      if(!visi[i]){
        visi[i] = true;
        temp.add(arr[i]);
        permute(ind +1, arr, temp, res, visi);
        temp.remove(temp.size()-1);
        visi[i] = false;
      }
    }
  }
  
  public static void main(String args[]){
    int[] arr = {1,2,3};
    List<List<Integer>> res = new ArrayList<>();
    permute(0, arr, new ArrayList<>(), res, new boolean[arr.length]);
    System.out.println(res);
  }
}

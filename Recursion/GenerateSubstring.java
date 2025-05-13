import java.util.*;
class GenerateSubstring {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(
            genSubSet(new ArrayList<>(),s , "", 0)
            );
    }
    
    public static List<String> genSubSet(List<String> list,String input ,String str, int index){
        
        if(index == input.length()){
            list.add(str);
            return list;
        }
        
        genSubSet(list, input, str, index+1);
        genSubSet(list, input, str+input.charAt(index), index+1);
        
        return list;
    }
}










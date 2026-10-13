import java.util.HashMap;
import java.util.Map;
public class _20_246_Strobogrammatic_number {

    public static boolean isStro(Map <Character, Character> map,
     String s){
        int i = 0;
        int j = s.length()-1; // for string length() 

        while(i<=j){
            char l = s.charAt(i);
            char r = s.charAt(j);

            if(map.containsKey(l)){
                if(map.get(l) != r){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){

        Map <Character, Character> map = new HashMap<>();
        String s = "181";

        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        System.out.println(isStro(map, s));

    }
}

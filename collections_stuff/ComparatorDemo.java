import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Akash on 8/11/2016.
 */
public class ComparatorDemo {

    public static class CustomStringComparator implements Comparator<String>{
        public int compare(String s1, String s2){
            if(s1.length() > s2.length()){
                return 1;
            }else if(s1.length() < s2.length()) {
                return -1;
            }else{
                return s1.compareTo(s2);
            }
        }
    }
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Lion");
        list.add("Elephant");
        list.add("Zebra");
        list.add("Kangaroo");
        list.add("Tiger");


        Collections.sort(list, new CustomStringComparator());

        for(String str:list){
            System.out.println(str);
        }
    }
}

import java.util.Comparator;

public class LambdasExample {

    public static void main(String[] args){
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int compare = stringComparator.compare("hello","world");
        System.out.println(compare);
        

    }

}

/**
 * Created by litvinenko on 3/30/2016.
 */
import java.util.*;

public class UniqueArray {

    public String toJadenCase(String phrase) {
        StringBuilder str = new StringBuilder();
        if(phrase != null){
            String[] mas = phrase.split(" ");
            for(String x : mas){
                str.append(x.substring(0, 1).toUpperCase() + x.substring(1));
                if(Arrays.asList(mas).lastIndexOf(x) != mas.length - 1){
                    str.append(" ");
                }
            }
        }
        else if(phrase != null || phrase == ""){
            return null;
        }
        return str.toString();
    }


    public static void main(String[] args) {
        System.out.println(new UniqueArray().toJadenCase("most trees are blue"));
    }
}
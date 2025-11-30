package paral;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SampleFile {

    public static void main(String[] args) {

       List<String> list=new LinkedList<>();
       list.add("Mega");
       list.add("Dhoni");
       list.add("Dhola");
       list.add("kholi");
        list.add("kholi");
        Set<String> d = list.stream().map(String::toLowerCase).filter(a -> a.startsWith("d")).collect(Collectors.toSet());
        System.out.println(d);
    }
}

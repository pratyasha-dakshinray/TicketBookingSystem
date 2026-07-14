import java.util.*;
public class app {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()); 
    }

     
    
}



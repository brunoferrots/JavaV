import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Comparison {
    //No Java 8 surgiu a possibilidade de implementar método nas interfaces através da palavra chave "default";
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Bruno");
        nomes.add("Maria");
        nomes.add("Pandora");
        nomes.add("Mary");

//        nomes.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if(s1.length() < s2.length())
//                    return -1;
//                if(s1.length() > s2.length())
//                    return 1;
//                return 0;
//            }
//        });

//        nomes.sort(new Comparator<String>() {
//                @Override
//                public int compare(String s1, String s2) {
//                    return s1.compareTo(s2);
//                }
//            }
//        );
        nomes.sort(Comparator.comparing(String::length));
//        nomes.sort(String::compareTo);

        System.out.println(nomes);

//        nomes.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        nomes.forEach(System.out::println);



    }
}


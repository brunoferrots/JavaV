package v914;

import java.util.List;

//Java 9 - Factory Method for Collections Immutable
public class FactoryMethod {
    public static void main(String[] args) {
        //Immutable List (valid for all collections)
        var nameList = List.of("Bruno", "Larissa", "Vanessa");
        System.out.println(nameList);
    }
}

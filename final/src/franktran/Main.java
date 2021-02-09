package franktran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> groceryString = new ArrayList<>();
        groceryString.add("Jerome");
        groceryString.add("Beth");
        groceryString.add("Sam");

        System.out.println(groceryString);

        groceryString.remove("Beth");
//        groceryString.remove(1);

        System.out.println(groceryString);

        String jerome = groceryString.get(0);

        System.out.println(jerome);
    }
}

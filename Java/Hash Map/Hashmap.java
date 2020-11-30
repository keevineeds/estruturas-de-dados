import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "um");
        map.put(2, "dois");
        map.put(3, "tres");


        System.out.println("Valor 1: " + (String)map.get(1));
        System.out.println("Valor 2: " + (String)map.get(2));
        System.out.println("Valor 3: " + (String)map.get(3));
    }
}


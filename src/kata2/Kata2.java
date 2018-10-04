package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Truil
 */
public class Kata2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberCuantity;
        System.out.println("Intoduce una cantidad de numeros: ");
        numberCuantity = sc.nextInt();
        int[] array = new int[numberCuantity];
        for (int i = 0; i < numberCuantity; i++) {
            System.out.println("Introduce un valor: ");
            array[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numberCuantity; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        //map.forEach(<key,value> -> {System.out.println("Key: "+key+" value: "+value);});

        //iterar solo sobre claves
        //Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

}

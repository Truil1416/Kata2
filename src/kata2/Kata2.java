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
        System.out.println("Intoduce una cantidad de nombres: ");
        numberCuantity = sc.nextInt();
        String[] array = new String[numberCuantity];
        sc.nextLine();
        for (int i = 0; i < numberCuantity; i++) {
            System.out.println("Introduce un nombre: ");
            array[i] = sc.nextLine();
        }
        Histogram histo = new Histogram(array);
        Map <String,Integer> histogr = histo.getHistogram();
        //map.forEach(<key,value> -> {System.out.println("Key: "+key+" value: "+value);});
        for (String key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
 
}

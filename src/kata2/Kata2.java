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
        Histogram histo = new Histogram(array);
        Map <Integer,Integer> histogr = histo.getHistogram();
        //map.forEach(<key,value> -> {System.out.println("Key: "+key+" value: "+value);});
        for (Integer key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }

}

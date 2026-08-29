package Activity2;

import java.util.LinkedList;
import java.util.Queue;
//Problem: The queue should remove the first person who entered.
/*
 * Group Members:
 *  Hamdain, Redwann
 * Gertos, Joshua Miguel
 * Makasakit, Josch Martie
 * Utrera, Sean John Daniel
 * Yabut, Renyer N.
 * */
public class Group5 {
    public static void main(String[] args) {

        Queue<String> customers = new LinkedList<>();

        customers.add("Customer A");
        customers.add("Customer B");
        customers.add("Customer C");

        // Fix: Use poll() or remove() to remove the head of the queue ("Customer A")
        customers.poll();

        System.out.println(customers);
    }
}
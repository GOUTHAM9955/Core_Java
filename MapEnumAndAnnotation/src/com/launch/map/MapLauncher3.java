package com.launch.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Passport {
    private String name;
    private String city;

    public Passport(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Passport [name=" + name + ", city=" + city + "]";
    }
}

public class MapLauncher3 {

    public static void main(String[] args) {
        Passport p1 = new Passport("GK", "Khammam");
        Passport p2 = new Passport("RJ", "Guntur");
        Passport p3 = new Passport("HK", "Hyd");

        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(2);
        Integer i3 = Integer.valueOf(3);

        HashMap<Integer, Passport> hm = new HashMap<>();

        hm.put(i1, p1);
        hm.put(i2, p2);
        hm.put(i3, p3);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the id which you want to search for");
        Integer uid = scan.nextInt();  
        
        Set set = hm.entrySet();
        Iterator<Map.Entry<Integer, Passport>> itr = set.iterator();

        Boolean checker = false;
        while (itr.hasNext()) {
            Map.Entry<Integer, Passport> entry = itr.next();
            Integer key = entry.getKey();
            if(key == uid) {
            	System.out.println("Values are" + entry.getValue());
            	checker = true;
            }
        }
        if (!checker) {
        	System.out.println("Enter valid id");
        }
        scan.close();
    }
}

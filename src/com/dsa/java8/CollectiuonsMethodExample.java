package com.dsa.java8;

import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
public class CollectiuonsMethodExample {
    public static void main(String[] args) {
        /*List<Integer> list= Arrays.asList(1,4,5,14,56,20,6,7,8,3,4,11,13);
        System.out.println("Befor sort:"+list);
        Collections.sort(list);
        System.out.println("After sort:"+list);

        System.out.println( Collections.binarySearch(list,20));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.min(list,(a,v)->a.compareTo(v)));
        Collections.reverse(list);
        System.out.println(list);
        List<Integer> unList = Collections.unmodifiableList(list);
        try{
            unList.add(89);
        }catch (Exception e){
            System.out.println("Niot Support");
        }

        System.out.println("==============================");
        System.out.println(list);
        Collections.rotate(list,2);
        System.out.println(list);
        Collections.replaceAll(list,11,121);
        System.out.println(list);

        System.out.println();
        for(Integer eel:list){
            System.out.println( Collections.frequency(list,eel));
        }

        List<String> nameList = Collections.nCopies(10, "Ganesh");
        System.out.println(nameList);


        List<String> newList = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("Element1");
        list1.add("Element2");
        list1.add("Element3");
       */

        List<String> newList = new ArrayList<>();
        newList.add("Ganesh");
        newList.add("Ganesh");
        newList.add("Ganesh");
        newList.add("Ganesh");
        System.out.println(newList);

        // Elements to add to the newList
        String[] elementsToAdd = {"Element1", "Element2", "Element3"};
        boolean isModified = Collections.addAll(newList, elementsToAdd);

        System.out.println(isModified);

        System.out.println("Contents of newList: " + newList);
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Smartphone", 599.99));
        products.add(new Product("Tablet", 399.99));
        products.add(new Product("Smartwatch", 199.99));

        //Collections.binarySearch(products, Comparator.comparing(Product::getName));

        Comparator<Product> nameComparator = Comparator.comparing(Product::getName);

        // Search for a product by name
        Product key = new Product("Smartphone", 0); // We only care about the name for the search
        int index = Collections.binarySearch(products, key, nameComparator);
        if (index >= 0) {
            System.out.println("Product found at index: " + index);
            System.out.println("Product details: " + products.get(index));
        } else {
            System.out.println("Product not found.");
        }

















    }




}

package com.dsa.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllJava8CondingProblem {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 8, 6, 10);
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
        System.out.println("Max element: " + max);


        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers1.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        char searchChar = 'o';
        List<String> aFilterList = strings.stream().filter(str -> str.contains(String.valueOf(searchChar))).collect(Collectors.toList());
        System.out.println(aFilterList);

        List<String> strings1 = Arrays.asList("apple", "banana", "orange", "grape");
        List<String> upperCaseStrings = strings1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase strings: " + upperCaseStrings);

        System.out.println("=========================================================================");

        List<Integer> numbers123 = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble average = numbers123.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "N/A"));

        System.out.println("============================================================================");

        List<String> stringsFruits = Arrays.asList("banana", "orange", "apple", "grape");
        List<String> sortedStrings = stringsFruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted strings: " + sortedStrings);
        System.out.println("===========================================================================");

        String concatenatedString = strings.stream()
                .collect(Collectors.joining(" "));
        System.out.println("Concatenated string: " + concatenatedString);

        Optional<String> maxString = strings.stream().max((s1, s2) -> s1.length()-s2.length());
        System.out.println(maxString);

        System.out.println("================================================================");
        List<Integer> numbersList = Arrays.asList(4, 2, 8, 6, 10);
        Stream<Integer> sortedStrream = numbersList.stream().sorted((n1, n2) -> n1.compareTo(n2));
        System.out.println(sortedStrream.skip(1).findFirst());

        Optional<Integer> secondLargest = numbers.stream()
                .sorted((num1, num2) -> num2 - num1)
                .skip(1)
                .findFirst();
        System.out.println("Second largest number: " + (secondLargest.isPresent() ? secondLargest.get() : "N/A"));
        List<Integer> numbers1_10 = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
        List<Integer> uniqueNumbers = numbers1_10.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Original list: " + numbers);
        System.out.println("List with duplicates removed: " + uniqueNumbers);

        List<String> strings123 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String shortString = strings123.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(shortString);
        System.out.println("==================================================================================");
        List<Integer> numbers1_1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers1_1.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Original list: " + numbers);
        System.out.println("List of squares: " + squares);

        System.out.println("================================================================================");

        List<String> stringser = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String prefix = "a";
        List<String> stringsWithPrefix = stringser.stream()
                .filter(s -> s.startsWith(prefix))
                .collect(Collectors.toList());
        System.out.println("Strings starting with prefix '" + prefix + "': " + stringsWithPrefix);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product of all elements: " + product);

        List<Integer> primes = numbers.stream()
                .filter(AllJava8CondingProblem::isPrime)
                .collect(Collectors.toList());
        System.out.println("Prime numbers: " + primes);

        String target = "banana";
        boolean containsString = strings.stream()
                .anyMatch(s -> s.equals(target));
        System.out.println("List contains string '" + target + "': " + containsString);


        int minLength = 5;
        List<String> longStrings = strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
        System.out.println("Strings with length greater than " + minLength + ": " + longStrings);

        List<Integer> numbersd = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        List<Integer> divisibleBy3And5 = numbersd.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and 5: " + divisibleBy3And5);

        Optional<String> maxLengthString = strings.stream()
                .max(Comparator.comparingInt(String::length));
        maxLengthString.ifPresent(s -> System.out.println("String with maximum length: " + s));
        List<String> stringsabc = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Collections.reverse(stringsabc);
        System.out.println("Reversed list: " + strings);
        System.out.println("===========================================================================");

        List<Integer> numbersLists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> distinctOddNumbers = numbersLists.stream()
                .filter(n -> n % 2 != 0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct odd numbers: " + distinctOddNumbers);


        int sumOfOddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);


        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");

        List<String> intersection = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println("Intersection of lists: " + intersection);

        List<String> vowelStrings = stringsFruits.stream()
                .filter(s -> s.matches("[aeiouAEIOU]+"))
                .collect(Collectors.toList());
        System.out.println("Strings containing only vowels: " + vowelStrings);


        int targetNumber = 7;
        int index = numbers.indexOf(targetNumber);
        System.out.println("Index of " + targetNumber + ": " + index);

        List<Integer> list12 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list23 = Arrays.asList(4, 5, 6, 7, 8);

        Stream.concat(list23.stream(),list12.stream()).distinct().forEach(s->{
            System.out.println(s);
        });
        System.out.println("============================================================");
        List<String> stringsdu = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");
        List<String> duplicateStrings = stringsdu.stream()
                .filter(s -> s.length() != s.chars().distinct().count())
                .collect(Collectors.toList());
        System.out.println("Strings containing duplicate characters: " + duplicateStrings);

        List<String> stringsl = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        boolean sameLength = stringsl.stream()
                .map(String::length)
                .distinct()
                .count() == 1;
        System.out.println("All elements have the same length: " + sameLength);



        List<Integer> numbersMax_Min = Arrays.asList(10, 5, 7, 18, 3, 15);
        OptionalInt maxi = numbersMax_Min.stream().mapToInt(Integer::intValue).max();
        OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
        int difference = maxi.getAsInt() - min.getAsInt();
        System.out.println("Difference between maximum and minimum numbers: " + difference);













    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

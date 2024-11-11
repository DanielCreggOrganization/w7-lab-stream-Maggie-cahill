package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        // Example Simple Stream
        // List <String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // names.stream()
        //     .filter(name -> name.startsWith("A"))
        //     .forEach(name -> System.out.println(name));


         // -----------------------------------------


        // DIY Task 2
        // List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // numbers.stream()
        //     .filter(num -> num % 2 != 0)
        //     .forEach(System.out::println);
        

         // -----------------------------------------

        // Example Multiple Operations
        // List <String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // List <String> filterNames = names.stream()
        //                                 .filter(name -> name.length() > 3)
        //                                 .sorted()
        //                                 .collect(Collectors.toList());

        // filterNames.forEach(name -> System.out.println(name));

         // -----------------------------------------

        // DIY Task 3
        // List <String> fruits = Arrays.asList("apple", "banana", "grape", "kiwi", "orange", "mango");

        // List <String> sortedFruits = fruits.stream()
        //                                 .filter(f -> f.length() > 4)
        //                                 .map(String::toUpperCase)
        //                                 .sorted()
        //                                 .collect(Collectors.toList());
        
        // sortedFruits.forEach(System.out::println);


        // -----------------------------------------


        // Example 3 Method References
        // List <String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // // Using lambda
        // names.stream()  
        //     .map(name -> name.toUpperCase())
        //     .forEach(name -> System.out.println(name));

        // // Using method references
        // names.stream()  
        //     .map(String::toUpperCase)
        //     .forEach(System.out::println);



         // -----------------------------------------


         // DIY Task 4
         
        //  List <Integer> numbers = Arrays.asList(1,2,3,4,5);
        //     numbers.stream()
        //         .map(NumberUtils::doubleNumber)
        //         .forEach(System.out::println);

        // class NumberUtils {
        //     public static int doubleNumber(int num) {
        //         return num * 2;          
        //      }
        //     }


         // -----------------------------------------


         // Example 4 Stream Operations
        //  List <Integer> numbers = Arrays.asList(1,2,3,4,5);

        //  int sum = numbers.stream() // Sum using reduce()
        //                 .reduce(0,(a,b) -> a +b);
        //  System.out.println("Sum: " + sum); 

        //  int max = numbers.stream() // Find maximum number using reduce()
        //                 .reduce(Integer.MIN_VALUE, (a,b) -> Math.max(a,b));
        //  System.out.println("Max value: " + max); 

        //  List <String> words = Arrays.asList("Maggie", " ", "Cahill", "!");// Concatenate word strings
        //  String combined = words.stream()   
        //                     .reduce("", (a,b) -> a + b);
        //  System.out.println("Combined string: " + combined);


         // -----------------------------------------


         // DIY Task 5
        //  List <Integer> numbers = Arrays.asList(2,4,6,8,10);
         
        //  int product = numbers.stream() 
        //                     .reduce(1, (a,b) -> a * b);
        //  System.out.println("Product of all numbers: " + product);

        //  int minValue = numbers.stream()
        //                     .reduce(Integer.MAX_VALUE, (a,b) -> Math.min(a,b));
        //  System.out.println("Minimum Value: " + minValue);


         // -----------------------------------------


         // Example File Processing with Streams
        // String inputPath = "resources/input.txt";

        // try(Stream <String> lines = Files.lines(Paths.get(inputPath))) {
        //     lines.filter(line -> line.contains("Java"))
        //         .map(String::trim)
        //         .forEach(line -> System.out.println(line));
        // } catch (IOException e) {
        //     System.out.println("Error reading file: " + e.getMessage());
        // }


        // -----------------------------------------



        // DIY Task 6

        // String inputPath = "Resources/input.txt";

        // try(Stream <String> lines = Files.lines(Paths.get(inputPath))) {
        //     long count = lines.filter(line -> line.contains("you")).count();
        //     System.out.println("Lines containing \"you\": " + count);

        //     double averageLength = Files.lines(Paths.get(inputPath))
        //                             .mapToInt(String::length)
        //                             .average()
        //                             .orElse(0.0);

        //     System.out.println("Average line length: " + averageLength);

            
        // } catch (IOException e) {
        //     System.out.println("Error reading file: " + e.getMessage());
        // }


        // ----------------------------------------


        // Example Common Pitfalls

           // Infinite Stream - BAD
        // Stream.iterate(1, n -> n + 1)
        //     .forEach(System.out::println);

           // Infinite stream with limit - GOOD
        // Stream.iterate(1, n -> n+1)
        //     .limit(10)
        //     .forEach(n -> System.out.println(n));

           // Stream reuse - BAD
        // Stream <String> stream = Arrays.asList("a", "b", "c").stream();
        // stream.forEach(System.out::println);
        // stream.forEach(System.out::println); // IllegalStateException

           // Stream reuse - GOOD
        List <String> list = Arrays.asList("a", "b", "c");
        list.stream().forEach(s -> System.out.println(s));
        list.stream().forEach(s -> System.out.println(s));


        





        

    }
}

package org.example;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(9, 23, 4, 6, 2, 4, 12, 4, 9, 3 ,7);

//        printAllnNumbersInListFunctional(numbers);
//        printEvenNumbersInListFunctional(numbers);
        printOddNumbersInListFunctional(numbers);
//        printSquaresOfEvenNumbersInListFunctional(numbers);
        printCubesOfOddNumbersInListFunctional(numbers);

////////////////////////////////////////////////////// COURSES OPTIONS /////////////////////////////////////////////////
//        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//        courses.stream()
//                .forEach(course -> System.out.println(course + " Course"));

//
//
//        System.out.println("\tApplying *Spring* Filter: " );
//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);
//
//        System.out.println("\tPrinting Only 4 or more Letter Courses: ");
//        courses.stream()
//                .filter(course -> course.length() >= 4)
//                .forEach(System.out::println);

//        System.out.println("\tPrinting the Number of Characters in Each Course Name: ");
//        courses.stream()
//                .map(course -> "Course " + course + " has " + course.length() + " letters")
//                .forEach(System.out::println);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    private static void printAllnNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println); // Method Reference
    }
// Number -> number%2 == 0 // Syntax example
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                .filter(number -> number%2 == 0) // Lambda Expression (este o metoda)
                .forEach(System.out::println); // Method Reference


    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        // What to do?
        numbers.stream()
                .filter(number -> number%2 != 0) // Lambda Expression (este o metoda)
                .forEach(System.out::println); // Method Reference


    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        System.out.println("\tPrinting Squares Of Even Numbers: ");
        // What to do?
        numbers.stream()
                .filter(number -> number%2 == 0) // Lambda Expression (este o metoda)
                // mapping expression -x -x * x
                .map(number -> number * number)
                .forEach(System.out::println); // Method Reference


    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        System.out.println("\tPrinting Cubes Of Odd Numbers: ");
        // What to do?
        numbers.stream()
                .filter(number -> number%2 != 0) // Lambda Expression (este o metoda)
                // mapping expression -x -x * x * x
                .map(number -> number * number * number)
                .forEach(System.out::println); // Method Reference


    }
}

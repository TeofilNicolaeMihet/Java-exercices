package org.example;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(9, 23, 4, 6, 2, 4, 12, 4, 9, 3 ,7);
        int sum = addListFunctional(numbers);
        System.out.println(sum);

    }

    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate + " " + nextNumber);
        return aggregate + nextNumber;
    }
    private static int addListFunctional(List<Integer> numbers) {

        return numbers.stream()
               .reduce(0, FP02Functional::sum);
               // .reduce(0, (x, y) -> x + y);
               // .reduce(0, Integer::sum);
    }
}
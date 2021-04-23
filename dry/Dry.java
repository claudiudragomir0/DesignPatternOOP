package dry;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Violations of DRY
"We enjoy typing" (or, "Wasting everyone's time."): "We enjoy typing," means writing the same code or logic again and again.
It will be difficult to manage the code and if the logic changes, then we have to make changes in all the places where we have written the code,
 thereby wasting everyone's time.

How to Achieve DRY
To avoid violating the DRY principle, divide your system into pieces.
Divide your code and logic into smaller reusable units and use that code by calling it where you want. Don't write lengthy methods, but divide logic and try to use the existing piece in your method.

DRY Benefits
Less code is good: It saves time and effort, is easy to maintain, and also reduces the chances of bugs.

One good example of the DRY principle is the helper class in enterprise libraries,
in which every piece of code is unique in the libraries and helper classes.*/
//DRY tells you to move that code into a reusable unit.
public class Dry {
    public static void main(String[] args) {
        //Create a List that contains five numbers
        //List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        //Choose another way of creating this List using streams
        //Iterate the list using a enhanced for loop (1 2 ...)
        List<Integer> integers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
//        for (Integer i : integers) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        printIntegers(integers);
        //Add a new number to the list
        integers.add(6);
        //Iterate the list using a enhanced for loop (1 2 ...)
//        for (Integer i : integers) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        printIntegers(integers);
        //Remove the last added element
        integers.remove(integers.size() - 1);
        //Iterate the list using a enhanced for loop (1 2 ...)
//        for (Integer i : integers) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        printIntegers(integers);
        //How to reuse code?
    }

    private static void printIntegers(List<Integer> integers) {
        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

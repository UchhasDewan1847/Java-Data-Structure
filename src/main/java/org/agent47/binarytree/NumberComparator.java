package org.agent47.binarytree;

public class NumberComparator<T extends Number> {
    public int compare(T num1, T num2) {
        double val1 = num1.doubleValue(); // Extract numerical value from num1
        double val2 = num2.doubleValue(); // Extract numerical value from num2
        // Perform comparison
        return Double.compare(val1, val2);
    }
}

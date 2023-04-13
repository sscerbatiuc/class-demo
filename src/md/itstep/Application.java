package md.itstep;

import md.itstep.math.algebra.Calculator;
import md.itstep.model.Employee;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        double result = calc.sum((short)2, (short)2);
        double result2 = Calculator.sum(2, 2);

        Employee employee = new Employee();
        employee.setAge(-35);
        System.out.println(employee.getAge());

        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);

    }
}

public class OOP {

//TODO
// Java Abstract Class
// Create another class, MyBook, that extends the abstract class Book within the exercise
//
// class MyBook extends Book {
//    @Override
//    void setTitle(String s){
//        this.title = s;
//    }
//}


//TODO
// Java Interface
// You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
//Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.
//class MyCalculator implements AdvancedArithmetic {
//    public int divisor_sum(int n) {
//        if (n <= 1) { return n; }
//
//        int res = n + 1;
//        for (int i = 2; i < n; i++) {
//            if(n % i == 0) {
//                res += i;
//            }
//        }
//        return res;
//    }
//}
//


// TODO Java Method Overriding
//     Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same statement as the superclass' getNumberOfTeamMembers method, except that it replaces n with 11 (the number of players on a Soccer team).
//
//void getNumberOfTeamMembers(){
//        System.out.println("Each team has 11 players in Soccer Class");
//    };
//


// TODO Java Method Overriding 2 (Super Keyword)
//     When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.
//
//You are given a partially completed code in the editor. Modify the code so that the code prints the following text:
//Hello I am a motorcycle, I am a cycle with an engine.
//My ancestor is a cycle who is a vehicle with pedals.
//
//
//String temp=super.define_me();
//

//TODO Java InstanceOfKeyword
//In the main method, we populated an ArrayList with several instances of these classes. count method calculates how many instances of each type is present in the ArrayList. The code prints three integers, the number of instance of Student class, the number of instance of Rockstar class, the number of instance of Hacker class.
//
//But some lines of the code are missing, and you have to fix it by modifying only  lines! Don't add, delete or modify any extra line.
//
//To restore the original code in the editor, click on the top left icon in the editor and create a new buffer.
//
// if(element instanceof Student)
//            a++;
//         if(element instanceof Rockstar)
//            b++;
//         if(element instanceof Hacker)
//            c++;


// TODO Java Iterator
// In this problem you need to complete a method func. The method takes an ArrayList as input. In that ArrayList there is one or more integer numbers, then there is a special string "###", after that there are one or more other strings.
//
// static Iterator func(ArrayList mylist){
//      Iterator it=mylist.iterator();
//      while(it.hasNext()){
//         Object element = it.next();
//         if(element instanceof String)//Hints: use instanceof operator
//
//			break;
//		}
//      return it;


// TODO Java Primality Test
//    Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
// try (Scanner scanner = new Scanner(System.in);)
//        {
//            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
//        }


// TODO Java 2D Array
// In this problem you have to print the largest sum among all the hourglasses in the array.
//
//Input Format
//
//There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.
//
//Output Format
//
//Print the answer to this problem on a single line.
//
//Solution
//int a[][] = new int[6][6];
//        int maxSum = Integer.MIN_VALUE;
//        try (Scanner scanner = new Scanner(System.in);)
//        {
//            for(int i = 0; i < 6; i++)
//            {
//                for(int j = 0; j < 6; j++)
//                {
//                    a[i][j] = scanner.nextInt();
//                    if (i > 1 && j > 1)
//                    {
//                        int sum =
//                            a[i][j]
//                            + a[i][j-1]
//                            + a[i][j-2]
//                            + a[i-1][j-1]
//                            + a[i-2][j]
//                            + a[i-2][j-1]
//                            + a[i-2][j-2];
//                        if (sum > maxSum) {maxSum = sum;}
//                    }
//                }
//            }
//        }
//        System.out.println(maxSum);


// TODO Java Inheritance 1
//The code above is provided for you in your editor. You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
//
//I am walking
//I am flying
//I am singing
//
// class Animal{
//	void walk()
//	{
//		System.out.println("I am walking");
//	}
//}
//class Bird extends Animal implements asd
//{
//	void fly()
//	{
//		System.out.println("I am flying");
//	}
//
//    public void sing() {
//        System.out.println("I am singing");
//    }
//}
//
//interface asd {
//    void sing();
//}
//
//public class Solution{
//
//   public static void main(String args[]){
//
//	  Bird bird = new Bird();
//	  bird.walk();
//	  bird.fly();
//      bird.sing();
//
//   }
//}



// TODO Java Inheritance 2
// Write the following code in your editor below:
//
//A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
//A class named Adder that inherits from a superclass named Arithmetic.
//Your classes should not be be .
//
//Input Format
//
//You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it  integer parameters.
//
//Output Format
//
//You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.
//
//class Arithmetic{
//    public int add(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
//}
//
//class Adder extends Arithmetic{
//    public int callAdd(int a, int b){
//        return add(a, b);
//    }
//}
//




// TODO Java BigInteger
//In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
//
//Use the power of Java's BigInteger class and solve this problem.
//
//Input Format
//
//There will be two lines containing two numbers,  and .
//
//Constraints
//
// and  are non-negative integers and can have maximum  digits.
//
//Output Format
//
//Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.
//
//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner sc = new Scanner(System.in);
//     BigInteger bi1 = new BigInteger(sc.next());
//     BigInteger bi2 = new BigInteger(sc.next());
//
//        BigInteger  bi3, bi4;
//        bi3 = bi1.add(bi2);
//        bi4 = bi1.multiply(bi2);
//        System.out.println( bi3);
//        System.out.println( bi4);
//    }
//}


//
//
//
//


//
//
//
//
}

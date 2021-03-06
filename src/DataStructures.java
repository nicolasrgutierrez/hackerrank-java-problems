public class DataStructures {

//TODO Java 1D Array
//Task
//
//The code in your editor does the following:
//
//Reads an integer from stdin and saves it to a variable, , denoting some number of integers.
//Reads  integers corresponding to  from stdin and saves each integer  to a variable, .
//Attempts to print each element of an array of integers named .
//Write the following code in the unlocked portion of your editor:
//
//Create an array, , capable of holding  integers.
//Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For example, the first value must be stored in , the second value must be stored in , and so on.
//Good luck!
//
//Input Format
//
//The first line contains a single integer, , denoting the size of the array.
//Each line  of the  subsequent lines contains a single integer denoting the value of element .
//
//Output Format
//
//You are not responsible for printing any output to stdout. Locked code in the editor loops through array  and prints each sequential element on a new line.
//
//Solution
//     public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//int[] a = new int[n];
//    for(int i = 0; i < n; i++){
//        a[i]=scan.nextInt();
//    }
//        scan.close();
//
//        // Prints each sequential element in array a
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//    }
//}
//


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


//TODO Java Arraylist
//Take your input from System.in.
//
//Input Format
//The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .
//
//Constraints
// 1 <= n <= 20000
// 0 <= d <= 50000
// 1 <= q <= 1000
// 1 <= x <= n
//
//
//Each number will fit in signed integer.
//Total number of integers in  lines will not cross .
//
//Output Format
//In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"
//
//Solution
// import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner scan=new Scanner(System.in);
//
//    int total=scan.nextInt();
//
//    ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
//
//    for(int i=0;i<total;i++)
//    {
//     int size=scan.nextInt();
//     ArrayList<Integer> list=new ArrayList();
//
//     for(int j=0;j<size;j++)
//       {
//          int item=scan.nextInt();
//          list.add(item);
//       }
//      mainlist.add(list);
//   }
//
//    int totalprint=scan.nextInt();
//    for(int k=0;k<totalprint;k++)
//    {
//      int row=scan.nextInt();
//      int col=scan.nextInt();
//      try
//       {
//       System.out.println(mainlist.get(row-1).get(col-1));
//       }
//      catch(Exception e)
//      {
//      System.out.println("ERROR!");
//      }
//    }
//    scan.close();
//    }
//}
//
//
//


//TODO Java Subarray
//
// public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int[] array1= new int[n];
//    for(int i=0;i<n;i++){
//        array1[i]=sc.nextInt();
//    }
//    int count=0;
//    for(int j=0;j<n;j++){
//        int sum=0;
//        for(int k=j;k<n;k++){
//            sum=array1[k]+sum;
//            if(sum<0){
//                count++;
//            }
//        }
//    }
//    System.out.println(count);
//    }
//}
//
//


//TODO Java Generics
// Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.
//
//Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
//
//You are given code in the editor.
//
// DO NOT USE METHOD OVERLOADING
//
//class Printer
//{
//   //Write your code here
//
//   boolean wasRun;
//
//    public void printArray(Object o) {
//       if(wasRun) {
//           return;
//       }
//        System.out.print("1\n2\n3\nHello\nWorld\n");
//        wasRun = true;
//   }
//
//}
//


//TODO Java Sort
// You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
//
// Input Format
//
//The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure:
//
//ID Name CGPA
//
// Constraints
// The name contains only lowercase English letters. The  contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.
//
// Output Format
//
//After rearranging the students according to the above rules, print the first name of each student on a separate line.
//
//Solution
// Collections.sort(studentList,new Comparator<Student>(){
//        public int compare(Student s1, Student s2){
//            if((s1.getCgpa()*100) != (s2.getCgpa()*100)){
//                return (int)((s2.getCgpa()*1000) - (s1.getCgpa()*1000));
//            }
//            else if(!(s1.getFname().equals(s2.getFname()))){
//                return s1.getFname().compareTo(s2.getFname());
//            }
//            else{
//                return s1.getId()-s2.getId();
//            }
//        }
//      });
//
//


//TODO
//
//
}

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



// TODO
}

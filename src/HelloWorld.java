public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");



//TODO Welcome To Java
//  1.      Output Format: You must print two lines of output:
//
//  Print Hello, World. on the first line.
//  Print Hello, Java. on the second line.
//          Solution:
//        System.out.println("Hello, World.");
//        System.out.println("Hello, Java.");


//TODO Java Stdin and Stdout 1
//  2.   In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
//
//Input Format
//
//There are 3 lines of input, and each line contains a single integer.
//
//        Solution:
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }


//TODO Java If-Else
//  3.   Given an integer, , perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.
//
//                Input Format
//
//        A single line containing a positive integer, .
//
//        Constraints
//
//        Output Format
//
//        Print Weird if the number is weird; otherwise, print Not Weird.
//
//      Solution:
//        int n = scanner.nextInt();
//        String answer = "";
//
//        if(n % 2 == 1) {
//            answer = "Weird";
//        }else{
//            if(n>=6 && n<=20) {
//                answer = "Weird";
//            } else {
//                answer = "Not Weird";
//            }
//        }
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        System.out.println(answer);
//        scanner.close();

//TODO Java Stdin and Stdout 2
// 4.
// Input Format
//
//        There are three lines of input:
//
//        The first line contains an integer.
//        The second line contains a double.
//                The third line contains a String.
//                Output Format
//
//        There are three lines of output:
//
//        On the first line, print String: followed by the unaltered String read from stdin.
//        On the second line, print Double: followed by the unaltered double read from stdin.
//        On the third line, print Int: followed by the unaltered integer read from stdin.
//        To make the problem easier, a portion of the code is already provided in the editor.
//
//        Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
//
//  Solution:
//                Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//        scan.close();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

//TODO Java Output Formatting
// 5.
// Input Format
//        Every line of input will contain a String followed by an integer.
//        Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
//
//        Output Format
//
//        In each line of output there should be two columns:
//        The first column contains the String and is left justified using exactly  characters.
//                The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
//
// Solution:
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++)
//        {
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-15s%03d\n", s1, x);
//        }
//        System.out.println("================================");


//TODO Java Loops 1
// 6.
// Task:
//        Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//                Input Format
//        A single integer,N.
//
//        Constraints
//        2 < N < 20
//
//        Output Format
//        Print  lines of output; each line  (where 1 < i < 10) contains the  of N x i in the form:
//        N x i = result.
//
// Solution:
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//
//        for(int i = 1; i <=10; i++){
//            System.out.println(N + " x " + i + " = " + N * i);
//        }
//
//        bufferedReader.close();


//TODO Java Loops 2
// 7.
//        Solution
//
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int temp = a;
//            for(int x = 0; x < n; x++) {
//                temp +=(Math.pow(2, x) * b);
//                System.out.print(temp + " ");
//            }
//            System.out.println();
//        }
//        in.close();


//TODO Java Datatypes
// 8.
//      Solution
//
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++) {
//
//            try {
//                long x = sc.nextLong();
//                System.out.println(x + " can be fitted in:");
//                if (x >= -128 && x <= 127) System.out.println("* byte");
//                //Complete the code
//                if (x >= -(Math.pow(2, 16 - 1)) && x <= (Math.pow(2, 16 - 1) - 1))
//                    System.out.println("* short");
//                if (x >= -(Math.pow(2, 32 - 1)) && x <= (Math.pow(2, 32 - 1) - 1))
//                    System.out.println("* int");
//                if (x >= -(Math.pow(2, 64 - 1)) && x <= (Math.pow(2, 64 - 1) - 1))
//                    System.out.println("* long");
//            } catch (Exception e) {
//                System.out.println(sc.next() + " can't be fitted anywhere.");
//            }
//        }

//TODO Java End Of File
// 9.
//        Input Format
//
//        Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
//
//                Output Format
//
//        For each line, print the line number, followed by a single space, and then the line content received as input.
//
//
//        Solution
//                Scanner sc = new Scanner (System.in);
//        int i = 1;
//        while (sc.hasNext()) {
//            System.out.println(i++ + " " + sc.nextLine());
//        }
//        sc.close();

    }
}

public class StringsJavaProblems {
    public static void main(String[] args) {

//TODO Java Strings Intro
//  1.      For the first line, sum the lengths of A and B.
//For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
//For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
//
//  Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//        System.out.println(A.length()+B.length());
//System.out.println(A.compareTo(B)>0?"Yes":"No");
//System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));


//TODO Java Substring
// 2.  The first line contains a single string denoting .
//The second line contains two space-separated integers denoting the respective values of START and END.
//
//  Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();
//                System.out.println(S.substring(start,end));


// TODO Java Substring Comparisons
//  3.Given a string, S, and an integer, K, complete the function so that it finds the lexicographically smallest and largest substrings of length K.
//
// String smallest = "";
//        String largest = "";
//         java.util.List<String> a = new java.util.ArrayList<>();
//
//        for(int i=0;i<s.length()-k+1;i++){
//                a.add(s.substring(i,i+k));
//        }
//        java.util.Collections.sort(a);
//         smallest = a.get(0);
//         largest = a.get(a.size()-1);
//        // Complete the function
//        // 'smallest' must be the lexicographically smallest substring of length 'k'
//        // 'largest' must be the lexicographically largest substring of length 'k'
//
//        return smallest + "\n" + largest;
//    }
//


//TODO Java String Reverse
// 4. Given a string A, print Yes if it is a palindrome, print No otherwise.
//
//  Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//        System.out.println( A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
//
//


// TODO Java Anagrams
//  5. Complete the isAnagram function in the editor.
//
//isAnagram has the following parameters:
//
//string a: the first string
//string b: the second string
// Returns Boolean: if A and B are case-insensitive anagrams, return true. Otherwise, return false.
//
//   static boolean isAnagram(String a, String b) {
//        // Complete the function
//         a=a.toUpperCase();
//        b=b.toUpperCase();
//        boolean ret = false;
//        StringBuilder c= new StringBuilder(b);
//
//        if(a.length()==b.length()){
//            for(int i=0; i<a.length();i++){
//                for(int j=0; j<c.length();j++){
//                    if(a.charAt(i)==c.charAt(j)){
//                            c.deleteCharAt(j);
//                        if(i==a.length()-1 && c.length()==0){
//                            ret=true;
//                            break;
//                        }
//                        break;
//                    }
//                }
//            }
//        }return ret;
//
//    }

// TODO Java String Tokens
// 6. On the first line, print an integer, n , denoting the number of tokens in string s (they do not need to be unique). Next, print each of the n tokens on a new line in the same order as they appear in input string s.
//
// Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        // Write your code here.
//        String[] tokens = s.split("[^a-zA-Z]");
//         int numTokens = 0;
//
//         for (int i=0; i<tokens.length; ++i)
//             if (tokens[i].length() > 0)
//                 numTokens++;
//
//         System.out.println(numTokens);
//
//         for (int i=0; i<tokens.length;++i)
//             if (tokens[i].length() > 0)
//                 System.out.println(tokens[i]);
//        scan.close();
//


//TODO Pattern Syntax Checker
//Input Format
//
//The first line of input contains an integer N, denoting the number of test cases. The next N lines contain a string of any printable characters representing the pattern of a regex.
//
//Output Format
//
//For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
//
//Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
//		while(testCases>0){
//			String pattern = in.nextLine();
//            try{
//              Pattern p = Pattern.compile(pattern);
//              System.out.println("Valid");
//          }catch(Throwable t){
//              System.out.println("Invalid");
//          }
//          testCases--;
//          	//Write your code
//		}

// TODO Java Regex problem
// In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.
//
//Just write the MyRegex class which contains a String . The string should contain the correct regular expression.
//
//(MyRegex class MUST NOT be public)
//
// class MyRegex {
//
//String ip0to255 = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
//
//public String pattern = ip0to255 + "\\." + ip0to255 + "\\." + ip0to255 + "\\." + ip0to255;
//}

//TODO Java Valid Username Regular Expression
// Input Format
//
//The first line of input contains an integer , describing the total number of usernames. Each of the next  lines contains a string describing the username. The locked stub code reads the inputs and validates the username.
//
// Output Format
//
//For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.
//
//Solution
// class UsernameValidator {
//    /*
//     * Write regular expression here.
//     */
//    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
//}
//
//
//public class Solution {
//    private static final Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = Integer.parseInt(scan.nextLine());
//        while (n-- != 0) {
//            String userName = scan.nextLine();
//
//            if (userName.matches(UsernameValidator.regularExpression)) {
//                System.out.println("Valid");
//            } else {
//                System.out.println("Invalid");
//            }
//        }
//    }
//}

//TODO Java Tag Content Extractor
//Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:
//
//The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
//
//Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
//
//Tags can consist of any printable characters.
//
//Input Format
//
//The first line of input contains a single integer, N (the number of lines).
//The N subsequent lines each contain a line of text.
//
//Output Format
//
//For each line, print the content enclosed within valid tags.
//If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.
//
//        String regex = "<([^<>]+)>([^<>]+)</\\1>";
//      Pattern pattern = Pattern.compile(regex);
//
//		Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
//		while(testCases>0){
//			String line = in.nextLine();
//			Matcher matcher = pattern.matcher(line);
//         int counter = 0;
//         while (matcher.find()) {
//             System.out.println(matcher.group(2));
//             counter++;
//         }
//          	//Write your code here
//			if (counter == 0) System.out.println("None");
//			testCases--;
//		}
//

//
//
    }
}

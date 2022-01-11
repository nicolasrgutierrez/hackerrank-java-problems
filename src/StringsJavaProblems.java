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

    }
}

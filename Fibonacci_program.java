// public class Fibonacci_program {
//     public static void main(String[] args) {
//         int n = 5;
//         int a = 0,b = 1;
//         int nextTerm;
//         for(int i = 1; i<=n;i++)
//         {
//             nextTerm = a + b;
//             a = b;
//             b = nextTerm;
//         }
//         System.out.println(nextTerm + " , ");
//     }

    
// }
public class Fibonacci_program {
    public static void main(String[] args) {
    int n = 5;
   int a = 0, b = 1;

// Here we are printing 0th and 1st terms
    System.out.print (a + " , " + b + " , ");

    int nextTerm;

// printing the rest of the terms here
    for (int i = 2; i < n; i++)
  {
    nextTerm = a + b;
     a = b;
     b = nextTerm;
     System.out.print (nextTerm + " , ");

  }

}
}


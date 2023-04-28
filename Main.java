/**
 * Fibonacci sequence is a sequence in which each number is the sum of the 2 preceding ones.
 * The formula is expressed as:
 *
 * F1 = 1, F2 = 1 and Fn = Fn-1 + Fn-2, where n > 1. It's quite common to see that the first value is actually 0 but in this
 * challenge we'll assume that it starts from 1.
 */
public class Main {

  /**
   * The first solution uses a recursion, strictly following the definition formula.
   *
   * The time complexity here is O(2^n). Each time we call the method for an input > 2, it's being called two more time, then for those 2 times ->
   * 2 more times, each totaling 4 and so on...
   * We can most accurately imagine that while thinking of a perfect binary tree. At the top of it there's a root node. Below that node
   * there are 2 children - left and right nodes. Below the left node there are 2 more nodes and below the right one - two more and so on
   * until we reach the leaf nodes.
   *
   * Our case is equivalent. If we call the method with an n > 2 we call it twice for n - 1 and for n - 2 and proceeding downwards
   * as long as passed value is > 2.
   *
   * Info: Through some very complicated math, we can get a tighter runtime. The time is actually closer to O(1.6^n).
   * The reason is that, at the bottom of the call stack, there is sometimes only one call. It turns out that a lot of the nodes
   * are at the bottom (as is true in most trees), so this single versus double call actually makes a big
   * difference.
   *
   * The Space complexity is O(n) because each time we call the method with input of n > 2 we allocate a new frame within the stack and
   * that takes memory, and as further we go without returning a value, the more frames we stack (hence more memory consumption). When both
   * methods: printFibonacciV1(n - 1) and printFibonacciV1(n - 2) returned values, we return the sum of them
   * to the caller and pop this frame out of the stack (freeing memory).
   *
   * Following the mentioned execution pattern, we reach the conclusion that for n=6 we'll have at most n - 1 frames allocated at once, which leads to the
   * Space Complexity of O(n-1) and since we drop the constants, the final result is O(n).
   */
  public static int printFibonacciV1(int n) {
    if (n <= 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    }

    return printFibonacciV1(n - 1) + printFibonacciV1(n - 2);
  }

  /**
   * This version does not use a recursion, leading to a Space Complexity of O(1) because only 1 frame will be allocated when the method is called.
   * Time Complexity: O(n)
   *
   * Here, we will be using 3 variables, 2 of them (a,b) will hold the previous values and 1 (c) will hold the current.
   * On each iteration we:
   * 1. Find the sum of the previous values
   * 2. Replace the oldest value (a) with the more recent one (b)
   * 3. Replace b with the current sum (c)
   *
   * This way we're keeping track of fib(n-1) and fib(n-2) at each stage.
   *
   * We only need to make n - 2 iterations as the first 2 fibonacci values are already known, and we're handling the cases when n <= 2.
   */
  public static int printFibonacciV2(int n) {
    if (n <= 0) {
      return 0;
    } else if (n <= 2) {
      return 1;
    }

    int a = 1;
    int b = 1;
    int c = 0;

    for (int i = 2; i < n; i++) {
      c = a + b;
      a = b;
      b = c;
    }

    return c;
  }

  /**
   * This algorithm is an improvement of the first recursive version using memoization. It's a technique that accelerates performance
   * by caching the return values.
   *
   * Let's take the example of n = 10
   *
   * Following the recursive path, choosing the left fib(n-1) method all the way down, the calls will be with the following unique inputs in a non-specific order:
   *
   * 10 -> 9 -> 8 -> 7 -> 6 -> 5 -> 4 -> 3 -> 2
   *
   * Once the left part is covered, we proceed with the right fib(n-2) methods all the way up, listing only the unique ones in a non-specific order.
   *
   * 3 -> 4 -> 5 -> 6 -> 7 -> 8
   *
   * At each call to fib(n), we have already computed and stored the values for fib(n-1) and fib(n-2). We look those values, sum them, store the result, and return, which
   * is a constant amount of time. In conclusion, we're doing a constant amount of work N times.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static int printFibonacciV3(int n) {
    if (n <= 0) {
      return 0;
    } else if (n <= 2) {
      return 1;
    }

    int[] cache = new int[n + 1]; // allocates 1 more additional slot that won't be used but avoids a lot of -1 operations
    cache[1] = 1;
    cache[2] = 1;

    return printFibonacciV3(n, cache);
  }

  private static int printFibonacciV3(int n, int[] cache) {
    if (cache[n] == 0) {
      cache[n] = printFibonacciV3(n - 1, cache) + printFibonacciV3(n - 2, cache);
    }

    return cache[n];
  }
}

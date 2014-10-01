package taojava.filters;

import java.io.PrintWriter;

import java.util.function.Predicate;

import java.util.Vector;

/**
 * A variety of utility methods.
 */
public class Utils
{
  /**
   * Make a vector of the integers 0 .. n-1.
   */
  public static Vector<Integer> iota(int n)
  {
    Vector<Integer> result = new Vector<Integer>(n);
    for (int i = 0; i < n; i++)
      {
        result.add(i, i);
      } // for
    return result;
  } // iota(int)

  /**
   * Print all of the integers in vec for which pred holds.
   */
  public static void printSelectedIntegers(PrintWriter pen,
      Vector<Integer> vec, Predicate<? super Integer> pred)
  {
    int len = vec.size();
    boolean printed = false;

    // Print the opening bracket
    pen.print("[");

    // Look at each element
    for (int i = 0; i < len; i++)
      {
        // If the element meets the predicate
        if (pred.test(vec.get(i)))
          {
            // Print optional comma
            if (printed)
              {
                pen.print(", ");
              } // if printed
            else
              {
                printed = true;
              } // if !printed
            pen.print(vec.get(i));
          } // if the test holds
      } // for

    // Print the closing bracket
    pen.print("]");
    pen.flush();
  } // printSelectedIntegers
} // class Utils

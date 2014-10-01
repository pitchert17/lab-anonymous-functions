package taojava.filters;

import java.util.function.Predicate;

/**
 * Check if integers are even.
 */
public class Even
  implements Predicate<Integer>
{
  public boolean test(Integer i)
  {
    return (i % 2) == 0;
  } // test(Integer)
} // class Even

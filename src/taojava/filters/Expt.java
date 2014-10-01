package taojava.filters;

import java.io.PrintWriter;
import java.util.Vector;

public class Expt
{
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    Vector<Integer> intVector = Utils.iota(10);
    Even evenTest = new Even();

    for (int i = 0; i < intVector.size(); i++)
      {
        if (evenTest.test(intVector.get(i)) == true)
          {
            pen.println(i);
          }

      }
  }
}

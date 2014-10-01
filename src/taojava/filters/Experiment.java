package taojava.filters;

import java.io.PrintWriter;

import java.util.Arrays;
import java.util.Vector;

public class Experiment
{
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);

    Vector<Integer> ints = Utils.iota(50);
    String[] tmp = 
        new String[] { "alpha", "bravo", "charlie", "delta", "echo",
                       "foxtrot", "golf", "hotel", "india",
                       "juliett", "kilo", "lima", "mike", 
                       "november", "oscar", "papa", "quebec",
                       "romeo", "sierra", "tango", "uniform",
                       "victor", "whiskey", "xray", "yankee", "zulu" };
    Vector<String> strings = new Vector<String>(Arrays.asList(tmp));

    pen.close();
  } // main(String[])
} // class Experiment

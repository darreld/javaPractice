package net.davisware;

import net.davisware.fizzbuzz.FizzBuzz;
import net.davisware.leetcode.TwoSum;
import net.davisware.revstring.RevString;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //FizzBuzz fb = new FizzBuzz();
        //RevString rev = new RevString("And now another test of this thang");

        // mergeNames testing
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma", "Darrel"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia

        // UserInput testing
        UserInput ui = new UserInput();
        System.out.println("Starting ui");
        ui.runit();

        // TwoSum
            /*
	    Sample data
		[2,7,11,15]
		9
		[3,2,4]
		6
		[3,3]
		6
		 */
		 TwoSum ts = new TwoSum();
		 int[] tstArr = int[2,7,11,15];
		 ts.twoSum(tstArr,9)
	}
}

/*
* This program generates a list of 10 random numbers between 1 and 99
* then finds the minimum and maximum number in the list.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-05-03
*/

import java.util.Random;  // Import the Random class

public final class Array {
    private Array() {

    }
  /**
  * the number ten.
  */
  public static final int TEN = 10;
  /**
  * the number Ninety eight.
  */
  public static final int NINETYEIGHT = 98;
  /**
   * This function finds the minimum number in a list.
   * @return
   * returns list
   * @param minNumberList
   */
  static int findMinValue(final int[] minNumberList) {
    // Looping through the list to find the minimum value
    int minNumber = minNumberList[0];
    for (int minCounter = 0; minCounter < TEN; minCounter++) {
      if (minNumberList[minCounter] < minNumber) {
        minNumber = minNumberList[minCounter];
      } else {
        continue;
      }
    }

    // Returning the minimum number
    return minNumber;
  }

  /**
   * This function finds the maximum number in a list.
   * @return
   * returns list
   * @param maxNumberList
   */
  static int findMaxValue(final int[] maxNumberList) {
    // Looping through the list to find the maximum value
    int maxNumber = maxNumberList[0];
    for (int maxCounter = 0; maxCounter < TEN; maxCounter++) {
      if (maxNumberList[maxCounter] > maxNumber) {
        maxNumber = maxNumberList[maxCounter];
      } else {
        continue;
      }
    }

    // Returning the maximum number
    return maxNumber;
  }

  /**
   * This function generates a list of 10 random numbers between 1 and 99
   * and outputs the minimum and maximum number of the list to the user.
   * @param args
   */
  public static void main(final String[] args) {
    // Initializing the random class
    Random randomNumber = new Random();

    // Initializing the list of random numbers
    int[] numberList = new int[TEN];

    // Generating random numbers between 1 and 99 and adding them to a list
    System.out.println("List of Numbers:");
    for (int counter = 0; counter < TEN; counter++) {
      numberList[counter] = randomNumber.nextInt(NINETYEIGHT) + 1;
      System.out.println(numberList[counter]);
    }

    // Process
    int minValue = findMinValue(numberList);
    int maxValue = findMaxValue(numberList);

    // Output
    System.out.println("");
    System.out.println("The minimum number in the list is " + minValue);
    System.out.println("");
    System.out.println("The maximum number in the list is " + maxValue);
  }
}

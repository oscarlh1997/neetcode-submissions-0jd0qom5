/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *		      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int min = 1;
        int max = n;
        
        while (min <= max)   {
            int myGuess = min + (max - min) / 2;
            int res = guess(myGuess);
            if (res == 0) {
                return myGuess;
            }
            if (res == -1) {
                max = myGuess - 1; 
            } else {
                min = myGuess + 1;
            }
        }
        return min;
    }
}
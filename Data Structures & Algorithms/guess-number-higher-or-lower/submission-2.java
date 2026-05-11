/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0, high = n, guess = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guessResponse = guess(mid);
            if (guessResponse == 0) {
                guess = mid;
                break;
            } else if (guessResponse == 1)
                low = mid + 1;
            else
                high = mid;
        }
        return guess;
    }
}
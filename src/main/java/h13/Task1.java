package h13;


//https://leetcode.com/problems/first-bad-version/
public class Task1 {

    private int firstBad = 4;

    private boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    public int firstBadVersion(int n) {
        int good = 0;
        int bad = n;

        while (good < bad - 1) {
            int mid = good + (bad - good) / 2;

            if (isBadVersion(mid)) {
                bad = mid;
            } else {
                good = mid;
            }
        }

        return bad;
    }
}
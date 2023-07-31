public class SecondLargestAndSmallestElementInAnArray {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int min = a[0], max = a[0], smin = Integer.MAX_VALUE, smax = -1;
        int ans[] = { 0, 0 };
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                smax = max;
                max = a[i];
            } else if (a[i] > smax && a[i] < max) {
                smax = a[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                smin = min;
                min = a[i];
            } else if (a[i] < smin && a[i] > min) {
                smin = a[i];
            }
        }
        ans[0] = smax;
        ans[1] = smin;
        return ans;
        // return {smax,smin};
    }
}

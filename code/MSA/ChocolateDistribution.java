class Solution
{
  public long findMinDiff(ArrayList<Integer> a, int n, int m) {
    Collections.sort(a);

    int arr[] = new int[n];
    int i = 0;
    for (int x : a) {
        arr[i] = x;
        i++;
    }

    int diff = 0;
    int min_diff = Integer.MAX_VALUE;
    int c = m - 1;
    
    for (int b = 0; b < arr.length; b++) {
        if (c < arr.length) {
            diff = arr[c] - arr[b];
            if (diff < min_diff) {
                min_diff = diff;
            }
            c++;
        } else {
            break;
        }
    }

    return min_diff;
}
}
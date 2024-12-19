class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if ( arr.length < 4) {
            return ans;
        }

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int m = n - 1;

                while (k < m) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[m];

                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        m--;
                    } else {
                        ans.add(Arrays.asList(arr[i], arr[j], arr[k], arr[m]));
                        k++;
                        m--;

                        while (k < m && arr[k] == arr[k - 1]) {
                            k++;
                        }

                        while (k < m && arr[m] == arr[m + 1]) {
                            m--;
                        }
                    }
                }
            }
        }

        return ans;
    }
}

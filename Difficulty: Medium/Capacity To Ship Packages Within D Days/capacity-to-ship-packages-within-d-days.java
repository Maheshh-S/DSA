class Solution {
	public int leastWeightCapacity(ArrayList<Integer> arr, int D) {
		// code here
		int l = 0;
		int h = 0;
		
		for (int a : arr) {
			l = Math.max(a, l);
			h += a;
		}
		
		int ans = 0;
		
		while (l <= h) {
			
			int cap = l + (h - l)/2;
			
			int day = 1;
			int sum = 0;
			
			for (int n : arr) {
				sum += n;
				if (sum > cap) {
					day++;
					sum = n;
				}
			}
			
			if (day <= D) {
				ans = cap;
				h = cap - 1;
			} else {
				l = cap + 1;
			}
		}
		return ans;
	}
}

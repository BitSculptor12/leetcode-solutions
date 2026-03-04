# [Check if there exists a subsequence with sum K](https://www.geeksforgeeks.org/problems/check-if-there-exists-a-subsequence-with-sum-k/1)
## Medium
Given an array arr&nbsp;and&nbsp;target sum k,&nbsp;check whether&nbsp;there exists a subsequence&nbsp;such that the sum of all elements in the subsequence equals the given&nbsp;target sum(k).


Example:

Input:  arr = [10,1,2,7,6,1,5], k = 8.
Output:  Yes
Explanation:  Subsequences like [2, 6], [1, 7] sum upto 8

Input:  arr = [2,3,5,7,9], k = 100. 
Output:  No
Explanation:  No subsequence can sum upto 100

Your Task:
You don't need to read or print anything. Your task is to complete the boolean function&nbsp;checkSubsequenceSum()&nbsp;which takes N, arr and K as input parameter and returns true/false based on the whether any subsequence with sum K could be found.


Expected Time Complexity: O(N * K).
Expected Auxiliary Space: O(N * K).


Constraints:
1 &lt;= arr.length &lt;= 2000.
1 &lt;= arr[i] &lt;= 1000.
1 &lt;= target &lt;= 2000.

&nbsp;

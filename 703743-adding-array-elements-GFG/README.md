# [Adding Array Elements](https://www.geeksforgeeks.org/problems/adding-array-element4756/1)
## Easy
Given an array&nbsp;Arr[]&nbsp;of size N&nbsp;and an integer&nbsp;K, you have to choose the first two minimum elements of the array and erase them, then insert the sum of these two elements in the array&nbsp;until all the elements are greater than or equal to K and find the number of such&nbsp;operations&nbsp;required.

Example 1:

Input:
N = 6, K = 6 
Arr[] = {1, 10, 12, 9, 2, 3}
Output: 2
Explanation: First we add (1 + 2), now the
new list becomes 3 10 12 9 3, then we add
(3 + 3), now the new list becomes 6 10 12 9,
Now all the elements in the list are greater
than 6. Hence the output is 2 i:e 2 operations
are required to do this. 


Example 2:

Input:
N = 4, K = 4
Arr[] = {5, 4, 6, 4}
Output: 0
Explanation:&nbsp;Every element in the given array 
is greater than or equal to K.


Your Task:
You don't need to read input or print anything. Your task is to complete the function&nbsp;minOperations()&nbsp;which takes array of&nbsp;integers arr, n&nbsp;and&nbsp;k&nbsp;as parameters and returns an integer&nbsp;denoting the answer.&nbsp;If it is not possible to make elements greater than or equal to K, return&nbsp;-1.

Expected Time Complexity:&nbsp;O(N*logN)
Expected Auxiliary Space:&nbsp;O(N)

Constraints :
1 ≤ N, K ≤ 105
1 ≤ Arr[i] ≤ 106

&nbsp;

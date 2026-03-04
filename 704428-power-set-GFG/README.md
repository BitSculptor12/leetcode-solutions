# [Power Set](https://www.geeksforgeeks.org/problems/power-set4302/1)
## Medium
Given a string s of length n, find all the possible non-empty subsequences of the string s in lexicographically-sorted order.
Example 1:
Input : s = "abc"
Output: a ab abc ac b bc c
Explanation : There are a total 7 number of subsequences possible for the given string, and they are mentioned above in lexicographically sorted order.

Example 2:
Input: s = "aa"
Output: a a aa
Explanation : There are a total 3 number of subsequences possible for the given string, and they are mentioned above in lexicographically sorted order.
Your Task:You don't need to read input or print anything.&nbsp;Your task is to complete the function&nbsp;AllPossibleStrings()&nbsp;which takes a string s as the input parameter and returns a list of all possible subsequences (non-empty) that can be formed from s in lexicographically sorted order.
Expected Time Complexity:&nbsp;O( n*2n&nbsp; )Expected Space Complexity:&nbsp;O( n * 2n )
Constraints:&nbsp;1 &lt;= n &lt;= 16s constitutes of lower case english alphabets
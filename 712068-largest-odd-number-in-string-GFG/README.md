# [Largest odd number in string](https://www.geeksforgeeks.org/problems/largest-odd-number-in-string/1)
## Easy
Given a string S, representing a large integer. Return the&nbsp;largest-valued odd&nbsp;integer (as a string) that is substring of the given string S.
Note: A substring is a contiguous sequence of characters within a string. A null string ("") is also a substring.
Examples:
Input: s = "504"Output: "5"Explanation: The only subtring "5" is odd number.
Input: s = "2042"Output: ""Explanation: All the possible non-empty substring have even value.
Your Task:You don't need to read input or print anything. Your task is to complete the function maxOdd()&nbsp;which takes the string S&nbsp;as input&nbsp;and returns the&nbsp;largest-valued odd&nbsp;integer&nbsp;that is substring of the given string.Constraints:1&lt;=|S|&lt;=2*105S only consists of digits and does not contain any leading zeros.
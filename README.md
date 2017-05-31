
# BomberAlgo:

The bomber algorithm doesn't like 3 or more consecutive characters in a given string to be same. For Example: If the given string is "adbcccbbd" the bomber algo will first bomb "ccc" and then "bbb", so the final output string will become "add". The bomber algo will destroy the characters only if there are 3 or more continuous occurrence of same characters in the string.  Write a code of the bomber algo. The method takes a string as an input and returns the bombed string as an output.   If you are taking any assumptions, please do mention them before the code!  
Examples:  
Input 1: aaabcccdee 
Output: bdee 
Explanation -> 
Step 1: bcccdee 
Step 2: bdee (Final Answer)  

Input 2: abcdeeeeddcbfgf 
Output : abccbfgf 
Explanation -> 
Step 1: abcdddcbfgf 
Step 2: abccbfgf (Final Answer)

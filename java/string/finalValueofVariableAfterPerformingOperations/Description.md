#Final Value of Variable After Performing Operations

There is a programming language with only four operations and one variable `X`:

- ++X and X++ increments the value of the variable X by 1.
- --X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.



##Example 1:

>Input: operations = ["--X","X++","X++"]<br/>
Output: 1<br/>
Explanation: The operations are performed as follows:<br/>
Initially, X = 0.<br/>
--X: X is decremented by 1, X =  0 - 1 = -1.<br/>
X++: X is incremented by 1, X = -1 + 1 =  0.<br/>
X++: X is incremented by 1, X =  0 + 1 =  1.<br/>

##Example 2:

>Input: operations = ["++X","++X","X++"]<br/>
Output: 3<br/>
Explanation: The operations are performed as follows:<br/>
Initially, X = 0.<br/>
++X: X is incremented by 1, X = 0 + 1 = 1.<br/>
++X: X is incremented by 1, X = 1 + 1 = 2.<br/>
X++: X is incremented by 1, X = 2 + 1 = 3.<br/>


##Example 3:

>Input: operations = ["X++","++X","--X","X--"]<br/>
Output: 0<br/>
Explanation: The operations are performed as follows:<br/>
Initially, X = 0.<br/>
X++: X is incremented by 1, X = 0 + 1 = 1.<br/>
++X: X is incremented by 1, X = 1 + 1 = 2.<br/>
--X: X is decremented by 1, X = 2 - 1 = 1.<br/>
X--: X is decremented by 1, X = 1 - 1 = 0.<br/>

##Constraints:

- 1 <= operations.length <= 100
- operations[i] will be either "++X", "X++", "--X", or "X--".

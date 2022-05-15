#Goal Parser Interpretation

You own a Goal Parser that can interpret a string `command`. The `command` consists of an alphabet of `"G"`, `"()"` and/or `"(al)"` in some order. The Goal Parser will interpret `"G"` as the string `"G"`, `"()"` as the string `"o"`, and `"(al)"` as the string "al". The interpreted strings are then concatenated in the original order.

Given the string `command`, return **the Goal Parser**'s interpretation of `command`.


##Example 1:

>Input: command = "G()(al)"<br>
Output: "Goal"<br>
Explanation: The Goal Parser interprets the command as follows:<br>
G -> G<br>
() -> o<br>
(al) -> al<br>
The final concatenated result is "Goal".

##Example 2:

>Input: command = "G()()()()(al)"<br>
Output: "Gooooal"

##Example 3:

>Input: command = "(al)G(al)()()G"<br>
Output: "alGalooG"


##Constraints:

- 1 <= command.length <= 100
- command consists of "G", "()", and/or "(al)" in some order.

// Goal Parser Interpretation

// You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

// Given the string command, return the Goal Parser's interpretation of command.

 

// Example 1:

// Input: command = "G()(al)"
// Output: "Goal"
// Explanation: The Goal Parser interprets the command as follows:
// G -> G
// () -> o
// (al) -> al
// The final concatenated result is "Goal".
// Example 2:

// Input: command = "G()()()()(al)"
// Output: "Gooooal"
// Example 3:

// Input: command = "(al)G(al)()()G"
// Output: "alGalooG"
 

// Constraints:

// 1 <= command.length <= 100
// command consists of "G", "()", and/or "(al)" in some order.

public class Problem5_Sahil {
    public String interpret(String command) {
        StringBuffer ans = new StringBuffer();
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                ans.append("G");
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans.append("o");
            }
            else if(command.charAt(i) == '(' && command.charAt(i+3) == ')'){
                ans.append("al");
            }
        }
        return ans.toString();
        // return command.replace("()","o").replace("(al)","al");
    }
}

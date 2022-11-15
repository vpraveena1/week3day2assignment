package week3day2assign;
/*Given a string s consisting of words and spaces, 
 * return the length of the last word in the string.


 * A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/

public class Strings {

	public static void main(String[] args) {
		String s="Hello World";
		System.out.println((s.substring(6, 11)).length());
		String s1="    fly me to the moon  ";
		s1.trim();
		System.out.println((s1.substring(18, 23)).length());
		String s2="luffy is still joyboy";
		System.out.println((s2.substring(15, 21)).length());
	}

}

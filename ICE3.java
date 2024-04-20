/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.pkg3;

/**
 *
 * @author 27765
 */
public class ICE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
        //Question 1
       public boolean isValid(String s) {
    StringBuilder stack = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.append(c);
        } else if (c == ')' && (stack.length() == 0 || stack.charAt(stack.length() - 1) != '(')) {
            return false;
        } else if (c == '}' && (stack.length() == 0 || stack.charAt(stack.length() - 1) != '{')) {
            return false;
        } else if (c == ']' && (stack.length() == 0 || stack.charAt(stack.length() - 1) != '[')) {
            return false;
        } else {
            stack.deleteCharAt(stack.length() - 1);
        }
    }
    return stack.length() == 0;
}
   //Question 2:
  public int oddSquaresSum(int limit) {
    int sum = 0;
    for (int i = 1; ; i += 2) {
        int square = i * i;
        if (square > limit) {
            break;
        }
        sum += square;
    }
    return sum;
}
//Question 3:
    public int greatestCommonDivisor(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

    }
    


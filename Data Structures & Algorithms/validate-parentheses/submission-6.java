class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)   {
            return false;
        }
       Stack<Character> open = new Stack<>();

       for (char c: s.toCharArray())  {
        if (c == '(' || c == '{' || c == '[')   {
            open.push(c);
        }
        
        else {
            if(open.isEmpty())  {
            return false;
        }
            if ((open.peek() == '(' && c == ')') ||
        (open.peek() == '{' && c == '}') ||
        (open.peek() == '[' && c == ']'))   {
            open.pop();
            }
            else return false;
        }
        
       }

       
       return open.isEmpty();
    }
}

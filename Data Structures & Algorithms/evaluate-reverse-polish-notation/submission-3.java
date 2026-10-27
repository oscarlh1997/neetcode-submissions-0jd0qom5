class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> numbers = new Stack<>();
        int p = 0;

        while (p < tokens.length) {
            if (!tokens[p].equals("+") && !tokens[p].equals("-") && !tokens[p].equals("*") && !tokens[p].equals("/") )   {
                numbers.push(Integer.parseInt(tokens[p]));
                p++;    
            }
            else {
                  
                    int num1 = numbers.peek();
                    numbers.pop();
                    int num2 = numbers.peek();
                    numbers.pop();

                    numbers.push(calculate(num1,num2,tokens[p]));
                    p++;
                    }
        }
        return numbers.peek();
        
    }

    public int calculate(int num1, int num2, String oper) {
        if (oper.equals("+")){return num1+num2;}
        if (oper.equals("-")){return num2-num1;}
        if (oper.equals("/"))
        {   if (num2 == 0) {
            return 0;
        }
        return num2/num1;}
        if (oper.equals("*")){return num2*num1;}
        return 0;
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

       for(String str : tokens){
            if(str.equals("+") || str.equals("-") 
            || str.equals("*") || str.equals("/")){
                int a = st.pop();
                int b = st.pop();
                int result = solve(b,a,str);
                st.push(result); 
            }else{
                st.push(Integer.parseInt(str));
            }
        } 
        return st.peek();
    }

    public int solve(int first_operand, int second_operand, String operator){
        int sum = 0;
        if(operator.equals("+")) {   sum = first_operand + second_operand;  }
        if(operator.equals("-")) {   sum = first_operand - second_operand;  }
        if(operator.equals("*")) {   sum = first_operand * second_operand;  }
        if(operator.equals("/")) {   sum = (int)(first_operand / second_operand);  }

        return sum;
    }
}
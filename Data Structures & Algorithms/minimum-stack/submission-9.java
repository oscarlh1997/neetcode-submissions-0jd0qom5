class MinStack {

        List<Integer> arr = new ArrayList();
        Stack<Integer> minValueAtT = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        if(minValueAtT.isEmpty())    {
            minValueAtT.push(val);
            
        }
        else    {
           minValueAtT.push(Math.min(minValueAtT.peek(),val)) ;
        }
        
        
        arr.add(val);
        
        
    }
    
    public void pop() {
        
        minValueAtT.pop();
        arr.removeLast();
        
    }
    
    public int top() {
        return arr.getLast();
        
    }
    
    public int getMin() {
        return minValueAtT.peek();

        
    }
}

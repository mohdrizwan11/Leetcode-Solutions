class StockSpanner {
    Stack<Integer> stack;
    int prices[];
    int span[];
    int index;
    public StockSpanner() {
        stack = new Stack<>();
        prices = new int[10000]; //enough for constraints
        span = new int[10000];
        index = 0;
    }
    
    public int next(int price) {
        prices[index] = price;

        while(!stack.isEmpty() && prices[stack.peek()] <= price){
            stack.pop();
        }
        if(stack.isEmpty()){
            span[index] = index + 1;
        }else{
            span[index] = index - stack.peek();
        }

        stack.push(index);
        return span[index++];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
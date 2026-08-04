class StockSpanner {
    Deque<MyObj> spanStack;
    public StockSpanner() {
        spanStack = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;
        while (!spanStack.isEmpty() && spanStack.peek().price <= price) {
            span += spanStack.pop().span;
        }
        spanStack.push(new MyObj(price, span));
        return span;
    }

    class MyObj {
        int price;
        int span;
        public MyObj(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
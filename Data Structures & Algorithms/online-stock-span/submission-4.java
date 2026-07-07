class StockSpanner {
    // We'll intialiaze a stack to keep track of prices and span
    Deque<int[]> prices;
    public StockSpanner() {
        prices = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;
        while (!prices.isEmpty() && price >= prices.peek()[0]) {
            span += prices.pop()[1];
        }
        prices.push(new int[] {price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
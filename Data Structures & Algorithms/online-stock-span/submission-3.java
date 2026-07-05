class StockSpanner {
    private Deque<int[]> pricesSpan;
    public StockSpanner() {
        pricesSpan = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;
        while (!pricesSpan.isEmpty() && price >= pricesSpan.peek()[0]) {
            span += pricesSpan.pop()[1];
        }
        pricesSpan.push(new int[] {price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
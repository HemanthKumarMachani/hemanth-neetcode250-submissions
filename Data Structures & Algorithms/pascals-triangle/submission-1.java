class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if (numRows == 0)
            return pascal;
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        for (int outer = 1; outer < numRows; outer++) {
            List<Integer> temp = new ArrayList<>(pascal.get(outer - 1));
            temp.add(0, 0);
            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for (int inner = 0; inner < pascal.get(outer - 1).size() + 1; inner++) {
                row.add(temp.get(inner) + temp.get(inner + 1));
            }
            pascal.add(row);
        }
        return pascal;
    }
}
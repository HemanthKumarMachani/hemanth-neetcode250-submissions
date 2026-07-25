class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        for (int index = 1; index < numRows; index++) {
            List<Integer> temp = new ArrayList<>(pascal.get(index - 1));
            temp.add(0, 0);
            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for (int inner = 0; inner < pascal.get(index - 1).size() + 1; inner++) {
                row.add(temp.get(inner) + temp.get(inner + 1));
            }
            pascal.add(row);
        }
        return pascal;
    }
}
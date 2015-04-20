public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<Integer> firstRow = new ArrayList<Integer>();

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(numRows == 0)
            return result;

        firstRow.add(1);
        result.add(firstRow);

        if(numRows == 1)
            return result;

        List<Integer> secondRow = new ArrayList<Integer>();
        secondRow.add(1);
        secondRow.add(1);
        result.add(secondRow);

        List<Integer> lastRow = secondRow;

        for(int i = 2; i < numRows; i ++)
        {
            List<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1);
            for(int j = 0; j < lastRow.size() - 1; j++)
                currentRow.add(lastRow.get(j) + lastRow.get(j + 1));
            currentRow.add(1);
            result.add(currentRow);
            lastRow = currentRow;
        }

        return result;
    }
}

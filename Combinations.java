public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if(n == 0)
            return null;


        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(n == k)
        {
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 1; i <= n; i ++)
                list.add(i);
            result.add(list);
            return result;
        }

        if(k == 1)
        {
            for(int i = 1; i <= n; i ++)
            {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                result.add(list);
            }
            return result;
        }

        List<List<Integer>> nMinus1 = combine(n - 1, k);
        List<List<Integer>> nMinus1kMinus1 = combine(n - 1, k - 1);

        for(List<Integer> l : nMinus1)
            result.add(l);

        for(List<Integer> l : nMinus1kMinus1)
        {
            l.add(n);
            result.add(l);
        }

        return result;
    }

}

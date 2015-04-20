public class 4Sum {
    public List<List<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();

        int n = num.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j ++)
            {
                int k = j + 1;
                int l = n - 1;

                while(k < l)
                {
                    int sum = num[i] + num[j] + num[k] + num[l];
                    if(sum < target)
                        k ++;
                    else if(sum > target)
                        l --;
                    else
                    {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[k]);
                        list.add(num[l]);

                        if(!set.contains(list))
                        {
                            set.add(list);
                            result.add(list);
                        }

                        k ++;
                        l --;
                    }
                }
            }
        }

        return result;
    }
}

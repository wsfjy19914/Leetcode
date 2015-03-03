public class RotatedArrayMinimum {

//solution with O(n)

//    public int findMin(int[] num) {
//        if(num.length == 1)
//            return num[0];
//        for(int i = 1; i < num.length; i ++)
//        {
//            if(num[i] < num[i-1])
//            return num[i];
//        }
//        return num[0];
//    }


//solution with O(log n) by using binary search without considering duplications

	public int findMin(int[] num){
		if (num.length == 1)
			return num[0];
		int start = 0;
		int end = num.length - 1;
		int mid;

		if(num[start] < num[end])
			return num[start];
		else
		{
			while(start + 1 != end)
			{
				mid =(start + end) / 2;

				if(num[start] <= num[mid])
				{
					start = mid;
				}
				else
					end = mid;
			}
			return num[end];
		}
	}
}

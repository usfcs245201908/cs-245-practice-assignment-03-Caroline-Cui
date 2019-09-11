public class BinaryIterativeSearch implements Practice03Search
{
    @Override
    public String searchName()
    {
        return "BinaryIterative";
    }

    @Override
    public int search(int[] arr, int target)
    {
        int start = 0;
        int mid;
        int end = arr.length - 1;
        int len;
        int count = 0;
        boolean test = true;
        while (test)
        {
            len = end - start + 1;
            mid = len/2 + start;
            if (arr[mid] < target)
            {
                start = mid + 1;
                len = end - start + 1;
                end = start + (len/2 - 1) - 1;
                count++;
            }
            else if (arr[mid] > target)
            {
                end = mid - 1;
                len = end - start + 1;
                start = end + 1 - (len/2);
                count++;
            }
            else
            {
                test = false;
                return mid;
            }

            if (count > arr.length)
            {
                test = false;
            }
        }
        return -1;
    }
}

public class BinaryRecursiveSearch implements Practice03Search
{
    public String searchName()
    {

        return "BinaryRecursive";
    }

    public int search(int[] arr, int target)
    {
        return searchB(arr, target, 0, arr.length-1);
    }

    public int searchB(int[] arr, int target, int start, int end)
    {
        int mid;
        mid = (end + start)/2;
        if (end<start)
        {
            return -1;
        }
        if (arr[mid] == target)
        {
            return mid;
        }
        if (arr[mid] > target)
        {
            return searchB(arr,  target,  start, mid-1);
        }
        else
        {
            return searchB(arr, target, mid+1, end);
        }
    }
}

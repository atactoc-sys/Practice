public class Solution {


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        if (head==null) //Empty linked list
        {
            return -1;
        }
        
        if (head.data.equals(n))
        {
            return 0;
        }
        int smallIndex=findNodeRec(head.next,n);
        if (smallIndex==-1)
        {
            return smallIndex;
        }
        else
        {
            return smallIndex+1;
        }
	}

}

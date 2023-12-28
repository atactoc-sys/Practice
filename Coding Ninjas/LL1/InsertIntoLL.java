public class Solution {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
		if (pos == 0){
			LinkedListNode t = new LinkedListNode(data);
			LinkedListNode tem = head;
			head = t;
			head.next = tem;
			return head;
		}
		int x = 0;
		LinkedListNode temp = head;
		while(temp!= null){
			if (x+1 == pos){
				LinkedListNode t = new LinkedListNode(data);
				LinkedListNode tem = temp.next;
				temp.next = t;
				temp.next.next = tem;
				x++;
			}
			x++;
			temp = temp.next;
		}
		return head;
	}
}

public class Solution {

	public static int findLengthLL(LinkedListNode<Integer> head) {
		int count = 0;
		while (head.next != null) {
			head = head.next;
			count = count + 1;
		}
		return count;

	}

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		// Your code goes here
		if (head == null || head.next == null) {
			return head;
		}
		int n = findLengthLL(head);
		LinkedListNode<Integer> node1 = null, node2 = null, temp = null;
		int data1 = 0, data2 = 0;
		for (int i = 0; i < n; i++) {
			node1 = head;
			node2 = head.next;
			for (int j = 0; j < n - i; j++) {
				data1 = node1.data;
				data2 = node2.data;
				if (data1 > data2) {
					node1.data = data2;
					node2.data = data1;
				}
				node1 = node1.next;
				node2 = node2.next;

			}
			// Runner.print(head);
		}
		// System.out.println();
		return head;

	}
}

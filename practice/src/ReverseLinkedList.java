public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        int i = 0;
        ListNode oldHeadValue = head;
        while (head.next != null) {
            i++;
            head = head.next;
        }
        ListNode[] arr = new ListNode[i];

        for (int j = 0; j < i; j++) {
            arr[j] = oldHeadValue;
            oldHeadValue = oldHeadValue.next;
        }
        int lengthIterate = arr.length - 1;


        ListNode iterate = arr[arr.length - 1];

        while (iterate.next != null) {
            arr[lengthIterate].next = iterate;
            lengthIterate--;
            iterate = iterate.next;
        }
        return arr[lengthIterate];


    }
}


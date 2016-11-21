/**
 * Created by chandresh.pancholi on 20/07/16.
 */
public class ReverseKNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//        head.next.next.next.next.next.next = new ListNode(7);

        int k  = 3;

//        int len = 0;
//        ListNode temp = head;
//        while (temp!=null) {
//            temp = temp.next;
//            len++;
//        }
//        if(len < k) {
//
//        }
        head = reverse(head, k);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode reverse(ListNode head, int k) {
        ListNode next = null;
        ListNode curr = head;
        ListNode prev = null;

        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            count++;
        }

        if(next != null) {
            head.next = reverse(next, k);
        }

        return prev;

    }
}

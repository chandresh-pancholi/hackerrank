import java.util.List;

/**
 * Created by chandresh.pancholi on 20/07/16.
 */
public class RotateList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        ListNode temp = head;

        int k = 1;

        int len = 0;

        if(temp.next == null) {
            len = 1;
        }

        if(len == 1 && k >= len) {
            System.out.println(temp);
        }

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        ListNode tail = temp;

        temp = head;

        if (k >= len) {
            k = k % len;
        }

        int count = 0;

        while (temp != null && count != len - k) {
            count++;
            temp = temp.next;

        }
        if(temp.next == null) {

        }
        ListNode curr = temp.next;
        temp.next = null;

        tail.next = head;

        head = curr;

        temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }



    }
}

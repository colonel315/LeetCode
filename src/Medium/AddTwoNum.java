package Medium;

/**
 * Created by Dell on 1/3/2017.
 */
public class AddTwoNum {
    public static void main(String args[]) {
        AddTwoNum addTwoNum = new AddTwoNum();

        ListNode l1 = new ListNode(2);
        ListNode l1b = new ListNode(4);
        ListNode l1c = new ListNode(3);
        l1.next = l1b;
        l1b.next = l1c;

        ListNode l2 = new ListNode(5);
        ListNode l2b = new ListNode(6);
        ListNode l2c = new ListNode(4);
        l2.next = l2b;
        l2b.next = l2c;

        System.out.print(addTwoNum.addTwoNum(l1, l2));
    }
    private ListNode addTwoNum(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            ListNode curr = new ListNode(0);
            int sum = 0;
            if(l1 != null) {
                sum += l1.val;
            }
            if(l2 != null) {
                sum += l2.val;
            }
            sum += carry;

            curr.val = sum%10;
            carry = sum/10;

            prev.next = curr;
            prev = curr;

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        return head.next;
    }
}

package insertionSortList;

import java.util.StringJoiner;

public class Solution {

    public static void main(String[] args) {
        final ListNode _3 = new ListNode(3);
        final ListNode _1 = new ListNode(1,_3);
        final ListNode _2 = new ListNode(2,_1);
        final ListNode _4 = new ListNode(4, _2);
        print(_4);

        ListNode sort = sort(_4);

        print(sort);
    }

    private static ListNode sort(ListNode head) {
        if( head == null ){
            return head;
        }
        ListNode helper = new ListNode(0);
        ListNode cur = head;
        ListNode pre = helper;
        ListNode next = new ListNode();
        while( cur != null ){
            next = cur.next;
            while(pre.next !=null &&  pre.next.val < cur.val){
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            pre = helper;
            cur = next;
            System.out.println("-------------");
            print(helper);
        }

        return helper.next;
    }

    static void print (ListNode root){
        StringJoiner stringJoiner = new StringJoiner(">");
        while (root != null){
            stringJoiner.add(String.valueOf(root.val));
            root = root.next;
        }
        System.out.println(stringJoiner.toString());
    }
}

class ListNode {

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
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val){
        this.val=val;
        this.next=null;
    }

    public static ListNode Add_two_num(ListNode l1, ListNode l2){
        ListNode dummyhead=new ListNode(0);
        ListNode currentNode=dummyhead;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int l1_val=(l1!=null)?l1.val:0;
            int l2_val=(l2!=null)?l2.val:0;

            int sum=l1_val+l2_val+carry;
            currentNode.next=new ListNode(sum%10);
            currentNode=currentNode.next;
            carry=Math.abs(sum/10);

            if (l1!=null)l1=l1.next;
            if (l2!=null)l2=l2.next;
        }

        return dummyhead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = Add_two_num(l1, l2);

        // Print the result
        ListNode currentNode = result;
        while (currentNode != null) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");

    }
}


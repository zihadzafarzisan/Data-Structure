public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end) {
        // TO DO
         int n = 0;
    for (DNode t = dh.next; t != dh; t = t.next) n++;
    DNode cur = dh.next;
    for (int i = 0; i < n; i++) {
        DNode nxt = cur.next; 
        int v = (Integer) cur.elem;
        if (v >= start && v <= end) {
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
            DNode last = dh.prev;
            last.next = cur;
            cur.prev = last;
            cur.next = dh;
            dh.prev = cur;
        }
        cur = nxt;
    }
}

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}

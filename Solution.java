/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class gfg
{
      
	    void splitList(circular_LinkedList list)
        {
           Node h = list.head;

            Node s = h;
            Node f = h.next;

        while(f != h && f.next != h && f.next.next != h ){
            s= s.next;
        f=f.next.next;
                }
        if(f.next.next == h) {f = f.next; s = s.next;}

    list.head1 = h;
    list.head2 = s.next;
    s.next = h;
    f.next = list.head2;
             // Your code here
	 }
}

//make a queue class

class Queue
{
   //pointer to first node in Class
   private Node head;  //front
   private Node tail;//back

   //constructor
   public Queue()
   {
      head = null;
      tail = null;
   }

   //adds new node to the head
   //like push for queue
   public void add(Node newNode)
   {
      if (newNode == null)
         return;           //emergency return
      newNode.next = null; //there is no next node b/c you are last
      tail.next = newNode; // the tail is now 2nd to tail
      tail = newNode;    // the newNode is the tail
   }

   //removes "head = front" Node
   public Node next()
   {
      Node temp;

      temp = head;
      if (head == null)
      {
         temp = null;   //empty queue
      }
      
      if (head != null)
      {
         head = head.next;
         temp.next = null; // don't give client access to stack!
      }
      return temp;
   }

   public void showStack()
   {
      Node p;

      //display all the nodes in the Stack
      for (p = head; p != null; p = p.next)
         p.show();
   }

}

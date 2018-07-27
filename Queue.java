//make a queue class

class Queue
{
   //pointer to first node in Class
   private StackNode top;  //front
   private StackNode bottom;//back

   //constructor
   public Queue()
   {
      top = null;
      bottom = null;
   }

   //adds new node to the top
   //like push for queue
   public void add(StackNode newNode)
   {
      if (newNode == null)
         return;
      newNode.next = null; //there is no next node b/c you are last
      bottom.next = newNode; // the bottome is now 2nd to bottom
   }

   //removes "top = front" StackNode
   public StackNode next()
   {
      StackNode temp;

      temp = top;
      if (top != null)
      {
         top = top.next;
         temp.next = null; // don't give client access to stack!
      }
      return temp;
   }

   public void showStack()
   {
      StackNode p;

      //display all the nodes in the Stack
      for (p = top; p != null; p = p.next)
         p.show();
   }

}

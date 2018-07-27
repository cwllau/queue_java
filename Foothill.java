public class Foothill
{
   public static void main (String[] args)
   {
      Stack stk = new Stack();
      StackNode p;

      // build the stack
      for (int k = 0; k < 5; k++)
      {
         p = new StackNode();
         stk.push(p);
      }

      // show the stack, deleting as you pop
      while ( (p = stk.pop()) != null)
         p.show();
      System.out.println();

      System.out.prinlnt("\n\n TESTING THE QUEUE \n\n");
      Queue q = new Queue();
      StackNode z;

      //build the queue??? how to keep track of the stuff
      q.add(a);
   }
 }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class queue_implmentation 
{
    static int queue[] = new int[100];
    static int left,right;
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static void menu() throws IOException
    {
         int choice = 1;
         left = -1;
        right = -1;
        while(choice!=4)
        {
            System.out.println("1. Push element in the queue - Enqueue");
            System.out.println("2. Pop element from the queue - Dequeue");
            System.out.println("3. Show elements in the queue - Peek");
            System.out.println("4. Exit");
            choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1 : {
                            if(left != 99 )
                            {
                                if(right==-1 && left == -1)
                                {
                                    right++;
                                }
                                left++;
                                System.out.println("Enter the number to be added");
                                queue[left] = Integer.parseInt(br.readLine());
                            }
                            else
                            {
                                System.out.println("Queue is Full!!!!");
                            }
                            
                            break;
                         }
                case 2 : {
                            if(left != -1 )
                            {
                                System.out.println("Element removed : "+ queue[right]);
                                right++;
                            }
                            else
                            {
                                System.out.println("Queue is Empty!!!!");
                            }
                            
                            break;
                         }
                case 3 : {
                            System.out.println("Elements in the queue are : ");
                            for(int i= right ; i >= left ; i-- )
                            {
                                System.out.print(queue[i]+" ");
                            }
                            System.out.println("");
                            break;
                         }
                case 4 : {
                            return;
                        }
                default : {
                            
                            System.out.println("Please enter valid choice");
                         }
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        menu();
    }
}

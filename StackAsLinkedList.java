//Time Complexity -> O(1) for each function operation (isEmpty(), push(), pop(), peek())
//Space Complexity -> O(n) for n elements in stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach:
// Here we implemented a stack using linked list where each node holds data and address to the next node
// The top of the stack is represented as "root" node
// push(data): we add new node at the beginning and update the root
// pop(): we remove the top node by moving the root to the next node
// Peek(): returns the data or value at the root node
//isEmpty(): check if the stack is empty






public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
    
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;


    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;

        }
        else{
            int poppedElement = root.data;
            root = root.next;
            return poppedElement;
        }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Empty");
            return 0;
        }
        else{
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

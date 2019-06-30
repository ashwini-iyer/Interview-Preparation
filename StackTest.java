package javainterviews;
/**
 * Implement a stack in java program without using the inbuilt data type in Util Package
 * Popular Amazon interview question.
 * @author Ashwini Iyer
 *
 */
 class Stack{
	 //Your stack is an integer array of length 5 say
	int[] st = new int[5];
	//top is the top most element index
	int top = 0;
	/**
	 * Push the data to the stack.
	 * Put the data in the array and increment its top pointer by 1
	 * @param data
	 */
	public void push(int data) {
		st[top]= data;
		top++;
	}
	/**
	 * Pop the top most stack data
	 * Return the top most array value 
	 * Set the top array value to 0 and decrement  the top most pointer 
	 * @return
	 */
	public int pop() {
	    int data = st[top-1];
	    st[top-1]=0;
	    top--;
	    return data;
		
	}
	/**
	 * Peek to the stack data
	 * @return the top most stack data.
	 */
	public int peek() {
		int data = st[top-1];
		return data;
	}
	/**
	 * Show all the array element values in the stack.
	 */
	public void show() {
		for(int i:st) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		if(st[0]==0) {
			return true;
		}
		else {return false;}
	}
}
 
 /**
  * This class tests the stack class methods.
  * @author Ashwini Iyer 
  *
  */
public class StackTest {
    /**
     * Instantiate the stack class and call its implemented methods.
     * @param args
     */
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(12);
		stack.push(8);
		stack.push(15);
		System.out.println("After push the data is :-");
		stack.show();
		
		System.out.println("Pop: "+stack.pop());
		System.out.println("After pop the data is :-");
		stack.show();
		
		System.out.println("peek: "+stack.peek());
		System.out.println("After peek the data is :-");
		stack.show();
		System.out.println("The length of the stack is :-"+stack.size());
		System.out.println("The stack is emty or not?"+stack.isEmpty());
		
	}

}

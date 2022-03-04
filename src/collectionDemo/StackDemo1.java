package collectionDemo;

import java.util.Stack;import javax.swing.LayoutStyle;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.add(12);
		stack.push(13);
		stack.addElement(14);
		stack.add(54);
		
		/*
		54 
		14
		13
		12
		*/
		
		int len = stack.size();
		System.out.println("The size of Stack : " + len);
		System.out.println("Stack values before pop action _ " +stack);
		stack.pop();
		/*
		54 - removed 
		14
		13
		12
		*/
		System.out.println("Stack values after pop action _ " +stack);
		
		/*
		
		14 = return 
		13
		12
		*/
		// LIFO
		// 4 3 2 1 FIFO

		
		System.out.println("Return last value stored in Stack = " + stack.peek());
		
		System.out.println("Print all the values in stack =  " +stack);

	}

}

package wangzhen.job;

import java.util.ArrayList;
import java.util.Stack;

   class ListNode {
       int val;
        ListNode next = null;
        
        ListNode(int val) {
            this.val = val;
       }
    }


public class NIuke3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	//ArrayList�಻��������һ�������ʼ��С
    	ArrayList<Integer> result = new ArrayList<>();
    	Stack<Integer> stack = new Stack<>();
    	ListNode temp = listNode;
    	while (temp != null) {
    		 //Stack��ʼû�д�С����
			stack.push(temp.val);
			temp = temp.next;
		}
    	
    	while(!stack.isEmpty()){
    		result.add(stack.pop());
    	}
    	return result;
    }
}

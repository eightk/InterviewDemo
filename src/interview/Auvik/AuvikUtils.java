/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Auvik;

import java.util.Hashtable;

/**
 *
 * @author huico
 */
public class AuvikUtils {
    
    public static class LinkedListNode {
        int val;
        LinkedListNode next;
        
        LinkedListNode(int node_val) {
            val = node_val;
            next = null;
        }
    }
    
    public static LinkedListNode insertNode(LinkedListNode head, LinkedListNode tail, int val) {
        if(head == null) {
            head = new LinkedListNode(val);
            tail = head;
        } else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;           
        }
        return tail;
    }
    
    public static LinkedListNode removeNodes(LinkedListNode list, int x) {
        //Make sure the first one is correct        
        while(list != null && list.val > x) {
            list = list.next;
        }
        LinkedListNode preNode = list;
        LinkedListNode curNode = list.next;
        do {
          if(curNode.val>x) {
              preNode.next = curNode.next;
              curNode = curNode.next;
          } else {
              preNode = curNode;
              curNode = curNode.next;
          }
        }   while(curNode!=null);
        return list;
    }
    
    public static void printLinkedList(LinkedListNode list) {
        do {
          System.out.print(list.val + " ");
          list = list.next;
        }   while(list!=null);
        System.out.println();
    }
    
    public static String lastLetters(String word) {
        StringBuilder result = new StringBuilder();        
        if(word.length()>100 || word.isEmpty()) {
            
        } else {
            result = result.append(word.charAt(word.length()-1));
            result = result.append(" ");
            result = result.append(word.charAt(word.length()-2));
        }
        return result.toString();       
    }
    
    public static void ascii() {
        Hashtable<Character, Integer> result = new Hashtable();
        for(int i=97; i<123; i++) {
            result.put((char)i, 0);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(lastLetters("ABCDE"));
        //ascii();
        LinkedListNode list = new LinkedListNode(1);
        insertNode(list, list, 2);
        LinkedListNode curNode = list.next;
        insertNode(list, curNode, 3);
        curNode = curNode.next;
        insertNode(list, curNode, 4);
        curNode = curNode.next;
        insertNode(list, curNode, 5);
        printLinkedList(list);
        removeNodes(list, 3);
        printLinkedList(list);
        
    } 
}

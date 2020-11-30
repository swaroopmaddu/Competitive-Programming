/*

 */
package LinkedLists;

import java.util.HashSet;

/**
 *
 * @author Sai
 */

class Node {
    
    int val;
    
    Node next;
    
    public Node(int val) {
        this.val = val;
    }
}

public class MyLinkedList {
    Node head;
    int count;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        count = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        Node currentNode = head;
        int n = 0;
        while(n < index){
            currentNode = currentNode.next;
            n++;
        }
        return currentNode.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node tempNode= new Node(val);
        tempNode.next = head;
        head = tempNode;
        count++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(count == 0) {
            addAtHead(val);
            return;
        }
        Node tempNode= new Node(val);
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = tempNode;
        tempNode.next = null;
        count++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > count) {
            return;
        }
        else if (index == 0) {
            addAtHead(val);
        }
        else if (index == count) {
            addAtTail(val);
        } 
        else{
            Node tempNode = new Node(val);

            Node currentNode = head;
            int n = 0;
            while(n < index-1){
                currentNode = currentNode.next;
                n++;
            }
            tempNode.next = currentNode.next;
            currentNode.next = tempNode;
            count++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
         
        if (index < 0 || index >= count) {
            return;
        }
        
        
        Node currentNode = head;
        
        if(index == 0) {
            head = currentNode.next;
        } 
        else{
            int n = 0;
            Node preNode = null;
            while(n != index){
                preNode = currentNode;
                currentNode = currentNode.next;
                n++;
            }
            preNode.next = currentNode.next;
            count--;
        }
    }
    

    
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        
        System.out.println(obj.get(1));
        
        obj.deleteAtIndex(1);
        //print output
        System.out.println(obj.get(1));
                
        
    }

}


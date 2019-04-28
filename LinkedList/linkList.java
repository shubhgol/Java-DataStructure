import java.util.*;

class LinkedList {
    Node head=null;

    static class Node {
     private   int data;
     private   Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static  LinkedList insert(LinkedList list ,int data) {
        Node newNode = new Node(data);
        if(list.head== null ) {
            list.head = newNode;
        }
        else {
            Node currentNode = list.head;
            while(currentNode.next!=null) 
            currentNode = currentNode.next;

            currentNode.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node currentNode = list.head;
        while(currentNode!=null) {
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }


    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
    } 



}
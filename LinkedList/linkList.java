
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    } 
}

 class LinkedList {
     Node head = null;
     
  public void insertData(LinkedList list, int value) {

    Node newNode = new Node(value);
    if(list.head==null) {
        list.head = newNode;
    } else {
        Node currentNode = list.head;
        while(currentNode.next!=null) 
        currentNode = currentNode.next;
        currentNode.next = newNode;
    }
  
  }


  public void printList(LinkedList list) {
      Node currentNode = list.head;
      while(currentNode!=null) {
          System.out.print(currentNode.data+" ");
          currentNode = currentNode.next;
      }
  }
  
  public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.insertData(list,5);
      list.insertData(list,10);
      list.insertData(list,15);
      list.printList(list);
  }

 }
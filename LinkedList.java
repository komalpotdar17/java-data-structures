public class LinkedList {
    Node head;
    
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void addFirst(String data){
        Node curNode = head;
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
           return;
        }

        newNode.next = head;
        head = newNode;
    }

    // public void addLast(String data){
       
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }

    //     No
    // } 

     



    public static void main(String args[]){ṇ
        LinkedList list = new LinkedList();

        list.addFirst("a");
        list.addFirst("is");
    }
    
}

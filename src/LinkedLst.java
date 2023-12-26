public class LinkedLst {
    Node head;
    private int size;
    LinkedLst(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
//Add First
    public void addFirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    // Add Last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //Printing List
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" --> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    //delete First
    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        size--;
        head=head.next;
    }

    // delete Last

    public void deleteLast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    // get Size

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LinkedLst lst=new LinkedLst();
        lst.addFirst("a");
        lst.addFirst("is");
        lst.addFirst("this");
        lst.addFirst("now");
        lst.printList();
        lst.addLast("LinkedList");
        lst.addLast("List");
        lst.printList();
        System.out.println("List size: "+lst.getSize());
        lst.deleteFirst();
        lst.printList();
        lst.deleteLast();
        lst.printList();
        System.out.println("List size: "+lst.getSize());
    }
}

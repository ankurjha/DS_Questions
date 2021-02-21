public class LinkedList {

    private LLNode head;

    public LLNode getHead() {
        return head;
    }

    public void setHead(LLNode head) {
        this.head = head;
    }

    public void printList(LLNode head){
        while(head != null){
            if(head.getNext() != null) {
                System.out.print(head.getValue() + "->");
            }else{
                System.out.print(head.getValue() + "->NULL");
            }
            head = head.next;
        }
    }

    public LLNode reverseListRecursive(LLNode head){
        if(head == null){
            return null;
        }
        if(head.getNext() == null){
            this.head = head;
            return head;
        }
        LLNode previous = head;
        LLNode current = reverseListRecursive(head.getNext());
        previous.setNext(current.getNext());
        current.setNext(previous);
        return previous;
    }

    public LLNode reverseLinkedList(LLNode head){
        if(head == null){
            return null;
        }
        LLNode previous = null;
        LLNode current = head;
        while(head != null){
            head = current.getNext();
            current.setNext(previous);
            previous = current;
            current = head;
        }
        return previous;
    }

    //Input: 1->2->3->4->5->6->7->8->NULL, K = 3
    //Output: 3->2->1->6->5->4->8->7->NULL
    public void reverseInAGroup(){

    }

    public static void main(String[] args) {

        LLNode llNode70 = new LLNode(70,null);
        LLNode llNode60 = new LLNode(60,llNode70);
        LLNode llNode50 = new LLNode(50,llNode60);
        LLNode llNode40 = new LLNode(40,llNode50);
        LLNode llNode30 = new LLNode(30,llNode40);
        LLNode llNode20 = new LLNode(20,llNode30);
        LLNode llNode10 = new LLNode(10,llNode20);

        LinkedList list = new LinkedList();
        list.setHead(llNode10);

        list.printList(list.getHead());
        System.out.println();

        /*list.reverseListRecursive(list.getHead());
        list.printList(list.head);*/
        list.printList(list.reverseLinkedList(list.head));

    }
}

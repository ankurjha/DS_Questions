public class LLNode {

    int value;
    LLNode next;

    public LLNode(int value, LLNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }
}

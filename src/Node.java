public class Node<T> {
    T element;
    Node next;

    public Node() {
    }

    public Node(T element, Node next) {
        this.element = element;
        this.next = next;
    }
}

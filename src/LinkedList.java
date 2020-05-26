public class LinkedList<T> {
    private int size = 0;
    private Node<T> head;

    private void addElement(T element) {
        Node<T> node = new Node(element, null);
        if (head == null) {
            head = node;
        }
        else {
            Node<T> n = head;
            while(n.next!=null) {
                n = n.next;
            }
            n.next =  node;
        }
        size++;
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    private T getElement(int index) {
        if (checkIndex(index)) {
            Node<T> node = head;
            for (int i = 0; i < index; i++)
                node = node.next;
            return node.element;
        }
        return null;
    }

    private class IteratorLinkedList {
        private Node<T> next = head;
        private int nextIndex = 0;

        public boolean hasNext() {
            return nextIndex < size;
        }

        public T next() {
            if (hasNext()) {
                Node<T> nodeReturn = next;
                next = next.next;
                nextIndex++;
                return nodeReturn.element;
            }
            return null;
        }
    }

    private void iterator() {
        IteratorLinkedList iterator = new IteratorLinkedList();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.addElement("test1");
        l.addElement("test2");
        l.addElement("test3");
        System.out.println(l.getElement(1));
        l.iterator();
    }
}

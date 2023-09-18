public class Node<T>{
    T element;
    Node<T> next;
    public Node(T element) {
        this.element = element;
        this.next = null;
    }
}

class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void addLast(T element) {
        Node<T> node = new Node<>(element);
        if(this.head == null){
            this.head = node;
        } else {
            this.tail.next = node;
        }
        this.tail = node;
    }

    public void show() {
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.element);
            currentNode = currentNode.next;
        }
    }

    public void addFist(T element) {
        Node<T> node = new Node<>(element);
        node.next = this.head;
        this.head = node;
    }

    public void removeTail() {
        Node<T> currentNode = this.head;
        while (currentNode.next != this.tail) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        this.tail = currentNode;
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(5);
        linkedList.addFist(7);
        linkedList.removeTail(); // 7 1 5
        linkedList.show();
    }
}


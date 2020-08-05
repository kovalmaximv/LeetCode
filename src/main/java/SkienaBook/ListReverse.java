package SkienaBook;

public class ListReverse {
    private static class Node {
        Node next;
        Integer value;

        public Node(Node next, Integer value) {
            this.next = next;
            this.value = value;
        }
    }

    public Node reverse(Node head) {
        Node prevTwo = null;
        Node prev = head;
        Node cur = head.next;
        while (cur != null) {
            prev.next = prevTwo;
            prevTwo = prev;
            prev = cur;
            cur = cur.next;
        }

        prev.next = prevTwo;

        return prev;
    }

    public static void main(String... args) {
        ListReverse listReverse = new ListReverse();
        Node lastNode = new Node(null, 4);
        Node thirdNode = new Node(lastNode, 3);
        Node secondNode = new Node(thirdNode, 2);
        Node head = new Node(secondNode, 1);
        Node check = listReverse.reverse(head);
    }
}

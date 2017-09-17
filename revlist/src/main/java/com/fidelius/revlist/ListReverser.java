package com.fidelius.revlist;

public class ListReverser {

  public Node reverse(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    Node current = head;
    Node prev = null;
    Node next = null;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  public static void main(String... args) {
    Node head = new Node(new int[] { 1, 12, 7, 9 });
    ListReverser reverser = new ListReverser();
    Node result = reverser.reverse(head);
    
    System.out.println(result);
  }

}

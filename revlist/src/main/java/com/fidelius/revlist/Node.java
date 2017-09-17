package com.fidelius.revlist;

import java.util.LinkedList;
import java.util.List;

public class Node {

  Node next;
  int value;

  public Node() { }

  public Node(int[] values) {
    if (values.length == 0) {
      throw new IllegalArgumentException("At least one value must be provided!");
    }
    Node current = this;
    current.value = values[0];

    for (int i = 1; i < values.length; i++) {
      Node next = new Node();
      next.value = values[i];
      current.next = next;
      current = next;
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node current = this;
    while (current != null) {
      sb.append(current.value + " ");
      current = current.next;
    }
    return sb.toString();
  }

  public int[] toArray() {
    List<Integer> result = new LinkedList<>();
    Node current = this;
    while (current != null) {
      result.add(current.value);
      current = current.next;
    }
    return result.stream().mapToInt(i -> i).toArray();
  }

}

package com.fidelius.revlist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ListReverserTest {

  private static ListReverser reverser;

  @BeforeAll
  static void init() {
    reverser = new ListReverser();
  }

  @Test
  void singleNode() {
    int[] input = new int[] { 3 };
    Node head = new Node(input);
    Node result = reverser.reverse(head);
    assertArrayEquals(result.toArray(), input);
  }

  @Test
  void multipleNodes() {
    int[] input = new int[] { 1, 12, 7, 9 };
    int[] expected = new int[] { 9, 7, 12, 1 };

    Node head = new Node(input);
    Node result = reverser.reverse(head);
    assertArrayEquals(result.toArray(), expected);
  }

}

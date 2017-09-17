package com.fidelius.singleton;

public final class SimpleSingleton {

  private static final SimpleSingleton INSTANCE = new SimpleSingleton();

  private SimpleSingleton() {
    if (INSTANCE != null) {
      throw new IllegalStateException("Already instantiated!");
    }
  }

  public static SimpleSingleton getInstance() {
    return INSTANCE;
  }

  public Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("Cannot clone this instance!");
  }

}
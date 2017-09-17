package com.fidelius.singleton;

public final class LazySingleton {

  private static class LazySingletonLoader {
    private static final LazySingleton INSTANCE = new LazySingleton();
  }

  private LazySingleton() {
    if (LazySingletonLoader.INSTANCE != null) {
      throw new IllegalStateException("Already instantiated!");
    }
  }

  public static LazySingleton getInstance() {
    return LazySingletonLoader.INSTANCE;
  }

}
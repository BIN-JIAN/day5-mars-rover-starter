package com.afs.tdd;

public enum Direction {
  North,
  South,
  East,
  West;

  public Direction turnLeft() {
    switch (this) {
      case North: return West;
      case West: return South;
      case South: return East;
      case East: return North;
      default: throw new IllegalStateException("Unknown direction: " + this);
    }
  }

  public Direction turnRight() {
    switch (this) {
      case North: return East;
      case East: return South;
      case South: return West;
      case West: return North;
      default: throw new IllegalStateException("Unknown direction: " + this);
    }
  }
}

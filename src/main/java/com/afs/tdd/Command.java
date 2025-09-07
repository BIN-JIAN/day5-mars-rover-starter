package com.afs.tdd;

public enum Command {
  MOVE,//Move
  TURN_LEFT,//Turn Left
  TURN_RIGHT,//Turn Right
  MOVE_BACK;//Move Back

  public static Command fromChar(char commandChar) {
    switch (Character.toUpperCase(commandChar)) {
      case 'M':
        return MOVE;
      case 'L':
        return TURN_LEFT;
      case 'R':
        return TURN_RIGHT;
      case 'B':
        return MOVE_BACK;
      default:
        throw new IllegalArgumentException("Unknown command: " + commandChar);
    }
  }
}

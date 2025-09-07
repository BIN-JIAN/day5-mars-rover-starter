package com.afs.tdd;

public class MarsRover {

  private final Location location;
  private static final int MOVE_DISTANCE = 1;

  public MarsRover(Location location) {
    this.location = location;
  }

  public void executeCommand(Command command) {
    switch (command) {
      case MOVE:
        move(MOVE_DISTANCE);
        break;
      case TURN_LEFT:
        location.setDirection(location.getDirection().turnLeft());
        break;
      case TURN_RIGHT:
        location.setDirection(location.getDirection().turnRight());
        break;
      case MOVE_BACK:
        move(-MOVE_DISTANCE);
        break;
    }
  }

  public void executeCommands(String commands) {
    if (commands == null || commands.isEmpty()) {
      return;
    }

    for (char commandChar : commands.toCharArray()) {
      Command command = Command.fromChar(commandChar);
      executeCommand(command);
    }
  }

  private void move(int distance) {
    location.getDirection().move(location, distance);
  }

  public Location getLocation() {
    return location;
  }
}

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
        move();
        break;
      case TURN_LEFT:
        location.setDirection(location.getDirection().turnLeft());
        break;
      case TURN_RIGHT:
        location.setDirection(location.getDirection().turnRight());
        break;
      case MOVE_BACK:
        moveBack();
        break;
    }
  }

  private void moveBack() {
    switch (location.getDirection()){
      case North:
        moveBackNorth();
        break;
      case South:
        moveBackSouth();
        break;
      case East:
        moveBackEast();
        break;
      case West:
        moveBackWest();
        break;
    }
  }



  private void move() {
    switch (location.getDirection()) {
      case North:
        moveNorth();
        break;
      case South:
        moveSouth();
        break;
      case East:
        moveEast();
        break;
      case West:
        moveWest();
        break;
    }
  }

  private void moveNorth() {
    location.setLocationY(location.getLocationY() + MOVE_DISTANCE);
  }
  private void moveSouth() {
    location.setLocationY(location.getLocationY() - MOVE_DISTANCE);
  }

  private void moveEast() {
    location.setLocationX(location.getLocationX() + MOVE_DISTANCE);
  }

  private void moveWest() {
    location.setLocationX(location.getLocationX() - MOVE_DISTANCE);
  }

  public Location getLocation() {
    return location;
  }

  private void moveBackEast() {
    location.setLocationX(location.getLocationX() - MOVE_DISTANCE);
  }

  private void moveBackWest() {
    location.setLocationX(location.getLocationX() + MOVE_DISTANCE);

  }

  private void moveBackNorth() {
    location.setLocationY(location.getLocationY() - MOVE_DISTANCE);
  }

  private void moveBackSouth() {
    location.setLocationY(location.getLocationY() + MOVE_DISTANCE);
  }
}

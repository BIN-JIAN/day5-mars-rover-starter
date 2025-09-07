package com.afs.tdd;

import static com.afs.tdd.Direction.East;
import static com.afs.tdd.Direction.North;
import static com.afs.tdd.Direction.South;
import static com.afs.tdd.Direction.West;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MarsRoverTest {

  @Test
  void should_move_direction_N_when_executeCommand_given_01() {
    //Given
    Location location = new Location(0, 0, Direction.North);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.MOVE);
    //Then
    assertEquals(1, marsRover.getLocation().getLocationY());
  }

  @Test
  void should_move_direction_S_when_executeCommand_given_0minus1() {
    //Given
    Location location = new Location(0, 0, South);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.MOVE);
    //Then
    assertEquals(-1, marsRover.getLocation().getLocationY());
  }

  @Test
  void should_move_direction_E_when_executeCommand_given_10() {
    //Given
    Location location = new Location(0, 0, East);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.MOVE);
    //Then
    assertEquals(1, marsRover.getLocation().getLocationX());
  }

  @Test
  void should_move_direction_E_when_executeCommand_given_minus10() {
    //Given
    Location location = new Location(0, 0, West);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.MOVE);
    //Then
    assertEquals(-1, marsRover.getLocation().getLocationX());
  }

  @Test
  void should_turnLeft_direction_W_when_executeCommand_given_direction_S() {
    //Given
    Location location = new Location(0, 0, West);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.TURN_LEFT);
    //Then
    assertEquals(South, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turnLeft_direction_S_when_executeCommand_given_direction_E() {
    //Given
    Location location = new Location(0, 0, South);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.TURN_LEFT);
    //Then
    assertEquals(East, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turnLeft_direction_E_when_executeCommand_given_direction_N() {
    //Given
    Location location = new Location(0, 0, East);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.TURN_LEFT);
    //Then
    assertEquals(North, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turnLeft_direction_N_when_executeCommand_given_direction_W() {
    //Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.TURN_LEFT);
    //Then
    assertEquals(West, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turnRight_direction_N_when_executeCommand_given_direction_E() {
    //Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.TURN_RIGHT);
    //Then
    assertEquals(East, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turnRight_direction_E_when_executeCommand_given_direction_S() {
    //Given
    Location location = new Location(0, 0, East);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.TURN_RIGHT);
    //Then
    assertEquals(South, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turnRight_direction_S_when_executeCommand_given_direction_W() {
    //Given
    Location location = new Location(0, 0, South);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.TURN_RIGHT);
    //Then
    assertEquals(West, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turnRight_direction_W_when_executeCommand_given_direction_N() {
    //Given
    Location location = new Location(0, 0, West);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.TURN_RIGHT);
    //Then
    assertEquals(North, marsRover.getLocation().getDirection());
  }
}

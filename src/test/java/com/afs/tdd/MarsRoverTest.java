package com.afs.tdd;

import static com.afs.tdd.Direction.E;
import static com.afs.tdd.Direction.N;
import static com.afs.tdd.Direction.S;
import static com.afs.tdd.Direction.W;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MarsRoverTest {

  @Test
  void should_move_direction_N_when_executeCommand_given_01() {
    //Given
    Location location = new Location(0, 0, Direction.N);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.M);
    //Then
    assertEquals(1, marsRover.getLocation().getLocationY());

  }

  @Test
  void should_move_direction_S_when_executeCommand_given_0minus1() {
    //Given
    Location location = new Location(0, 0, S);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.M);
    //Then
    assertEquals(-1, marsRover.getLocation().getLocationY());
  }

  @Test
  void should_move_direction_E_when_executeCommand_given_10() {
    //Given
    Location location = new Location(0, 0, E);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.M);
    //Then
    assertEquals(1, marsRover.getLocation().getLocationX());
  }
  @Test
  void should_turnLeft_direction_W_when_executeCommand_given_direction_S() {
    //Given
    Location location = new Location(0, 0, W);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.L);
    //Then
    assertEquals(S, marsRover.getLocation().getDirection());
  }
  @Test
  void should_turnLeft_direction_S_when_executeCommand_given_direction_E() {
    //Given
    Location location = new Location(0, 0, W);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.L);
    //Then
    assertEquals(E, marsRover.getLocation().getDirection());
  }
  @Test
  void should_turnLeft_direction_E_when_executeCommand_given_direction_N() {
    //Given
    Location location = new Location(0, 0, W);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.L);
    //Then
    assertEquals(N, marsRover.getLocation().getDirection());
  }
  @Test
  void should_turnLeft_direction_N_when_executeCommand_given_direction_W() {
    //Given
    Location location = new Location(0, 0, W);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.L);
    //Then
    assertEquals(W, marsRover.getLocation().getDirection());
  }
}

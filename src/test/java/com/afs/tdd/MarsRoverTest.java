package com.afs.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MarsRoverTest {
  @Test
  void should_move_direction_N_when_executeCommand_given_1() {
    //Given
    Location location = new Location(0,0,Direction.N);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.M);
    //Then
    assertEquals(1, marsRover.getLocation().getLocationY());

  }
  @Test
  void should_move_direction_S_when_executeCommand_given_minus1() {
    //Given
    Location location = new Location(0,0,Direction.S);
    MarsRover marsRover = new MarsRover(location);
    //When
    marsRover.executeCommand(Command.M);
    //Then
    assertEquals(-1, marsRover.getLocation().getLocationY());

  }
}

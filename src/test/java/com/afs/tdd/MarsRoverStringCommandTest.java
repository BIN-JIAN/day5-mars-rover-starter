package com.afs.tdd;

import static com.afs.tdd.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarsRoverStringCommandTest {

  @Test
  void should_move_forward_when_executeCommands_given_M() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("M");

    // Then
    assertEquals(0, marsRover.getLocation().getLocationX());
    assertEquals(1, marsRover.getLocation().getLocationY());
    assertEquals(North, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turn_left_when_executeCommands_given_L() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("L");

    // Then
    assertEquals(0, marsRover.getLocation().getLocationX());
    assertEquals(0, marsRover.getLocation().getLocationY());
    assertEquals(West, marsRover.getLocation().getDirection());
  }

  @Test
  void should_turn_right_when_executeCommands_given_R() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("R");

    // Then
    assertEquals(0, marsRover.getLocation().getLocationX());
    assertEquals(0, marsRover.getLocation().getLocationY());
    assertEquals(East, marsRover.getLocation().getDirection());
  }

  @Test
  void should_move_back_when_executeCommands_given_B() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("B");

    // Then
    assertEquals(0, marsRover.getLocation().getLocationX());
    assertEquals(-1, marsRover.getLocation().getLocationY());
    assertEquals(North, marsRover.getLocation().getDirection());
  }

  @Test
  void should_execute_multiple_commands_when_executeCommands_given_MLRB() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("MLRB");

    // Then
    assertEquals(0, marsRover.getLocation().getLocationX());
    assertEquals(0, marsRover.getLocation().getLocationY());
    assertEquals(North, marsRover.getLocation().getDirection());
  }

  @Test
  void should_move_in_square_pattern_when_executeCommands_given_MRMLMLM() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("MRMLMLM");

    // Then
    assertEquals(0, marsRover.getLocation().getLocationX());
    assertEquals(1, marsRover.getLocation().getLocationY());
    assertEquals(North, marsRover.getLocation().getDirection());
  }

  @Test
  void should_handle_lowercase_commands_when_executeCommands_given_mlrb() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("mlrb");

    // Then
    assertEquals(0, marsRover.getLocation().getLocationX());
    assertEquals(0, marsRover.getLocation().getLocationY());
    assertEquals(North, marsRover.getLocation().getDirection());
  }

  @Test
  void should_do_nothing_when_executeCommands_given_empty_string() {
    // Given
    Location location = new Location(5, 3, East);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("");

    // Then
    assertEquals(5, marsRover.getLocation().getLocationX());
    assertEquals(3, marsRover.getLocation().getLocationY());
    assertEquals(East, marsRover.getLocation().getDirection());
  }

  @Test
  void should_do_nothing_when_executeCommands_given_null() {
    // Given
    Location location = new Location(5, 3, East);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands(null);

    // Then
    assertEquals(5, marsRover.getLocation().getLocationX());
    assertEquals(3, marsRover.getLocation().getLocationY());
    assertEquals(East, marsRover.getLocation().getDirection());
  }

  @Test
  void should_throw_exception_when_executeCommands_given_invalid_command() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When & Then
    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> marsRover.executeCommands("MXL")
    );
    assertEquals("Unknown command: X", exception.getMessage());
  }

  @Test
  void should_execute_complex_sequence_when_executeCommands_given_MMLRRMBLLLM() {
    // Given
    Location location = new Location(0, 0, North);
    MarsRover marsRover = new MarsRover(location);

    // When
    marsRover.executeCommands("MMLRRMBLLLM");

    // Then
    // M: (0,1,N) -> M: (0,2,N) -> L: (0,2,W) -> R: (0,2,N) -> R: (0,2,E)
    // -> M: (1,2,E) -> B: (0,2,E) -> L: (0,2,N) -> L: (0,2,W) -> L: (0,2,S) -> M: (0,1,S)
    assertEquals(0, marsRover.getLocation().getLocationX());
    assertEquals(1, marsRover.getLocation().getLocationY());
    assertEquals(South, marsRover.getLocation().getDirection());
  }
}

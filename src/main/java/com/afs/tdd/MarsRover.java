package com.afs.tdd;

public class MarsRover {
  
  private Location location ;
  public MarsRover(Location location) {
    this.location = location;
  }
  public void executeCommand (Command m){
    if(m==Command.M && location.getDirection() == Direction.N){
      location.setLocationY(location.getLocationY()+1);
    }
  }

  public Location getLocation() {
    return location;
  }
}

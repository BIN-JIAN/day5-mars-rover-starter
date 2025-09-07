package com.afs.tdd;

public class MarsRover {
  
  private Location location ;
  public MarsRover(Location location) {
    this.location = location;
  }
  public void executeCommand (Command m){
    if(m==Command.M && location.getDirection() == Direction.N){
      location.setLocationY(location.getLocationY()+1);
    }else if(m==Command.M && location.getDirection() == Direction.S){
      location.setLocationY(location.getLocationY()-1);
    }else if(m==Command.M && location.getDirection() == Direction.E){
      location.setLocationX(location.getLocationX()+1);
    }else if(m==Command.M && location.getDirection() == Direction.W){
      location.setLocationX(location.getLocationX()-1);
  }}

  public Location getLocation() {
    return location;
  }
}

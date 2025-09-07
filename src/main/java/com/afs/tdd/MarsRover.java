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
    }else if(m==Command.M && location.getDirection() == Direction.W) {
      location.setLocationX(location.getLocationX() - 1);
    } else if (m==Command.L) {
      if(location.getDirection() == Direction.N){
        location = new Location(location.getLocationX(),location.getLocationY(),Direction.W);
      }else if(location.getDirection() == Direction.W){
        location = new Location(location.getLocationX(),location.getLocationY(),Direction.S);
      }else if(location.getDirection() == Direction.S){
        location = new Location(location.getLocationX(),location.getLocationY(),Direction.E);
      }else if(location.getDirection() == Direction.E){
        location = new Location(location.getLocationX(),location.getLocationY(),Direction.N);
      }
    } else if (m==Command.R) {
      if(location.getDirection() == Direction.N){
        location = new Location(location.getLocationX(),location.getLocationY(),Direction.E);
      }else if(location.getDirection() == Direction.E){
        location = new Location(location.getLocationX(),location.getLocationY(),Direction.S);
      }else if(location.getDirection() == Direction.S){
        location = new Location(location.getLocationX(),location.getLocationY(),Direction.W);
      }else if(location.getDirection() == Direction.W){
        location = new Location(location.getLocationX(),location.getLocationY(),Direction.N);
      }
    }
  }

  public Location getLocation() {
    return location;
  }
}

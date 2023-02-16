package maze.builders;

import maze.mazeobjects.Direction;
import maze.mazeobjects.Door;
import maze.mazeobjects.MapSite;
import maze.mazeobjects.Maze;
import maze.mazeobjects.Room;
import maze.mazeobjects.Wall;

public class StandardMazeBuilder extends MazeBuilder {
	
	public StandardMazeBuilder() {
		super();
	}
	
	@Override
	void buildMaze() {
		this.currentMaze=new Maze();
	}

	@Override
	void buildRoom(int num) {
		if(currentMaze.getRoom(num)==null) {
			Room room=new Room(num);
			room.setSite(Direction.North, new Wall());
			room.setSite(Direction.South, new Wall());
			room.setSite(Direction.East, new Wall());
			room.setSite(Direction.West, new Wall());
			currentMaze.addRoom(room);
		}
	}

	@Override
	void buildDoor(int room1num, int room2num) {
		Room room1=currentMaze.getRoom(room1num);
		Room room2=currentMaze.getRoom(room2num);
		
		if(room1!=null && room2!=null) {
			Door door=new Door(room1, room2);
			
			Direction room1dir=commonWall(room1, room2);
			Direction room2dir=commonWall(room2, room1);
			if(room1dir!=null) {
				door.setRoom1(room1);
				door.setRoom2(room2);
				
				room1.setSite(room1dir, door);
				room2.setSite(room2dir, door);
			}
		}	
	}
	
	@Override
	public Direction commonWall(Room room1, Room room2) {
		MapSite[] sides=room1.getSides();
		for(int i=0; i<sides.length; i++) {
			if(sides[i].equals(room2)){
				return Direction.values()[i];
			}
		}
		return null;
	}

	@Override
	void buildCommonWall(int room1Num, int room2Num, Direction room1dir) {
			currentMaze.getRoom(room1Num).setSite(room1dir, currentMaze.getRoom(room2Num));
			currentMaze.getRoom(room2Num).setSite(Direction.values()[room1dir.ordinal()+2], currentMaze.getRoom(room1Num));
	}

}

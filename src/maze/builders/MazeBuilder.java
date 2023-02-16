package maze.builders;

import maze.mazeobjects.Direction;
import maze.mazeobjects.Maze;
import maze.mazeobjects.Room;

public abstract class MazeBuilder {
	
	protected Maze currentMaze;
	
	abstract void buildMaze();
	abstract void buildRoom(int roomNum);
	abstract void buildCommonWall(int room1Num, int room2Num, Direction room1dir);
	abstract void buildDoor(int room1num, int room2num);
	
	protected MazeBuilder() {
		this.currentMaze=new Maze();
	}

	protected Maze getMaze() {
		return this.currentMaze;
	}
	
	public abstract Direction commonWall(Room room1, Room room2);
}

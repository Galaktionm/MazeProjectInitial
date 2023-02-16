package maze.factories;
import maze.mazeobjects.Door;
import maze.mazeobjects.Maze;
import maze.mazeobjects.Room;
import maze.mazeobjects.Wall;

public class DefaultMazeFactory implements MazeFactory {

	@Override
	public Maze MakeMaze() {
		Maze maze=new Maze();
		return maze;
	}

	@Override
	public Wall MakeWall() {
		Wall wall=new Wall();
		return wall;
	}

	@Override
	public Room MakeRoom(int num) {
		Room room=new Room(num);
		return room;
	}

	@Override
	public Door MakeDoor(Room room1, Room room2) {
		Door door=new Door(room1, room2);
		return door;
	}

}

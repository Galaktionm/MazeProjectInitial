package maze.factories;
import maze.mazeobjects.Door;
import maze.mazeobjects.Maze;
import maze.mazeobjects.Room;
import maze.mazeobjects.Wall;

public interface MazeFactory {
	
	Maze MakeMaze();
	Wall MakeWall();
	Room MakeRoom(int num);
	Door MakeDoor(Room room1, Room room2);

}

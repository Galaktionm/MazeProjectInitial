package maze.mazeobjects;
import java.util.ArrayList;
import java.util.List;

public class Maze {
	
	private List<Room> rooms=new ArrayList<>();
	
	public Maze() {
		
	}
	
	public Room getRoom(int num) {
		return rooms.get(num);
	}
	
	public void addRoom(Room room) {
		rooms.set(room.getRoomNum(), room);
	}

}

package maze.mazeobjects;

public class Door extends MapSite {
	
	private Room room1;
	private Room room2;
	private boolean isOpen;
	
	public Door(Room room1, Room room2) {
		this.room1=room1;
		this.room2=room2;
	}
	
	public Room getRoom1() {
		return this.room1;
	}
	
	public void setRoom1(Room room1) {
		this.room1=room1;
	}
	
	public Room getRoom2() {
		return this.room2;
	}
	
	public void setRoom2(Room room2) {
		this.room2=room2;
	}
	
	public boolean isOpen() {
		return this.isOpen;
	}
	
	public void setOpen(boolean open) {
		this.isOpen=open;
	}

}

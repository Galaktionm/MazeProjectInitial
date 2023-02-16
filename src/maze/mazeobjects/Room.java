package maze.mazeobjects;
public class Room extends MapSite {
	
	private int roomNum;
	private MapSite[] sides=new MapSite[4];
	
	public Room(int roomNum) {
		this.roomNum=roomNum;
	}
	
	public int getRoomNum() {
		return this.roomNum;
	}
	
	public void setRoomNum(int roomNum) {
		this.roomNum=roomNum;
	}
	
	public MapSite[] getSides() {
		return this.sides;
	}
	
	public MapSite getSite(Direction dir) {
		return sides[dir.ordinal()];
	}
	
	public void setSite(Direction dir, MapSite site) {
		sides[dir.ordinal()]=site;
	}
	
	
	

}

package session11_abstraction.challenges.challengeseven.home;

public abstract class Room {

    private String roomName;

    protected Room(String roomName){
        this.roomName = roomName;
    }

    public String getRoomName(){
        return roomName;
    }

}

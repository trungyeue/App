package com.example.appduan.mode;

public class InHome {
    private String roomType;
    private String romName;
    private String guestName;
    private  String roomRate;

    public InHome(String roomType, String romName, String guestName, String roomRate) {
        this.roomType = roomType;
        this.romName = romName;
        this.guestName = guestName;
        this.roomRate = roomRate;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRomName() {
        return romName;
    }

    public void setRomName(String romName) {
        this.romName = romName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(String roomRate) {
        this.roomRate = roomRate;
    }
}

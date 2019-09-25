package com.example.appduan.mode;

public class InHome {
    private String roomType;
    private String romName;
    private String guestName;
    private  String roomRate;
    private String arrival;
    private  String departure;
    private  String nights;
    private  String roomCharge;
    private String folioNo;
    private  String source;

    public InHome(String roomType, String romName, String guestName, String roomRate, String arrival, String departure, String nights, String roomCharge,String folioNo,String source ) {
        this.roomType = roomType;
        this.romName = romName;
        this.guestName = guestName;
        this.roomRate = roomRate;
        this.arrival = arrival;
        this.departure = departure;
        this.nights = nights;
        this.roomCharge = roomCharge;
        this.folioNo=folioNo;
        this.source=source;

    }

    public String getfolioNo() {
        return folioNo;
    }

    public void setfolioNo(String folioNo) {
        this.folioNo = folioNo;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getNights() {
        return nights;
    }

    public void setNights(String nights) {
        this.nights = nights;
    }

    public String getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(String roomCharge) {
        this.roomCharge = roomCharge;
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

    public String getFolioNo() {
        return folioNo;
    }

    public void setFolioNo(String folioNo) {
        this.folioNo = folioNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

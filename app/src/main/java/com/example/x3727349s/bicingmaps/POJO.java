package com.example.x3727349s.bicingmaps;

/**
 * Created by x3727349s on 31/01/17.
 */

public class POJO {

    private int ids;
    private String type;
    private double latitude;
    private double longitude;
    private String streetName;
    private int streetNumber;
    private int altitude;
    private int slots;
    private int bikes;
    private String status;
    private String nearbyStation;

    public int getIds() {return ids;}
    public String getType() {return type;}
    public double getLatitude() {return latitude;}
    public double getLongitude() {return longitude;}
    public String getStreetName() {return streetName;}
    public int getStreetNumber() {return streetNumber;}
    public int getAltitude() {return altitude;}
    public int getSlots() {return slots;}
    public int getBikes() {return bikes;}
    public String getStatus() {return status;}
    public String getNearbyStation() {return nearbyStation;}

    public void setIds(int id) {this.ids = id;}
    public void setType(String type) {this.type = type;}
    public void setLatitude(double latitude) {this.latitude = latitude;}
    public void setLongitude(double longitude) {this.longitude = longitude;}
    public void setStreetName(String streetName) {this.streetName = streetName;}
    public void setStreetNumber(int streetNumber) {this.streetNumber = streetNumber;}
    public void setAltitude(int altitude) {this.altitude = altitude;}
    public void setSlots(int slots) {this.slots = slots;}
    public void setBikes(int bikes) {this.bikes = bikes;}
    public void setStatus(String status) {this.status = status;}
    public void setNearbyStation(String nearbyStation) {this.nearbyStation = nearbyStation;}

    @Override
    public String toString() {
        return "POJO{" +
                "id=" + ids +
                ", type='" + type + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", altitude=" + altitude +
                ", slots=" + slots +
                ", bikes=" + bikes +
                ", status='" + status + '\'' +
                ", nearbyStation='" + nearbyStation + '\'' +
                '}';
    }
}

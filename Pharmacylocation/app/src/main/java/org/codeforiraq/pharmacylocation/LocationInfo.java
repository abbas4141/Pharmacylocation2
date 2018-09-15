package org.codeforiraq.pharmacylocation;

/**
 * Created by Abbas on 02/09/2018.
 */

public class LocationInfo{
    private  int ID;
    private  String PlaceName;
    private  String PlaceCity;
    private String longitude;
    private String latitude;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LocationInfo() {
    }

    public LocationInfo(String placeName, String placeCity, String longitude,String latitude) {

        PlaceName = placeName;
        PlaceCity = placeCity;
        this. longitude = longitude;
        this.latitude=latitude;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String placeName) {
        PlaceName = placeName;
    }

    public String getPlaceCity() {
        return PlaceCity;
    }

    public void setPlaceCity(String placeCity) {
        PlaceCity = placeCity;
    }

}

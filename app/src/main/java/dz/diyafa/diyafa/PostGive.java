package dz.diyafa.diyafa;


import java.util.ArrayList;
import java.util.Date;

public class PostGive {
    private String userName;
    private String phone;
    private String foodName;
    private String country;
    private String region;
    private Date PostGiveDate;
    private String quantity;
    private int postionX;
    private int postionY;
    private String mapUrl;
    private String minutes;

    public String getMinutes() {
        return minutes;
    }
    /*public static final ArrayList<PostGive> PostGives= new ArrayList<>()
            new PostGive("Chorba", "Algeria,Algiers", "15min", "3people"),
            new PostGive("Egyptian food", "Egypt,Cairo", "15min", "2people"),
            new PostGive("REPAT", "Morocco,Casablanca", "50min", "3people"),
            new PostGive("Chorba", "Algeria,Algiers", "30min", "1person"),
            new PostGive("Chorba", "Algeria,Algiers", "15min", "3people")
    };*/

    public PostGive(String foodName,String country,String region,String minutes,String quantity
                       ){
        this.foodName=foodName;
        this.country=country;
        this.minutes=minutes;
        this.quantity=quantity;
        this.region=region;

    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public Date getPostGiveDate() {
        return PostGiveDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public int getPostionX() {
        return postionX;
    }

    public int getPostionY() {
        return postionY;
    }

    public String getMapUrl() {
        return mapUrl;
    }




}

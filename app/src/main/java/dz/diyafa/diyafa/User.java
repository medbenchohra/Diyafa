package dz.diyafa.diyafa;

import java.util.HashMap;
import static dz.diyafa.diyafa.Constants.*;

public class User {
    private String id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private HashMap<String, Boolean> medicalInformation = new HashMap<>();
    private String email;
    private String country;
    private String region;
    private String phone;
    private String residence;
    private String residenceCoor;

    {
        medicalInformation.put(DIABETES,false);
        medicalInformation.put(ALLERGIES,false);
        medicalInformation.put(BLOOD_PRESSURE,false);
    }

    public User() {}

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String password, String firstName,
                String lastName, HashMap<String, Boolean> medicalInformation,
                String email, String country, String region, String phone,
                String residence) {

        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.medicalInformation = medicalInformation;
        this.email = email;
        this.country = country;
        this.region = region;
        this.phone = phone;
        this.residence = residence;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public HashMap<String, Boolean> getMedicalInformation() {
        return medicalInformation;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getPhone() {
        return phone;
    }

    public String getResidence() {
        return residence;
    }

    public String getResidenceCoor() {
        return residenceCoor;
    }
}

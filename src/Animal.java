public class Animal {
    private String designation;
    private String locationOfLiviningPlace;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocationOfLiviningPlace() {
        return locationOfLiviningPlace;
    }

    public void setLocationOfLiviningPlace(String locationOfLiviningPlace) {
        this.locationOfLiviningPlace = locationOfLiviningPlace;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "designation is: " + designation + '\'' +
                "location of livining place is:" + locationOfLiviningPlace;
    }

    public Animal(String designation, String locationOfLiviningPlace) {
        this.designation = designation;
        this.locationOfLiviningPlace = locationOfLiviningPlace;


    }
}

public class Boy {
    private String name;
    private String surname;
    private int yearOfBirth;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Boy: " +
                "name: " + name + '\'' +
                "surname: " + surname + '\'' +
                "yearOfBirth: " + yearOfBirth +
                "gender: " + gender;
    }

    public Boy(String name, String surname, int yearOfBirth, String gender) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;

    }
}

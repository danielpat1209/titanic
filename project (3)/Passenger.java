

public class Passenger {
    private int passengerId;
    private int survived;
    private int pclass;
    private String name;
    private String sex;
    private int age;
    private int sibSp;
    private int parch;
    private String ticket;
    private double fare;
    private String cabin;
    private String embarked;

    public Passenger(int passengerId, int survived, int pclass, String name, String sex, int age, int sibSp, int parch, String ticket, double fare, String cabin, String embarked) {
        this.passengerId = passengerId;
        this.survived = survived;
        this.pclass = pclass;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibSp = sibSp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public int getSurvived() {
        return survived;
    }

    public int getPclass() {
        return pclass;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getSibSp() {
        return sibSp;
    }

    public int getParch() {
        return parch;
    }

    public String getTicket() {
        return ticket;
    }

    public double getFare() {
        return fare;
    }

    public String getCabin() {
        return cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public String getFormattedName() {
        String[] parts = name.split(", ");
        if (parts.length < 2) {
            return name;
        }
        String lastName = parts[0];
        String[] firstNameParts = parts[1].split(" ");
        String firstName = firstNameParts[1];
        return firstName + " " + lastName;
    }
}





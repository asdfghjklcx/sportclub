package kz.enu.rest.sportclub.model;

public class Player {
    private String name;
    private int age;
    private String clubName;

    public Player() {}

    public Player(String name, int age, String clubName) {
        this.name = name;
        this.age = age;
        this.clubName = clubName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}

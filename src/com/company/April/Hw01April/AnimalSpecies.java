package com.company.April.Hw01April;

public class AnimalSpecies {

    @Habitat("water")
    private String fish;
    @Habitat("air")
    private String bird;
    @Habitat("land")
    private String mammal;
    private String bug;

    public AnimalSpecies(String fish, String bird, String mammal, String bug) {
        this.fish = fish;
        this.bird = bird;
        this.mammal = mammal;
        this.bug = bug;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public String getMammal() {
        return mammal;
    }

    public void setMammal(String mammal) {
        this.mammal = mammal;
    }

    public String getBug() {
        return bug;
    }

    public void setBug(String bug) {
        this.bug = bug;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "fish='" + fish + '\'' +
                ", bird='" + bird + '\'' +
                ", mammal='" + mammal + '\'' +
                ", bug='" + bug + '\'' +
                '}';
    }
}

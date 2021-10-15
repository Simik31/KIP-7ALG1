package cz.osu.student.r19584.kip7alg1.tut6.task_1;

public class Head {
    private String hairColor;
    private String eyeColor;
    private NoseType nose;

    public Head(String hairColor, String eyeColor, NoseType nose) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.nose = nose;
    }

    public Head() {
        hairColor = "brown";
        eyeColor = "green";
        nose = NoseType.VOLDEMORT;
    }

    public void setHairColor(String color) {
        this.hairColor = color;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setEyeColor(String color) {
        this.eyeColor = color;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public NoseType getNose() {
        return this.nose;
    }
}

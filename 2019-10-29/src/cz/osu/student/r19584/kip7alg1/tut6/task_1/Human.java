package cz.osu.student.r19584.kip7alg1.tut6.task_1;

public class Human {
    private String name;
    private String surname;
    private String skinColor;
    private int age;
    private Lang language;
    public Head head;
    private Limb leftArm;
    private Limb rightArm;
    private Limb leftLeg;
    private Limb rightLeg;

    public Human() {
        name = "N/A";
        surname = "N/A";
        skinColor = "normal";
        language = Lang.UNKNOWN;
        head = new Head();
        leftArm = new Limb();
        rightArm = new Limb();
        leftLeg = new Limb();
        rightLeg = new Limb();
    }

    public Human(String name, String surname, String skinColor, int age, Lang language, Head head, Limb leftArm,
            Limb rightArm, Limb leftLeg, Limb rightLeg) {
        this.name = name;
        this.surname = surname;
        this.skinColor = skinColor;
        this.age = age;
        this.language = language;
        this.head = head;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public int getAge() {
        return age;
    }

    public Lang getLanguage() {
        return language;
    }

    public Head getHead() {
        return head;
    }

    public Limb getLeftArm() {
        return leftArm;
    }

    public Limb getRightArm() {
        return rightArm;
    }

    public Limb getLeftLeg() {
        return leftLeg;
    }

    public Limb getRightLeg() {
        return rightLeg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLanguage(Lang language) {
        this.language = language;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeftArm(Limb leftArm) {
        this.leftArm = leftArm;
    }

    public void setRightArm(Limb rightArm) {
        this.rightArm = rightArm;
    }

    public void setLeftLeg(Limb leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(Limb rightLeg) {
        this.rightLeg = rightLeg;
    }

    public String hello() {
        String ret;
        switch (language) {
            case CZECH:
                ret = "Ahoj";
                break;
            case ENGLISH:
                ret = "Hello";
                break;
            case GERMAN:
                ret = "Gutten Tag";
                break;
            case UNKNOWN:
            default:
                ret = "---";
                break;
        }
        return ret;
    }

}

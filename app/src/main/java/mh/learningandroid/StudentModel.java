package mh.learningandroid;

public class StudentModel {
    private String name;
    private String family;

    public StudentModel(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String GetNamne(){
        return this.name;
    }

    public String GetFamily(){
        return this.family;
    }
}

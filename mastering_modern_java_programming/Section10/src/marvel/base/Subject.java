package marvel.base;

public abstract class Subject {

    public Integer marks;
    public static final Integer MIN_MARKS = 80;

    // concrete methods
    public Integer totalMarks() {
        return 100;
    };

    public abstract void teach();

}

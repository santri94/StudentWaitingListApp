package database.model;

public class Note {
    public static final String TABLE_NAME = "waitingList";

    public static final String COLUMN_ID = "studentID";
    public static final String COLUMN_STUDENT = "studentName";
    public static final String COLUMN_CLASS = "course";
    public static final String COLUMN_PRIORITY = "priority";

    private int id;
    private String name;
    private String course;
    private int priority;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_STUDENT + " TEXT,"
                    + COLUMN_CLASS + " TEXT,"
                    + COLUMN_PRIORITY + " INT"
                    + ");";

    public Note() {
    }

    public Note(int id, String name, String course, int priority ) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.priority = priority;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}

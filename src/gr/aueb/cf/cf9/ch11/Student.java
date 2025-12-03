package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean.
 * Data class that has
 * -private fields
 * -Default constructor
 * -getters and setters with conventions
 */

public class Student {
    private static int studentsCount = 0;

    // static block
    static {
        studentsCount = 0;
    }

    private int id;
    private String firstname;
    private String lastname;

    // Default constructor
    public Student(){
        studentsCount++;

    }

    //Overloaded constructor
    public Student(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Public Getters and Setters
    public int getId(){             //convention: getX
        return id;
    }

    public void setId(int id){      //convention: setX
        this.id = id;
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;
    }

    public static int getStudentsCount(){
        return studentsCount;
    }
}

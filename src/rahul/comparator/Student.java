package rahul.comparator;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marksObtained;
    Student(String name,int rollNo,int marksObtained) {
        this.name = name;
        this.rollNo = rollNo;
        this.marksObtained = marksObtained;
    }
    @Override
    public String toString() {
        return "Roll No. " + this.rollNo  + " "  + this.name + " has obtained " + this.marksObtained + " marks\n";
    }
    @Override
    public int compareTo(Student o) {
        if(this.marksObtained > o.marksObtained) return 1;
        else if(this.marksObtained < o.marksObtained) return -1;
        else return this.name.compareTo(o.name);
     }
}

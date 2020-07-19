
public class Student implements Comparable<Student> {

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fname='" + fname + '\'' + ", cgpa=" + cgpa + '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        {
            if (this.cgpa == anotherStudent.cgpa) {
                return 0;
            } else if (this.cgpa < anotherStudent.cgpa) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(33, "Rumpa", 3.68));
        students.add(new Student(85, "Ashis", 3.85));
        students.add(new Student(56, "Samara", 3.75));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}




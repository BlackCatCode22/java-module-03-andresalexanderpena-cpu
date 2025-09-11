


public class App {
    public static void main(String[] args) {

        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halpert";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;

        System.out.println(myStudent.lastName);

    }
    }
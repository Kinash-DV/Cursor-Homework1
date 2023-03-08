package dv.kinash;

import java.util.Set;
import static dv.kinash.DrivingLicenseCategory.*;

public class App
{
    public static void main( String[] args )
    {
        AutoSchool mySchool = new AutoSchool("Auto+", Set.of(B, B1, C, C1));
        SchoolEnrollment enrollment = new SchoolEnrollment(mySchool);

        Student ivan = new Student("Ivan", 29);
        Student pavel = new Student("Pavel", 15);
        Student tomas = new Student("Tomas", 19);
        Student maria = new Student("Maria", 22);
        Student alex = new Student("Alex", 32);

        enrollment.EnrollStudent(ivan, B1);
        enrollment.EnrollStudent(pavel, B1);
        enrollment.EnrollStudent(tomas, C);
        enrollment.EnrollStudent(maria, B);
        enrollment.EnrollStudent(alex, D1);

        System.out.println(enrollment);
    }
}

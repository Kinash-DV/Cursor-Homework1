package dv.kinash;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SchoolEnrollment {
    final AutoSchool school;
    private List<EnrollmentRecord> enrolledStudents = new ArrayList<EnrollmentRecord>();

    public SchoolEnrollment(AutoSchool school) {
        this.school = school;
    }

    public boolean EnrollStudent(Student student, DrivingLicenseCategory category){
        if (student.getAge() >= category.getAllowedAge()
                && this.school.getAvailableDrivingLicenseCategories().contains(category)) {
            enrolledStudents.add(new EnrollmentRecord(student, category));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Enrollment records for school: %s\n\t%s",
                school.getName(),
                enrolledStudents.stream()
                        .map(n -> String.valueOf(n))
                        .collect(Collectors.joining("\n\t"))
        );
    }

    class EnrollmentRecord{
        Student student;
        DrivingLicenseCategory category;

        public EnrollmentRecord(Student student, DrivingLicenseCategory category) {
            this.student = student;
            this.category = category;
        }

        public Student getStudent() {
            return student;
        }

        public DrivingLicenseCategory getCategory() {
            return category;
        }

        @Override
        public String toString() {
            return String.format("%s [%s]", student.getName(), category);
        }
    }
}

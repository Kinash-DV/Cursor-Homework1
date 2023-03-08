package dv.kinash;

import java.util.Set;

public class AutoSchool {
    String name;
    Set<DrivingLicenseCategory> availableDrivingLicenseCategories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<DrivingLicenseCategory> getAvailableDrivingLicenseCategories() {
        return availableDrivingLicenseCategories;
    }

    public void setAvailableDrivingLicenseCategories(Set<DrivingLicenseCategory> availableDrivingLicenseCategories) {
        this.availableDrivingLicenseCategories = availableDrivingLicenseCategories;
    }

    public AutoSchool(String name, Set<DrivingLicenseCategory> availableDrivingLicenseCategories) {
        this.name = name;
        this.availableDrivingLicenseCategories = availableDrivingLicenseCategories;
    }

}

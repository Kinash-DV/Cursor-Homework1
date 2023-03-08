package dv.kinash;

public enum DrivingLicenseCategory {
    A(16),
    A1(16),
    B(18),
    B1(18),
    BE(19),
    C(18),
    C1(18),
    CE(19),
    D(21),
    D1(21);

    private final int allowedAge;

    DrivingLicenseCategory(int allowedAge) {
        this.allowedAge = allowedAge;
    }

    public int getAllowedAge() {
        return allowedAge;
    }
}

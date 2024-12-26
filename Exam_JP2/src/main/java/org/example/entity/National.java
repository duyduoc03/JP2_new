package org.example.entity;

public class National {
    private int NationalId;
    private String NationalName;

    public National() {
    }

    public National(String nationalName) {
        NationalName = nationalName;
    }

    public National(int nationalId, String nationalName) {
        NationalId = nationalId;
        NationalName = nationalName;
    }

    public int getNationalId() {
        return NationalId;
    }

    public void setNationalId(int nationalId) {
        NationalId = nationalId;
    }

    public String getNationalName() {
        return NationalName;
    }

    public void setNationalName(String nationalName) {
        NationalName = nationalName;
    }

    @Override
    public String toString() {
        return "National{" +
                "NationalId=" + NationalId +
                ", NationalName='" + NationalName + '\'' +
                '}';
    }
}

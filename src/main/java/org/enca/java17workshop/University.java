package org.enca.java17workshop;

import java.util.ArrayList;
import java.util.List;

public class University {

    public University(String universityName, String countryName, String cityName, String districtName,List<Program> universityPrograms) {
        this.universityName = universityName;
        this.countryName = countryName;
        this.cityName = cityName;
        this.districtName = districtName;
        this.universityPrograms=universityPrograms;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public List<Program> getUniversityPrograms() {
        return universityPrograms;
    }

    public void setUniversityPrograms(List<Program> universityPrograms) {
        this.universityPrograms = universityPrograms;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", universityPrograms=" + universityPrograms +
                '}';
    }

    private String universityName;
    private String countryName;
    private String cityName;
    private String districtName;
    private List<Program> universityPrograms;
}

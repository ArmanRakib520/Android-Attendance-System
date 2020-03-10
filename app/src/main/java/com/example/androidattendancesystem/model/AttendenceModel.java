package com.example.androidattendancesystem.model;

public class AttendenceModel {

    String Name;
    Integer Id;
    Boolean Present,Absenr,Sick,Late;

    public AttendenceModel(String name, Integer id, Boolean present, Boolean absenr, Boolean sick, Boolean late) {
        Name = name;
        Id = id;
        Present = present;
        Absenr = absenr;
        Sick = sick;
        Late = late;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Boolean getPresent() {
        return Present;
    }

    public void setPresent(Boolean present) {
        Present = present;
    }

    public Boolean getAbsenr() {
        return Absenr;
    }

    public void setAbsenr(Boolean absenr) {
        Absenr = absenr;
    }

    public Boolean getSick() {
        return Sick;
    }

    public void setSick(Boolean sick) {
        Sick = sick;
    }

    public Boolean getLate() {
        return Late;
    }

    public void setLate(Boolean late) {
        Late = late;
    }
}

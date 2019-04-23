package com.example.serviceconsumption.entity;

public class BumenDto {

    private Integer id;
    private String bname;
    private String bboss;
    private String file1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBboss() {
        return bboss;
    }

    public void setBboss(String bboss) {
        this.bboss = bboss;
    }

    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    @Override
    public String toString() {
        return "BumenMapper{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", bboss=" + bboss +
                ", file1=" + file1 +
                '}';
    }
}

package com.car.api.model;

public class User {
    private Integer uid;

    private String admins;

    private String pwds;

    private String teld;

    private Integer orgid;

    private Integer power;

    private String lastloginip;

    private String lastltime;

    private Integer ltimes;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAdmins() {
        return admins;
    }

    public void setAdmins(String admins) {
        this.admins = admins == null ? null : admins.trim();
    }

    public String getPwds() {
        return pwds;
    }

    public void setPwds(String pwds) {
        this.pwds = pwds == null ? null : pwds.trim();
    }

    public String getTeld() {
        return teld;
    }

    public void setTeld(String teld) {
        this.teld = teld == null ? null : teld.trim();
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public String getLastltime() {
        return lastltime;
    }

    public void setLastltime(String lastltime) {
        this.lastltime = lastltime == null ? null : lastltime.trim();
    }

    public Integer getLtimes() {
        return ltimes;
    }

    public void setLtimes(Integer ltimes) {
        this.ltimes = ltimes;
    }
}
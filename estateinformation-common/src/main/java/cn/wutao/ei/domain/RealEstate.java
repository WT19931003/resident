package cn.wutao.ei.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;

public class RealEstate {

    private Long id;

    private String projectname;

    private String address;

    private String housetype;

    private Integer area;

    private Long buidtime;

    private String onBuidTime;


    private Long userId;

    private User user;

    public String getOnBuidTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return this.buidtime==null?" ":dateFormat.format(this.buidtime);
    }
    public Long getBuidtime() {


        return buidtime;
    }
    public void setBuidtime(Long buidtime) {
        this.buidtime = buidtime;
    }




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype == null ? null : housetype.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }




    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", address='" + address + '\'' +
                ", housetype='" + housetype + '\'' +
                ", area=" + area +
                ", buidtime='" + buidtime + '\'' +
                ", userId=" + userId +
                ", user=" + user +
                '}';
    }
}
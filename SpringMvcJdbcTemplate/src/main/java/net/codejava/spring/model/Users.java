package net.codejava.spring.model;

/**
 * Đây là Model của trang người dùng.
 * 
 * @author DungLT-05/03/2017
 * 
 */
public class Users {

    private int id;
    private String logo;
    private String name;
    private String birthday;
    private String address;
    private String job;
    private String user;
    private String password;
    private String admin;
    private String createDate;
    private String createBy;
    private String updateDate;
    private String updateBy;
    private String deleteDate;
    private String deleteBy;

    public Users() {
    }

    public Users(int id, String logo, String name, String birthday, String address, String job, String user, String password, String admin, String createDate, String createBy, String updateDate, String updateBy, String deleteDate, String deleteBy) {
        this.id = id;
        this.logo = logo;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.job = job;
        this.user = user;
        this.password = password;
        this.admin = admin;
        this.createDate = createDate;
        this.createBy = createBy;
        this.updateDate = updateDate;
        this.updateBy = updateBy;
        this.deleteDate = deleteDate;
        this.deleteBy = deleteBy;
    }

    public int getId() {
        return id;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getAdmin() {
        return admin;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
    }

}

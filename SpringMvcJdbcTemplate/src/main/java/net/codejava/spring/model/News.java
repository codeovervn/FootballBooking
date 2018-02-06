package net.codejava.spring.model;

/**
 * Đây là Model của trang Đặt vé
 * 
 * @author DungLT-28/02/2017
 * 
 */
public class News {

    private int id;
    private String title;
    private String img;
    private String description;
    private String detail;
    private int feed;
    private int menuId;
    private String createDate;
    private String createBy;
    private String updateDate;
    private String updateBy;
    private String deleteDate;
    private String deleteBy;

    public News() {
    }

    public News(int id, String title, String img, String description, String detail, int feed, int menuId, String createDate, String createBy, String updateDate, String updateBy, String deleteDate, String deleteBy) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.description = description;
        this.detail = detail;
        this.feed = feed;
        this.menuId = menuId;
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
    public String getTitle() {
        return title;
    }
    public String getImg() {
        return img;
    }
    public String getDescription() {
        return description;
    }
    public String getDetail() {
        return detail;
    }
    public int getFeed() {
        return feed;
    }
    public int getMenuId() {
        return menuId;
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

    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public void setFeed(int feed) {
        this.feed = feed;
    }
    public void setMenuId(int menuId) {
        this.menuId = menuId;
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

    public String getUpdateBy() {
        return updateBy;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public String getDeleteBy() {
        return deleteBy;
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

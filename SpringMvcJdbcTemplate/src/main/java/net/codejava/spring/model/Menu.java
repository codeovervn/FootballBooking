package net.codejava.spring.model;

/**
 * Đây là Model của trang Đặt vé
 * 
 * @author DungLT-28/02/2017
 * 
 */
public class Menu {

    private int id;
    private String name;
    private String actionId;
    private String mobile;
    private String display;

    public Menu() {
    }

    public Menu(int id, String name, String actionId, String mobile, String display) {
        this.id = id;
        this.name = name;
        this.actionId = actionId;
        this.mobile = mobile;
        this.display = display;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getActionId() {
        return actionId;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDisplay() {
        return display;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

}

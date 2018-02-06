package net.codejava.spring.model;

/**
 * Đây là Model của trang Vé
 * 
 * @author DungLT-13/03/2017
 * 
 */
public class Ticket {

    private int id;
    private String giaidau;
    private String vongdau;
    private String trandau;
    private String sandau;
    private String khandai;
    private String cuaso;
    private String giave;
    private String trangthai;
    private String createDate;
    private String createBy;
    private String updateDate;
    private String updateBy;
    private String deleteDate;
    private String deleteBy;

    public Ticket() {
    }

    public Ticket(int id, String giaidau, String vongdau, String trandau, String sandau, String khandai, String cuaso, String giave, 
            String trangthai, String createDate, String createBy, String updateDate, String updateBy, String deleteDate, String deleteBy) {
        this.id = id;
        this.giaidau = giaidau;
        this.vongdau = vongdau;
        this.trandau = trandau;
        this.sandau = sandau;
        this.khandai = khandai;
        this.cuaso = cuaso;
        this.giave = giave;
        this.trangthai = trangthai;
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

    public String getGiaidau() {
        return giaidau;
    }

    public String getVongdau() {
        return vongdau;
    }

    public String getTrandau() {
        return trandau;
    }

    public String getSandau() {
        return sandau;
    }

    public String getKhandai() {
        return khandai;
    }

    public String getCuaso() {
        return cuaso;
    }

    public String getGiave() {
        return giave;
    }

    public String getTrangthai() {
        return trangthai;
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

    public void setGiaidau(String giaidau) {
        this.giaidau = giaidau;
    }

    public void setVongdau(String vongdau) {
        this.vongdau = vongdau;
    }

    public void setTrandau(String trandau) {
        this.trandau = trandau;
    }

    public void setSandau(String sandau) {
        this.sandau = sandau;
    }

    public void setKhandai(String khandai) {
        this.khandai = khandai;
    }

    public void setCuaso(String cuaso) {
        this.cuaso = cuaso;
    }

    public void setGiave(String giave) {
        this.giave = giave;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
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

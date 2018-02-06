package net.codejava.spring.model;

/**
 * Đây là Model của trang Thông tin Sân vận động.
 * 
 * @author DungLT-13/03/2017
 * 
 */
public class Stadium {

    private int id;
    private String masan;
    private String tensan;
    private String logo;
    private String ngaythanhlap;
    private String doichuquan;
    private String thanhpho;
    private String succhua;
    private String thongtin;
    private String trangthai;
    private String createDate;
    private String createBy;
    private String updateDate;
    private String updateBy;
    private String deleteDate;
    private String deleteBy;

    public Stadium() {
    }

    public Stadium(int id, String masan, String tensan, String logo, String ngaythanhlap, String doichuquan, String thanhpho, String succhua, String thongtin, 
            String trangthai, String createDate, String createBy, String updateDate, String updateBy, String deleteDate, String deleteBy) {
        this.id = id;
        this.masan = masan;
        this.tensan = tensan;
        this.logo = logo;
        this.ngaythanhlap = ngaythanhlap;
        this.doichuquan = doichuquan;
        this.thanhpho = thanhpho;
        this.succhua = succhua;
        this.thongtin = thongtin;
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

    public String getMasan() {
        return masan;
    }

    public String getTensan() {
        return tensan;
    }

    public String getLogo() {
        return logo;
    }

    public String getNgaythanhlap() {
        return ngaythanhlap;
    }

    public String getDoichuquan() {
        return doichuquan;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public String getSucchua() {
        return succhua;
    }

    public String getThongtin() {
        return thongtin;
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

    public void setMasan(String masan) {
        this.masan = masan;
    }

    public void setTensan(String tensan) {
        this.tensan = tensan;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setNgaythanhlap(String ngaythanhlap) {
        this.ngaythanhlap = ngaythanhlap;
    }

    public void setDoichuquan(String doichuquan) {
        this.doichuquan = doichuquan;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public void setSucchua(String succhua) {
        this.succhua = succhua;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
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

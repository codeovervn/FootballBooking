package net.codejava.spring.model;

/**
 * Đây là Model của trang Lịch Thi Đấu
 * 
 * @author DungLT-27/02/2017
 * 
 */
public class ClubInfo {

    private int id;
    private String madoituyen;
    private String tendoituyen;
    private String imgdoituyen;
    private String matrandau;
    private String thanhpho;
    private String HLV;
    private String ngaythanhlap;
    private String danhhieu;
    private String thongtin;
    private String createDate;
    private String createBy;
    private String updateDate;
    private String updateBy;
    private String deleteDate;
    private String deleteBy;

    public ClubInfo() {
    }

    public ClubInfo(int id, String madoituyen, String tendoituyen, String imgdoituyen, String matrandau, String thanhpho, String HLV, String ngaythanhlap, 
            String thongtin, String danhhieu, String createDate, String createBy, String updateDate, String updateBy, String deleteDate, String deleteBy) {
        this.id = id;
        this.madoituyen = madoituyen;
        this.tendoituyen = tendoituyen;
        this.imgdoituyen = imgdoituyen;
        this.matrandau = matrandau;
        this.thanhpho = thanhpho;
        this.HLV = HLV;
        this.ngaythanhlap = ngaythanhlap;
        this.danhhieu = danhhieu;
        this.thongtin = thongtin;
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
    public String getMadoituyen() {
        return madoituyen;
    }
    public String getTendoituyen() {
        return tendoituyen;
    }
    public String getMatrandau() {
        return matrandau;
    }
    public String getImgdoituyen() {
        return imgdoituyen;
    }

    public void setImgdoituyen(String imgdoituyen) {
        this.imgdoituyen = imgdoituyen;
    }

    public String getNgaythanhlap() {
        return ngaythanhlap;
    }
    public String getThongtin() {
        return thongtin;
    }
   public String getThanhpho() {
        return thanhpho;
    }
    public String getHLV() {
        return HLV;
    }
    public String getDanhhieu() {
        return danhhieu;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setMadoituyen(String madoituyen) {
        this.madoituyen = madoituyen;
    }
    public void setTendoituyen(String tendoituyen) {
        this.tendoituyen = tendoituyen;
    }
    public void setMatrandau(String matrandau) {
        this.matrandau = matrandau;
    }
    public void setNgaythanhlap(String ngaythanhlap) {
        this.ngaythanhlap = ngaythanhlap;
    }
    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }
    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }
    public void setHLV(String HLV) {
        this.HLV = HLV;
    }
    public void setDanhhieu(String danhhieu) {
        this.danhhieu = danhhieu;
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

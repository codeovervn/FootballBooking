package net.codejava.spring.model;

/**
 * Đây là Model của trang Đặt vé
 * 
 * @author DungLT-28/02/2017
 * 
 */
public class Booking {

    private int id;
    private String giai;
    private String tengiai;
    private int vong;
    private String matran;
    private String machunha;
    private String chunha;
    private String tyso;
    private String makhach;
    private String khach;
    private String san;
    private String ngay;
    private int nam;
    private int status;

    public Booking() {
    }

    public Booking(int id, String tengiai, String giai, int vong, String matran, String machunha, String chunha, String tyso, String makhach, String khach, String san, String ngay, int nam, int status) {
        this.id = id;
        this.giai = giai;
        this.tengiai = tengiai;
        this.vong = vong;
        this.matran = matran;
        this.machunha = machunha;
        this.chunha = chunha;
        this.tyso = tyso;
        this.makhach = makhach;
        this.khach = khach;
        this.san = san;
        this.ngay = ngay;
        this.nam = nam;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public String getGiai() {
        return giai;
    }
    public String getTengiai() {
        return tengiai;
    }
    public int getVong() {
        return vong;
    }
    public String getMatran() {
        return matran;
    }
    public String getMachunha() {
        return machunha;
    }
    public String getChunha() {
        return chunha;
    }
    public String getTyso() {
        return tyso;
    }
    public String getMakhach() {
        return makhach;
    }
    public String getKhach() {
        return khach;
    }
    public String getSan() {
        return san;
    }
    public String getNgay() {
        return ngay;
    }
    public int getNam() {
        return nam;
    }
    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setGiai(String giai) {
        this.giai = giai;
    }
    public void setTengiai(String tengiai) {
        this.tengiai = tengiai;
    }
    public void setVong(int vong) {
        this.vong = vong;
    }
    public void setMatran(String matran) {
        this.matran = matran;
    }
    public void setChunha(String chunha) {
        this.chunha = chunha;
    }
    public void setMachunha(String machunha) {
        this.machunha = machunha;
    }
    public void setTyso(String tyso) {
        this.tyso = tyso;
    }
    public void setKhach(String khach) {
        this.khach = khach;
    }
    public void setMakhach(String makhach) {
        this.makhach = makhach;
    }
    public void setSan(String san) {
        this.san = san;
    }
    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    public void setStatus(int status) {
        this.status = status;
    }

}

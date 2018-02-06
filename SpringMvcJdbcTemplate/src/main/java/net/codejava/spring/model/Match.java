package net.codejava.spring.model;

/**
 * Đây là Model của trang Lịch Thi Đấu
 * 
 * @author DungLT-27/02/2017
 * 
 */
public class Match {

    private String id;
    private String giai;
    private String tengiai;
    private String vong;
    private String matran;
    private String chunha;
    private String tyso;
    private String khach;
    private String ngay;
    private String status;

    public Match() {
    }

    public Match(String id, String tengiai, String giai, String vong, String matran, String chunha, String tyso, String khach, String ngay, String status) {
        this.id = id;
        this.giai = giai;
        this.tengiai = tengiai;
        this.vong = vong;
        this.matran = matran;
        this.chunha = chunha;
        this.tyso = tyso;
        this.khach = khach;
        this.ngay = ngay;
        this.status = status;
    }

    public String getId() {
        return id;
    }
    public String getGiai() {
        return giai;
    }
    public String getTengiai() {
        return tengiai;
    }
    public String getVong() {
        return vong;
    }
    public String getMatran() {
        return matran;
    }
    public String getChunha() {
        return chunha;
    }
    public String getTyso() {
        return tyso;
    }
    public String getKhach() {
        return khach;
    }
    public String getNgay() {
        return ngay;
    }
    public String getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setGiai(String giai) {
        this.giai = giai;
    }
    public void setTengiai(String tengiai) {
        this.tengiai = tengiai;
    }
    public void setVong(String vong) {
        this.vong = vong;
    }
    public void setMatran(String matran) {
        this.matran = matran;
    }
    public void setChunha(String chunha) {
        this.chunha = chunha;
    }
    public void setTyso(String tyso) {
        this.tyso = tyso;
    }
    public void setKhach(String khach) {
        this.khach = khach;
    }
    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}

package net.codejava.spring.dao;

import java.util.List;

import net.codejava.spring.model.Match;

/**
 * Đây là DAO của trang Lịch Thi Đấu
 * 
 * @author DungLT-27/02/2017
 * 
 */
public interface MatchDAO {

    public List<Match> listMatchAll();

    public List<Match> listMatchAllSearch();

    public List<Match> listMatchDetail(String giai);

    public List<Match> listMatchDetail(String giai, int records, int recordsPerPage);

    public List<Match> searchMatchList(String giai, String vong, String doituyen, int records, int recordsPerPage);
}

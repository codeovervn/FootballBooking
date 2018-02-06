package net.codejava.spring.service;

import java.util.List;

import net.codejava.spring.model.Match;

public interface MatchService {

    public List<Match> listMatchAll();

    public List<Match> listMatchAllSearch();

    public List<Match> listMatchDetail(String giai);

    public List<Match> listMatchDetail(String giai, int records, int recordsPerPage);

    public List<Match> searchMatchList(String giai, String vong, String doituyen, int records, int recordsPerPage);
}

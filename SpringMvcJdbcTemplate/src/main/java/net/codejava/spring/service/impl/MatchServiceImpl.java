package net.codejava.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.dao.MatchDAO;
import net.codejava.spring.model.Match;
import net.codejava.spring.service.MatchService;

public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchDAO matchDAO;

    @Override
    public List<Match> listMatchAll() {

        List<Match> listContact = matchDAO.listMatchAll();
        return listContact;
    }

    @Override
    public List<Match> listMatchAllSearch() {

        List<Match> listContact = matchDAO.listMatchAllSearch();
        return listContact;
    }

    @Override
    public List<Match> listMatchDetail(String giai) {

        List<Match> listMatch = matchDAO.listMatchDetail(giai);
        return listMatch;
    }

    @Override
    public List<Match> listMatchDetail(String giai, int records, int recordsPerPage) {

        List<Match> listMatchPaging = matchDAO.listMatchDetail(giai, records, recordsPerPage);
        return listMatchPaging;
    }

    @Override
    public List<Match> searchMatchList(String giai, String vong, String doituyen, int records, int recordsPerPage) {

        List<Match> searchMatchList = matchDAO.searchMatchList(giai, vong, doituyen, records, recordsPerPage);
        return searchMatchList;
    }

}

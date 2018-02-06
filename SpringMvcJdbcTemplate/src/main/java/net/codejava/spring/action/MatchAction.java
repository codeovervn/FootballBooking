package net.codejava.spring.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.codejava.spring.model.Match;
import net.codejava.spring.service.MatchService;

/**
 * Đây là Action của trang Lịch Thi Đấu
 * 
 * @author DungLT-27/02/2017
 * 
 */
public class MatchAction {

    @Autowired
    MatchService matchService;

    public List<Match> listMatchAll() {
        List<Match> listMatch = matchService.listMatchAll();
        return listMatch;
    }

    public List<Match> listMatchAllSearch() {
        List<Match> listMatch = matchService.listMatchAllSearch();
        return listMatch;
    }

    public List<Match> listMatchDetail(String giai) {
        List<Match> listMatch = matchService.listMatchDetail(giai);
        return listMatch;
    }

    public List<Match> listMatchDetail(String giai, int records, int recordsPerPage) {
        List<Match> listMatch = matchService.listMatchDetail(giai, records, recordsPerPage);
        return listMatch;
    }

    public List<Match> searchMatchList(String giai, String vong, String doituyen, int records, int recordsPerPage) {
        List<Match> listSearchMatch = matchService.searchMatchList(giai, vong, doituyen, records, recordsPerPage);
        return listSearchMatch;
    }
}

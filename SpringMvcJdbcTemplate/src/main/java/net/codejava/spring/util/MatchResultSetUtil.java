/*
 * Copyright DungLT - 2017
 */
package net.codejava.spring.util;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import net.codejava.spring.model.Match;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@SuppressWarnings("rawtypes")
public class MatchResultSetUtil implements ResultSetExtractor {

    public static ResultSetExtractor<List<Match>> extractData() {
        return new ResultSetExtractor<List<Match>>() {
            @Override
            public List<Match> extractData(ResultSet rs) throws SQLException, DataAccessException {
                //Map<Integer, Match> mapMatch = new HashMap<Integer, Match>();
                Map<Integer, Match> mapMatch = new LinkedHashMap<Integer, Match>();
                Match match = null;
                while (rs.next()) {
                    Integer id = rs.getInt(1);
                    match = mapMatch.get(id);
                    //match.setId(rs.getString(1));
                    if(match == null || !(id.equals(match.getId()))) {
                        match = new Match();
                        /*match.setId(rs.getString(1));
                        match.setGiai(rs.getString(2));
                        match.setVong(rs.getString(3));
                        match.setChunha(rs.getString(4));
                        match.setTyso(rs.getString(5));
                        match.setKhach(rs.getString(6));
                        match.setNgay(rs.getString(7));*/

                        match.setId(rs.getString("id"));
                        match.setGiai(rs.getString("giai"));
                        match.setTengiai(rs.getString("tengiai"));
                        match.setVong(rs.getString("vong"));
                        match.setMatran(rs.getString("matran"));
                        match.setChunha(rs.getString("chunha"));
                        match.setTyso(rs.getString("tyso"));
                        match.setKhach(rs.getString("khach"));
                        match.setNgay(rs.getString("ngay"));
                        match.setStatus(rs.getString("status"));

                        mapMatch.put(id, match);
                    }
                    mapMatch.put(id, match);
                }
                return new ArrayList<Match>(mapMatch.values());
            }
        };
    }

    @Override
    public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
        return null;
    }
}

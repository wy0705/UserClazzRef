package com.easy.archiecture.dao;

import com.easy.archiecture.entity.College;
import com.easy.archiecture.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CollegeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public College findByCollege(int cid){
        final College college=new College();
        String sql="select cid,name,nnscore_line,nscore_line,score_line,eeNumber,difficulty,eeNumberMax from college where cid=?";
        jdbcTemplate.query(sql, new Object[]{cid}, new RowCallbackHandler() {
            public void processRow(ResultSet rs) throws SQLException {
                college.setCid(rs.getInt(1));
                college.setName(rs.getString(2));
                college.setNnscore_line(rs.getInt(3));
                college.setNscore_line(rs.getInt(4));
                college.setScore_line(rs.getInt(5));
                college.setEeNumber(rs.getInt(6));
                college.setDifficulty(rs.getBoolean(7));
                college.setEeNumberMax(rs.getInt(8));
            }
        });
        return college;
    }

    public College findByName(String name){
        final College college=new College();
        String sql="select cid,name,nnscore_line,nscore_line,score_line,eeNumber,difficulty,eeNumberMax from college where name=?";
        jdbcTemplate.query(sql, new Object[]{name}, new RowCallbackHandler() {
            public void processRow(ResultSet rs) throws SQLException {
                college.setCid(rs.getInt(1));
                college.setName(rs.getString(2));
                college.setNnscore_line(rs.getInt(3));
                college.setNscore_line(rs.getInt(4));
                college.setScore_line(rs.getInt(5));
                college.setEeNumber(rs.getInt(6));
                college.setDifficulty(rs.getBoolean(7));
                college.setEeNumberMax(rs.getInt(8));
            }
        });
        return college;
    }

    public int insertCollege(College college) {
        String sql = "INSERT INTO college (cid,name,nnscore_line,nscore_line,score_line,eeNumber,eeNumberMax) VALUES (?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,college.getCid(),college.getName(),college.getNnscore_line(),college.getNscore_line(),college.getScore_line(),college.getEeNumber(),college.getEeNumberMax());
    }


    public int updateCollege(College college) {
        String sql = "UPDATE user SET name=?,phone=?,password=?,grade=?,address=?,eeNumber=?,difficulty=?,eeNumberMax=? WHERE id=?";
        return jdbcTemplate.update(sql,college.getName(),college.getNnscore_line(),college.getNscore_line(),college.getScore_line(),college.getEeNumber(),college.isDifficulty(),college.getEeNumberMax(),college.getCid());
    }


}

package com.easy.archiecture.dao;

import com.easy.archiecture.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    public User findByUser(int uid){
        final User user=new User();
        String sql="select uid,name,phone,grade,address from user where uid=?";
        jdbcTemplate.query(sql, new Object[]{uid}, new RowCallbackHandler() {
            public void processRow(ResultSet rs) throws SQLException {
                user.setUid(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPhone(rs.getString(3));
                user.setGrade(rs.getInt(4));
                user.setGrade(rs.getInt(5));
            }
        });
        return user;
    }


    public User findByNname(String name){
        final User user=new User();
        String sql="select uid,name,phone,grade,address from user where name=?";
        jdbcTemplate.query(sql, new Object[]{name}, new RowCallbackHandler() {
            public void processRow(ResultSet rs) throws SQLException {
                user.setUid(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPhone(rs.getString(3));
                user.setGrade(rs.getInt(4));
                user.setGrade(rs.getInt(5));
            }
        });
        return user;
    }

    public User findByNameAndPassword(String name,String password){
        final User user=new User();
        String sql="select uid,name,phone,grade,address from user where name=? and password=?";
        jdbcTemplate.query(sql, new Object[]{name, password}, new RowCallbackHandler() {
            public void processRow(ResultSet rs) throws SQLException {
                user.setUid(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPhone(rs.getString(3));
                user.setGrade(rs.getInt(4));
                user.setGrade(rs.getInt(5));
            }
        });
        return user;
    }

    public int insertUser(User user) {
        String sql = "INSERT INTO user (uid,name,phone,password,grade,address) VALUES (?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,user.getUid(),user.getName(),user.getPhone(),user.getPassword(),user.getGrade(),user.getAddress());
    }


    public int updateUser(User user) {
        String sql = "UPDATE user SET name=?,phone=?,password=?,grade=?,address=? WHERE id=?";
        return jdbcTemplate.update(sql,user.getName(),user.getPhone(),user.getPassword(),user.getGrade(),user.getAddress(),user.getUid());
    }

}

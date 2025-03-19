package com.example1.repository;

import com.example1.model.Alien;
import com.mysql.cj.result.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class AlienRepo  {
    @Autowired
    private JdbcTemplate template;  // Ensure this is injected

    public void save(Alien alien){
        String sql = "INSERT INTO alien (id, name, tech) VALUES (?, ?, ?)";
        template.update(sql, alien.getId(), alien.getName(), alien.getTech());
    }

}

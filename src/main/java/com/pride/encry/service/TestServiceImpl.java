package com.pride.encry.service;

import com.pride.encry.converter.EfHomePortConverter;
import com.pride.encry.domain.EfHomePort;
import com.pride.encry.dto.EfHomePortDTO;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void test() {
        String sql = "select * from ef_home_port";
        List<EfHomePort> list = jdbcTemplate.query(sql, new RowMapper<EfHomePort>() {
            @Override
            public EfHomePort mapRow(ResultSet rs, int rowNum) throws SQLException {
                EfHomePort efHomePort = new EfHomePort();
                efHomePort.setCode(rs.getString("code"));
                efHomePort.setName(rs.getString("name"));
                efHomePort.setMapName(rs.getString("map_name"));
                return efHomePort;
            }
        });
        for(EfHomePort ef : list) {
            System.out.println(ef);
        }
    }

    @Override
    public void dtoTest() {
        String sql = "select * from ef_home_port";
        List<EfHomePort> list = jdbcTemplate.query(sql, new RowMapper<EfHomePort>() {
            @Override
            public EfHomePort mapRow(ResultSet rs, int rowNum) throws SQLException {
                EfHomePort efHomePort = new EfHomePort();
                efHomePort.setCode(rs.getString("code"));
                efHomePort.setName(rs.getString("name"));
                efHomePort.setMapName(rs.getString("map_name"));
                return efHomePort;
            }
        });
        List<EfHomePortDTO> efHomePortDTOS = EfHomePortConverter.INSTANCE.convertDTO(list);
        for(EfHomePortDTO dto : efHomePortDTOS) {
            System.out.println(dto);
        }
    }
}

package ru.rt.eip.boot.mdm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.rt.eip.boot.mdm.model.MdmClient;

import java.util.List;

@Repository
public class MdmClientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public MdmClient findOne(String localSystemId, Long applicationId, Long version) {

        String query = "SELECT * FROM CLIENT WHERE LOCALSYSTEMID = ? AND APP_PKID=? AND VERSION = ?";
        List<MdmClient> result = jdbcTemplate.query(query, new Object[] {localSystemId, applicationId, version},
                (rs, rowNum) -> new MdmClient(
                        rs.getString("LOCALSYSTEMID"),
                        rs.getLong("APP_PKID"),
                        rs.getLong("VERSION"),
                        rs.getString("NLS"),
                        rs.getString("TITLE"),
                        rs.getString("SHORTNAME"),
                        rs.getString("INN")));

        if (result.isEmpty()) {
            return null;
        }
        return result.get(0);
    }

    public List<MdmClient> findByNls(String nls) {

        String query = "SELECT * FROM CLIENT WHERE NLS = ?";
        List<MdmClient> result = jdbcTemplate.query(query, new Object[] {nls},
                (rs, rowNum) -> new MdmClient(
                        rs.getString("LOCALSYSTEMID"),
                        rs.getLong("APP_PKID"),
                        rs.getLong("VERSION"),
                        rs.getString("NLS"),
                        rs.getString("TITLE"),
                        rs.getString("SHORTNAME"),
                        rs.getString("INN")));

        return result;
    }

}

package id.bio.dao;

import id.bio.database.DatabaseMYSQL;
import id.bio.model.Jurusan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JurusanDAOImpl implements JurusanDAO {
    public boolean insert(Jurusan j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean update(Jurusan j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean delete(Jurusan j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Jurusan> getAllJurusan() {
        List<Jurusan> jurusan = new ArrayList<Jurusan>();
        String sql = "SELECT * FROM jurusan";
        try {
            if (DatabaseMYSQL.getConnection() == null) {
                return null;
            } else {
                PreparedStatement statement = DatabaseMYSQL.getConnection().prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    Jurusan j = new Jurusan(
                        rs.getString(1),
                        rs.getString(2)
                    );
                    jurusan.add(j);
                }
                statement.close();
            }
        } catch (Exception ex) {
            // Exception handling
        }
        return jurusan;
    }

    public Jurusan getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Jurusan> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

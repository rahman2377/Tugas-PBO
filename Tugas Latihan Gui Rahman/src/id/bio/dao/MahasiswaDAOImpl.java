package id.bio.dao;

import id.bio.database.DatabaseMYSQL;
import id.bio.model.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class MahasiswaDAOImpl implements MahasiswaDAO {
    @Override
    public boolean insert(Mahasiswa m) {
        String sql = "INSERT INTO mahasiswa values (?, ?, ?)";
        try (PreparedStatement statement = DatabaseMYSQL.getConnection().prepareStatement(sql)) {
            statement.setString(1, m.getStambuk());
            statement.setString(2, m.getNama());
            statement.setInt(3, Integer.parseInt(m.getProdi().getId()));
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // Metode update untuk Mahasiswa
@Override
public boolean update(Mahasiswa m) {
    String sql = "UPDATE mahasiswa set nama = ?, prodi = ? where nim = ?";
    try {
        PreparedStatement statement = DatabaseMYSQL.getConnection().prepareStatement(sql);
        statement.setString(1, m.getNama());
        statement.setInt(2, Integer.parseInt(m.getProdi().getId()));
        statement.setString(3, m.getStambuk());
        int row = statement.executeUpdate();
        if (row > 0) {
            return true;
        }
        statement.close();
    } catch (Exception ex) {
        Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

// Metode delete untuk Mahasiswa
@Override
public boolean delete(Mahasiswa m) {
    String sql = "DELETE FROM mahasiswa WHERE nim = ?";
    try {
        PreparedStatement statement = DatabaseMYSQL.getConnection().prepareStatement(sql);
        statement.setString(1, m.getStambuk());
        int row = statement.executeUpdate();
        if (row > 0) {
            return true;
        }
        statement.close();
    } catch (Exception ex) {
        Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}
// Metode getAllMahasiswa untuk mengambil semua data mahasiswa
@Override
public List<Mahasiswa> getAllMahasiswa() {
    List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    String sql = "SELECT * FROM mahasiswa INNER JOIN jurusan ON jurusan.id = mahasiswa.prodi";
    try {
        if (DatabaseMYSQL.getConnection() == null) {
            return null;
        } else {
            PreparedStatement statement = DatabaseMYSQL.getConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                    rs.getString("stambuk"),
                    rs.getString("nama"),
                    new Jurusan(rs.getString("id"), rs.getString("nama"))
                );
                mahasiswa.add(m);
            }
            statement.close();
        }
    } catch (Exception ex) {
        Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
    }
    return mahasiswa;
}

// Metode getByID untuk mengambil data mahasiswa berdasarkan ID
@Override
public Mahasiswa getByID(String nim) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

// Metode getByName untuk mengambil data mahasiswa berdasarkan nama
@Override
public List<Mahasiswa> getByName(String name) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}



    // Other methods would be here
}

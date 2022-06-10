package com.softuni.bg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TablesDAO extends BaseDAO {

    @SuppressWarnings("CallToPrintStackTrace")
    //public static ResultSet getAllFromUser() {
    public static List getAllFromUser() {

        Connection con = null;
        ResultSet rs;
        String sql = " SELECT * FROM User ";

        ArrayList<ArrayList> rows = new ArrayList<>();

        try {
            con = getCon();
            rs = con.prepareStatement(sql).executeQuery();

            while (rs.next()) {
                ArrayList<Object> cols = new ArrayList<>();
                // > read every field from DB
                cols.add(rs.getInt("ID"));
                cols.add(rs.getString("Name"));
                // > add every cols in rows
                rows.add(cols);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
        return rows;
        //return rs;

    }
}

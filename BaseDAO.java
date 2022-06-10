package com.softuni.bg;

import java.sql.Connection;
import java.sql.DriverManager;

import static com.kriss.mediateka.Utilities.Constants.*;

public class BaseDAO {


    public static Connection getCon() {
        Connection con = null;

        try {
            con = DriverManager.getConnection(DB_URL + DB_HOST + DB_PORT + DB_NAME, DB_USER, DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeCon(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}




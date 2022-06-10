package com.softuni.bg;

import java.sql.SQLException;
import java.util.ArrayList;

import static com.kriss.mediateka.Data.TablesDAO.*;

public class CheckDB {

    public static void main(String[] args) throws SQLException {

        // ArrayList<Object> readCols = new ArrayList<>();
        // int ID_sum = 0;

        getAllFromUser().forEach(record ->
                {
                    System.out.println(record);
                }
        );

        // System.out.println(ID_sum);


    } // end main()

} // end class

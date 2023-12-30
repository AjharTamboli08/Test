package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Service {

    private static Connection conn = null;

    static{
        String url="jdbc:mysql://localhost:3307/test";
        String username="root";
        String password="root";

        try {
            conn = DriverManager.getConnection(url , username , password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static int insertFilmDetails(film newfilm)
    {
        int n=0;
        String insertQuery="INSERT INTO FILM_INFO VALUES( ? , ? , ? , ? , ?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, newfilm.getFilmId());
            pstmt.setString(2, newfilm.getFilmName());
            pstmt.setString(3,newfilm.getFilmLang());
            pstmt.setInt(4,newfilm.getFilmRating());
            pstmt.setDouble(5,newfilm.getFilmYear());
            n=pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("INVALID DATA , FILM NOT ADDED");
        }
        return n;
    }
    public List<film>displayAllFilm()
    {
        String displayQuery ="SELECT * FROM FILM_INFO";
        List<film> filmList= new ArrayList<>();


        return filmList;
    }

}

import java.sql.*;

public class DB {
//  public static Connection getConnection(){
    public static void main(String[] args) throws SQLException {

      Connection con=null;
      String name1 = "DBMS";
    try{
      Class.forName("com.mysql.jdbc.Driver");
      con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","sam","sam");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select * from books where name = 'DBMS' ");
      while(rs.next())
        System.out.println(rs.getInt(1)+"  "+
                rs.getString(2)+"  "+
                rs.getString(3)+"  "+
                rs.getString(4)+"  "+
                rs.getString(5)+"  "+
              rs.getString(6)+"  "+
                rs.getString(7)+"  "+
                rs.getString(8));
      con.close();
    }catch(Exception e){System.out.println(e);}
//    return con;

//     createTable();
  }
//
//  public static void createTable() throws SQLException {
//    String createString =
//            "create table "  +
//                    ".SUPPLIERS " +
//                    "(SUP_ID integer NOT NULL, " +
//                    "SUP_NAME varchar(40) NOT NULL, " +
//                    "STREET varchar(40) NOT NULL, " +
//                    "CITY varchar(20) NOT NULL, " +
//                    "STATE char(2) NOT NULL, " +
//                    "ZIP char(5), " +
//                    "PRIMARY KEY (SUP_ID))";
//
//    Statement stmt = null;
//    Connection con = null;
//
//    try {
//      stmt = con.createStatement();
//      stmt.executeUpdate(createString);
//    } catch (SQLException e) {
////      JDBCTutorialUtilities.printSQLException(e);
//      System.out.println(e);
//    } finally {
//      if (stmt != null) { stmt.close(); }
//    }
//  }

}

import java.sql.*;

public class DBTest {

    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/user/Desktop/CarDatabase.accdb");
            Statement st = conn.createStatement();
            String sql = "Select * from Car";
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int year = rs.getInt(3);
                System.out.println(id +"\t"+name+"\t"+year);
            }
            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}

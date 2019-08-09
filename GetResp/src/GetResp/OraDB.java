/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetResp;



/**
 *
 * @author ALawicki
 */


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALawicki
 */
public class OraDB {     
        
        
   
private String login="null";

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
private String password="null";  

    
   
public boolean testing_driver (){
        System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {          
            
              
            return false;

        }
        
        
        return true;
}
public String connection ( ){
        

String message;
        
        

      

        Connection connection = null;

        try 
        {

            connection = DriverManager.getConnection(
                 "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=netisdb-scan.oss.networks.pl)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=netis)))", login, password);
          

        } catch (SQLException e) {

            message=("Wrong password or connection issue");
           // e.printStackTrace();
            return message;

        }

        if (connection != null) {
            message=("Connection OK");
        } else {
            message=("Failed to make connection!");      
            
         }
  return message;      
}
public List getDBData(List lista){
    for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
    
    

        }
    System.out.println("czary mary oracle");
    return lista;
}
ArrayList <String> getResp(Connection con, ArrayList<String> array) throws SQLException {
    
        String respName;
        ResultSet rs;
     
      
   ArrayList<String> wynik = new ArrayList<String> ();  
   Statement stmt = con.createStatement();
   wynik.add("RESP");
   
    
    for ( int i=0;i<(array.size());i++){ 
        String query=  "select  aut.full_name from smart.v_bra_loc l, smart.v_bra_proj p, smart.v_bra_area a, smart.v_bra_aut aut, smart.v_bra_locr rp\n" +
"where p.obj=a.parent and a.obj=l.parent and l.obj=rp.parent and rp.resp_aut_obj_id=aut.obj and\n" +
"l.ver ='ACT' and l.rainbow_site is not null and rp.resp_domain_name in ('RADIO')   and l.networks_code="+array.get(i);
        rs = stmt.executeQuery(query);
         while (rs.next()) {
       respName=rs.getString("full_name");       
       wynik.add(respName) ;
   }
         
        }

    return wynik;
};
}
    


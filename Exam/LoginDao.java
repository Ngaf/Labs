package Exam.login;
import java.sql.*;
import Exam.Index;

public class LoginDao{
	public static boolean validate(LoginBean bean){
		boolean status = false;

		try{
			Connection con = Index.getCon();

            PreparedStatement ps = con.prepareStatement(
            	"select * from users where email=? and pwd=?");

            ps.setString(1, bean.getEmail());
            ps.setString(2, bean.getPassword());

            ResultSet rs = ps.executeQuery();
            status=rs.next();
        }
        catch(Exception e){
        } 
             return status;
         }
     }
     
		
	

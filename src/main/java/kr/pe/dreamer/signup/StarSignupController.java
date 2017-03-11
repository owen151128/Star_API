package kr.pe.dreamer.signup;

import java.sql.DriverManager;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.*;
@Controller
public class StarSignupController {
	private static final Logger logger = Logger.getLogger(StarSignupController.class);

	@RequestMapping(value = "/signup.star", method = RequestMethod.POST)
	public @ResponseBody StarBooleanResult init(@RequestBody StarSignupDTO dto) {
		System.out.println("init called!!!");
		System.out.println(dto.getInputId());
		System.out.println(dto.getInputName());
		System.out.println(dto.getInputPassword());
		System.out.println(dto.getInputPhone());
		
		
		java.sql.Connection conn = null;
		PreparedStatement stmt=null;

		String USER = "root";
		String PW = "dhqjtmxk";
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://192.168.35.253:5678/startalk", USER,PW);

			String sql = "insert into profile values(?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, dto.getInputId());
			ps.setString(2, dto.getInputPassword());
			ps.setString(3, dto.getInputName());
			ps.setString(4, dto.getInputPhone());
			ps.executeUpdate();
			System.out.println(ps.toString());
			ps.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;
	}
}






















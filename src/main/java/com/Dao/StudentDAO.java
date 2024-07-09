package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDAO {
	
	private  Connection conn;
	
	public StudentDAO(Connection conn) {
		super();
		this.conn = conn;
	}



	
	
	
	
	public  boolean addstudent(Student student) {
		boolean f=false;
		try {
			String sql="insert into student(name,dob,address,qualification,email) values(?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, student.getFullName());
			ps.setString(2, student.getDate());
			ps.setString(3, student.getAddress());
			ps.setString(4, student.getQualification());
			ps.setString(5, student.getEmail());
			
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return f;
	}
	
	public List<Student> getAllStudent(){
		List<Student> list=new ArrayList<Student>();
		
		Student stu=null;
		
		try {
			String sql="select * from student";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				stu=new Student();
				
				stu.setId(rs.getInt(1));
				stu.setFullName(rs.getString(2));
				stu.setDate(rs.getString(3));
				stu.setAddress(rs.getString(4));
				stu.setQualification(rs.getString(5));
				stu.setEmail(rs.getString(6));
				list.add(stu);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return list;
		
	}
	
	
public Student getstudentByid(int id) {
	Student stu=null;
	
	try {
		String sql="select * from student where id=?";
		
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			stu=new Student();
			
			stu.setId(rs.getInt(1));
			stu.setFullName(rs.getString(2));
			stu.setDate(rs.getString(3));
			stu.setAddress(rs.getString(4));
			stu.setQualification(rs.getString(5));
			stu.setEmail(rs.getString(6));
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	return stu;
}


public  boolean updatestudent(Student student) {
	boolean f=false;
	try {
		String sql="update student set name=?,dob=?,address=?,qualification=?,email=? where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, student.getFullName());
		ps.setString(2, student.getDate());
		ps.setString(3, student.getAddress());
		ps.setString(4, student.getQualification());
		ps.setString(5, student.getEmail());
		ps.setInt(6, student.getId());
		
		int i=ps.executeUpdate();
		if(i==1) {
			f=true;
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	
	return f;
}

public boolean deletestudent(int id) {
	boolean f=false;
	try {
		String sql="delete from student where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, id);
		
		int i=ps.executeUpdate();
		if(i==1) {
			f=true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}

}

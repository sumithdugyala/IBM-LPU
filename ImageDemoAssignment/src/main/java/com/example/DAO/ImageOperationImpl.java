package com.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.factory.MyConnectionFactory;
import com.example.model.Image;

public class ImageOperationImpl implements ImageOperations {
	
	MyConnectionFactory factory =null;
	public ImageOperationImpl(){
	 factory = MyConnectionFactory.getConnectionObject();
	}	
	
	
	public void addImage(Image obj) {
		// TODO Auto-generated method stub
		try {
			Connection con = factory.getMyConnection();
			PreparedStatement st= con.prepareStatement("insert into jdbc1 values(?,?,?)");
			st.setInt(1, obj.getId());
			st.setString(2, obj.getName());
			st.setBoolean(3, obj.getIsAvalaible());
			st.executeUpdate();
			System.out.println("added");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public void displayImage(int i) {
		// TODO Auto-generated method stub
		try {
			Connection con = factory.getMyConnection();
			PreparedStatement st= con.prepareStatement("select * from jdbc1 where imageId = ?");
			st.setInt(1, i);
			
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("imageId"));
				System.out.println(rs.getString("imageUrl"));
				System.out.println(rs.getBoolean(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateImageName(int i, String name) {
		// TODO Auto-generated method stub
		try {
			Connection con = factory.getMyConnection();
			PreparedStatement st= con.prepareStatement("Update jdbc1 set imageUrl=? where imageId=?");
			st.setInt(2, i);
			st.setString(1, name);
			st.executeUpdate();
			System.out.println("updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteImage(int i) {
		// TODO Auto-generated method stub
		try {
			Connection con = factory.getMyConnection();
			PreparedStatement st= con.prepareStatement("Delete from jdbc1 where imageId=?");
			st.setInt(1, i);
			
			st.executeUpdate();
			System.out.println("deleted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
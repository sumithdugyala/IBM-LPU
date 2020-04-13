package com.example.demo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Image;

@Repository
public class ImageRepoImpl implements ImageRepo 
{
	@Autowired
	private DataSource dataSource;
	
	private Connection connection=null;
	
	private static Logger logger=Logger.getLogger("ImageRepoImpl"); 
	
	public Image createImage(Image image) 
	{
		try 
		{
			logger.log(Level.INFO,"connecting to database");
			connection=dataSource.getConnection();
			logger.log(Level.INFO, "connected");
			PreparedStatement pStatement=connection.prepareStatement("insert into image value(?,?)");
			pStatement.setString(1,image.getImageId());
			pStatement.setString(2, image.getImageName());
			pStatement.executeUpdate();
			logger.log(Level.INFO, "image creation completed");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return image;
	}

}

package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.model.Library;
import com.chainsys.util.JdbcConnection;

public class LibraryDao {

	static Library libraryPojo=new Library();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		
	}

	public static int save(Library libraryPojo) {
		// TODO Auto-generated method stub
		int status=0;  
        try{  
           
            Connection getConnection=JdbcConnection.getConnection();
            PreparedStatement prepareStatement=getConnection.prepareStatement(  
                         "insert into user905(name,password,email,country) values (?,?,?,?)");  
            prepareStatement.setString(1,libraryPojo.getName());  
            prepareStatement.setInt(2,libraryPojo.getCardNumber());
            prepareStatement.setString(3,libraryPojo.getEmailId()); 
            prepareStatement.setString(4,libraryPojo.getPassword());  
            prepareStatement.setInt(5,libraryPojo.getPhoneNumber());
            prepareStatement.setString(6, libraryPojo.getAddress());
            prepareStatement.setString(7, libraryPojo.getCity());
            prepareStatement.setInt(8, libraryPojo.getPinCode());
            prepareStatement.setString(9, libraryPojo.getDistrict());
            prepareStatement.setString(10, libraryPojo.getState());
            prepareStatement.setString(11, libraryPojo.getGender());
            
              
            status=prepareStatement.executeUpdate();  
              
            getConnection.close();  
        }
        catch(Exception e){
        	e.printStackTrace();
        	}  
          
        return status;  
		
	}

//	 public static Library getLibraryByCardNumber(int cardNumber){  
//	      
//	          
//	        try{  
//	            Connection getConnection=JdbcConnection.getConnection();  
//	            PreparedStatement prepareStatement=getConnection.prepareStatement("select * from library where cardNumber=?");  
//	            prepareStatement.setInt(2,cardNumber);  
//	            ResultSet resultSet=prepareStatement.executeQuery();  
//	            if(resultSet.next()){  
//	            	
//	                libraryPojo.setName(resultSet.getString(1));  
//	                libraryPojo.setCardNumber(resultSet.getInt(2));
//	                libraryPojo.setEmailId(resultSet.getString(3));  
//	                libraryPojo.setPassword(resultSet.getString(4));  
//	                libraryPojo.setPhoneNumber(resultSet.getInt(5));
//	                libraryPojo.setAddress(resultSet.getString(6));
//	                libraryPojo.setCity(resultSet.getString(7));
//	                libraryPojo.setPinCode(resultSet.getInt(8));
//	                libraryPojo.setDistrict(resultSet.getString(9));
//	                libraryPojo.setState(resultSet.getString(10));
//	                libraryPojo.setGender(resultSet.getString(11));
//	                
//	               
//	            }  
//	            getConnection.close();  
//	        }catch(Exception e){
//	        	e.printStackTrace();
//	        	}  
//	          
//	        return libraryPojo;  
//	    }  
	 public static List<Library> getAllLibrary (){  
	        List<Library> list=new ArrayList<Library>();  
	          
	        try{  
	            Connection getConnection=JdbcConnection.getConnection();  
	            PreparedStatement prepareStatement=getConnection.prepareStatement("select * from user905");  
	            ResultSet resultSet=prepareStatement.executeQuery();  
	            while(resultSet.next()){  
	            	libraryPojo.setName(resultSet.getString(1));  
	                libraryPojo.setCardNumber(resultSet.getInt(2));
	                libraryPojo.setEmailId(resultSet.getString(3));  
	                libraryPojo.setPassword(resultSet.getString(4));  
	                libraryPojo.setPhoneNumber(resultSet.getInt(5));
	                libraryPojo.setAddress(resultSet.getString(6));
	                libraryPojo.setCity(resultSet.getString(7));
	                libraryPojo.setPinCode(resultSet.getInt(8));
	                libraryPojo.setDistrict(resultSet.getString(9));
	                libraryPojo.setState(resultSet.getString(10));
	                libraryPojo.setGender(resultSet.getString(11));
	                list.add(libraryPojo);  
	            }  
	            getConnection.close();  
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }  
	          
	        return list;  
	    }  
}  

	


package com.foodPlaza.Pojo;

//create table customer(custName varchar(30),emailId varchar(30) primary key,
//custPassword varchar(30),custAddress varchar(30),contactNo varchar(30),custLocation varchar(30));

public class Customer 
{
	
private String  custName;
	
private String emailId;
	
private String custPassword;
	
private String custAddress;
	
private String contactNo;
	
private String custLocaton;
	

public Customer()
	
{
		
	
}
	

public Customer(String custName,String emailId,String custPassword,String
 custAddress,String contactNo,String custLocaton)
	
{
		
this.custName= custName;
		
this.emailId=emailId;
		
this.custPassword=custPassword;
		
this.custAddress=custAddress;
		
this.contactNo=contactNo;
		
this.custLocaton=custLocaton;
		
	
}

	
@Override
	
public String toString() 
{
		
return "Customer [custName=" + custName + ", emailId=" + emailId + ","
+ " custPassword=" + custPassword
+ ", custAddress=" + custAddress + ", contactNo=" + contactNo +", custLocation=" + custLocaton + "]";
	
}
	

public String getCustName() 
{
		
return custName;
	
}
	

public void setCustName(String custName) 
{
		
this.custName = custName;
	
}
	

public String getEmailId() 
{
		
return emailId;
	
}
	

public void setEmailId(String emailId) 
{
		
this.emailId = emailId;
	
}
	

public String getCustPassword() 
{
		
return custPassword;
	
}
	

public void setCustPassword(String custPassword) 
{
		
this.custPassword = custPassword;
	
}
	

public String getCustAddress() 
{
		
return custAddress;
	
}
	

public void setCustAddress(String custAddress) 
{
		
this.custAddress = custAddress;
	
}
	

public String getContactNo() 
{
		
return contactNo;
	
}
	

public void setContactNo(String contactNo) 
{
		
this.contactNo = contactNo;
	
}
	

public String getCustLocaton() 
{
		
return custLocaton;
	
}
	

public void setCustLocaton(String custLocaton) 
{
		
this.custLocaton = custLocaton;
	
}

	
	

}
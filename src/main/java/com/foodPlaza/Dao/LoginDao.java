package com.foodPlaza.Dao;

public interface LoginDao {
boolean userLogin(String emailId,String CPassword);
boolean userChangePassword(String custName,String newPassword);
boolean adminLogin(String adminName,String adminPassword);
boolean adminChangePassword(String adminUserName,String adminNewPassword);
}

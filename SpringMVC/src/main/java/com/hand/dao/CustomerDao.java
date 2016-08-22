package com.hand.dao;

//import java.util.List;

import java.util.List;





import org.apache.ibatis.annotations.Param;

import com.hand.pojo.Customer;

public interface CustomerDao {
    int deleteByPrimaryKey(Short customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Short customerId);
    Customer selectByFirstName(String firstName);
    int updateByPrimaryKeySelective(Customer record);

    List<Customer> selectCustomer();
    int updateByPrimaryKey(Customer record);
   // public void insertCustomer(@Param("storeId")Byte storeId,@Param("firstName")String firstName,@Param("lastName")String lastName,@Param("email")String email);
  //  public List selectCustomerName();
    
}
package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.Students;
import com.example.demo.model.Students2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;


@Mapper
public interface StudentsMapper {

  final String query1 = "insert into user(userName,userAge,userAddress) values(#{userName},#{userAge},#{userAddress})";

  @Results(id="userMap", value={
    @Result(property="id", column="id", id=true),
    @Result(property="name", column="userName"),
    @Result(property="age", column="userAge"),
    @Result(property="address", column="userAddress"),
  })
  @Select("select * from user")
  List<Students2> findAll();

  @Insert(query1)
  @Options(useGeneratedKeys=true, keyProperty="id")
  void insert(Students students);

  @Delete("delete from user where id=#{id}")
  void deleteUser(int id);


}







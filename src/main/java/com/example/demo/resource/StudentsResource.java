package com.example.demo.resource;

import java.util.List;

import com.example.demo.mapper.StudentsMapper;
import com.example.demo.model.Students;
import com.example.demo.model.Students2;
import com.example.demo.model.UserRequestModel;

// import org.apache.ibatis.session.SqlSession;
// import org.apache.ibatis.session.SqlSessionException;
// import org.apache.ibatis.session.SqlSessionFactory;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class StudentsResource {
  private StudentsMapper studentsMapper;

  public StudentsResource(StudentsMapper studentsMapper){
    this.studentsMapper = studentsMapper;
  }

  @GetMapping("/all")
  public List<Students2> getAll(){

    List<Students2> res = studentsMapper.findAll();
    for (Students2 s: res){
      System.out.println(s);
    }
    return res;
  }

  @PostMapping("/update")
  private List<Students2> update(@RequestBody UserRequestModel detail){

    Students stu = new Students();
    stu.setUserName(detail.getUserName());
    stu.setUserAge(detail.getUserAge());
    stu.setUserAddress(detail.getUserAddress());
    
    studentsMapper.insert(stu);
    return studentsMapper.findAll();
  }

  @DeleteMapping("/{userId}")
  private void deleteUser(@PathVariable int userId) {
    studentsMapper.deleteUser(userId);
  }

  @Transactional
  @GetMapping("/test")
  private void testing(){
    Students stu = new Students("name02", 13, "addr2");
    Students stu2 = new Students("name03", 14, "addr3");
    
    studentsMapper.insert(stu);
    studentsMapper.insert(stu2);
    studentsMapper.deleteUser(2);
  }

  // require http://xxxxxx?aa=xx
  @GetMapping("/try")
  private void trys(@RequestParam(value="aa", required=true) String ps){
    System.out.println("ps: " + ps);
  }
  
}









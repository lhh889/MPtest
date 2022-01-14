package com;

import com.itlhh.dao.UserDao;
import com.itlhh.domain.User;
import com.itlhh.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MptestApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private IUserService iUserService;

    @Test
    void testGetById() {
        //System.out.println("测试");
        //根据id查询
        User user = userDao.selectById(1480871335214252034l);
        System.out.println(user);
    }

    @Test
    void testGetAll() {
        //查询全部
        List<User> userList = iUserService.list();
        System.out.println(userList);

    }

    @Test
    void testsave() {
        //添加
        User user = new User();
        user.setName("张三");
        user.setPassword("33366");
        user.setAge(25);
        user.setTel("13333");
        boolean save = iUserService.save(user);
        if (save) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }

    @Test
    void testdel() {
        //根据id删除
        boolean removeById = iUserService.removeById(1480871335214252034l);
        if (removeById) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    //修改
    @Test
    public void  testupdate(){
        User user = new User();
        user.setName("李四");
        user.setPassword("3306");
        user.setAge(24);
        user.setTel("16666");
        user.setId(66l);
        userDao.updateById(user);
    }
}

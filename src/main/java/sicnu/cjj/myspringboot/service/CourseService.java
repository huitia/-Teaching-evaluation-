package sicnu.cjj.myspringboot.service;

import sicnu.cjj.myspringboot.entity.CourseBean;

import java.util.List;

public interface CourseService {
    //学生子系统

    //课程表的查询
    List<CourseBean> queryAllUser(String username);


//    //评价内容的查询
//    List<ContentBean> queryAllContent(String name);
//    //填写教师每项分数
//    int modifyGrade(String[] grade);
}

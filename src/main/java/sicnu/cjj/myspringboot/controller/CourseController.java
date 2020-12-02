package sicnu.cjj.myspringboot.controller;

import org.springframework.web.bind.annotation.RestController;
import sicnu.cjj.myspringboot.entity.CourseBean;
import sicnu.cjj.myspringboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("Student")
public class CourseController {

    @Autowired
    CourseService courseService;

    /**
     * 学生页面返回教师信息列表
     */
    @RequestMapping("ReturnStudentList")
    public List<CourseBean> showUsers(){
        List<CourseBean> userList = courseService.queryAllUser("2018110442");
        return userList;
    }

//
//    /**
//     *获取前端的登录账号
//     */
//    public String username;
//    @RequestMapping("/xuesheng")
//    @ResponseBody
//    public void juese(String name){
//        username = name;
//    }


//    /**
//     *给前端传参（评价内容）
//     */
//    @RequestMapping("/zhujie")
//    @ResponseBody
//    public List<ContentBean> showContent(String name){
//        List<ContentBean> contentList = userService.queryAllContent(name);
//        return contentList;
//    }
//
//    /**
//     *
//     */
//    @RequestMapping(value = "/tiaocha",method = RequestMethod.POST)
//    @ResponseBody
//    public Map grade(String grade){
//        String [] sgrade = grade.split(",");
//        int flag = userService.modifyGrade(sgrade);
//        Map<String,Object> map = new HashMap<String,Object>();
//        if(flag == 1){
//            map.put("msg","添加分数成功");
//            return map;
//        }else {
//            map.put("msg","添加分数失败");
//            return map;
//        }
//    }

}

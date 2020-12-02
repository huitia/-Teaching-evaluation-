package sicnu.cjj.myspringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sicnu.cjj.myspringboot.entity.CourseBean;
import sicnu.cjj.myspringboot.mapper.CourseMapper;
import sicnu.cjj.myspringboot.service.CourseService;


import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    //学生子系统
    @Resource
    CourseMapper courseMapper;

    @Override
    @Transactional
    @Cacheable(cacheManager = "cacheManager", value = "user",key="'stu_teacher-list'+#account")
    public List<CourseBean> queryAllUser(String account) {
        List<CourseBean> list= courseMapper.getAllUser(account);
        return list;
    }

//    @Override
//    public List<ContentBean> queryAllContent(String name) {
//        username = name;
//        return courseMapper.getAllContent(name);
//    }
//    @Override
//    public int modifyGrade(String[] grade){
//        int aFlag = 0 ;
//        int i,ques_id;
//        ques_id = courseMapper.getques_id(username);
//        for(i=0;i<grade.length;i++){
//            aFlag = courseMapper.updateContent(i+ques_id,grade[i]);
//        }
//        return aFlag;
//    }
}

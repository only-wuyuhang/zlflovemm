package com.quellan.zlflovemm.dao.mapper2;

import com.quellan.zlflovemm.entry.UserEntry;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2019/9/21 15:34
 * @Version 1.0
 */
public interface UserMapper2 {
    @Select("select id,username as userName,password,email,role_code as roleCode,gmt_create as gmtCreate,gmt_update as gmtUpdate,nickname as nickName,user_create as userCreate from sys_user")
    List<UserEntry> findUserList();


    @Insert({"insert into sys_user(username,password,email) values('${user.userName}','${user.password}','${user.email}')"})
    int add(@Param("user") UserEntry user);

    @Delete("delete from sys_user where id = #{id}")
    int delete(int id);
}

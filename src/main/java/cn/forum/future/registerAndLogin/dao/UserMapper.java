package cn.forum.future.registerAndLogin.dao;


import cn.forum.future.registerAndLogin.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * mapper的具体表达式
 */
@Mapper //标记mapper文件位置，否则在Application.class启动类上配置mapper包扫描
@Repository
public interface UserMapper {
    /**
     * 查询用户名是否存在，若存在，不允许注册
     * 注解@Param(value) 若value与可变参数相同，注解可省略
     * 注解@Results  列名和字段名相同，注解可省略
     * @param username
     * @return
     */
    @Select(value = "select u.adminName,u.adminPassword from tb_admin u where u.adminName=#{adminName}")
    @Results
            ({@Result(property = "adminName",column = "adminName"),
                    @Result(property = "adminPassword",column = "adminPassword")})
    User findUserByName(@Param("adminName") String username);

    /**
     * 注册  插入一条user记录
     * @param user
     * @return
     */
    @Insert("insert into tb_admin values(#{adminId},#{adminName},#{adminPassword})")
    //加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true,keyProperty = "adminId",keyColumn = "adminId")
    void regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    @Select("select u.adminId from tb_admin u where u.adminName = #{adminName} and adminPassword = #{adminPassword}")
    Long login(User user);
}

package cn.forum.future.initialize.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InitializationDataBase {
    /**
     * 管理员表
     */

    public void tbAdmin();

    /**
     * 用户表
     */

    public void tbUserInfo();

    /**
     * 信息表
     */

    public void tbCard();

    /**
     * 帮助表
     */

    public void tbHelp();

    /**
     * 级别表
     */

    public void tbMark();

    /**
     * 主题表
     */

    public void tbModule();

    /**
     * 主题表
     */

    public void tbRevertCard();
}

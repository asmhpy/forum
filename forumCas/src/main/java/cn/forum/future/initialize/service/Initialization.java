package cn.forum.future.initialize.service;

import cn.forum.future.initialize.dao.InitializationDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Initialization implements ApplicationRunner {
    @Autowired
    private InitializationDataBase initializationDataBase;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        initializationDataBase.tbAdmin();
        initializationDataBase.tbUserInfo();
        initializationDataBase.tbCard();
        initializationDataBase.tbHelp();
        initializationDataBase.tbMark();
        initializationDataBase.tbModule();
        initializationDataBase.tbRevertCard();
    }
}

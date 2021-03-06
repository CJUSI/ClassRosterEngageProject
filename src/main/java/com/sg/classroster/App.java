package com.sg.classroster;

import com.sg.classroster.controller.ClassRosterController;
import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterFileImpl;
import com.sg.classroster.service.ClassRosterServiceLayer;
import com.sg.classroster.service.ClassRosterServiceLayerImpl;
import com.sg.classroster.ui.ClassRosterView;
import com.sg.classroster.ui.UserIO;
import com.sg.classroster.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Instantiate UserIO Object
        //UserIO myIo = new UserIOConsoleImpl();
        //Instantiate view object and wire through UserIO into it
        //ClassRosterView myView = new ClassRosterView(myIo);
        //Instantiate the DAO
        //ClassRosterDao myDao = new ClassRosterFileImpl();
        //Instantiate Audit DAO
        //ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        //Instantiate Service Layer and wire DAo and AuditDao into it
        //ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        //Instantiate controller
        //ClassRosterController controller = new ClassRosterController(myService, myView);
        //Run Controller
        //controller.run();
        // UserIO myIo = new UserIOConsoleImpl();
        // ClassRosterView myView = new ClassRosterView(myIo);
        // ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        // ClassRosterAuditDao myAuditDao =
        //       new ClassRosterAuditDaoFileImpl();
        // ClassRosterServiceLayer myService =
        //       new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        // ClassRosterController controller =
        //       new ClassRosterController(myService, myView);
        // controller.run();

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassRosterController controller =
                ctx.getBean("controller", ClassRosterController.class);
        controller.run();
    }
}

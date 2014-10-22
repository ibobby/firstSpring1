package demo;

import beans.SpringFirstTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WhiteMountiens on 19.10.2014.
 */
public class SpringDemo {

    public static void main(String[] args) {
        String confFile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        SpringFirstTest sft = (SpringFirstTest) context.getBean("SpringTest");
        sft.testMe();
        ////



    }

}

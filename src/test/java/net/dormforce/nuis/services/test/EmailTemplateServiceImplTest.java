package net.dormforce.nuis.services.test;

import net.dormforce.nuis.service.impl.EmailTemplateServiceImpl;
import net.dormforce.nuis.support.pojo.EmailTemplate;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by ZhangJianshun on 2017/4/21 0021.
 */
public class EmailTemplateServiceImplTest {

    private ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:" +
            "spring_config/applicationContext.xml");

    private EmailTemplateServiceImpl emailTemplateService = (EmailTemplateServiceImpl) applicationContext.getBean("emailService");

    private EmailTemplate emailTemplate;

    {
        emailTemplate = new EmailTemplate();
        emailTemplate.setSubject("报名信息");
        emailTemplate.setTitle("报名");
        emailTemplate.setType("公函");
    }

    @Test
    public void getEmailTemplates() throws Exception {
        System.out.println(emailTemplateService.getEmailTemplates());
    }

    @Test
    public void getEmailTemplate() throws Exception {
        System.out.println(emailTemplateService.getEmailTemplate(1));
    }

    @Test
    public void saveEmailTemplate() throws Exception {
        emailTemplate.setEmailTemplateId(2);
        emailTemplate.setTitle("不是报名");
        System.out.println(emailTemplateService.saveEmailTemplate(emailTemplate));
    }

    @Test
    public void removeEmailTemplate() throws Exception {
        System.out.println(emailTemplateService.removeEmailTemplate(1));
    }

}
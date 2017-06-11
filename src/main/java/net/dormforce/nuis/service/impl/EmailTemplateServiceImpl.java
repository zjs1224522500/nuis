package net.dormforce.nuis.service.impl;

import net.dormforce.nuis.service.EmailTemplateService;
import net.dormforce.nuis.support.dao.EmailTemplateDao;
import net.dormforce.nuis.support.pojo.EmailTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/21 0021.
 */
@Service("emailService")
public class EmailTemplateServiceImpl implements EmailTemplateService {

    @Autowired
    private EmailTemplateDao emailTemplateDao;

    @Override
    public List<EmailTemplate> getEmailTemplates() {
        return emailTemplateDao.findEmailTemplates();
    }

    @Override
    public EmailTemplate getEmailTemplate(int emailTemplateId) {
        return emailTemplateDao.findEmailTemplate(emailTemplateId);
    }

    @Override
    public Boolean saveEmailTemplate(EmailTemplate emailTemplate) {
        if(emailTemplate.getEmailTemplateId() != null){
            return emailTemplateDao.updateEmailTemplate(emailTemplate);
        }else{
            return emailTemplateDao.addEmailTemplate(emailTemplate);
        }
    }

    @Override
    public Boolean removeEmailTemplate(int emailTemplateId) {
        return emailTemplateDao.deleteEmailTemplate(emailTemplateId);
    }
}

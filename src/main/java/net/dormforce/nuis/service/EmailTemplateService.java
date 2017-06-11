package net.dormforce.nuis.service;

import net.dormforce.nuis.support.pojo.EmailTemplate;

import java.util.List;

/**
 * Created by ZhangJianshun on 2017/4/21 0021.
 */
public interface EmailTemplateService {

    public List<EmailTemplate> getEmailTemplates();

    public EmailTemplate getEmailTemplate(int emailTemplateId);

    public Boolean saveEmailTemplate(EmailTemplate emailTemplate);

    public Boolean removeEmailTemplate(int emailTemplateId);

}

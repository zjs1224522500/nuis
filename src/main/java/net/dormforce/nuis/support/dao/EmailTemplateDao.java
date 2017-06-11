package net.dormforce.nuis.support.dao;


import net.dormforce.nuis.support.pojo.EmailTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmailTemplateDao {

    public List<EmailTemplate> findEmailTemplates();

    public EmailTemplate findEmailTemplate(int emailTemplateId);

    public Boolean updateEmailTemplate(EmailTemplate emailTemplate);

    public Boolean addEmailTemplate(EmailTemplate emailTemplate);

    public Boolean deleteEmailTemplate(int emailTemplateId);
}
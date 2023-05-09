package com.ktg.mes.qc.service.Impl;

import com.ktg.mes.qc.domain.Template;
import com.ktg.mes.qc.mapper.TemplateMapper;
import com.ktg.mes.qc.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;

public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateMapper templateMapper;

    @Override
    public int insertTemplate(Template template) {
        return templateMapper.insertTemplate(template);
    }

    @Override
    public Template selectTemplateBytemplatecode(String template_code) {
        return templateMapper.selectTemplateBytemplatecode(template_code);
    }

    @Override
    public int updateTemplate(Template template) {
        return templateMapper.updateTemplate(template);
    }

    @Override
    public int deleteTemplateBytemplatecode(String template_code) {
        return templateMapper.deleteTemplateBytemplatecode(template_code);
    }
}

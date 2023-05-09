package com.ktg.mes.qc.service;

import com.ktg.mes.qc.domain.Template;

public interface TemplateService {
    int insertTemplate(Template template);

    Template selectTemplateBytemplatecode(String template_code);

    int updateTemplate(Template template);

    int deleteTemplateBytemplatecode(String template_code);
}

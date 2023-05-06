package com.ktg.mes.dv.service.Impl;

import com.ktg.mes.dv.domain.Subject;
import com.ktg.mes.dv.mapper.SubjectMapper;
import com.ktg.mes.dv.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;

public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public int insertSubject(Subject subject) {
        return subjectMapper.insertSubject(subject);
    }

    @Override
    public Subject selectSubjectBysubjectcode(String subject_code) {
        return subjectMapper.selectSubjectBysubjectcode(subject_code);
    }

    @Override
    public int updateSubject(Subject subject) {
        return subjectMapper.updateSubject(subject);
    }

    @Override
    public int deleteSubjectBysubjectcode(String subject_code) {
        return subjectMapper.deleteSubjectBysubjectcode(subject_code);
    }
}

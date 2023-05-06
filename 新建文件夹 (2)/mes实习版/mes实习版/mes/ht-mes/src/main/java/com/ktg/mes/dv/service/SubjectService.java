package com.ktg.mes.dv.service;

import com.ktg.mes.dv.domain.Machine;
import com.ktg.mes.dv.domain.Subject;

public interface SubjectService {
    int insertSubject(Subject subject);

    Subject selectSubjectBysubjectcode(String subject_code);

    int updateSubject(Subject subject);

    int deleteSubjectBysubjectcode(String subject_code);
}

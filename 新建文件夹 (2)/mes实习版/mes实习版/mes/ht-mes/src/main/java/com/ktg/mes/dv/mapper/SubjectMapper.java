package com.ktg.mes.dv.mapper;

import com.ktg.mes.dv.domain.Subject;

public interface SubjectMapper {
    int insertSubject(Subject subject);

    Subject selectSubjectBysubjectcode(String subject_code);

    int updateSubject(Subject subject);

    int deleteSubjectBysubjectcode(String subject_code);
}

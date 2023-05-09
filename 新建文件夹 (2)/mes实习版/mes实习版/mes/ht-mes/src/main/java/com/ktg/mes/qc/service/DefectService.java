package com.ktg.mes.qc.service;

import com.ktg.mes.qc.domain.Defect;

public interface DefectService {
    int insertDefect(Defect defect);

    Defect selectDefectBydefectcode(String defect_code);

    int updateDefect(Defect defect);

    int deleteDefectBydefectcode(String defect_code);
}

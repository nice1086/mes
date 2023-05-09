package com.ktg.mes.qc.mapper;

import com.ktg.mes.qc.domain.Defect;

public interface DefectMapper {
    int insertDefect(Defect defect);

    Defect selectDefectBydefectcode(String defect_code);

    int updateDefect(Defect defect);

    int deleteDefectBydefectcode(String defect_code);
}

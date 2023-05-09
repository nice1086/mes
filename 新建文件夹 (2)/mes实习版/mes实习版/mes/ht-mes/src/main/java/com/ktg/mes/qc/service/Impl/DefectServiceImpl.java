package com.ktg.mes.qc.service.Impl;

import com.ktg.mes.qc.domain.Defect;
import com.ktg.mes.qc.mapper.DefectMapper;
import com.ktg.mes.qc.service.DefectService;
import org.springframework.beans.factory.annotation.Autowired;

public class DefectServiceImpl implements DefectService {

    @Autowired
    private DefectMapper defectMapper;

    @Override
    public int insertDefect(Defect defect) {
        return defectMapper.insertDefect(defect);
    }

    @Override
    public Defect selectDefectBydefectcode(String defect_code) {
        return defectMapper.selectDefectBydefectcode(defect_code);
    }

    @Override
    public int updateDefect(Defect defect) {
        return defectMapper.updateDefect(defect);
    }

    @Override
    public int deleteDefectBydefectcode(String defect_code) {
        return defectMapper.deleteDefectBydefectcode(defect_code);
    }
}

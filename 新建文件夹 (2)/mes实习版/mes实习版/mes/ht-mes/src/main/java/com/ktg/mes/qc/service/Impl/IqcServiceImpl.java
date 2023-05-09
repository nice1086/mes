package com.ktg.mes.qc.service.Impl;

import com.ktg.mes.qc.domain.Iqc;
import com.ktg.mes.qc.mapper.IqcMapper;
import com.ktg.mes.qc.service.IqcService;
import org.springframework.beans.factory.annotation.Autowired;

public class IqcServiceImpl implements IqcService {

    @Autowired
    private IqcMapper iqcMapper;

    @Override
    public int insertIqc(Iqc iqc) {
        return iqcMapper.insertIqc(iqc);
    }

    @Override
    public Iqc selectIqcByiqccode(String iqc_code) {
        return iqcMapper.selectIqcByiqccode(iqc_code);
    }

    @Override
    public int updateIqc(Iqc iqc) {
        return iqcMapper.updateIqc(iqc);
    }

    @Override
    public int deleteIqcByiqccode(String iqc_code) {
        return iqcMapper.deleteIqcByiqccode(iqc_code);
    }
}

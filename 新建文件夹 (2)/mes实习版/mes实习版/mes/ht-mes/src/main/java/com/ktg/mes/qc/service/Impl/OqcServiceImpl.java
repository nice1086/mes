package com.ktg.mes.qc.service.Impl;

import com.ktg.mes.qc.domain.Oqc;
import com.ktg.mes.qc.mapper.OqcMapper;
import com.ktg.mes.qc.service.OqcService;
import org.springframework.beans.factory.annotation.Autowired;

public class OqcServiceImpl implements OqcService {

    @Autowired
    private OqcMapper oqcMapper;

    @Override
    public int insertOqc(Oqc oqc) {
        return oqcMapper.insertOqc(oqc);
    }

    @Override
    public Oqc selectOqcByoqccode(String oqc_code) {
        return oqcMapper.selectOqcByoqccode(oqc_code);
    }

    @Override
    public int updateOqc(Oqc oqc) {
        return oqcMapper.updateOqc(oqc);
    }

    @Override
    public int deleteOqcByoqccode(String oqc_code) {
        return oqcMapper.deleteOqcByoqccode(oqc_code);
    }
}

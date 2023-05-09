package com.ktg.mes.qc.service.Impl;

import com.ktg.mes.qc.domain.Ipqc;
import com.ktg.mes.qc.mapper.IpqcMapper;
import com.ktg.mes.qc.service.IpqcService;
import com.ktg.mes.qc.service.IqcService;
import org.springframework.beans.factory.annotation.Autowired;

public class IpqcServiceImpl implements IpqcService {

    @Autowired
    private IpqcMapper ipqcMapper;

    @Override
    public int insertIpqc(Ipqc ipqc) {
        return ipqcMapper.insertIpqc(ipqc);
    }

    @Override
    public Ipqc selectIqcByiqccode(String ipqc_code) {
        return ipqcMapper.selectIqcByiqccode(ipqc_code);
    }

    @Override
    public int updateIpqc(Ipqc ipqc) {
        return ipqcMapper.updateIpqc(ipqc);
    }

    @Override
    public int deleteIpqcByipqccode(String ipqc_code) {
        return ipqcMapper.deleteIpqcByipqccode(ipqc_code);
    }
}

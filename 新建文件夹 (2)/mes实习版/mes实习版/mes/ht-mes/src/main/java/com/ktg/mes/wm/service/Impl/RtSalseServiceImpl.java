package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.RtSalse;
import com.ktg.mes.wm.mapper.RtSalseMapper;
import com.ktg.mes.wm.service.RtSalseService;
import org.springframework.beans.factory.annotation.Autowired;

public class RtSalseServiceImpl implements RtSalseService {

    @Autowired
    private RtSalseMapper rtSalseMapper;

    @Override
    public int insertRtSalse(RtSalse rtSalse) {
        return rtSalseMapper.insertRtSalse(rtSalse);
    }

    @Override
    public RtSalse selectRtSalseByrtcode(String rt_code) {
        return rtSalseMapper.selectRtSalseByrtcode(rt_code);
    }

    @Override
    public int updateRtSalse(RtSalse rtSalse) {
        return rtSalseMapper.updateRtSalse(rtSalse);
    }

    @Override
    public int deleteRtSalseByrtcode(String rt_code) {
        return rtSalseMapper.deleteRtSalseByrtcode(rt_code);
    }
}

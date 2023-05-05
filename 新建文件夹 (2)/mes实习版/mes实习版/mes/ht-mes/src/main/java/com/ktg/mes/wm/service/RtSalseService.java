package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.RtSalse;

public interface RtSalseService {
    int insertRtSalse(RtSalse rtSalse);

    RtSalse selectRtSalseByrtcode(String rt_code);

    int updateRtSalse(RtSalse rtSalse);

    int deleteRtSalseByrtcode(String rt_code);
}

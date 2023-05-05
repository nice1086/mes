package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.RtSalse;

public interface RtSalseMapper {
    int insertRtSalse(RtSalse rtSalse);

    RtSalse selectRtSalseByrtcode(String rt_code);

    int updateRtSalse(RtSalse rtSalse);

    int deleteRtSalseByrtcode(String rt_code);
}

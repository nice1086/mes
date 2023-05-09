package com.ktg.mes.qc.mapper;

import com.ktg.mes.qc.domain.Ipqc;

public interface IpqcMapper {
    int insertIpqc(Ipqc ipqc);

    Ipqc selectIqcByiqccode(String ipqc_code);

    int updateIpqc(Ipqc ipqc);

    int deleteIpqcByipqccode(String ipqc_code);
}

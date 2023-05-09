package com.ktg.mes.qc.service;

import com.ktg.mes.qc.domain.Ipqc;

public interface IpqcService {
    int insertIpqc(Ipqc ipqc);

    Ipqc selectIqcByiqccode(String ipqc_code);

    int updateIpqc(Ipqc ipqc);

    int deleteIpqcByipqccode(String ipqc_code);
}

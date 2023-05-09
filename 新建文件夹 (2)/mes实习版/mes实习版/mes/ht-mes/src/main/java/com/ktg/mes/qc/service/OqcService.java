package com.ktg.mes.qc.service;

import com.ktg.mes.qc.domain.Oqc;

public interface OqcService {
    int insertOqc(Oqc oqc);

    Oqc selectOqcByoqccode(String oqc_code);

    int updateOqc(Oqc oqc);

    int deleteOqcByoqccode(String oqc_code);
}

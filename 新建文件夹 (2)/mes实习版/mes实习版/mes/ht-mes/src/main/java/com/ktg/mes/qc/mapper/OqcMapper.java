package com.ktg.mes.qc.mapper;

import com.ktg.mes.qc.domain.Oqc;

public interface OqcMapper {
    int insertOqc(Oqc oqc);

    Oqc selectOqcByoqccode(String oqc_code);

    int updateOqc(Oqc oqc);

    int deleteOqcByoqccode(String oqc_code);
}

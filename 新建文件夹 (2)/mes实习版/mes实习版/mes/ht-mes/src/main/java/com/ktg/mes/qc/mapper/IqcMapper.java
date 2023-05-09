package com.ktg.mes.qc.mapper;

import com.ktg.mes.qc.domain.Iqc;

public interface IqcMapper {
    int insertIqc(Iqc iqc);

    Iqc selectIqcByiqccode(String iqc_code);

    int updateIqc(Iqc iqc);

    int deleteIqcByiqccode(String iqc_code);
}

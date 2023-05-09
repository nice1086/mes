package com.ktg.mes.qc.service;

import com.ktg.mes.qc.domain.Iqc;

public interface IqcService {
    int insertIqc(Iqc iqc);

    Iqc selectIqcByiqccode(String iqc_code);

    int updateIqc(Iqc iqc);

    int deleteIqcByiqccode(String iqc_code);
}

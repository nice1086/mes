package com.ktg.mes.md.service;

import com.ktg.mes.md.domain.MdPro;
import com.ktg.mes.md.domain.MdProManager;

public interface MdProManagerService {
    MdPro selectMdProByitemcode(String item_code);

    int insertMdProManager(MdProManager mdProManager);

    int deleteMdProByitemcode(String item_code);

    int updateMdProManager(MdProManager mdProManager);
}

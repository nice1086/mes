package com.ktg.mes.md.mapper;

import com.ktg.mes.md.domain.MdPro;
import com.ktg.mes.md.domain.MdProManager;

//物料管理接口
public interface MdProManagerMapper {
    MdPro selectMdProByitemcode(String item_code);

    int insertMdProManager(MdProManager mdProManager);

    int deleteMdProByitemcode(String item_code);

    int updateMdProManager(MdProManager mdProManager);
}

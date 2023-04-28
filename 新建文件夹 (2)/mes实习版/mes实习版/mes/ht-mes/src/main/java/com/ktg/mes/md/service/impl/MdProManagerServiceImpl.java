package com.ktg.mes.md.service.impl;

import com.ktg.mes.md.domain.MdPro;
import com.ktg.mes.md.domain.MdProManager;
import com.ktg.mes.md.mapper.MdProManagerMapper;
import com.ktg.mes.md.service.MdProManagerService;
import org.springframework.beans.factory.annotation.Autowired;

public class MdProManagerServiceImpl implements MdProManagerService {

    @Autowired
    private MdProManagerMapper mdProManagerMapper;

    @Override
    public MdPro selectMdProByitemcode(String item_code) {
        return mdProManagerMapper.selectMdProByitemcode(item_code);
    }

    @Override
    public int insertMdProManager(MdProManager mdProManager) {
        return mdProManagerMapper.insertMdProManager(mdProManager);
    }

    @Override
    public int deleteMdProByitemcode(String item_code) {
        return mdProManagerMapper.deleteMdProByitemcode(item_code);
    }

    @Override
    public int updateMdProManager(MdProManager mdProManager) {
        return mdProManagerMapper.updateMdProManager(mdProManager);
    }
}

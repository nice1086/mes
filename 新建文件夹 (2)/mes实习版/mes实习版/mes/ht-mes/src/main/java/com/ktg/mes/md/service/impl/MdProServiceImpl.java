package com.ktg.mes.md.service.impl;

import com.ktg.mes.md.domain.MdPro;
import com.ktg.mes.md.mapper.MdProMapper;
import com.ktg.mes.md.service.MdProService;
import org.springframework.beans.factory.annotation.Autowired;

public class MdProServiceImpl implements MdProService {

    @Autowired
    private MdProMapper mdproMapper;

    @Override
    public MdPro selectMdProByParent(String parent) {
        return mdproMapper.selectMdProByParent(parent);
    }

    @Override
    public int insertMdPro(MdPro mdPro) {
        return mdproMapper.insertMdPro(mdPro);
    }

    @Override
    public int deleteMdProByParent(String parent) {
        return mdproMapper.deleteMdProByParent(parent);
    }

    @Override
    public int updateMdPro(MdPro mdPro) {
        return mdproMapper.updateMdPro(mdPro);
    }

}

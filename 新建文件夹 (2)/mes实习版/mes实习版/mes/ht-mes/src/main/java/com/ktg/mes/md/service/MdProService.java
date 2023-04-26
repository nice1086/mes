package com.ktg.mes.md.service;

import com.ktg.mes.md.domain.MdPro;

public interface MdProService {
    //传入父分类 获取信息
    MdPro selectMdProByParent(String parent);

    //插入
    int insertMdPro(MdPro mdPro);

    int deleteMdProByParent(String parent);

    int updateMdPro(MdPro mdPro);
}

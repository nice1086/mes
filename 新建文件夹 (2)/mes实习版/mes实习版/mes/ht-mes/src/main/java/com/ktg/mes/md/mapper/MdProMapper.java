package com.ktg.mes.md.mapper;

import com.ktg.mes.md.domain.MdPro;

//物料mapper接口
public interface MdProMapper {
    MdPro selectMdProByParent(String parent);

    int insertMdPro(MdPro mdPro);

    int deleteMdProByParent(String parent);

    int updateMdPro(MdPro mdPro);
}

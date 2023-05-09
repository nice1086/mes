package com.ktg.mes.qc.service.Impl;

import com.ktg.mes.qc.domain.Index;
import com.ktg.mes.qc.mapper.IndexMapper;
import com.ktg.mes.qc.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;

public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public int insertIndex(Index index) {
        return indexMapper.insertIndex(index);
    }

    @Override
    public Index selectIndexByindexcode(String index_code) {
        return indexMapper.selectIndexByindexcode(index_code);
    }

    @Override
    public int updateIndex(Index index) {
        return indexMapper.updateIndex(index);
    }

    @Override
    public int deleteIndexByindexcode(String index_code) {
        return indexMapper.deleteIndexByindexcode(index_code);
    }
}

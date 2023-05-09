package com.ktg.mes.qc.mapper;

import com.ktg.mes.qc.domain.Index;

public interface IndexMapper {
    int insertIndex(Index index);

    Index selectIndexByindexcode(String index_code);

    int updateIndex(Index index);

    int deleteIndexByindexcode(String index_code);
}

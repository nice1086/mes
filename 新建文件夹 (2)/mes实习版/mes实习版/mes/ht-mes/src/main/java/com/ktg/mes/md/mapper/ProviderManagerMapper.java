package com.ktg.mes.md.mapper;

import com.ktg.mes.md.domain.ProviderManager;

public interface ProviderManagerMapper {
    int insertProviderManager(ProviderManager providerManager);

    ProviderManager selectProviderByvendorcode(String vendor_code);

    int updateProviderManager(ProviderManager providerManager);

    int deleteProviderByvendorcode(String vendor_code);
}

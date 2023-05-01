package com.ktg.mes.md.service;

import com.ktg.mes.md.domain.ProviderManager;

public interface ProviderManagerService {
    int insertProviderManager(ProviderManager providerManager);

    ProviderManager selectProviderByvendorcode(String vendor_code);

    int updateProviderManager(ProviderManager providerManager);

    int deleteProviderByvendorcode(String vendor_code);
}

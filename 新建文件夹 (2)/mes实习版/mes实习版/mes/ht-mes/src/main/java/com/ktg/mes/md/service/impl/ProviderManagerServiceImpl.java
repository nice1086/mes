package com.ktg.mes.md.service.impl;

import com.ktg.mes.md.domain.ProviderManager;
import com.ktg.mes.md.mapper.ProviderManagerMapper;
import com.ktg.mes.md.service.ProviderManagerService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProviderManagerServiceImpl implements ProviderManagerService {

    @Autowired
    private ProviderManagerMapper providerManagerMapper;

    @Override
    public int insertProviderManager(ProviderManager providerManager) {
        return providerManagerMapper.insertProviderManager(providerManager);
    }

    @Override
    public ProviderManager selectProviderByvendorcode(String vendor_code) {
        return providerManagerMapper.selectProviderByvendorcode(vendor_code);
    }

    @Override
    public int updateProviderManager(ProviderManager providerManager) {
        return providerManagerMapper.updateProviderManager(providerManager);
    }

    @Override
    public int deleteProviderByvendorcode(String vendor_code) {
        return providerManagerMapper.deleteProviderByvendorcode(vendor_code);
    }
}

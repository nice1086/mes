package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.RtVendor;
import com.ktg.mes.wm.mapper.RtVendorMapper;
import com.ktg.mes.wm.service.RtVendorService;
import org.springframework.beans.factory.annotation.Autowired;

public class RtVendorServiceImpl implements RtVendorService {

    @Autowired
    private RtVendorMapper rtVendorMapper;

    @Override
    public int insertRtVendor(RtVendor rtVendor) {
        return rtVendorMapper.insertRtVendor(rtVendor);
    }

    @Override
    public RtVendor selectRtVendorByrtcode(String rt_code) {
        return rtVendorMapper.selectRtVendorByrtcode(rt_code);
    }

    @Override
    public int updateRtVendor(RtVendor rtVendor) {
        return rtVendorMapper.updateRtVendor(rtVendor);
    }

    @Override
    public int deleteRtVendorByrtcode(String rt_code) {
        return rtVendorMapper.deleteRtVendorByrtcode(rt_code);
    }
}

package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.RtVendor;

public interface RtVendorService {
    int insertRtVendor(RtVendor rtVendor);

    RtVendor selectRtVendorByrtcode(String rt_code);

    int updateRtVendor(RtVendor rtVendor);

    int deleteRtVendorByrtcode(String rt_code);
}

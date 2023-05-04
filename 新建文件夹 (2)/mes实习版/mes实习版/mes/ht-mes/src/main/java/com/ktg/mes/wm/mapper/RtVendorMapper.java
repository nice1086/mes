package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.RtVendor;

public interface RtVendorMapper {
    int insertRtVendor(RtVendor rtVendor);

    RtVendor selectRtVendorByrtcode(String rt_code);

    int updateRtVendor(RtVendor rtVendor);

    int deleteRtVendorByrtcode(String rt_code);
}

package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.Location;

public interface LocationMapper {
    int updateLocation(Location location);

    int deleteLocationByrecptcode(String recpt_code);

    int insertLocation(Location location);

    Location selectLocationByrecptcode(String recpt_code);
}

package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.Location;

public interface LocationService {
     int updateLocation(Location location);

     int deleteLocationByrecptcode(String recpt_code);

     int insertLocation(Location location);

     Location selectLocationByrecptcode(String recpt_code);
}

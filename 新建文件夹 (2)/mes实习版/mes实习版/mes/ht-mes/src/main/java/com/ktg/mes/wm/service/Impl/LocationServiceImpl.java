package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.Location;
import com.ktg.mes.wm.mapper.LocationMapper;
import com.ktg.mes.wm.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;

public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public int updateLocation(Location location) {
        return locationMapper.updateLocation(location);
    }

    @Override
    public int deleteLocationByrecptcode(String recpt_code) {
        return locationMapper.deleteLocationByrecptcode(recpt_code);
    }

    @Override
    public int insertLocation(Location location) {
        return locationMapper.insertLocation(location);
    }

    @Override
    public Location selectLocationByrecptcode(String recpt_code) {
        return locationMapper.selectLocationByrecptcode(recpt_code);
    }
}

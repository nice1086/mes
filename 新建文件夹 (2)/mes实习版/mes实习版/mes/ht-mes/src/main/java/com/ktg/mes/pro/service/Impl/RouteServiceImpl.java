package com.ktg.mes.pro.service.Impl;

import com.ktg.mes.pro.domain.Route;
import com.ktg.mes.pro.mapper.RouteMapper;
import com.ktg.mes.pro.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;

public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteMapper routeMapper;

    @Override
    public int insertRoute(Route route) {
        return routeMapper.insertRoute(route);
    }

    @Override
    public Route selectRouteByroutecode(String route_code) {
        return routeMapper.selectRouteByroutecode(route_code);
    }

    @Override
    public int updateRoute(Route route) {
        return routeMapper.updateRoute(route);
    }

    @Override
    public int deleteRouteByroutecode(String route_code) {
        return routeMapper.deleteRouteByroutecode(route_code);
    }
}

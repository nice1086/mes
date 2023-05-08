package com.ktg.mes.pro.mapper;

import com.ktg.mes.pro.domain.Route;

public interface RouteMapper {
    int insertRoute(Route route);

    Route selectRouteByroutecode(String route_code);

    int updateRoute(Route route);

    int deleteRouteByroutecode(String route_code);
}

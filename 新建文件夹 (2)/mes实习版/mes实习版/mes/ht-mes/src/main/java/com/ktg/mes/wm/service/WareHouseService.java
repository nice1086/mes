package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.WareHouse;

public interface WareHouseService {
    int insertWareHouse(WareHouse wareHouse);

    WareHouse selectWareHouseBywarehousecode(String workstation_code);

    int updateWareHouse(WareHouse wareHouse);

    int deleteWareHouseBywarehousecode(String warehouse_code);
}

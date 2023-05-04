package com.ktg.mes.wm.mapper;

import com.ktg.mes.wm.domain.WareHouse;

public interface WareHouseMapper {
    int insertWareHouse(WareHouse wareHouse);

    WareHouse selectWareHouseBywarehousecode(String workstation_code);

    int updateWareHouse(WareHouse wareHouse);

    int deleteWareHouseBywarehousecode(String warehouse_code);
}

package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.WareHouse;
import com.ktg.mes.wm.mapper.WareHouseMapper;
import com.ktg.mes.wm.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;

public class WareHouseServiceImpl implements WareHouseService {

    @Autowired
    private WareHouseMapper wareHouseMapper;

    @Override
    public int insertWareHouse(WareHouse wareHouse) {
        return wareHouseMapper.insertWareHouse(wareHouse);
    }

    @Override
    public WareHouse selectWareHouseBywarehousecode(String workstation_code) {
        return wareHouseMapper.selectWareHouseBywarehousecode(workstation_code);
    }

    @Override
    public int updateWareHouse(WareHouse wareHouse) {
        return wareHouseMapper.updateWareHouse(wareHouse);
    }

    @Override
    public int deleteWareHouseBywarehousecode(String warehouse_code) {
        return wareHouseMapper.deleteWareHouseBywarehousecode(warehouse_code);
    }
}

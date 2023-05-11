package com.ktg.mes.cal.service.Impl;

import com.ktg.mes.cal.domain.Holiday;
import com.ktg.mes.cal.mapper.HolidayMapper;
import com.ktg.mes.cal.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;

public class HolidayServiceImpl implements HolidayService {

    @Autowired
    private HolidayMapper holidayMapper;

    @Override
    public int insertHoliday(Holiday holiday) {
        return holidayMapper.insertHoliday(holiday);
    }

    @Override
    public Holiday selectHolidayByholidayid(String holiday_id) {
        return holidayMapper.selectHolidayByholidayid(holiday_id);
    }

    @Override
    public int updateHoliday(Holiday holiday) {
        return holidayMapper.updateHoliday(holiday);
    }

    @Override
    public int deleteHolidayByholidayid(String holiday_id) {
        return holidayMapper.deleteHolidayByholidayid(holiday_id);
    }
}

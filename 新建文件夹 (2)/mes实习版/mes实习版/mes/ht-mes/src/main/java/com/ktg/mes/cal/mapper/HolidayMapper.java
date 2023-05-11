package com.ktg.mes.cal.mapper;

import com.ktg.mes.cal.domain.Holiday;

public interface HolidayMapper {
    int insertHoliday(Holiday holiday);

    Holiday selectHolidayByholidayid(String holiday_id);

    int updateHoliday(Holiday holiday);

    int deleteHolidayByholidayid(String holiday_id);
}

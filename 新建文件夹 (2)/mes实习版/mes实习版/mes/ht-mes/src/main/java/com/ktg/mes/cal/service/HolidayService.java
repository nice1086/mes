package com.ktg.mes.cal.service;

import com.ktg.mes.cal.domain.Holiday;

public interface HolidayService {
    int insertHoliday(Holiday holiday);

    Holiday selectHolidayByholidayid(String holiday_id);

    int updateHoliday(Holiday holiday);

    int deleteHolidayByholidayid(String holiday_id);
}

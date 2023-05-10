package com.ktg.mes.cal.mapper;

import com.ktg.mes.cal.domain.Plan;
import com.ktg.mes.cal.domain.Team;

public interface PlanMapper {
    int insertPlan(Plan plan);

    Plan selectPlanByplancode(String plan_code);

    int updatePlan(Plan plan);

    int deletePlanByplancode(String plan_code);
}

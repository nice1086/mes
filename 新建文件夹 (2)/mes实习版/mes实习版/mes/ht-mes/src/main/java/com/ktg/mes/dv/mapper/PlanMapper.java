package com.ktg.mes.dv.mapper;

import com.ktg.mes.dv.domain.Plan;

public interface PlanMapper {
    int insertPlan(Plan plan);

    Plan selectPlanByplancode(String plan_code);

    int updatePlan(Plan plan);

    int deletePlanByplancode(String plan_code);
}

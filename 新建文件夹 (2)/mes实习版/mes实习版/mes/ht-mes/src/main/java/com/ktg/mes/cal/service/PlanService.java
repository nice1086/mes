package com.ktg.mes.cal.service;

import com.ktg.mes.cal.domain.Plan;
import com.ktg.mes.cal.domain.Team;

public interface PlanService {
    int insertPlan(Plan plan);

    Plan selectPlanByplancode(String plan_code);

    int updatePlan(Plan plan);

    int deletePlanByplancode(String plan_code);
}

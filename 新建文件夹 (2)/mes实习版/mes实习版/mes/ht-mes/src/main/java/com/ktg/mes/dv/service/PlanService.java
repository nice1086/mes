package com.ktg.mes.dv.service;

import com.ktg.mes.dv.domain.Plan;

public interface PlanService {
    int insertPlan(Plan plan);

    Plan selectPlanByplancode(String plan_code);

    int updatePlan(Plan plan);

    int deletePlanByplancode(String plan_code);
}

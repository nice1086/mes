package com.ktg.mes.cal.service.Impl;

import com.ktg.mes.cal.domain.Plan;
import com.ktg.mes.cal.domain.Team;
import com.ktg.mes.cal.mapper.PlanMapper;
import com.ktg.mes.cal.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;

public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanMapper planMapper;

    @Override
    public int insertPlan(Plan plan) {
        return planMapper.insertPlan(plan);
    }

    @Override
    public Plan selectPlanByplancode(String plan_code) {
        return planMapper.selectPlanByplancode(plan_code);
    }

    @Override
    public int updatePlan(Plan plan) {
        return planMapper.updatePlan(plan);
    }

    @Override
    public int deletePlanByplancode(String plan_code) {
        return planMapper.deletePlanByplancode(plan_code);
    }
}

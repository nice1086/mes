package com.ktg.mes.pro.service.Impl;

import com.ktg.mes.pro.domain.Workorder;
import com.ktg.mes.pro.mapper.ProcessMapper;
import com.ktg.mes.pro.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private ProcessMapper processMapper;

    @Override
    public int insertProcess(Process process) {
        return processMapper.insertProcess(process);
    }

    @Override
    public Process selectProcessByprocesscode(String process_code) {
        return processMapper.selectProcessByprocesscode(process_code);
    }

    @Override
    public int updateProcess(Process process) {
        return processMapper.updateProcess( process);
    }

    @Override
    public int deleteProcessByprocesscode(String process_code) {
        return processMapper.deleteProcessByprocesscode(process_code);
    }
}

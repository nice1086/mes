package com.ktg.mes.pro.service;

import com.ktg.mes.pro.domain.Workorder;

public interface ProcessService {
    int insertProcess(Process process);

    Process selectProcessByprocesscode(String process_code);

    int updateProcess(Process process);

    int deleteProcessByprocesscode(String process_code);
}

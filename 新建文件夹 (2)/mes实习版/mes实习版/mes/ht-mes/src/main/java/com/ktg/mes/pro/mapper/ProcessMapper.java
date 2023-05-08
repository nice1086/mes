package com.ktg.mes.pro.mapper;

public interface ProcessMapper {
    int insertProcess(Process process);

    Process selectProcessByprocesscode(String process_code);

    int updateProcess(Process process);

    int deleteProcessByprocesscode(String process_code);
}

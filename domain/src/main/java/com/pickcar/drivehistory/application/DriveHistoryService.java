package com.pickcar.drivehistory.application;

import com.pickcar.drivehistory.domain.DriveHistory;
import com.pickcar.drivehistory.infrastructure.DriveHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DriveHistoryService {

    private final DriveHistoryRepository driveHistoryRepository;
    
    public void create() {
        //TODO: 운행기록 생성
    }
    
    public DriveHistory getById(Long id) {
        //TODO: ID 기반 조회 구현
        return null;
    }
}

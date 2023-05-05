package com.ktg.mes.wm.service.Impl;

import com.ktg.mes.wm.domain.Package;
import com.ktg.mes.wm.mapper.PackageMapper;
import com.ktg.mes.wm.service.PackageService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;

public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageMapper packageMapper;

    @Override
    public int insertPackage(Package pacKage) {
        return packageMapper.insertPackage(pacKage);
    }

    @Override
    public Package selectPackageBypackagecode(String package_code) {
        return packageMapper.selectPackageBypackagecode(package_code);
    }

    @Override
    public int updatePackage(Package pacKage) {
        return packageMapper.updatePackage(pacKage);
    }

    @Override
    public int deletePackageBypackagecode(String package_code) {
        return packageMapper.deletePackageBypackagecode(package_code);
    }
}

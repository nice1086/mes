package com.ktg.mes.wm.service;

import com.ktg.mes.wm.domain.Package;

public interface PackageService {
    int insertPackage(Package pacKage);

    Package selectPackageBypackagecode(String package_code);

    int updatePackage(Package pacKage);

    int deletePackageBypackagecode(String package_code);
}

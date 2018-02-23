package com.cj.mypermission;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
/**
 * 作者： 陈骏
 * 创建时间： 2018/2/14
 * 博客： https://www.jianshu.com/u/c5ada9939f6d
 * Q Q： 200622550
 * 作用：检查权限的工具类
 */
public class PermissionsChecker {
    private final Context mContext;

    public PermissionsChecker(Context context) {
        mContext = context.getApplicationContext();
    }

    // 判断权限集合
    public boolean lacksPermissions(String... permissions) {
        for (String permission : permissions) {
            if (lacksPermission(permission)) {
                return true;
            }
        }
        return false;
    }

    // 判断是否缺少权限
    private boolean lacksPermission(String permission) {
        return ContextCompat.checkSelfPermission(mContext, permission) ==
                PackageManager.PERMISSION_DENIED;
    }
}

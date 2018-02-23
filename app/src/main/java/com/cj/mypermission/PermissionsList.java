package com.cj.mypermission;

import android.Manifest;

/**
 * 作者： 陈骏
 * 创建时间： 2018/2/14
 * 博客： https://www.jianshu.com/u/c5ada9939f6d
 * Q Q： 200622550
 * 作用：权限列表
 */

public class PermissionsList {

    /**
     * Normal Permissions
     * 配置清单申请
     */
    public static final String ACCESS_LOCATION_EXTRA_COMMANDS = Manifest.permission.ACCESS_LOCATION_EXTRA_COMMANDS;
    public static final String ACCESS_NETWORK_STATE = Manifest.permission.ACCESS_NETWORK_STATE;
    public static final String ACCESS_NOTIFICATION_POLICY = Manifest.permission.ACCESS_NOTIFICATION_POLICY;
    public static final String ACCESS_WIFI_STATE = Manifest.permission.ACCESS_WIFI_STATE;
    public static final String BLUETOOTH = Manifest.permission.BLUETOOTH;
    public static final String BLUETOOTH_ADMIN = Manifest.permission.BLUETOOTH_ADMIN;
    public static final String BROADCAST_STICKY = Manifest.permission.BROADCAST_STICKY;
    public static final String CHANGE_NETWORK_STATE = Manifest.permission.CHANGE_NETWORK_STATE;
    public static final String CHANGE_WIFI_MULTICAST_STATE = Manifest.permission.CHANGE_WIFI_MULTICAST_STATE;
    public static final String CHANGE_WIFI_STATE = Manifest.permission.CHANGE_WIFI_STATE;
    public static final String DISABLE_KEYGUARD = Manifest.permission.DISABLE_KEYGUARD;
    public static final String EXPAND_STATUS_BAR = Manifest.permission.EXPAND_STATUS_BAR;
    public static final String GET_PACKAGE_SIZE = Manifest.permission.GET_PACKAGE_SIZE;
    public static final String INSTALL_SHORTCUT = Manifest.permission.INSTALL_SHORTCUT;
    public static final String INTERNET = Manifest.permission.INTERNET;
    public static final String KILL_BACKGROUND_PROCESSES = Manifest.permission.KILL_BACKGROUND_PROCESSES;
    public static final String MODIFY_AUDIO_SETTINGS = Manifest.permission.MODIFY_AUDIO_SETTINGS;
    public static final String NFC = Manifest.permission.NFC;
    public static final String READ_SYNC_SETTINGS = Manifest.permission.READ_SYNC_SETTINGS;
    public static final String READ_SYNC_STATS = Manifest.permission.READ_SYNC_STATS;
    public static final String RECEIVE_BOOT_COMPLETED = Manifest.permission.RECEIVE_BOOT_COMPLETED;
    public static final String REORDER_TASKS = Manifest.permission.REORDER_TASKS;
    public static final String REQUEST_INSTALL_PACKAGES = Manifest.permission.REQUEST_INSTALL_PACKAGES;
    public static final String SET_ALARM = Manifest.permission.SET_ALARM;
    public static final String SET_TIME_ZONE = Manifest.permission.SET_TIME_ZONE;
    public static final String SET_WALLPAPER = Manifest.permission.SET_WALLPAPER;
    public static final String SET_WALLPAPER_HINTS = Manifest.permission.SET_WALLPAPER_HINTS;
    public static final String TRANSMIT_IR = Manifest.permission.TRANSMIT_IR;
    public static final String UNINSTALL_SHORTCUT = Manifest.permission.UNINSTALL_SHORTCUT;
    public static final String USE_FINGERPRINT = Manifest.permission.USE_FINGERPRINT;
    public static final String VIBRATE = Manifest.permission.VIBRATE;
    public static final String WAKE_LOCK = Manifest.permission.WAKE_LOCK;
    public static final String WRITE_SYNC_SETTINGS = Manifest.permission.WRITE_SYNC_SETTINGS;


    /**
     * Dangerous Permissions
     * 需要申请的权限
     */
    public static final String WRITE_CONTACTS = Manifest.permission.GET_ACCOUNTS;
    public static final String GET_ACCOUNTS = Manifest.permission.GET_ACCOUNTS;
    public static final String READ_CONTACTS = Manifest.permission.READ_CONTACTS;
    public static final String READ_CALL_LOG = Manifest.permission.READ_CALL_LOG;
    public static final String READ_PHONE_STATE = Manifest.permission.READ_PHONE_STATE;
    public static final String CALL_PHONE = Manifest.permission.CALL_PHONE;
    public static final String WRITE_CALL_LOG = Manifest.permission.WRITE_CALL_LOG;
    public static final String USE_SIP = Manifest.permission.USE_SIP;
    public static final String PROCESS_OUTGOING_CALLS = Manifest.permission.PROCESS_OUTGOING_CALLS;
    public static final String ADD_VOICEMAIL = Manifest.permission.ADD_VOICEMAIL;
    public static final String READ_CALENDAR = Manifest.permission.READ_CALENDAR;
    public static final String WRITE_CALENDAR = Manifest.permission.WRITE_CALENDAR;
    public static final String CAMERA = Manifest.permission.CAMERA;
    public static final String BODY_SENSORS = Manifest.permission.BODY_SENSORS;
    public static final String ACCESS_FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    public static final String ACCESS_COARSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    public static final String READ_EXTERNAL_STORAGE = Manifest.permission.READ_EXTERNAL_STORAGE;
    public static final String WRITE_EXTERNAL_STORAGE = Manifest.permission.WRITE_EXTERNAL_STORAGE;
    public static final String RECORD_AUDIO = Manifest.permission.RECORD_AUDIO;
    public static final String READ_SMS = Manifest.permission.READ_SMS;
    public static final String RECEIVE_WAP_PUSH = Manifest.permission.RECEIVE_WAP_PUSH;
    public static final String RECEIVE_MMS = Manifest.permission.RECEIVE_MMS;
    public static final String RECEIVE_SMS = Manifest.permission.RECEIVE_SMS;
    public static final String SEND_SMS = Manifest.permission.SEND_SMS;
}

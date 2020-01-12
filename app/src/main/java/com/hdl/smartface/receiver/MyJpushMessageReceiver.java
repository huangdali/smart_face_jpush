package com.hdl.smartface.receiver;

import android.content.Context;
import android.util.Log;

import cn.jpush.android.api.JPushMessage;
import cn.jpush.android.service.JPushMessageReceiver;

/**
 * 自定义JPush message 接收器,包括操作tag/alias的结果返回(仅仅包含tag/alias新接口部分)
 *
 * @author Admin
 */
public class MyJpushMessageReceiver extends JPushMessageReceiver {
    private static final String TAG = "MyJpushMessageReceiver";

    @Override
    public void onTagOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onTagOperatorResult(context, jPushMessage);
        Log.e(TAG, "onTagOperatorResult: code = " + jPushMessage.getErrorCode());
    }

    @Override
    public void onCheckTagOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onCheckTagOperatorResult(context, jPushMessage);
        Log.e(TAG, "onCheckTagOperatorResult: code = " + jPushMessage.getErrorCode());
    }

    @Override
    public void onAliasOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onAliasOperatorResult(context, jPushMessage);
        Log.e(TAG, "onAliasOperatorResult: code = " + jPushMessage.getErrorCode());
    }

    @Override
    public void onMobileNumberOperatorResult(Context context, JPushMessage jPushMessage) {
        super.onMobileNumberOperatorResult(context, jPushMessage);
        Log.e(TAG, "onMobileNumberOperatorResult: code = " + jPushMessage.getErrorCode());
    }
}

package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new xyz.luan.audioplayers.AudioplayersPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.mr.flutter.plugin.filepicker.FilePickerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.hiennv.flutter_callkit_incoming.FlutterCallkitIncomingPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_callkit_incoming_yoer, com.hiennv.flutter_callkit_incoming.FlutterCallkitIncomingPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.flutter.logs.plogs.flutter_logs.FlutterLogsPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_logs, com.flutter.logs.plogs.flutter_logs.FlutterLogsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new flutter.plugins.vibrate.VibratePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_vibrate, flutter.plugins.vibrate.VibratePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.wingli.is_lock_screen2.IsLockScreenPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin is_lock_screen2, com.wingli.is_lock_screen2.IsLockScreenPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.github.rmtmckenzie.native_device_orientation.NativeDeviceOrientationPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin native_device_orientation, com.github.rmtmckenzie.native_device_orientation.NativeDeviceOrientationPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new im.zego.zego_express_engine.ZegoExpressEnginePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin zego_express_engine, im.zego.zego_express_engine.ZegoExpressEnginePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.zegocloud.uikit.zego_uikit_plugin.ZegoUikitPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin zego_uikit, com.zegocloud.uikit.zego_uikit_plugin.ZegoUikitPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.zegocloud.uikit.call_plugin.ZegoUIKitCallPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin zego_uikit_prebuilt_call, com.zegocloud.uikit.call_plugin.ZegoUIKitCallPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.zegocloud.uikit.flutter.signal_plugin.zego_uikit_signaling_plugin.ZegoUikitSignalingPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin zego_uikit_signaling_plugin, com.zegocloud.uikit.flutter.signal_plugin.zego_uikit_signaling_plugin.ZegoUikitSignalingPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new im.zego.zim_flutter.ZegoZimPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin zego_zim, im.zego.zim_flutter.ZegoZimPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new im.zego.zpns_flutter.ZegoZpnsPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin zego_zpns, im.zego.zpns_flutter.ZegoZpnsPlugin", e);
    }
  }
}

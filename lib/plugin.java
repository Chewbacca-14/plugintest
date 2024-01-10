package com.example.pplugintest;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry.Registrar;

public class PlatformVersionPlugin implements MethodChannel.MethodCallHandler {

    public static void registerWith(Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "platform_version_plugin");
        channel.setMethodCallHandler(new PlatformVersionPlugin(registrar));
    }

    private PlatformVersionPlugin(Registrar registrar) {
        // Constructor
    }

    @Override
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        if (call.method.equals("getPlatformVersion")) {
            // Implement platform version retrieval here
            // For Android, you can use android.os.Build.VERSION.RELEASE
         
            // For iOS, you can use UIDevice.current.systemVersion
            result.success(android.os.Build.VERSION.RELEASE);
        } else {
            result.notImplemented();
        }
    }
}

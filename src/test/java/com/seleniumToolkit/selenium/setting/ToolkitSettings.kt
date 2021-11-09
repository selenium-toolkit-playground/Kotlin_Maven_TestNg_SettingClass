package com.seleniumToolkit.selenium.setting

import com.seleniumToolkit.selenium.framework.dataLoader.settings.Browser
import com.seleniumToolkit.selenium.framework.dataLoader.settings.ExecutiveEnvironment
import com.seleniumToolkit.selenium.framework.dataLoader.settings.MobileDevice
import com.seleniumToolkit.selenium.framework.dataLoader.settings.ToolkitSettingInterface
import com.seleniumToolkit.selenium.framework.grid.Vendor
import org.apache.logging.log4j.Level
import java.util.*

class ToolkitSettings : ToolkitSettingInterface {
    override fun getExecutiveEnvironment(): ExecutiveEnvironment {
        return ExecutiveEnvironment.LOCAL
    }

    override fun getRemoteGridUrl(): String {
        return ""
    }

    override fun getGridVendor(): Vendor {
        return Vendor.DUMMY_VENDOR
    }

    override fun getAllowedParallelThreads(): Int {
        return 1
    }

    override fun getWebDriverInternetExplorerDriverLocation(): String {
        return ""
    }

    override fun getWebDriverFirefoxDriverLocation(): String {
        return ""
    }

    override fun getWebDriverChromeDriverLocation(): String {
        return ""
    }

    override fun getBrowsers(): List<Browser> {
        return Arrays.asList(
                Browser("chrome")
        )
    }

    override fun getMobileDevices(): List<MobileDevice> {
        return Arrays.asList();
    }

    override fun getWebDriverInterceptor(): String {
        return "com.seleniumToolkit.selenium.setting.CustomWebDriverInterceptor"
    }

    override fun getLicense(): String {
        return ""
    }

    override fun getLoggerLevel(): Level {
        return Level.INFO
    }

    override fun getNetworkTrafficCapturing(): Boolean {
        return false
    }

    override fun getCaptureModeNoDiff(): Boolean {
        return false
    }
}
package com.seleniumToolkit.selenium.setting

import com.seleniumToolkit.selenium.framework.dataLoader.settings.*
import com.seleniumToolkit.selenium.framework.grid.Vendor
import com.seleniumToolkit.selenium.framework.grid.vendorOption.sauceLabs.SauceLabsOptions
import com.seleniumToolkit.selenium.framework.listeners.webdriver.SpeedMode
import com.seleniumToolkit.selenium.framework.modul.reporting.jiraXrayReporter.JiraReporterConfig
import com.seleniumToolkit.selenium.framework.modul.reporting.slack.SlackReporterConfig
import org.apache.logging.log4j.Level
import org.openqa.selenium.Capabilities
import org.openqa.selenium.remote.DesiredCapabilities
import java.util.*

class ToolkitSettings : ToolkitSettingInterface {

    /**
     * Description: If the switch is on grid, the tests will run on the defined grid.
     * If the switch is on local, the tests will run local on your machine.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getExecutiveEnvironment(): ExecutiveEnvironment? {
        return ExecutiveEnvironment.LOCAL
        //return ExecutiveEnvironment.GRID;
    }

    /**
     * Description: Url of the Grid without the ending “/wd/hub” where the tests should be executed in grid mode.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getRemoteGridUrl(): String? {
        return ""
    }

    /**
     * Description: Define the GridVendor if you have a SeleniumGrid of a Vendor.
     * The Functions of this Vendor will automaticly be added to your testrun.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getGridVendor(): Vendor? {
        return Vendor.DUMMY_VENDOR
        //return Vendor.SBOX_ELEMENT34;
        //return Vendor.SAUCELABS;
    }

    /**
     * Description: You can define how many tests may run in parallel.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getAllowedParallelThreads(): Int {
        return 1
    }

    /**
     * Description: Define a logging level for System-Output and Log-Files.
     * For Support, please set “DEBUG” to send us a detailed log.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getLoggerLevel(): Level? {
        return Level.INFO
        //return Level.DEBUG;
    }

    /**
     * Description: If switch to "true", the Selenium-Toolkit will autodownload the Driver.exe files for you.
     * If this cause problem, please switch to false and define the Driver.exe Location with the Methods like #getWebDriverInternetExplorerDriverLocation();
     * Since Version: 1.3.25
     * Expired Version: -
     */
    override fun getWebdriverAutoDownloadDriverExeEnabled(): Boolean {
        return false
    }

    /**
     * Description: Define the path to the InternetExplorerDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getWebDriverInternetExplorerDriverLocation(): String? {
        return ""
    }

    /**
     * Description: Define the path to the EdgeDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getWebDriverEdgeDriverLocation(): String? {
        return ""
    }

    /**
     * Description: Define the path to the FirefoxDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getWebDriverFirefoxDriverLocation(): String? {
        return ""
    }

    /**
     * Description: Define the path to the ChromeDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getWebDriverChromeDriverLocation(): String? {
        return ""
    }

    /**
     * Description: Define the path to the OperaDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getWebDriverOperaDriverLocation(): String? {
        return ""
    }

    /**
     * Description: You can define browser, versions and PlatformNames.
     * If you only define the browser, the grid will take the default version.
     * If you define multiple Browsers, it will clone the Tests and each test will then be run automatically with each of the browsers. *PRO-Feature*"
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getBrowsers(): List<Browser>? {
        return Arrays.asList(
                Browser("chrome")
        )
    }

    /**
     * Description: You can define a download directory in which all downloads are automatically saved in the case of a local Chrome or Firefox.
     * All necessary settings in Chrome and Firefox are set automatically.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getBrowserDownloadDirectory(): String? {
        return "target/download/"
    }

    /**
     * Description: If this property is setted, the toolkit will use Neoload as Proxy to capture the protocol.
     * Neoload must be running and a porject should be open.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getNeoloadEnabled(): Boolean {
        return false
    }

    /**
     * Description: Settings which will be used in [com.seleniumToolkit.selenium.framework.database.DatabaseScriptExecutor] to create a DB connection to execute your scripts.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getDbJdbxConfig(): DbJdbcConfig? {
        return null
        /*
        val hibernateShowSql = false
        return DbJdbcConfig(
                "jdbcDriver",
                "jdbcUrl",
                "jdbcUser",
                "jdbcPassword",
                "jtaDataSource",
                hibernateShowSql
        )
        */
    }

    /**
     * Description: Define your license-key to activate the Pro-Features.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getLicense(): String? {
        return ""
    }

    /**
     * Description: Define the LicenseServer endpoint where the license is to be collected.
     * Since Version: 1.3.25
     * Expired Version: -
     */
    override fun getLicenseServer(): String? {
        return null
    }

    /**
     * Description: General Capabilities for Webdriver
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getGenerallCapabilities(): Capabilities? {
        return DesiredCapabilities()
    }

    /**
     * Description: You can set captureModeNoDiff. If this is setted, the Screenshot-Diff-Mode will not create a Diff-Screenshot, it will recapture new reverence-images.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getCaptureModeNoDiff(): Boolean {
        return false
    }

    /**
     * Description: You can set dontCloseLocalBrowser. If this is setted, local browsers will not be closed after test end.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getDontCloseLocalBrowser(): Boolean {
        return false
    }

    /**
     * Description: URL to the local Appium server on which the mobile tests are executed if the execution is set to Local.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getLoaclAppiumServerUrl(): String? {
        return ""
    }

    /**
     * Description: You can define mobileDevice, version and platform.
     * If you define multiple MobileDevices, it will clone the Tests and each test will then be run automatically with each of the device. *PRO-Feature*"
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getMobileDevices(): List<MobileDevice?>? {
        return ArrayList()
    }

    /**
     * Description: General Capabilities for Mobile-Webdriver
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getGenerallMobileCapabilities(): Capabilities? {
        return DesiredCapabilities()
    }

    /**
     * Description: You are able to define different speedMode to slow down your Tests for a Demo or something like this. The Toolkit will automaticly wait after highlighting your action on the screen before it will do the next action.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getSpeedMode(): SpeedMode? {
        return SpeedMode.NORMAL
        //return SpeedMode.SLOW;
        //return SpeedMode.VERY_SLOW;
    }

    /**
     * Description: You can define a WebDriver-Interceptor which will be called befor a WebDriver will be created. Please set package and Classname as Value of this property like "com.selenium-toolkit.Interceptor". This class should implements "WebDriverInterceptor".
     * Since Version: 1.3.22
     * Expired Version: -
     */
    override fun getWebDriverInterceptor(): String? {
        return "com.seleniumToolkit.selenium.setting.CustomWebDriverInterceptor"
    }

    /**
     * Description: Add SauceLabsOptions if your GridVendor is SauceLabs
     * Since Version: 1.3.23
     * Expired Version: -
     */
    override fun getSauceLabsOption(): SauceLabsOptions? {
        return null
        /*
        val sauceLabsOptions = SauceLabsOptions()
        sauceLabsOptions.setTags("Tag")
        return sauceLabsOptions
        */
    }

    /**
     * Description: If this property is setted, the toolkit will start a Proxy for each Browser and Capture the Network Traffic
     * Since Version: 1.3.23
     * Expired Version: -
     */
    override fun getNetworkTrafficCapturing(): Boolean {
        return false
    }

    /**
     * Description: You can define the JiraReporterConfig to enable the JiraReportingModule
     * Since Version: 1.3.23
     * Expired Version: -
     */
    override fun getTestProjectName(): String? {
        return "Demo Project"
    }

    /**
     * Description: You can define the JiraReporterConfig to enable the JiraReportingModule
     * Since Version: 1.3.23
     * Expired Version: -
     */
    override fun getJiraReporterConfig(): JiraReporterConfig? {
        return null
        /*
        val jiraReporterConfig = JiraReporterConfig()
        jiraReporterConfig.isEnabled = true

        //Server Auth
        jiraReporterConfig.jiraUserName = ""
        jiraReporterConfig.jiraUserToken = ""

        //Cloud Auth
        jiraReporterConfig.xRayCloudClientId = ""
        jiraReporterConfig.xRayCloudClientSecret = ""
        jiraReporterConfig.projectKey = "Project Key where the Toolkit should raport"
        // If no TestPlanKey is defined, the toolkit will create a new Testplan and record all Tests into the new Testplan.
        // If the TestPlanKey is defined, the toolkit will create Testexecutions in the Testplan and prove recorded Tests with the new TestRuns.
        jiraReporterConfig.testPlanToReport = "TestPlanKey where the Toolkit should raport"
        jiraReporterConfig.isAddPackageInformationToTestName = true
        jiraReporterConfig.isAddTestParameterInformationToTestName = true
        return jiraReporterConfig
        */
    }

    /**
     * Description: You can define the SlackReporterConfig to enable the JiraReportingModule
     * On the Website is a detailed Instruction how to create the Slack connection and the Bot-User.
     * Since Version: 1.3.23
     * Expired Version: -
     */
    override fun getSlackReporterConfig(): SlackReporterConfig? {
        return null
        /*
         val slackReporterConfig = SlackReporterConfig()
         slackReporterConfig.isEnabled = true
         slackReporterConfig.channelName = ""
         slackReporterConfig.botUserToken = ""
         return slackReporterConfig
         */
    }
}
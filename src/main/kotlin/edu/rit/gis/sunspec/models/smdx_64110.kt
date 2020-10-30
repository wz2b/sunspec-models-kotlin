/*
 * OutBack AXS device
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=64110, len=282, name="model_64110")
class Model_64110 {
   @SunSpecPoint(id="MajorFWRev", label="AXS Major Firmware Number", offset=0, len=1, type="uint16",
                 description="",
                 notes="")
            
   var MajorFWRev: Int? = null

   @SunSpecPoint(id="MidFWRev", label="AXS Mid Firmware Number", offset=1, len=1, type="uint16",
                 description="",
                 notes="")
            
   var MidFWRev: Int? = null

   @SunSpecPoint(id="MinorFWRev", label="AXS Minor Firmware Number", offset=2, len=1, type="uint16",
                 description="",
                 notes="")
            
   var MinorFWRev: Int? = null

   @SunSpecPoint(id="EncrypKey", label="Encryption Key", offset=3, len=1, type="uint16",
                 description="",
                 notes="")
            
   var EncrypKey: Int? = null

   @SunSpecPoint(id="MAC_Address", label="MAC Address", offset=4, len=7, type="string",
                 description="",
                 notes="")
            
   var MAC_Address: String? = null

   @SunSpecPoint(id="WritePassword", label="Write Password", offset=11, len=8, type="string",
                 description="",
                 notes="")
            
   var WritePassword: String? = null

   @SunSpecPoint(id="EnableDHCP", label="Enable DHCP", offset=19, len=0, type="enum16",
                 description="",
                 notes="")
            
   var EnableDHCP: Any? = null

   @SunSpecPoint(id="TCPIP_address", label="TCPIP Address", offset=20, len=2, type="ipaddr",
                 description="",
                 notes="")
            
   var TCPIP_address: String? = null

   @SunSpecPoint(id="Gateway_address", label="TCPIP Gateway", offset=22, len=2, type="ipaddr",
                 description="",
                 notes="")
            
   var Gateway_address: String? = null

   @SunSpecPoint(id="TCPIP_Netmask", label="TCPIP Netmask", offset=24, len=2, type="ipaddr",
                 description="",
                 notes="")
            
   var TCPIP_Netmask: String? = null

   @SunSpecPoint(id="DNS1_address", label="TCPIP DNS1", offset=26, len=2, type="ipaddr",
                 description="",
                 notes="")
            
   var DNS1_address: String? = null

   @SunSpecPoint(id="DNS2_address", label="TCPIP DNS2", offset=28, len=2, type="ipaddr",
                 description="",
                 notes="")
            
   var DNS2_address: String? = null

   @SunSpecPoint(id="Modbus_port", label="ModBus Port", offset=30, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Modbus_port: Int? = null

   @SunSpecPoint(id="SMTP_server_nm", label="SMTP Server Name", offset=31, len=20, type="string",
                 description="",
                 notes="")
            
   var SMTP_server_nm: String? = null

   @SunSpecPoint(id="SMTP_account_nm", label="SMTP Account Name", offset=51, len=16, type="string",
                 description="",
                 notes="")
            
   var SMTP_account_nm: String? = null

   @SunSpecPoint(id="SMTP_enable_SSL", label="Enable SMTP SSL", offset=67, len=0, type="enum16",
                 description="",
                 notes="")
            
   var SMTP_enable_SSL: Any? = null

   @SunSpecPoint(id="SMTP_password", label="SMTP Password", offset=68, len=8, type="string",
                 description="",
                 notes="")
            
   var SMTP_password: String? = null

   @SunSpecPoint(id="SMTP_user_nm", label="SMTP User Name", offset=76, len=20, type="string",
                 description="",
                 notes="")
            
   var SMTP_user_nm: String? = null

   @SunSpecPoint(id="Stat_email_int", label="Status Email Interval", offset=96, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Stat_email_int: Int? = null

   @SunSpecPoint(id="Stat_start_HR", label="Status Email Start Hour", offset=97, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Stat_start_HR: Int? = null

   @SunSpecPoint(id="Stat_email_sub", label="Status Email Subject", offset=98, len=25, type="string",
                 description="",
                 notes="")
            
   var Stat_email_sub: String? = null

   @SunSpecPoint(id="Stat_email_addr1", label="Status Email to Address 1", offset=123, len=20, type="string",
                 description="",
                 notes="")
            
   var Stat_email_addr1: String? = null

   @SunSpecPoint(id="Stat_email_addr2", label="Status Email to Address 2", offset=143, len=20, type="string",
                 description="",
                 notes="")
            
   var Stat_email_addr2: String? = null

   @SunSpecPoint(id="Alarm_email_en", label="Enable Alarm Email", offset=163, len=0, type="enum16",
                 description="",
                 notes="")
            
   var Alarm_email_en: Any? = null

   @SunSpecPoint(id="Alarm_email_sub", label="Alarm Email Subject", offset=164, len=25, type="string",
                 description="",
                 notes="")
            
   var Alarm_email_sub: String? = null

   @SunSpecPoint(id="Alarm_email_addr1", label="Alarm Email to Address 1", offset=189, len=20, type="string",
                 description="",
                 notes="")
            
   var Alarm_email_addr1: String? = null

   @SunSpecPoint(id="Alarm_email_addr2", label="Alarm Email to Address 2", offset=209, len=20, type="string",
                 description="",
                 notes="")
            
   var Alarm_email_addr2: String? = null

   @SunSpecPoint(id="FTP_password", label="FTP Password", offset=229, len=8, type="string",
                 description="",
                 notes="")
            
   var FTP_password: String? = null

   @SunSpecPoint(id="TELNET_password", label="Telnet Password", offset=237, len=8, type="string",
                 description="",
                 notes="")
            
   var TELNET_password: String? = null

   @SunSpecPoint(id="Log_write_int", label="SD-Card Datalog Write Interval", offset=245, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Log_write_int: Int? = null

   @SunSpecPoint(id="Log_retain", label="SD-Card Datalog Retain", offset=246, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Log_retain: Int? = null

   @SunSpecPoint(id="Log_mode", label="SD-Card Datalog Mode", offset=247, len=0, type="enum16",
                 description="",
                 notes="")
            
   var Log_mode: Any? = null

   @SunSpecPoint(id="NTP_server_nm", label="NTP Timer Server Name", offset=248, len=20, type="string",
                 description="",
                 notes="")
            
   var NTP_server_nm: String? = null

   @SunSpecPoint(id="NTP_enable", label="Enable Network Time", offset=268, len=0, type="enum16",
                 description="",
                 notes="")
            
   var NTP_enable: Any? = null

   @SunSpecPoint(id="TimeZone", label="Time Zone", offset=269, len=1, type="int16",
                 description="",
                 notes="")
            
   var TimeZone: Short? = null

   @SunSpecPoint(id="Date_year", label="Year", offset=270, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Date_year: Int? = null

   @SunSpecPoint(id="Date_month", label="Month", offset=271, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Date_month: Int? = null

   @SunSpecPoint(id="Date_Day", label="Day", offset=272, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Date_Day: Int? = null

   @SunSpecPoint(id="Time_hour", label="Hour", offset=273, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Time_hour: Int? = null

   @SunSpecPoint(id="Time_minute", label="Minute", offset=274, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Time_minute: Int? = null

   @SunSpecPoint(id="Time_second", label="Second", offset=275, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Time_second: Int? = null

   @SunSpecPoint(id="Battery_temp", label="Battery Temperature", offset=276, len=1, type="int16",
                 description="",
                 notes="")
            
   var Battery_temp: Short? = null

   @SunSpecPoint(id="Ambient_temp", label="Ambient Temperature", offset=277, len=1, type="int16",
                 description="",
                 notes="")
            
   var Ambient_temp: Short? = null

   @SunSpecPoint(id="Temp_SF", label="", offset=278, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var Temp_SF: Any? = null

   @SunSpecPoint(id="AXS_Error", label="AXS Error", offset=279, len=1, type="bitfield16",
                 description="",
                 notes="")
            
   var AXS_Error: Short? = null

   @SunSpecPoint(id="AXS_Status", label="AXS Status", offset=280, len=1, type="bitfield16",
                 description="",
                 notes="")
            
   var AXS_Status: Short? = null

   @SunSpecPoint(id="AXS_Spare", label="Spare", offset=281, len=1, type="uint16",
                 description="",
                 notes="")
            
   var AXS_Spare: Int? = null

}

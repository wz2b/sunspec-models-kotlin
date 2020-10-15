/*
 * Veris Status and Configuration
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=64001, len=71, name="model_64001")
class Model_64001 {
   @SunSpecPoint(id="Cmd", label="Command Code", offset=0, len=0, type="enum16",
                 description="",
                 notes="")
            
   var Cmd: Any? = null

   @SunSpecPoint(id="HWRev", label="Hardware Revision", offset=1, len=1, type="uint16",
                 description="",
                 notes="")
            
   var HWRev: UShort? = null

   @SunSpecPoint(id="RSFWRev", label="RS FW Revision", offset=2, len=1, type="uint16",
                 description="",
                 notes="")
            
   var RSFWRev: UShort? = null

   @SunSpecPoint(id="OSFWRev", label="OS FW Revision", offset=3, len=1, type="uint16",
                 description="",
                 notes="")
            
   var OSFWRev: UShort? = null

   @SunSpecPoint(id="ProdRev", label="Product Revision", offset=4, len=2, type="string",
                 description="",
                 notes="")
            
   var ProdRev: String? = null

   @SunSpecPoint(id="Boots", label="Boot Count", offset=6, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Boots: UShort? = null

   @SunSpecPoint(id="Switch", label="DIP Switches", offset=7, len=1, type="bitfield16",
                 description="",
                 notes="")
            
   var Switch: UShort? = null

   @SunSpecPoint(id="Sensors", label="Num Detected Sensors", offset=8, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Sensors: UShort? = null

   @SunSpecPoint(id="Talking", label="Num Communicating Sensors", offset=9, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Talking: UShort? = null

   @SunSpecPoint(id="Status", label="System Status", offset=10, len=1, type="bitfield16",
                 description="",
                 notes="")
            
   var Status: UShort? = null

   @SunSpecPoint(id="Config", label="System Configuration", offset=11, len=1, type="bitfield16",
                 description="",
                 notes="")
            
   var Config: UShort? = null

   @SunSpecPoint(id="LEDblink", label="LED Blink Threshold", offset=12, len=1, type="uint16",
                 description="",
                 notes="")
            
   var LEDblink: UShort? = null

   @SunSpecPoint(id="LEDon", label="LED On Threshold", offset=13, len=1, type="uint16",
                 description="",
                 notes="")
            
   var LEDon: UShort? = null

   @SunSpecPoint(id="Reserved", label="", offset=14, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Reserved: UShort? = null

   @SunSpecPoint(id="Loc", label="Location String", offset=15, len=16, type="string",
                 description="",
                 notes="")
            
   var Loc: String? = null

   @SunSpecPoint(id="S1ID", label="Sensor 1 Unit ID", offset=31, len=0, type="enum16",
                 description="",
                 notes="")
            
   var S1ID: Any? = null

   @SunSpecPoint(id="S1Addr", label="Sensor 1 Address", offset=32, len=1, type="uint16",
                 description="",
                 notes="")
            
   var S1Addr: UShort? = null

   @SunSpecPoint(id="S1OSVer", label="Sensor 1 OS Version", offset=33, len=1, type="uint16",
                 description="",
                 notes="")
            
   var S1OSVer: UShort? = null

   @SunSpecPoint(id="S1Ver", label="Sensor 1 Product Version", offset=34, len=2, type="string",
                 description="",
                 notes="")
            
   var S1Ver: String? = null

   @SunSpecPoint(id="S1Serial", label="Sensor 1 Serial Num", offset=36, len=5, type="string",
                 description="",
                 notes="")
            
   var S1Serial: String? = null

   @SunSpecPoint(id="S2ID", label="Sensor 2 Unit ID", offset=41, len=0, type="enum16",
                 description="",
                 notes="")
            
   var S2ID: Any? = null

   @SunSpecPoint(id="S2Addr", label="Sensor 2 Address", offset=42, len=1, type="uint16",
                 description="",
                 notes="")
            
   var S2Addr: UShort? = null

   @SunSpecPoint(id="S2OSVer", label="Sensor 2 OS Version", offset=43, len=1, type="uint16",
                 description="",
                 notes="")
            
   var S2OSVer: UShort? = null

   @SunSpecPoint(id="S2Ver", label="Sensor 2 Product Version", offset=44, len=2, type="string",
                 description="",
                 notes="")
            
   var S2Ver: String? = null

   @SunSpecPoint(id="S2Serial", label="Sensor 2 Serial Num", offset=46, len=5, type="string",
                 description="",
                 notes="")
            
   var S2Serial: String? = null

   @SunSpecPoint(id="S3ID", label="Sensor 3 Unit ID", offset=51, len=0, type="enum16",
                 description="",
                 notes="")
            
   var S3ID: Any? = null

   @SunSpecPoint(id="S3Addr", label="Sensor 3 Address", offset=52, len=1, type="uint16",
                 description="",
                 notes="")
            
   var S3Addr: UShort? = null

   @SunSpecPoint(id="S3OSVer", label="Sensor 3 OS Version", offset=53, len=1, type="uint16",
                 description="",
                 notes="")
            
   var S3OSVer: UShort? = null

   @SunSpecPoint(id="S3Ver", label="Sensor 3 Product Version", offset=54, len=2, type="string",
                 description="",
                 notes="")
            
   var S3Ver: String? = null

   @SunSpecPoint(id="S3Serial", label="Sensor 3 Serial Num", offset=56, len=5, type="string",
                 description="",
                 notes="")
            
   var S3Serial: String? = null

   @SunSpecPoint(id="S4ID", label="Sensor 4 Unit ID", offset=61, len=0, type="enum16",
                 description="",
                 notes="")
            
   var S4ID: Any? = null

   @SunSpecPoint(id="S4Addr", label="Sensor 4 Address", offset=62, len=1, type="uint16",
                 description="",
                 notes="")
            
   var S4Addr: UShort? = null

   @SunSpecPoint(id="S4OSVer", label="Sensor 4 OS Version", offset=63, len=1, type="uint16",
                 description="",
                 notes="")
            
   var S4OSVer: UShort? = null

   @SunSpecPoint(id="S4Ver", label="Sensor 4 Product Version", offset=64, len=2, type="string",
                 description="",
                 notes="")
            
   var S4Ver: String? = null

   @SunSpecPoint(id="S4Serial", label="Sensor 4 Serial Num", offset=66, len=5, type="string",
                 description="",
                 notes="")
            
   var S4Serial: String? = null

}

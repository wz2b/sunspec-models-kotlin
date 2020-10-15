/*
 * Basic Charge Controller
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=64111, len=23, name="model_64111")
class Model_64111 {
   @SunSpecPoint(id="Port", label="Port Number", offset=0, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Port: UShort? = null

   @SunSpecPoint(id="V_SF", label="", offset=1, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="A_SF", label="", offset=2, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var A_SF: Any? = null

   @SunSpecPoint(id="P_SF", label="", offset=3, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var P_SF: Any? = null

   @SunSpecPoint(id="AH_SF", label="", offset=4, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var AH_SF: Any? = null

   @SunSpecPoint(id="KWH_SF", label="", offset=5, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var KWH_SF: Any? = null

   @SunSpecPoint(id="BattV", label="Battery Voltage", offset=6, len=1, type="uint16",
                 description="",
                 notes="")
            
   var BattV: UShort? = null

   @SunSpecPoint(id="ArrayV", label="Array Voltage", offset=7, len=1, type="uint16",
                 description="",
                 notes="")
            
   var ArrayV: UShort? = null

   @SunSpecPoint(id="OutputA", label="Output Current", offset=8, len=1, type="uint16",
                 description="",
                 notes="")
            
   var OutputA: UShort? = null

   @SunSpecPoint(id="InputA", label="Array Current", offset=9, len=1, type="uint16",
                 description="",
                 notes="")
            
   var InputA: UShort? = null

   @SunSpecPoint(id="ChargerSt", label="Operating State", offset=10, len=0, type="enum16",
                 description="",
                 notes="")
            
   var ChargerSt: Any? = null

   @SunSpecPoint(id="OutputW", label="Output Wattage", offset=11, len=1, type="uint16",
                 description="",
                 notes="")
            
   var OutputW: UShort? = null

   @SunSpecPoint(id="TodayMinBatV", label="Today's Minimum Battery Voltage", offset=12, len=1, type="uint16",
                 description="",
                 notes="")
            
   var TodayMinBatV: UShort? = null

   @SunSpecPoint(id="TodayMaxBatV", label="Today's Maximum Battery Voltage", offset=13, len=1, type="uint16",
                 description="",
                 notes="")
            
   var TodayMaxBatV: UShort? = null

   @SunSpecPoint(id="VOCV", label="VOC", offset=14, len=1, type="uint16",
                 description="",
                 notes="")
            
   var VOCV: UShort? = null

   @SunSpecPoint(id="TodayMaxVOC", label="Today's Maximum VOC", offset=15, len=1, type="uint16",
                 description="",
                 notes="")
            
   var TodayMaxVOC: UShort? = null

   @SunSpecPoint(id="TodaykWhOutput", label="Today's kWh", offset=16, len=1, type="uint16",
                 description="",
                 notes="")
            
   var TodaykWhOutput: UShort? = null

   @SunSpecPoint(id="TodayAHOutput", label="Today's AH", offset=17, len=1, type="uint16",
                 description="",
                 notes="")
            
   var TodayAHOutput: UShort? = null

   @SunSpecPoint(id="LifeTimeKWHOut", label="Lifetime kWh", offset=18, len=1, type="uint16",
                 description="",
                 notes="")
            
   var LifeTimeKWHOut: UShort? = null

   @SunSpecPoint(id="LifeTimeAHOut", label="Lifetime kAH", offset=19, len=1, type="uint16",
                 description="",
                 notes="")
            
   var LifeTimeAHOut: UShort? = null

   @SunSpecPoint(id="LifeTimeMaxOut", label="Lifetime Maximum Output Wattage", offset=20, len=1, type="uint16",
                 description="",
                 notes="")
            
   var LifeTimeMaxOut: UShort? = null

   @SunSpecPoint(id="LifeTimeMaxBatt", label="Lifetime Maximum Battery Voltage", offset=21, len=1, type="uint16",
                 description="",
                 notes="")
            
   var LifeTimeMaxBatt: UShort? = null

   @SunSpecPoint(id="LifeTimeMaxVOC", label="Lifetime Maximum VOC Voltage", offset=22, len=1, type="uint16",
                 description="",
                 notes="")
            
   var LifeTimeMaxVOC: UShort? = null

}

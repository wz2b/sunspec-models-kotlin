/*
 * Immediate Controls
 *
 * Immediate Inverter Controls 
 *
 * Ref 3: 8.7.1.2, 8.7.2.2, 8.7.3.2
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=123, len=24, name="controls")
class Model_123 {
   @SunSpecPoint(id="Conn_WinTms", label="Conn_WinTms", offset=0, len=1, type="uint16",
                 description="Time window for connect/disconnect.",
                 notes="Time window for connect/disconnect.")
            
   var Conn_WinTms: Int? = null

   @SunSpecPoint(id="Conn_RvrtTms", label="Conn_RvrtTms", offset=1, len=1, type="uint16",
                 description="Timeout period for connect/disconnect.",
                 notes="Timeout period for connect/disconnect.")
            
   var Conn_RvrtTms: Int? = null

   @SunSpecPoint(id="Conn", label="Conn", offset=2, len=1, type="enum16",
                 description="Enumerated valued.  Connection control.",
                 notes="Enumerated valued.  Connection control.")
            
   var Conn: Any? = null

   @SunSpecPoint(id="WMaxLimPct", label="WMaxLimPct", offset=3, len=1, type="uint16",
                 description="Set power output to specified level.",
                 notes="Set power output to specified level.")
            
   var WMaxLimPct: Int? = null

   @SunSpecPoint(id="WMaxLimPct_WinTms", label="WMaxLimPct_WinTms", offset=4, len=1, type="uint16",
                 description="Time window for power limit change.",
                 notes="Time window for power limit change.")
            
   var WMaxLimPct_WinTms: Int? = null

   @SunSpecPoint(id="WMaxLimPct_RvrtTms", label="WMaxLimPct_RvrtTms", offset=5, len=1, type="uint16",
                 description="Timeout period for power limit.",
                 notes="Timeout period for power limit.")
            
   var WMaxLimPct_RvrtTms: Int? = null

   @SunSpecPoint(id="WMaxLimPct_RmpTms", label="WMaxLimPct_RmpTms", offset=6, len=1, type="uint16",
                 description="Ramp time for moving from current setpoint to new setpoint.",
                 notes="Ramp time for moving from current setpoint to new setpoint.")
            
   var WMaxLimPct_RmpTms: Int? = null

   @SunSpecPoint(id="WMaxLim_Ena", label="WMaxLim_Ena", offset=7, len=1, type="enum16",
                 description="Enumerated valued.  Throttle enable/disable control.",
                 notes="Enumerated valued.  Throttle enable/disable control.")
            
   var WMaxLim_Ena: Any? = null

   @SunSpecPoint(id="OutPFSet", label="OutPFSet", offset=8, len=1, type="int16",
                 description="Set power factor to specific value - cosine of angle.",
                 notes="Set power factor to specific value - cosine of angle.")
            
   var OutPFSet: Short? = null

   @SunSpecPoint(id="OutPFSet_WinTms", label="OutPFSet_WinTms", offset=9, len=1, type="uint16",
                 description="Time window for power factor change.",
                 notes="Time window for power factor change.")
            
   var OutPFSet_WinTms: Int? = null

   @SunSpecPoint(id="OutPFSet_RvrtTms", label="OutPFSet_RvrtTms", offset=10, len=1, type="uint16",
                 description="Timeout period for power factor.",
                 notes="Timeout period for power factor.")
            
   var OutPFSet_RvrtTms: Int? = null

   @SunSpecPoint(id="OutPFSet_RmpTms", label="OutPFSet_RmpTms", offset=11, len=1, type="uint16",
                 description="Ramp time for moving from current setpoint to new setpoint.",
                 notes="Ramp time for moving from current setpoint to new setpoint.")
            
   var OutPFSet_RmpTms: Int? = null

   @SunSpecPoint(id="OutPFSet_Ena", label="OutPFSet_Ena", offset=12, len=1, type="enum16",
                 description="Enumerated valued.  Fixed power factor enable/disable control.",
                 notes="Enumerated valued.  Fixed power factor enable/disable control.")
            
   var OutPFSet_Ena: Any? = null

   @SunSpecPoint(id="VArWMaxPct", label="VArWMaxPct", offset=13, len=1, type="int16",
                 description="Reactive power in percent of WMax.",
                 notes="Reactive power in percent of WMax.")
            
   var VArWMaxPct: Short? = null

   @SunSpecPoint(id="VArMaxPct", label="VArMaxPct", offset=14, len=1, type="int16",
                 description="Reactive power in percent of VArMax.",
                 notes="Reactive power in percent of VArMax.")
            
   var VArMaxPct: Short? = null

   @SunSpecPoint(id="VArAvalPct", label="VArAvalPct", offset=15, len=1, type="int16",
                 description="Reactive power in percent of VArAval.",
                 notes="Reactive power in percent of VArAval.")
            
   var VArAvalPct: Short? = null

   @SunSpecPoint(id="VArPct_WinTms", label="VArPct_WinTms", offset=16, len=1, type="uint16",
                 description="Time window for VAR limit change.",
                 notes="Time window for VAR limit change.")
            
   var VArPct_WinTms: Int? = null

   @SunSpecPoint(id="VArPct_RvrtTms", label="VArPct_RvrtTms", offset=17, len=1, type="uint16",
                 description="Timeout period for VAR limit.",
                 notes="Timeout period for VAR limit.")
            
   var VArPct_RvrtTms: Int? = null

   @SunSpecPoint(id="VArPct_RmpTms", label="VArPct_RmpTms", offset=18, len=1, type="uint16",
                 description="Ramp time for moving from current setpoint to new setpoint.",
                 notes="Ramp time for moving from current setpoint to new setpoint.")
            
   var VArPct_RmpTms: Int? = null

   @SunSpecPoint(id="VArPct_Mod", label="VArPct_Mod", offset=19, len=1, type="enum16",
                 description="Enumerated value. VAR percent limit mode.",
                 notes="Enumerated value. VAR percent limit mode.")
            
   var VArPct_Mod: Any? = null

   @SunSpecPoint(id="VArPct_Ena", label="VArPct_Ena", offset=20, len=1, type="enum16",
                 description="Enumerated valued.  Percent limit VAr enable/disable control.",
                 notes="Enumerated valued.  Percent limit VAr enable/disable control.")
            
   var VArPct_Ena: Any? = null

   @SunSpecPoint(id="WMaxLimPct_SF", label="WMaxLimPct_SF", offset=21, len=1, type="sunssf",
                 description="Scale factor for power output percent.",
                 notes="Scale factor for power output percent.")
            
   var WMaxLimPct_SF: Any? = null

   @SunSpecPoint(id="OutPFSet_SF", label="OutPFSet_SF", offset=22, len=1, type="sunssf",
                 description="Scale factor for power factor.",
                 notes="Scale factor for power factor.")
            
   var OutPFSet_SF: Any? = null

   @SunSpecPoint(id="VArPct_SF", label="VArPct_SF", offset=23, len=1, type="sunssf",
                 description="Scale factor for reactive power percent.",
                 notes="Scale factor for reactive power percent.")
            
   var VArPct_SF: Any? = null

}

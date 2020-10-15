/*
 * Volt-Watt
 *
 * Volt-Watt 
 *
 * Ref 3: 8.12.1.2
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=132, len=64, name="volt_watt")
class Model_132 {
   @SunSpecPoint(id="ActCrv", label="ActCrv", offset=0, len=1, type="uint16",
                 description="Index of active curve. 0=no active curve.",
                 notes="Index of active curve. 0=no active curve.")
            
   var ActCrv: UShort? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=1, len=1, type="bitfield16",
                 description="Is Volt-Watt control active.",
                 notes="Is Volt-Watt control active.")
            
   var ModEna: UShort? = null

   @SunSpecPoint(id="WinTms", label="WinTms", offset=2, len=1, type="uint16",
                 description="Time window for volt-watt change.",
                 notes="Time window for volt-watt change.")
            
   var WinTms: UShort? = null

   @SunSpecPoint(id="RvrtTms", label="RvrtTms", offset=3, len=1, type="uint16",
                 description="Timeout period for volt-watt curve selection.",
                 notes="Timeout period for volt-watt curve selection.")
            
   var RvrtTms: UShort? = null

   @SunSpecPoint(id="RmpTms", label="RmpTms", offset=4, len=1, type="uint16",
                 description="Ramp time for moving from current mode to new mode.",
                 notes="Ramp time for moving from current mode to new mode.")
            
   var RmpTms: UShort? = null

   @SunSpecPoint(id="NCrv", label="NCrv", offset=5, len=1, type="uint16",
                 description="Number of curves supported (recommend min. 4).",
                 notes="Number of curves supported (recommend min. 4).")
            
   var NCrv: UShort? = null

   @SunSpecPoint(id="NPt", label="NPt", offset=6, len=1, type="uint16",
                 description="Number of points in array (maximum 20).",
                 notes="Number of points in array (maximum 20).")
            
   var NPt: UShort? = null

   @SunSpecPoint(id="V_SF", label="V_SF", offset=7, len=1, type="sunssf",
                 description="Scale factor for percent VRef.",
                 notes="Scale factor for percent VRef.")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="DeptRef_SF", label="DeptRef_SF", offset=8, len=1, type="sunssf",
                 description="Scale factor for % DeptRef.",
                 notes="Scale factor for % DeptRef.")
            
   var DeptRef_SF: Any? = null

   @SunSpecPoint(id="RmpIncDec_SF", label="RmpIncDec_SF", offset=9, len=1, type="sunssf",
                 description="Scale factor for increment and decrement ramps.",
                 notes="Scale factor for increment and decrement ramps.")
            
   var RmpIncDec_SF: Any? = null

}

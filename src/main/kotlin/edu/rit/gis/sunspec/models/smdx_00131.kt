/*
 * Watt-PF
 *
 * Watt-Power Factor 
 *
 * Ref 3: 8.11.1.2
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=131, len=64, name="watt_pf")
class Model_131 {
   @SunSpecPoint(id="ActCrv", label="ActCrv", offset=0, len=1, type="uint16",
                 description="Index of active curve. 0=no active curve.",
                 notes="Index of active curve. 0=no active curve.")
            
   var ActCrv: Int? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=1, len=1, type="bitfield16",
                 description="Is watt-PF mode active.",
                 notes="Is watt-PF mode active.")
            
   var ModEna: Short? = null

   @SunSpecPoint(id="WinTms", label="WinTms", offset=2, len=1, type="uint16",
                 description="Time window for watt-PF change.",
                 notes="Time window for watt-PF change.")
            
   var WinTms: Int? = null

   @SunSpecPoint(id="RvrtTms", label="RvrtTms", offset=3, len=1, type="uint16",
                 description="Timeout period for watt-PF curve selection.",
                 notes="Timeout period for watt-PF curve selection.")
            
   var RvrtTms: Int? = null

   @SunSpecPoint(id="RmpTms", label="RmpTms", offset=4, len=1, type="uint16",
                 description="Ramp time for moving from current mode to new mode.",
                 notes="Ramp time for moving from current mode to new mode.")
            
   var RmpTms: Int? = null

   @SunSpecPoint(id="NCrv", label="NCrv", offset=5, len=1, type="uint16",
                 description="Number of curves supported (recommend 4).",
                 notes="Number of curves supported (recommend 4).")
            
   var NCrv: Int? = null

   @SunSpecPoint(id="NPt", label="NPt", offset=6, len=1, type="uint16",
                 description="Max number of points in array.",
                 notes="Max number of points in array.")
            
   var NPt: Int? = null

   @SunSpecPoint(id="W_SF", label="W_SF", offset=7, len=1, type="sunssf",
                 description="Scale factor for percent WMax.",
                 notes="Scale factor for percent WMax.")
            
   var W_SF: Any? = null

   @SunSpecPoint(id="PF_SF", label="PF_SF", offset=8, len=1, type="sunssf",
                 description="Scale factor for PF.",
                 notes="Scale factor for PF.")
            
   var PF_SF: Any? = null

   @SunSpecPoint(id="RmpIncDec_SF", label="RmpIncDec_SF", offset=9, len=1, type="sunssf",
                 description="Scale factor for increment and decrement ramps.",
                 notes="Scale factor for increment and decrement ramps.")
            
   var RmpIncDec_SF: Any? = null

}

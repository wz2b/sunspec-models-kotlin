/*
 * HVRTC
 *
 * HVRT must remain connected
 *
 * Ref 4: 11
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=138, len=60, name="hvrtc")
class Model_138 {
   @SunSpecPoint(id="ActCrv", label="ActCrv", offset=0, len=1, type="uint16",
                 description="Index of active curve. 0=no active curve.",
                 notes="Index of active curve. 0=no active curve.")
            
   var ActCrv: UShort? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=1, len=1, type="bitfield16",
                 description="HVRT control mode. Enable active curve.  Bitfield value.",
                 notes="HVRT control mode. Enable active curve.  Bitfield value.")
            
   var ModEna: UShort? = null

   @SunSpecPoint(id="WinTms", label="WinTms", offset=2, len=1, type="uint16",
                 description="Time window for HVRT change.",
                 notes="Time window for HVRT change.")
            
   var WinTms: UShort? = null

   @SunSpecPoint(id="RvrtTms", label="RvrtTms", offset=3, len=1, type="uint16",
                 description="Timeout period for HVRT curve selection.",
                 notes="Timeout period for HVRT curve selection.")
            
   var RvrtTms: UShort? = null

   @SunSpecPoint(id="RmpTms", label="RmpTms", offset=4, len=1, type="uint16",
                 description="Ramp time for moving from current mode to new mode.",
                 notes="Ramp time for moving from current mode to new mode.")
            
   var RmpTms: UShort? = null

   @SunSpecPoint(id="NCrv", label="NCrv", offset=5, len=1, type="uint16",
                 description="Number of curves supported (recommend 4).",
                 notes="Number of curves supported (recommend 4).")
            
   var NCrv: UShort? = null

   @SunSpecPoint(id="NPt", label="NPt", offset=6, len=1, type="uint16",
                 description="Number of curve points supported (maximum of 20).",
                 notes="Number of curve points supported (maximum of 20).")
            
   var NPt: UShort? = null

   @SunSpecPoint(id="Tms_SF", label="Tms_SF", offset=7, len=1, type="sunssf",
                 description="Scale factor for duration.",
                 notes="Scale factor for duration.")
            
   var Tms_SF: Any? = null

   @SunSpecPoint(id="V_SF", label="V_SF", offset=8, len=1, type="sunssf",
                 description="Scale factor for percent VRef.",
                 notes="Scale factor for percent VRef.")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="Pad", label="", offset=9, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}

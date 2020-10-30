/*
 * HFRT
 *
 * High Frequency Ride-through
 *
 * Ref 4: 11
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=136, len=60, name="hfrt")
class Model_136 {
   @SunSpecPoint(id="ActCrv", label="ActCrv", offset=0, len=1, type="uint16",
                 description="Index of active curve. 0=no active curve.",
                 notes="Index of active curve. 0=no active curve.")
            
   var ActCrv: Int? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=1, len=1, type="bitfield16",
                 description="HFRT control mode. Enable active curve.  Bitfield value.",
                 notes="HFRT control mode. Enable active curve.  Bitfield value.")
            
   var ModEna: Short? = null

   @SunSpecPoint(id="WinTms", label="WinTms", offset=2, len=1, type="uint16",
                 description="Time window for HFRT change.",
                 notes="Time window for HFRT change.")
            
   var WinTms: Int? = null

   @SunSpecPoint(id="RvrtTms", label="RvrtTms", offset=3, len=1, type="uint16",
                 description="Timeout period for HFRT curve selection.",
                 notes="Timeout period for HFRT curve selection.")
            
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
                 description="Number of curve points supported (maximum of 20).",
                 notes="Number of curve points supported (maximum of 20).")
            
   var NPt: Int? = null

   @SunSpecPoint(id="Tms_SF", label="Tms_SF", offset=7, len=1, type="sunssf",
                 description="Scale factor for duration.",
                 notes="Scale factor for duration.")
            
   var Tms_SF: Any? = null

   @SunSpecPoint(id="Hz_SF", label="Hz_SF", offset=8, len=1, type="sunssf",
                 description="Scale factor for frequency.",
                 notes="Scale factor for frequency.")
            
   var Hz_SF: Any? = null

   @SunSpecPoint(id="Pad", label="", offset=9, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}

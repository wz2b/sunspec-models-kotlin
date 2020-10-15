/*
 * Freq-Watt Crv
 *
 * Curve-Based Frequency-Watt 
 *
 * Ref 3: 8.9.1.2, 8.9.4.2
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=134, len=68, name="freq_watt")
class Model_134 {
   @SunSpecPoint(id="ActCrv", label="ActCrv", offset=0, len=1, type="uint16",
                 description="Index of active curve. 0=no active curve.",
                 notes="Index of active curve. 0=no active curve.")
            
   var ActCrv: UShort? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=1, len=1, type="bitfield16",
                 description="Is curve-based Frequency-Watt control active.",
                 notes="Is curve-based Frequency-Watt control active.")
            
   var ModEna: UShort? = null

   @SunSpecPoint(id="WinTms", label="WinTms", offset=2, len=1, type="uint16",
                 description="Time window for freq-watt change.",
                 notes="Time window for freq-watt change.")
            
   var WinTms: UShort? = null

   @SunSpecPoint(id="RvrtTms", label="RvrtTms", offset=3, len=1, type="uint16",
                 description="Timeout period for freq-watt curve selection.",
                 notes="Timeout period for freq-watt curve selection.")
            
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
                 description="Number of curve points supported (maximum of 10).",
                 notes="Number of curve points supported (maximum of 10).")
            
   var NPt: UShort? = null

   @SunSpecPoint(id="Hz_SF", label="Hz_SF", offset=7, len=1, type="sunssf",
                 description="Scale factor for frequency.",
                 notes="Scale factor for frequency.")
            
   var Hz_SF: Any? = null

   @SunSpecPoint(id="W_SF", label="W_SF", offset=8, len=1, type="sunssf",
                 description="Scale factor for percent WRef.",
                 notes="Scale factor for percent WRef.")
            
   var W_SF: Any? = null

   @SunSpecPoint(id="RmpIncDec_SF", label="RmpIncDec_SF", offset=9, len=1, type="sunssf",
                 description="Scale factor for increment and decrement ramps.",
                 notes="Scale factor for increment and decrement ramps.")
            
   var RmpIncDec_SF: Any? = null

}

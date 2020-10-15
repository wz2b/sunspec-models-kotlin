/*
 * String Combiner (Advanced)
 *
 * An advanced string combiner including voltage and energy measurements
 *
 * This model supersedes model 402
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=404, len=39, name="string_combiner")
class Model_404 {
   @SunSpecPoint(id="DCA_SF", label="", offset=0, len=1, type="sunssf",
                 description="Current scale factor",
                 notes="Current scale factor")
            
   var DCA_SF: Any? = null

   @SunSpecPoint(id="DCAhr_SF", label="", offset=1, len=1, type="sunssf",
                 description="Amp-hour scale factor",
                 notes="Amp-hour scale factor")
            
   var DCAhr_SF: Any? = null

   @SunSpecPoint(id="DCV_SF", label="", offset=2, len=1, type="sunssf",
                 description="Voltage scale factor",
                 notes="Voltage scale factor")
            
   var DCV_SF: Any? = null

   @SunSpecPoint(id="DCW_SF", label="", offset=3, len=1, type="sunssf",
                 description="Power scale factor",
                 notes="Power scale factor")
            
   var DCW_SF: Any? = null

   @SunSpecPoint(id="DCWh_SF", label="", offset=4, len=1, type="sunssf",
                 description="Energy scale factor",
                 notes="Energy scale factor")
            
   var DCWh_SF: Any? = null

   @SunSpecPoint(id="DCAMax", label="Rating", offset=5, len=1, type="uint16",
                 description="Maximum DC Current Rating",
                 notes="Maximum DC Current Rating")
            
   var DCAMax: UShort? = null

   @SunSpecPoint(id="N", label="N", offset=6, len=1, type="count",
                 description="Number of Inputs",
                 notes="Number of Inputs")
            
   var N: UInt? = null

   @SunSpecPoint(id="Evt", label="Event", offset=7, len=2, type="bitfield32",
                 description="Bitmask value.  Events",
                 notes="Bitmask value.  Events")
            
   var Evt: UInt? = null

   @SunSpecPoint(id="EvtVnd", label="Vendor Event", offset=9, len=2, type="bitfield32",
                 description="Bitmask value.  Vendor defined events",
                 notes="Bitmask value.  Vendor defined events")
            
   var EvtVnd: UInt? = null

   @SunSpecPoint(id="DCA", label="Amps", offset=11, len=1, type="int16",
                 description="Total measured current",
                 notes="Total measured current")
            
   var DCA: Short? = null

   @SunSpecPoint(id="DCAhr", label="Amp-hours", offset=12, len=2, type="acc32",
                 description="Total metered Amp-hours",
                 notes="Total metered Amp-hours")
            
   var DCAhr: UInt? = null

   @SunSpecPoint(id="DCV", label="Voltage", offset=14, len=1, type="int16",
                 description="Output Voltage",
                 notes="Output Voltage")
            
   var DCV: Short? = null

   @SunSpecPoint(id="Tmp", label="Temp", offset=15, len=1, type="int16",
                 description="Internal operating temperature",
                 notes="Internal operating temperature")
            
   var Tmp: Short? = null

   @SunSpecPoint(id="DCW", label="Watts", offset=16, len=1, type="int16",
                 description="Output power",
                 notes="Output power")
            
   var DCW: Short? = null

   @SunSpecPoint(id="DCPR", label="PR", offset=17, len=1, type="int16",
                 description="DC Performance ratio value",
                 notes="DC Performance ratio value")
            
   var DCPR: Short? = null

   @SunSpecPoint(id="DCWh", label="Watt-hours", offset=18, len=2, type="acc32",
                 description="Output energy",
                 notes="Output energy")
            
   var DCWh: UInt? = null

   @SunSpecPoint(id="InDCA_SF", label="", offset=20, len=1, type="sunssf",
                 description="Current scale factor for inputs",
                 notes="Current scale factor for inputs")
            
   var InDCA_SF: Any? = null

   @SunSpecPoint(id="InDCAhr_SF", label="", offset=21, len=1, type="sunssf",
                 description="Amp-hour scale factor for inputs",
                 notes="Amp-hour scale factor for inputs")
            
   var InDCAhr_SF: Any? = null

   @SunSpecPoint(id="InDCV_SF", label="", offset=22, len=1, type="sunssf",
                 description="Voltage scale factor for inputs",
                 notes="Voltage scale factor for inputs")
            
   var InDCV_SF: Any? = null

   @SunSpecPoint(id="InDCW_SF", label="", offset=23, len=1, type="sunssf",
                 description="Power scale factor for inputs",
                 notes="Power scale factor for inputs")
            
   var InDCW_SF: Any? = null

   @SunSpecPoint(id="InDCWh_SF", label="", offset=24, len=1, type="sunssf",
                 description="Energy scale factor for inputs",
                 notes="Energy scale factor for inputs")
            
   var InDCWh_SF: Any? = null

}

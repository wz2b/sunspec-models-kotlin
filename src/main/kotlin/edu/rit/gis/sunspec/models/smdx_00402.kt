/*
 * String Combiner (Advanced)
 *
 * An advanced string combiner
 *
 * This model is SUPERSEDED by model 404
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=402, len=34, name="string_combiner")
class Model_402 {
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
            
   var DCAMax: Int? = null

   @SunSpecPoint(id="N", label="N", offset=6, len=1, type="count",
                 description="Number of Inputs",
                 notes="Number of Inputs")
            
   var N: Int? = null

   @SunSpecPoint(id="Evt", label="Event", offset=7, len=2, type="bitfield32",
                 description="Bitmask value.  Events",
                 notes="Bitmask value.  Events")
            
   var Evt: Int? = null

   @SunSpecPoint(id="EvtVnd", label="Vendor Event", offset=9, len=2, type="bitfield32",
                 description="Bitmask value.  Vendor defined events",
                 notes="Bitmask value.  Vendor defined events")
            
   var EvtVnd: Int? = null

   @SunSpecPoint(id="DCA", label="Amps", offset=11, len=1, type="int16",
                 description="Total measured current",
                 notes="Total measured current")
            
   var DCA: Short? = null

   @SunSpecPoint(id="DCAhr", label="Amp-hours", offset=12, len=2, type="uint32",
                 description="Total metered Amp-hours",
                 notes="Total metered Amp-hours")
            
   var DCAhr: Int? = null

   @SunSpecPoint(id="DCV", label="Voltage", offset=14, len=1, type="uint16",
                 description="Output Voltage",
                 notes="Output Voltage")
            
   var DCV: Int? = null

   @SunSpecPoint(id="Tmp", label="Temp", offset=15, len=1, type="int16",
                 description="Internal operating temperature",
                 notes="Internal operating temperature")
            
   var Tmp: Short? = null

   @SunSpecPoint(id="DCW", label="Watts", offset=16, len=1, type="int16",
                 description="Output power",
                 notes="Output power")
            
   var DCW: Short? = null

   @SunSpecPoint(id="DCPR", label="PR", offset=17, len=1, type="uint16",
                 description="DC Performance ratio value",
                 notes="DC Performance ratio value")
            
   var DCPR: Int? = null

   @SunSpecPoint(id="DCWh", label="Watt-hours", offset=18, len=2, type="uint32",
                 description="Output energy",
                 notes="Output energy")
            
   var DCWh: Int? = null

}

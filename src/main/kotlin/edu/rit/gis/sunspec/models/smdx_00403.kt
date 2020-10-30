/*
 * String Combiner (Current)
 *
 * A basic string combiner model
 *
 * This model supersedes model 401
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=403, len=24, name="string_combiner")
class Model_403 {
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

   @SunSpecPoint(id="DCAMax", label="Rating", offset=3, len=1, type="uint16",
                 description="Maximum DC Current Rating",
                 notes="Maximum DC Current Rating")
            
   var DCAMax: Int? = null

   @SunSpecPoint(id="N", label="N", offset=4, len=1, type="count",
                 description="Number of Inputs",
                 notes="Number of Inputs")
            
   var N: Int? = null

   @SunSpecPoint(id="Evt", label="Event", offset=5, len=2, type="bitfield32",
                 description="Bitmask value.  Events",
                 notes="Bitmask value.  Events")
            
   var Evt: Int? = null

   @SunSpecPoint(id="EvtVnd", label="Vendor Event", offset=7, len=2, type="bitfield32",
                 description="Bitmask value.  Vendor defined events",
                 notes="Bitmask value.  Vendor defined events")
            
   var EvtVnd: Int? = null

   @SunSpecPoint(id="DCA", label="Amps", offset=9, len=1, type="int16",
                 description="Total measured current",
                 notes="Total measured current")
            
   var DCA: Short? = null

   @SunSpecPoint(id="DCAhr", label="Amp-hours", offset=10, len=2, type="acc32",
                 description="Total metered Amp-hours",
                 notes="Total metered Amp-hours")
            
   var DCAhr: Long? = null

   @SunSpecPoint(id="DCV", label="Voltage", offset=12, len=1, type="int16",
                 description="Output Voltage",
                 notes="Output Voltage")
            
   var DCV: Short? = null

   @SunSpecPoint(id="Tmp", label="Temp", offset=13, len=1, type="int16",
                 description="Internal operating temperature",
                 notes="Internal operating temperature")
            
   var Tmp: Short? = null

   @SunSpecPoint(id="InDCA_SF", label="", offset=14, len=1, type="sunssf",
                 description="Current scale factor for inputs",
                 notes="Current scale factor for inputs")
            
   var InDCA_SF: Any? = null

   @SunSpecPoint(id="InDCAhr_SF", label="", offset=15, len=1, type="sunssf",
                 description="Amp-hour scale factor for inputs",
                 notes="Amp-hour scale factor for inputs")
            
   var InDCAhr_SF: Any? = null

}

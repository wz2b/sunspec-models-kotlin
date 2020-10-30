/*
 * Multiple MPPT Inverter Extension Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=160, len=28, name="mppt")
class Model_160 {
   @SunSpecPoint(id="DCA_SF", label="Current Scale Factor", offset=0, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var DCA_SF: Any? = null

   @SunSpecPoint(id="DCV_SF", label="Voltage Scale Factor", offset=1, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var DCV_SF: Any? = null

   @SunSpecPoint(id="DCW_SF", label="Power Scale Factor", offset=2, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var DCW_SF: Any? = null

   @SunSpecPoint(id="DCWH_SF", label="Energy Scale Factor", offset=3, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var DCWH_SF: Any? = null

   @SunSpecPoint(id="Evt", label="Global Events", offset=4, len=2, type="bitfield32",
                 description="",
                 notes="")
            
   var Evt: Int? = null

   @SunSpecPoint(id="N", label="Number of Modules", offset=6, len=1, type="count",
                 description="",
                 notes="")
            
   var N: Int? = null

   @SunSpecPoint(id="TmsPer", label="Timestamp Period", offset=7, len=1, type="uint16",
                 description="",
                 notes="")
            
   var TmsPer: Int? = null

}

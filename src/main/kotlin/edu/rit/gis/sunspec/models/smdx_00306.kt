/*
 * Reference Point Model
 *
 * Include to support a standard reference point
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=306, len=4, name="ref_point")
class Model_306 {
   @SunSpecPoint(id="GHI", label="GHI", offset=0, len=1, type="uint16",
                 description="Global Horizontal Irradiance",
                 notes="Global Horizontal Irradiance")
            
   var GHI: UShort? = null

   @SunSpecPoint(id="A", label="Amps", offset=1, len=1, type="uint16",
                 description="Current measurement at reference point",
                 notes="Current measurement at reference point")
            
   var A: UShort? = null

   @SunSpecPoint(id="V", label="Voltage", offset=2, len=1, type="uint16",
                 description="Voltage  measurement at reference point",
                 notes="Voltage  measurement at reference point")
            
   var V: UShort? = null

   @SunSpecPoint(id="Tmp", label="Temperature", offset=3, len=1, type="uint16",
                 description="Temperature measurement at reference point",
                 notes="Temperature measurement at reference point")
            
   var Tmp: UShort? = null

}

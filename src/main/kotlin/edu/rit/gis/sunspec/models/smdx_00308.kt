/*
 * Mini Met Model
 *
 * Include to support a few basic measurements
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=308, len=4, name="mini_met")
class Model_308 {
   @SunSpecPoint(id="GHI", label="GHI", offset=0, len=1, type="uint16",
                 description="Global Horizontal Irradiance",
                 notes="Global Horizontal Irradiance")
            
   var GHI: UShort? = null

   @SunSpecPoint(id="TmpBOM", label="Temp", offset=1, len=1, type="int16",
                 description="Back of module temperature measurement",
                 notes="Back of module temperature measurement")
            
   var TmpBOM: Short? = null

   @SunSpecPoint(id="TmpAmb", label="Ambient Temperature", offset=2, len=1, type="int16",
                 description="",
                 notes="")
            
   var TmpAmb: Short? = null

   @SunSpecPoint(id="WndSpd", label="Wind Speed", offset=3, len=1, type="uint16",
                 description="",
                 notes="")
            
   var WndSpd: UShort? = null

}

/*
 * Base Met
 *
 * Base Meteorological Model
 *
 * This model supersedes model 301
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=307, len=11, name="base_met")
class Model_307 {
   @SunSpecPoint(id="TmpAmb", label="Ambient Temperature", offset=0, len=1, type="int16",
                 description="",
                 notes="")
            
   var TmpAmb: Short? = null

   @SunSpecPoint(id="RH", label="Relative Humidity", offset=1, len=1, type="int16",
                 description="",
                 notes="")
            
   var RH: Short? = null

   @SunSpecPoint(id="Pres", label="Barometric Pressure", offset=2, len=1, type="int16",
                 description="",
                 notes="")
            
   var Pres: Short? = null

   @SunSpecPoint(id="WndSpd", label="Wind Speed", offset=3, len=1, type="int16",
                 description="",
                 notes="")
            
   var WndSpd: Short? = null

   @SunSpecPoint(id="WndDir", label="Wind Direction", offset=4, len=1, type="int16",
                 description="",
                 notes="")
            
   var WndDir: Short? = null

   @SunSpecPoint(id="Rain", label="Rainfall", offset=5, len=1, type="int16",
                 description="",
                 notes="")
            
   var Rain: Short? = null

   @SunSpecPoint(id="Snw", label="Snow Depth", offset=6, len=1, type="int16",
                 description="",
                 notes="")
            
   var Snw: Short? = null

   @SunSpecPoint(id="PPT", label="Precipitation Type", offset=7, len=1, type="int16",
                 description=" Precipitation Type (WMO 4680 SYNOP code reference)",
                 notes=" Precipitation Type (WMO 4680 SYNOP code reference)")
            
   var PPT: Short? = null

   @SunSpecPoint(id="ElecFld", label="Electric Field", offset=8, len=1, type="int16",
                 description="",
                 notes="")
            
   var ElecFld: Short? = null

   @SunSpecPoint(id="SurWet", label="Surface Wetness", offset=9, len=1, type="int16",
                 description="",
                 notes="")
            
   var SurWet: Short? = null

   @SunSpecPoint(id="SoilWet", label="Soil Wetness", offset=10, len=1, type="int16",
                 description="",
                 notes="")
            
   var SoilWet: Short? = null

}

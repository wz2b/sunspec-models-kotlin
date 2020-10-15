/*
 * GPS
 *
 * Include to support location measurements
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=305, len=36, name="location")
class Model_305 {
   @SunSpecPoint(id="Tm", label="Tm", offset=0, len=6, type="string",
                 description="UTC 24 hour time stamp to millisecond hhmmss.sssZ format",
                 notes="UTC 24 hour time stamp to millisecond hhmmss.sssZ format")
            
   var Tm: String? = null

   @SunSpecPoint(id="Date", label="Date", offset=6, len=4, type="string",
                 description="UTC Date string YYYYMMDD format",
                 notes="UTC Date string YYYYMMDD format")
            
   var Date: String? = null

   @SunSpecPoint(id="Loc", label="Location", offset=10, len=20, type="string",
                 description="Location string (40 chars max)",
                 notes="Location string (40 chars max)")
            
   var Loc: String? = null

   @SunSpecPoint(id="Lat", label="Lat", offset=30, len=2, type="int32",
                 description="Latitude with seven degrees of precision",
                 notes="Latitude with seven degrees of precision")
            
   var Lat: Int? = null

   @SunSpecPoint(id="Long", label="Long", offset=32, len=2, type="int32",
                 description="Longitude with seven degrees of precision",
                 notes="Longitude with seven degrees of precision")
            
   var Long: Int? = null

   @SunSpecPoint(id="Alt", label="Altitude", offset=34, len=2, type="int32",
                 description="Altitude measurement in meters",
                 notes="Altitude measurement in meters")
            
   var Alt: Int? = null

}

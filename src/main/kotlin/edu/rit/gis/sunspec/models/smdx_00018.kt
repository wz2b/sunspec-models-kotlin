/*
 * Cellular Link
 *
 * Include this model to support a cellular interface link
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=18, len=22, name="model_18")
class Model_18 {
   @SunSpecPoint(id="Nam", label="Name", offset=0, len=4, type="string",
                 description="Interface name",
                 notes="Interface name")
            
   var Nam: String? = null

   @SunSpecPoint(id="IMEI", label="IMEI", offset=4, len=2, type="uint32",
                 description="International Mobile Equipment Identifier for the interface",
                 notes="International Mobile Equipment Identifier for the interface")
            
   var IMEI: Int? = null

   @SunSpecPoint(id="APN", label="APN", offset=6, len=4, type="string",
                 description="Access Point Name for the interface",
                 notes="Access Point Name for the interface")
            
   var APN: String? = null

   @SunSpecPoint(id="Num", label="Number", offset=10, len=6, type="string",
                 description="Phone number for the interface",
                 notes="Phone number for the interface")
            
   var Num: String? = null

   @SunSpecPoint(id="Pin", label="PIN", offset=16, len=6, type="string",
                 description="Personal Identification Number for the interface",
                 notes="Personal Identification Number for the interface")
            
   var Pin: String? = null

}

/*
 * Extended Settings
 *
 * Inverter controls extended settings 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=145, len=8, name="ext_settings")
class Model_145 {
   @SunSpecPoint(id="NomRmpUpRte", label="Ramp Up Rate", offset=0, len=1, type="uint16",
                 description="Ramp up rate as a percentage of max current.",
                 notes="Ramp up rate as a percentage of max current.")
            
   var NomRmpUpRte: Int? = null

   @SunSpecPoint(id="NomRmpDnRte", label="NomRmpDnRte", offset=1, len=1, type="uint16",
                 description="Ramp down rate as a percentage of max current.",
                 notes="Ramp down rate as a percentage of max current.")
            
   var NomRmpDnRte: Int? = null

   @SunSpecPoint(id="EmgRmpUpRte", label="Emergency Ramp Up Rate", offset=2, len=1, type="uint16",
                 description="Emergency ramp up rate as a percentage of max current.",
                 notes="Emergency ramp up rate as a percentage of max current.")
            
   var EmgRmpUpRte: Int? = null

   @SunSpecPoint(id="EmgRmpDnRte", label="Emergency Ramp Down Rate", offset=3, len=1, type="uint16",
                 description="Emergency ramp down rate as a percentage of max current.",
                 notes="Emergency ramp down rate as a percentage of max current.")
            
   var EmgRmpDnRte: Int? = null

   @SunSpecPoint(id="ConnRmpUpRte", label="Connect Ramp Up Rate", offset=4, len=1, type="uint16",
                 description="Connect ramp up rate as a percentage of max current.",
                 notes="Connect ramp up rate as a percentage of max current.")
            
   var ConnRmpUpRte: Int? = null

   @SunSpecPoint(id="ConnRmpDnRte", label="Connect Ramp Down Rate", offset=5, len=1, type="uint16",
                 description="Connect ramp down rate as a percentage of max current.",
                 notes="Connect ramp down rate as a percentage of max current.")
            
   var ConnRmpDnRte: Int? = null

   @SunSpecPoint(id="AGra", label="Default Ramp Rate", offset=6, len=1, type="uint16",
                 description="Ramp rate specified in percent of max current.",
                 notes="Ramp rate specified in percent of max current.")
            
   var AGra: Int? = null

   @SunSpecPoint(id="Rmp_SF", label="Ramp Rate Scale Factor", offset=7, len=1, type="sunssf",
                 description="Ramp Rate Scale Factor",
                 notes="Ramp Rate Scale Factor")
            
   var Rmp_SF: Any? = null

}

/*
 * Flow Battery Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=806, len=2, name="flow_battery")
class Model_806 {
   @SunSpecPoint(id="BatTBD", label="Battery Points To Be Determined", offset=0, len=1, type="uint16",
                 description="",
                 notes="")
            
   var BatTBD: Int? = null

}

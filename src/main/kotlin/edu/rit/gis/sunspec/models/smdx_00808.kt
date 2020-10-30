/*
 * Flow Battery Module Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=808, len=2, name="flow_battery_module")
class Model_808 {
   @SunSpecPoint(id="ModuleTBD", label="Module Points To Be Determined", offset=0, len=1, type="uint16",
                 description="",
                 notes="")
            
   var ModuleTBD: Int? = null

}

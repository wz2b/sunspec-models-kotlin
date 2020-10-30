/*
 * Flow Battery Stack Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=809, len=2, name="flow_battery_stack")
class Model_809 {
   @SunSpecPoint(id="StackTBD", label="Stack Points To Be Determined", offset=0, len=1, type="uint16",
                 description="",
                 notes="")
            
   var StackTBD: Int? = null

}

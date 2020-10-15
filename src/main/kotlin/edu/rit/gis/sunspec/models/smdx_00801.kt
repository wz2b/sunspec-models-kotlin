/*
 * Energy Storage Base Model (DEPRECATED)
 *
 * This model has been deprecated.
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=801, len=1, name="storage")
class Model_801 {
   @SunSpecPoint(id="DEPRECATED", label="Deprecated Model", offset=0, len=0, type="enum16",
                 description="This model has been deprecated.",
                 notes="This model has been deprecated.")
            
   var DEPRECATED: Any? = null

}

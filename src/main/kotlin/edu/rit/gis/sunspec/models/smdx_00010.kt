/*
 * Communication Interface Header
 *
 * To be included first for a complete interface description
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=10, len=4, name="model_10")
class Model_10 {
   @SunSpecPoint(id="St", label="Interface Status", offset=0, len=0, type="enum16",
                 description="Overall interface status",
                 notes="Overall interface status")
            
   var St: Any? = null

   @SunSpecPoint(id="Ctl", label="Interface Control", offset=1, len=1, type="uint16",
                 description="Overall interface control (TBD)",
                 notes="Overall interface control (TBD)")
            
   var Ctl: UShort? = null

   @SunSpecPoint(id="Typ", label="Physical Access Type", offset=2, len=0, type="enum16",
                 description="Enumerated value.  Type of physical media",
                 notes="Enumerated value.  Type of physical media")
            
   var Typ: Any? = null

   @SunSpecPoint(id="Pad", label="", offset=3, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}

/*
 * Basic Scheduling
 *
 * Basic Scheduling 
 *
 * Ref 2: 2.2.8
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=133, len=66, name="schedule")
class Model_133 {
   @SunSpecPoint(id="ActSchd", label="ActSchd", offset=0, len=2, type="bitfield32",
                 description="Bitfield of active schedules",
                 notes="Bitfield of active schedules")
            
   var ActSchd: UInt? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=2, len=1, type="bitfield16",
                 description="Is basic scheduling active.",
                 notes="Is basic scheduling active.")
            
   var ModEna: UShort? = null

   @SunSpecPoint(id="NSchd", label="NSchd", offset=3, len=1, type="uint16",
                 description="Number of schedules supported (recommend min. 4, max 32)",
                 notes="Number of schedules supported (recommend min. 4, max 32)")
            
   var NSchd: UShort? = null

   @SunSpecPoint(id="NPts", label="NPts", offset=4, len=1, type="uint16",
                 description="Number of schedule entries supported (maximum of 10).",
                 notes="Number of schedule entries supported (maximum of 10).")
            
   var NPts: UShort? = null

   @SunSpecPoint(id="Pad", label="Pad", offset=5, len=1, type="pad",
                 description="Pad register.",
                 notes="Pad register.")
            
   var Pad: Any? = null

}

/*
 * Basic Aggregator
 *
 * Aggregates a collection of models for a given model id
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=2, len=14, name="aggregator")
class Model_2 {
   @SunSpecPoint(id="AID", label="AID", offset=0, len=1, type="uint16",
                 description="Aggregated model id",
                 notes="Aggregated model id")
            
   var AID: Int? = null

   @SunSpecPoint(id="N", label="N", offset=1, len=1, type="uint16",
                 description="Number of aggregated models",
                 notes="Number of aggregated models")
            
   var N: Int? = null

   @SunSpecPoint(id="UN", label="UN", offset=2, len=1, type="uint16",
                 description="Update Number.  Incrementing number each time the mapping is changed.  If the number is not changed from the last reading the direct access to a specific offset will result in reading the same logical model as before.  Otherwise the entire model must be read to refresh the changes",
                 notes="Update Number.  Incrementing number each time the mapping is changed.  If the number is not changed from the last reading the direct access to a specific offset will result in reading the same logical model as before.  Otherwise the entire model must be read to refresh the changes")
            
   var UN: Int? = null

   @SunSpecPoint(id="St", label="Status", offset=3, len=0, type="enum16",
                 description="Enumerated status code",
                 notes="Enumerated status code")
            
   var St: Any? = null

   @SunSpecPoint(id="StVnd", label="Vendor Status", offset=4, len=0, type="enum16",
                 description="Vendor specific status code",
                 notes="Vendor specific status code")
            
   var StVnd: Any? = null

   @SunSpecPoint(id="Evt", label="Event Code", offset=5, len=2, type="bitfield32",
                 description="Bitmask event code",
                 notes="Bitmask event code")
            
   var Evt: Int? = null

   @SunSpecPoint(id="EvtVnd", label="Vendor Event Code", offset=7, len=2, type="bitfield32",
                 description="Vendor specific event code",
                 notes="Vendor specific event code")
            
   var EvtVnd: Int? = null

   @SunSpecPoint(id="Ctl", label="Control", offset=9, len=0, type="enum16",
                 description="Control register for all aggregated devices",
                 notes="Control register for all aggregated devices")
            
   var Ctl: Any? = null

   @SunSpecPoint(id="CtlVnd", label="Vendor Control", offset=10, len=0, type="enum32",
                 description="Vendor control register for all aggregated devices",
                 notes="Vendor control register for all aggregated devices")
            
   var CtlVnd: Any? = null

   @SunSpecPoint(id="CtlVl", label="Control Value", offset=12, len=0, type="enum32",
                 description="Numerical value used as a parameter to the control",
                 notes="Numerical value used as a parameter to the control")
            
   var CtlVl: Any? = null

}

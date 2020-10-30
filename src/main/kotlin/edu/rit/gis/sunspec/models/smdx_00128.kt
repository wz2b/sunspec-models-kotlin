/*
 * Dynamic Reactive Current
 *
 * Dynamic Reactive Current 
 *
 * Ref 3: 8.10.1.2; Ref 4: 12
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=128, len=14, name="reactive_current")
class Model_128 {
   @SunSpecPoint(id="ArGraMod", label="ArGraMod", offset=0, len=1, type="enum16",
                 description="Indicates if gradients trend toward zero at the edges of the deadband or trend toward zero at the center of the deadband.",
                 notes="Indicates if gradients trend toward zero at the edges of the deadband or trend toward zero at the center of the deadband.")
            
   var ArGraMod: Any? = null

   @SunSpecPoint(id="ArGraSag", label="ArGraSag", offset=1, len=1, type="uint16",
                 description="The gradient used to increase capacitive dynamic current. A value of 0 indicates no additional reactive current support.",
                 notes="The gradient used to increase capacitive dynamic current. A value of 0 indicates no additional reactive current support.")
            
   var ArGraSag: Int? = null

   @SunSpecPoint(id="ArGraSwell", label="ArGraSwell", offset=2, len=1, type="uint16",
                 description="The gradient used to increase inductive dynamic current.  A value of 0 indicates no additional reactive current support.",
                 notes="The gradient used to increase inductive dynamic current.  A value of 0 indicates no additional reactive current support.")
            
   var ArGraSwell: Int? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=3, len=1, type="bitfield16",
                 description="Activate dynamic reactive current model",
                 notes="Activate dynamic reactive current model")
            
   var ModEna: Short? = null

   @SunSpecPoint(id="FilTms", label="FilTms", offset=4, len=1, type="uint16",
                 description="The time window used to calculate the moving average voltage.",
                 notes="The time window used to calculate the moving average voltage.")
            
   var FilTms: Int? = null

   @SunSpecPoint(id="DbVMin", label="DbVMin", offset=5, len=1, type="uint16",
                 description="The lower delta voltage limit for which negative voltage deviations less than this value no dynamic vars are produced.",
                 notes="The lower delta voltage limit for which negative voltage deviations less than this value no dynamic vars are produced.")
            
   var DbVMin: Int? = null

   @SunSpecPoint(id="DbVMax", label="DbVMax", offset=6, len=1, type="uint16",
                 description="The upper delta voltage limit for which positive voltage deviations less than this value no dynamic current produced.",
                 notes="The upper delta voltage limit for which positive voltage deviations less than this value no dynamic current produced.")
            
   var DbVMax: Int? = null

   @SunSpecPoint(id="BlkZnV", label="BlkZnV", offset=7, len=1, type="uint16",
                 description="Block zone voltage which defines a lower voltage boundary below which no dynamic current is produced.",
                 notes="Block zone voltage which defines a lower voltage boundary below which no dynamic current is produced.")
            
   var BlkZnV: Int? = null

   @SunSpecPoint(id="HysBlkZnV", label="HysBlkZnV", offset=8, len=1, type="uint16",
                 description="Hysteresis voltage used with BlkZnV.",
                 notes="Hysteresis voltage used with BlkZnV.")
            
   var HysBlkZnV: Int? = null

   @SunSpecPoint(id="BlkZnTmms", label="BlkZnTmms", offset=9, len=1, type="uint16",
                 description="Block zone time the time before which reactive current support remains active regardless of how low the voltage drops.",
                 notes="Block zone time the time before which reactive current support remains active regardless of how low the voltage drops.")
            
   var BlkZnTmms: Int? = null

   @SunSpecPoint(id="HoldTmms", label="HoldTmms", offset=10, len=1, type="uint16",
                 description="Hold time during which reactive current support continues after the average voltage has entered the dead zone.",
                 notes="Hold time during which reactive current support continues after the average voltage has entered the dead zone.")
            
   var HoldTmms: Int? = null

   @SunSpecPoint(id="ArGra_SF", label="ArGra_SF", offset=11, len=1, type="sunssf",
                 description="Scale factor for the gradients.",
                 notes="Scale factor for the gradients.")
            
   var ArGra_SF: Any? = null

   @SunSpecPoint(id="VRefPct_SF", label="VRefPct_SF", offset=12, len=1, type="sunssf",
                 description="Scale factor for the voltage zone and limit settings.",
                 notes="Scale factor for the voltage zone and limit settings.")
            
   var VRefPct_SF: Any? = null

   @SunSpecPoint(id="Pad", label="", offset=13, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}

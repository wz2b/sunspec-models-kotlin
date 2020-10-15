/*
 * Eltek Inverter Extension
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=64101, len=7, name="model_64101")
class Model_64101 {
   @SunSpecPoint(id="Eltek_Country_Code", label="", offset=0, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Eltek_Country_Code: UShort? = null

   @SunSpecPoint(id="Eltek_Feeding_Phase", label="", offset=1, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Eltek_Feeding_Phase: UShort? = null

   @SunSpecPoint(id="Eltek_APD_Method", label="", offset=2, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Eltek_APD_Method: UShort? = null

   @SunSpecPoint(id="Eltek_APD_Power_Ref", label="", offset=3, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Eltek_APD_Power_Ref: UShort? = null

   @SunSpecPoint(id="Eltek_RPS_Method", label="", offset=4, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Eltek_RPS_Method: UShort? = null

   @SunSpecPoint(id="Eltek_RPS_Q_Ref", label="", offset=5, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Eltek_RPS_Q_Ref: UShort? = null

   @SunSpecPoint(id="Eltek_RPS_CosPhi_Ref", label="", offset=6, len=1, type="int16",
                 description="",
                 notes="")
            
   var Eltek_RPS_CosPhi_Ref: Short? = null

}

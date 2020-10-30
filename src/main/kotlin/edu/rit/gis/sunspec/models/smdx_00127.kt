/*
 * Freq-Watt Param
 *
 * Parameterized Frequency-Watt 
 *
 * Ref 3: 8.9.1.2, 8.9.4.2
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=127, len=10, name="freq_watt_param")
class Model_127 {
   @SunSpecPoint(id="WGra", label="WGra", offset=0, len=1, type="uint16",
                 description="The slope of the reduction in the maximum allowed watts output as a function of frequency.",
                 notes="The slope of the reduction in the maximum allowed watts output as a function of frequency.")
            
   var WGra: Int? = null

   @SunSpecPoint(id="HzStr", label="HzStr", offset=1, len=1, type="int16",
                 description="The frequency deviation from nominal frequency (ECPNomHz) at which a snapshot of the instantaneous power output is taken to act as the CAPPED power level (PM) and above which reduction in power output occurs.",
                 notes="The frequency deviation from nominal frequency (ECPNomHz) at which a snapshot of the instantaneous power output is taken to act as the CAPPED power level (PM) and above which reduction in power output occurs.")
            
   var HzStr: Short? = null

   @SunSpecPoint(id="HzStop", label="HzStop", offset=2, len=1, type="int16",
                 description="The frequency deviation from nominal frequency (ECPNomHz) at which curtailed power output may return to normal and the cap on the power level value is removed.",
                 notes="The frequency deviation from nominal frequency (ECPNomHz) at which curtailed power output may return to normal and the cap on the power level value is removed.")
            
   var HzStop: Short? = null

   @SunSpecPoint(id="HysEna", label="HysEna", offset=3, len=1, type="bitfield16",
                 description="Enable hysteresis",
                 notes="Enable hysteresis")
            
   var HysEna: Short? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=4, len=1, type="bitfield16",
                 description="Is Parameterized Frequency-Watt control active.",
                 notes="Is Parameterized Frequency-Watt control active.")
            
   var ModEna: Short? = null

   @SunSpecPoint(id="HzStopWGra", label="HzStopWGra", offset=5, len=1, type="uint16",
                 description="The maximum time-based rate of change at which power output returns to normal after having been capped by an over frequency event.",
                 notes="The maximum time-based rate of change at which power output returns to normal after having been capped by an over frequency event.")
            
   var HzStopWGra: Int? = null

   @SunSpecPoint(id="WGra_SF", label="WGra_SF", offset=6, len=1, type="sunssf",
                 description="Scale factor for output gradient.",
                 notes="Scale factor for output gradient.")
            
   var WGra_SF: Any? = null

   @SunSpecPoint(id="HzStrStop_SF", label="HzStrStop_SF", offset=7, len=1, type="sunssf",
                 description="Scale factor for frequency deviations.",
                 notes="Scale factor for frequency deviations.")
            
   var HzStrStop_SF: Any? = null

   @SunSpecPoint(id="RmpIncDec_SF", label="RmpIncDec_SF", offset=8, len=1, type="sunssf",
                 description="Scale factor for increment and decrement ramps.",
                 notes="Scale factor for increment and decrement ramps.")
            
   var RmpIncDec_SF: Any? = null

   @SunSpecPoint(id="Pad", label="", offset=9, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}

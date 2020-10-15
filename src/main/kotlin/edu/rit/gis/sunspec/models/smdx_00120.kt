/*
 * Nameplate
 *
 * Inverter Controls Nameplate Ratings 
 *
 * Ref 3: 8.14.3.2, Ref 4: 17
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=120, len=26, name="nameplate")
class Model_120 {
   @SunSpecPoint(id="DERTyp", label="DERTyp", offset=0, len=1, type="enum16",
                 description="Type of DER device. Default value is 4 to indicate PV device.",
                 notes="Type of DER device. Default value is 4 to indicate PV device.")
            
   var DERTyp: Any? = null

   @SunSpecPoint(id="WRtg", label="WRtg", offset=1, len=1, type="uint16",
                 description="Continuous power output capability of the inverter.",
                 notes="Continuous power output capability of the inverter.")
            
   var WRtg: UShort? = null

   @SunSpecPoint(id="WRtg_SF", label="WRtg_SF", offset=2, len=1, type="sunssf",
                 description="Scale factor",
                 notes="Scale factor")
            
   var WRtg_SF: Any? = null

   @SunSpecPoint(id="VARtg", label="VARtg", offset=3, len=1, type="uint16",
                 description="Continuous Volt-Ampere capability of the inverter.",
                 notes="Continuous Volt-Ampere capability of the inverter.")
            
   var VARtg: UShort? = null

   @SunSpecPoint(id="VARtg_SF", label="VARtg_SF", offset=4, len=1, type="sunssf",
                 description="Scale factor",
                 notes="Scale factor")
            
   var VARtg_SF: Any? = null

   @SunSpecPoint(id="VArRtgQ1", label="VArRtgQ1", offset=5, len=1, type="int16",
                 description="Continuous VAR capability of the inverter in quadrant 1.",
                 notes="Continuous VAR capability of the inverter in quadrant 1.")
            
   var VArRtgQ1: Short? = null

   @SunSpecPoint(id="VArRtgQ2", label="VArRtgQ2", offset=6, len=1, type="int16",
                 description="Continuous VAR capability of the inverter in quadrant 2.",
                 notes="Continuous VAR capability of the inverter in quadrant 2.")
            
   var VArRtgQ2: Short? = null

   @SunSpecPoint(id="VArRtgQ3", label="VArRtgQ3", offset=7, len=1, type="int16",
                 description="Continuous VAR capability of the inverter in quadrant 3.",
                 notes="Continuous VAR capability of the inverter in quadrant 3.")
            
   var VArRtgQ3: Short? = null

   @SunSpecPoint(id="VArRtgQ4", label="VArRtgQ4", offset=8, len=1, type="int16",
                 description="Continuous VAR capability of the inverter in quadrant 4.",
                 notes="Continuous VAR capability of the inverter in quadrant 4.")
            
   var VArRtgQ4: Short? = null

   @SunSpecPoint(id="VArRtg_SF", label="VArRtg_SF", offset=9, len=1, type="sunssf",
                 description="Scale factor",
                 notes="Scale factor")
            
   var VArRtg_SF: Any? = null

   @SunSpecPoint(id="ARtg", label="ARtg", offset=10, len=1, type="uint16",
                 description="Maximum RMS AC current level capability of the inverter.",
                 notes="Maximum RMS AC current level capability of the inverter.")
            
   var ARtg: UShort? = null

   @SunSpecPoint(id="ARtg_SF", label="ARtg_SF", offset=11, len=1, type="sunssf",
                 description="Scale factor",
                 notes="Scale factor")
            
   var ARtg_SF: Any? = null

   @SunSpecPoint(id="PFRtgQ1", label="PFRtgQ1", offset=12, len=1, type="int16",
                 description="Minimum power factor capability of the inverter in quadrant 1.",
                 notes="Minimum power factor capability of the inverter in quadrant 1.")
            
   var PFRtgQ1: Short? = null

   @SunSpecPoint(id="PFRtgQ2", label="PFRtgQ2", offset=13, len=1, type="int16",
                 description="Minimum power factor capability of the inverter in quadrant 2.",
                 notes="Minimum power factor capability of the inverter in quadrant 2.")
            
   var PFRtgQ2: Short? = null

   @SunSpecPoint(id="PFRtgQ3", label="PFRtgQ3", offset=14, len=1, type="int16",
                 description="Minimum power factor capability of the inverter in quadrant 3.",
                 notes="Minimum power factor capability of the inverter in quadrant 3.")
            
   var PFRtgQ3: Short? = null

   @SunSpecPoint(id="PFRtgQ4", label="PFRtgQ4", offset=15, len=1, type="int16",
                 description="Minimum power factor capability of the inverter in quadrant 4.",
                 notes="Minimum power factor capability of the inverter in quadrant 4.")
            
   var PFRtgQ4: Short? = null

   @SunSpecPoint(id="PFRtg_SF", label="PFRtg_SF", offset=16, len=1, type="sunssf",
                 description="Scale factor",
                 notes="Scale factor")
            
   var PFRtg_SF: Any? = null

   @SunSpecPoint(id="WHRtg", label="WHRtg", offset=17, len=1, type="uint16",
                 description="Nominal energy rating of storage device.",
                 notes="Nominal energy rating of storage device.")
            
   var WHRtg: UShort? = null

   @SunSpecPoint(id="WHRtg_SF", label="WHRtg_SF", offset=18, len=1, type="sunssf",
                 description="Scale factor",
                 notes="Scale factor")
            
   var WHRtg_SF: Any? = null

   @SunSpecPoint(id="AhrRtg", label="AhrRtg", offset=19, len=1, type="uint16",
                 description="The usable capacity of the battery.  Maximum charge minus minimum charge from a technology capability perspective (Amp-hour capacity rating).",
                 notes="The usable capacity of the battery.  Maximum charge minus minimum charge from a technology capability perspective (Amp-hour capacity rating).")
            
   var AhrRtg: UShort? = null

   @SunSpecPoint(id="AhrRtg_SF", label="AhrRtg_SF", offset=20, len=1, type="sunssf",
                 description="Scale factor for amp-hour rating.",
                 notes="Scale factor for amp-hour rating.")
            
   var AhrRtg_SF: Any? = null

   @SunSpecPoint(id="MaxChaRte", label="MaxChaRte", offset=21, len=1, type="uint16",
                 description="Maximum rate of energy transfer into the storage device.",
                 notes="Maximum rate of energy transfer into the storage device.")
            
   var MaxChaRte: UShort? = null

   @SunSpecPoint(id="MaxChaRte_SF", label="MaxChaRte_SF", offset=22, len=1, type="sunssf",
                 description="Scale factor",
                 notes="Scale factor")
            
   var MaxChaRte_SF: Any? = null

   @SunSpecPoint(id="MaxDisChaRte", label="MaxDisChaRte", offset=23, len=1, type="uint16",
                 description="Maximum rate of energy transfer out of the storage device.",
                 notes="Maximum rate of energy transfer out of the storage device.")
            
   var MaxDisChaRte: UShort? = null

   @SunSpecPoint(id="MaxDisChaRte_SF", label="MaxDisChaRte_SF", offset=24, len=1, type="sunssf",
                 description="Scale factor",
                 notes="Scale factor")
            
   var MaxDisChaRte_SF: Any? = null

   @SunSpecPoint(id="Pad", label="Pad", offset=25, len=1, type="pad",
                 description="Pad register.",
                 notes="Pad register.")
            
   var Pad: Any? = null

}

/*
 * Pricing
 *
 * Pricing Signal  
 *
 * Ref 3: 8.7.5.1; Ref 4: 6
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=125, len=8, name="pricing")
class Model_125 {
   @SunSpecPoint(id="ModEna", label="ModEna", offset=0, len=1, type="bitfield16",
                 description="Is price-based charge/discharge mode active?",
                 notes="Is price-based charge/discharge mode active?")
            
   var ModEna: Short? = null

   @SunSpecPoint(id="SigType", label="SigType", offset=1, len=1, type="enum16",
                 description="Meaning of the pricing signal. When a Price schedule is used, type must match the schedule range variable description.",
                 notes="Meaning of the pricing signal. When a Price schedule is used, type must match the schedule range variable description.")
            
   var SigType: Any? = null

   @SunSpecPoint(id="Sig", label="Sig", offset=2, len=1, type="int16",
                 description="Utility/ESP specific pricing signal. Content depends on pricing signal type. When H/M/L type is specified. Low=0; Med=1; High=2.",
                 notes="Utility/ESP specific pricing signal. Content depends on pricing signal type. When H/M/L type is specified. Low=0; Med=1; High=2.")
            
   var Sig: Short? = null

   @SunSpecPoint(id="WinTms", label="WinTms", offset=3, len=1, type="uint16",
                 description="Time window for charge/discharge pricing change.",
                 notes="Time window for charge/discharge pricing change.")
            
   var WinTms: Int? = null

   @SunSpecPoint(id="RvtTms", label="RvtTms", offset=4, len=1, type="uint16",
                 description="Timeout period for charge/discharge pricing change.",
                 notes="Timeout period for charge/discharge pricing change.")
            
   var RvtTms: Int? = null

   @SunSpecPoint(id="RmpTms", label="RmpTms", offset=5, len=1, type="uint16",
                 description="Ramp time for moving from current charge or discharge level to new level.",
                 notes="Ramp time for moving from current charge or discharge level to new level.")
            
   var RmpTms: Int? = null

   @SunSpecPoint(id="Sig_SF", label="Sig_SF", offset=6, len=1, type="sunssf",
                 description="Pricing signal scale factor.",
                 notes="Pricing signal scale factor.")
            
   var Sig_SF: Any? = null

   @SunSpecPoint(id="Pad", label="", offset=7, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}

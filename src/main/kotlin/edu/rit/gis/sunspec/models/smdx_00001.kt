/*
 * Common
 *
 * All SunSpec compliant devices must include this as the first model
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=1, len=66, name="common")
class Model_1 {
   @SunSpecPoint(id="Mn", label="Manufacturer", offset=0, len=16, type="string",
                 description="Well known value registered with SunSpec for compliance",
                 notes="Well known value registered with SunSpec for compliance")
            
   var Mn: String? = null

   @SunSpecPoint(id="Md", label="Model", offset=16, len=16, type="string",
                 description="Manufacturer specific value (32 chars)",
                 notes="Manufacturer specific value (32 chars)")
            
   var Md: String? = null

   @SunSpecPoint(id="Opt", label="Options", offset=32, len=8, type="string",
                 description="Manufacturer specific value (16 chars)",
                 notes="Manufacturer specific value (16 chars)")
            
   var Opt: String? = null

   @SunSpecPoint(id="Vr", label="Version", offset=40, len=8, type="string",
                 description="Manufacturer specific value (16 chars)",
                 notes="Manufacturer specific value (16 chars)")
            
   var Vr: String? = null

   @SunSpecPoint(id="SN", label="Serial Number", offset=48, len=16, type="string",
                 description="Manufacturer specific value (32 chars)",
                 notes="Manufacturer specific value (32 chars)")
            
   var SN: String? = null

   @SunSpecPoint(id="DA", label="Device Address", offset=64, len=1, type="uint16",
                 description="Modbus device address",
                 notes="Modbus device address")
            
   var DA: UShort? = null

   @SunSpecPoint(id="Pad", label="", offset=65, len=1, type="pad",
                 description="Force even alignment",
                 notes="Force even alignment")
            
   var Pad: Any? = null

}

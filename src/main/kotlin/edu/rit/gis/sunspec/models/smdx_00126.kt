/*
 * Static Volt-VAR
 *
 * Static Volt-VAR Arrays 
 *
 * Ref 3: 8.8.1.2
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=126, len=64, name="volt_var")
class Model_126 {
   @SunSpecPoint(id="ActCrv", label="ActCrv", offset=0, len=1, type="uint16",
                 description="Index of active curve. 0=no active curve.",
                 notes="Index of active curve. 0=no active curve.")
            
   var ActCrv: Int? = null

   @SunSpecPoint(id="ModEna", label="ModEna", offset=1, len=1, type="bitfield16",
                 description="Is Volt-VAR control active.",
                 notes="Is Volt-VAR control active.")
            
   var ModEna: Short? = null

   @SunSpecPoint(id="WinTms", label="WinTms", offset=2, len=1, type="uint16",
                 description="Time window for volt-VAR change.",
                 notes="Time window for volt-VAR change.")
            
   var WinTms: Int? = null

   @SunSpecPoint(id="RvrtTms", label="RvrtTms", offset=3, len=1, type="uint16",
                 description="Timeout period for volt-VAR curve selection.",
                 notes="Timeout period for volt-VAR curve selection.")
            
   var RvrtTms: Int? = null

   @SunSpecPoint(id="RmpTms", label="RmpTms", offset=4, len=1, type="uint16",
                 description="Ramp time for moving from current mode to new mode.",
                 notes="Ramp time for moving from current mode to new mode.")
            
   var RmpTms: Int? = null

   @SunSpecPoint(id="NCrv", label="NCrv", offset=5, len=1, type="uint16",
                 description="Number of curves supported (recommend 4).",
                 notes="Number of curves supported (recommend 4).")
            
   var NCrv: Int? = null

   @SunSpecPoint(id="NPt", label="NPt", offset=6, len=1, type="uint16",
                 description="Number of curve points supported (maximum of 20).",
                 notes="Number of curve points supported (maximum of 20).")
            
   var NPt: Int? = null

   @SunSpecPoint(id="V_SF", label="V_SF", offset=7, len=1, type="sunssf",
                 description="Scale factor for percent VRef.",
                 notes="Scale factor for percent VRef.")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="DeptRef_SF", label="DeptRef_SF", offset=8, len=1, type="sunssf",
                 description="scale factor for dependent variable.",
                 notes="scale factor for dependent variable.")
            
   var DeptRef_SF: Any? = null

   @SunSpecPoint(id="RmpIncDec_SF", label="", offset=9, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var RmpIncDec_SF: Any? = null

}

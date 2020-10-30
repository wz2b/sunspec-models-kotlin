/*
 * Lithium-Ion Battery Bank Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=803, len=58, name="lithium_ion_bank")
class Model_803 {
   @SunSpecPoint(id="NStr", label="String Count", offset=0, len=1, type="uint16",
                 description="Number of strings in the bank.",
                 notes="Number of strings in the bank.")
            
   var NStr: Int? = null

   @SunSpecPoint(id="NStrCon", label="Connected String Count", offset=1, len=1, type="uint16",
                 description="Number of strings with contactor closed.",
                 notes="Number of strings with contactor closed.")
            
   var NStrCon: Int? = null

   @SunSpecPoint(id="ModTmpMax", label="Max Module Temperature", offset=2, len=1, type="int16",
                 description="Maximum temperature for all modules in the bank.",
                 notes="Maximum temperature for all modules in the bank.")
            
   var ModTmpMax: Short? = null

   @SunSpecPoint(id="ModTmpMaxStr", label="Max Module Temperature String", offset=3, len=1, type="uint16",
                 description="String containing the module with maximum temperature.",
                 notes="String containing the module with maximum temperature.")
            
   var ModTmpMaxStr: Int? = null

   @SunSpecPoint(id="ModTmpMaxMod", label="Max Module Temperature Module", offset=4, len=1, type="uint16",
                 description="Module with maximum temperature.",
                 notes="Module with maximum temperature.")
            
   var ModTmpMaxMod: Int? = null

   @SunSpecPoint(id="ModTmpMin", label="Min Module Temperature", offset=5, len=1, type="int16",
                 description="Minimum temperature for all modules in the bank.",
                 notes="Minimum temperature for all modules in the bank.")
            
   var ModTmpMin: Short? = null

   @SunSpecPoint(id="ModTmpMinStr", label="Min Module Temperature String", offset=6, len=1, type="uint16",
                 description="String containing the module with minimum temperature.",
                 notes="String containing the module with minimum temperature.")
            
   var ModTmpMinStr: Int? = null

   @SunSpecPoint(id="ModTmpMinMod", label="Min Module Temperature Module", offset=7, len=1, type="uint16",
                 description="Module with minimum temperature.",
                 notes="Module with minimum temperature.")
            
   var ModTmpMinMod: Int? = null

   @SunSpecPoint(id="ModTmpAvg", label="Average Module Temperature", offset=8, len=1, type="uint16",
                 description="Average temperature for all modules in the bank.",
                 notes="Average temperature for all modules in the bank.")
            
   var ModTmpAvg: Int? = null

   @SunSpecPoint(id="StrVMax", label="Max String Voltage", offset=9, len=1, type="uint16",
                 description="Maximum string voltage for all strings in the bank.",
                 notes="Maximum string voltage for all strings in the bank.")
            
   var StrVMax: Int? = null

   @SunSpecPoint(id="StrVMaxStr", label="Max String Voltage String", offset=10, len=1, type="uint16",
                 description="String with maximum voltage.",
                 notes="String with maximum voltage.")
            
   var StrVMaxStr: Int? = null

   @SunSpecPoint(id="StrVMin", label="Min String Voltage", offset=11, len=1, type="uint16",
                 description="Minimum string voltage for all strings in the bank.",
                 notes="Minimum string voltage for all strings in the bank.")
            
   var StrVMin: Int? = null

   @SunSpecPoint(id="StrVMinStr", label="Min String Voltage String", offset=12, len=1, type="uint16",
                 description="String with minimum voltage.",
                 notes="String with minimum voltage.")
            
   var StrVMinStr: Int? = null

   @SunSpecPoint(id="StrVAvg", label="Average String Voltage", offset=13, len=1, type="uint16",
                 description="Average string voltage for all strings in the bank.",
                 notes="Average string voltage for all strings in the bank.")
            
   var StrVAvg: Int? = null

   @SunSpecPoint(id="StrAMax", label="Max String Current", offset=14, len=1, type="int16",
                 description="Maximum current of any string in the bank.",
                 notes="Maximum current of any string in the bank.")
            
   var StrAMax: Short? = null

   @SunSpecPoint(id="StrAMaxStr", label="Max String Current String", offset=15, len=1, type="uint16",
                 description="String with the maximum current.",
                 notes="String with the maximum current.")
            
   var StrAMaxStr: Int? = null

   @SunSpecPoint(id="StrAMin", label="Min String Current", offset=16, len=1, type="int16",
                 description="Minimum current of any string in the bank.",
                 notes="Minimum current of any string in the bank.")
            
   var StrAMin: Short? = null

   @SunSpecPoint(id="StrAMinStr", label="Min String Current String", offset=17, len=1, type="uint16",
                 description="String with the minimum current.",
                 notes="String with the minimum current.")
            
   var StrAMinStr: Int? = null

   @SunSpecPoint(id="StrAAvg", label="Average String Current", offset=18, len=1, type="int16",
                 description="Average string current for all strings in the bank.",
                 notes="Average string current for all strings in the bank.")
            
   var StrAAvg: Short? = null

   @SunSpecPoint(id="NCellBal", label="Battery Cell Balancing Count", offset=19, len=1, type="uint16",
                 description="Total number of cells that are currently being balanced.",
                 notes="Total number of cells that are currently being balanced.")
            
   var NCellBal: Int? = null

   @SunSpecPoint(id="CellV_SF", label="", offset=20, len=1, type="sunssf",
                 description="Scale factor for cell voltage.",
                 notes="Scale factor for cell voltage.")
            
   var CellV_SF: Any? = null

   @SunSpecPoint(id="ModTmp_SF", label="", offset=21, len=1, type="sunssf",
                 description="Scale factor for module temperatures.",
                 notes="Scale factor for module temperatures.")
            
   var ModTmp_SF: Any? = null

   @SunSpecPoint(id="A_SF", label="", offset=22, len=1, type="sunssf",
                 description="Scale factor for string currents.",
                 notes="Scale factor for string currents.")
            
   var A_SF: Any? = null

   @SunSpecPoint(id="SoH_SF", label="", offset=23, len=1, type="sunssf",
                 description="Scale factor for string state of health.",
                 notes="Scale factor for string state of health.")
            
   var SoH_SF: Any? = null

   @SunSpecPoint(id="SoC_SF", label="", offset=24, len=1, type="sunssf",
                 description="Scale factor for string state of charge.",
                 notes="Scale factor for string state of charge.")
            
   var SoC_SF: Any? = null

   @SunSpecPoint(id="V_SF", label="", offset=25, len=1, type="sunssf",
                 description="Scale factor for string voltage.",
                 notes="Scale factor for string voltage.")
            
   var V_SF: Any? = null

}

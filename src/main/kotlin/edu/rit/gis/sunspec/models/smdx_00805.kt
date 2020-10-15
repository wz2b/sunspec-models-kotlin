/*
 * Lithium-Ion Module Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=805, len=46, name="lithium-ion-module")
class Model_805 {
   @SunSpecPoint(id="StrIdx", label="String Index", offset=0, len=1, type="uint16",
                 description="Index of the string containing the module.",
                 notes="Index of the string containing the module.")
            
   var StrIdx: UShort? = null

   @SunSpecPoint(id="ModIdx", label="Module Index", offset=1, len=1, type="uint16",
                 description="Index of the module within the string.",
                 notes="Index of the module within the string.")
            
   var ModIdx: UShort? = null

   @SunSpecPoint(id="NCell", label="Module Cell Count", offset=2, len=1, type="uint16",
                 description="Count of all cells in the module.",
                 notes="Count of all cells in the module.")
            
   var NCell: UShort? = null

   @SunSpecPoint(id="SoC", label="Module SoC", offset=3, len=1, type="uint16",
                 description="Module state of charge, expressed as a percentage.",
                 notes="Module state of charge, expressed as a percentage.")
            
   var SoC: UShort? = null

   @SunSpecPoint(id="DoD", label="Depth of Discharge", offset=4, len=1, type="uint16",
                 description="Depth of discharge for the module.",
                 notes="Depth of discharge for the module.")
            
   var DoD: UShort? = null

   @SunSpecPoint(id="SoH", label="Module SoH", offset=5, len=1, type="uint16",
                 description="Module state of health, expressed as a percentage.",
                 notes="Module state of health, expressed as a percentage.")
            
   var SoH: UShort? = null

   @SunSpecPoint(id="NCyc", label="Cycle Count", offset=6, len=2, type="uint32",
                 description="Count of cycles executed.",
                 notes="Count of cycles executed.")
            
   var NCyc: UInt? = null

   @SunSpecPoint(id="V", label="Module Voltage", offset=8, len=1, type="uint16",
                 description="Voltage of the module.",
                 notes="Voltage of the module.")
            
   var V: UShort? = null

   @SunSpecPoint(id="CellVMax", label="Max Cell Voltage", offset=9, len=1, type="uint16",
                 description="Maximum voltage for all cells in the module.",
                 notes="Maximum voltage for all cells in the module.")
            
   var CellVMax: UShort? = null

   @SunSpecPoint(id="CellVMaxCell", label="Max Cell Voltage Cell", offset=10, len=1, type="uint16",
                 description="Cell with the maximum voltage.",
                 notes="Cell with the maximum voltage.")
            
   var CellVMaxCell: UShort? = null

   @SunSpecPoint(id="CellVMin", label="Min Cell Voltage", offset=11, len=1, type="uint16",
                 description="Minimum voltage for all cells in the module.",
                 notes="Minimum voltage for all cells in the module.")
            
   var CellVMin: UShort? = null

   @SunSpecPoint(id="CellVMinCell", label="Min Cell Voltage Cell", offset=12, len=1, type="uint16",
                 description="Cell with the minimum voltage.",
                 notes="Cell with the minimum voltage.")
            
   var CellVMinCell: UShort? = null

   @SunSpecPoint(id="CellVAvg", label="Average Cell Voltage", offset=13, len=1, type="uint16",
                 description="Average voltage for all cells in the module.",
                 notes="Average voltage for all cells in the module.")
            
   var CellVAvg: UShort? = null

   @SunSpecPoint(id="CellTmpMax", label="Max Cell Temperature", offset=14, len=1, type="int16",
                 description="Maximum temperature for all cells in the module.",
                 notes="Maximum temperature for all cells in the module.")
            
   var CellTmpMax: Short? = null

   @SunSpecPoint(id="CellTmpMaxCell", label="Max Cell Temperature Cell", offset=15, len=1, type="uint16",
                 description="Cell with the maximum cell temperature.",
                 notes="Cell with the maximum cell temperature.")
            
   var CellTmpMaxCell: UShort? = null

   @SunSpecPoint(id="CellTmpMin", label="Min Cell Temperature", offset=16, len=1, type="int16",
                 description="Minimum temperature for all cells in the module.",
                 notes="Minimum temperature for all cells in the module.")
            
   var CellTmpMin: Short? = null

   @SunSpecPoint(id="CellTmpMinCell", label="Min Cell Temperature Cell", offset=17, len=1, type="uint16",
                 description="Cell with the minimum cell temperature.",
                 notes="Cell with the minimum cell temperature.")
            
   var CellTmpMinCell: UShort? = null

   @SunSpecPoint(id="CellTmpAvg", label="Average Cell Temperature", offset=18, len=1, type="int16",
                 description="Average temperature for all cells in the module.",
                 notes="Average temperature for all cells in the module.")
            
   var CellTmpAvg: Short? = null

   @SunSpecPoint(id="NCellBal", label="Balanced Cell Count", offset=19, len=1, type="uint16",
                 description="Number of cells currently being balanced in the module.",
                 notes="Number of cells currently being balanced in the module.")
            
   var NCellBal: UShort? = null

   @SunSpecPoint(id="SN", label="Serial Number", offset=20, len=16, type="string",
                 description="Serial number for the module.",
                 notes="Serial number for the module.")
            
   var SN: String? = null

   @SunSpecPoint(id="SoC_SF", label="", offset=36, len=1, type="sunssf",
                 description="Scale factor for module state of charge.",
                 notes="Scale factor for module state of charge.")
            
   var SoC_SF: Any? = null

   @SunSpecPoint(id="SoH_SF", label="", offset=37, len=1, type="sunssf",
                 description="Scale factor for module state of health.",
                 notes="Scale factor for module state of health.")
            
   var SoH_SF: Any? = null

   @SunSpecPoint(id="DoD_SF", label="", offset=38, len=1, type="sunssf",
                 description="Scale factor for module depth of discharge.",
                 notes="Scale factor for module depth of discharge.")
            
   var DoD_SF: Any? = null

   @SunSpecPoint(id="V_SF", label="", offset=39, len=1, type="sunssf",
                 description="Scale factor for module voltage.",
                 notes="Scale factor for module voltage.")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="CellV_SF", label="", offset=40, len=1, type="sunssf",
                 description="Scale factor for cell voltage.",
                 notes="Scale factor for cell voltage.")
            
   var CellV_SF: Any? = null

   @SunSpecPoint(id="Tmp_SF", label="", offset=41, len=1, type="sunssf",
                 description="Scale factor for module temperature.",
                 notes="Scale factor for module temperature.")
            
   var Tmp_SF: Any? = null

}

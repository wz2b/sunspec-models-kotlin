/*
 * Lithium-Ion String Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=804, len=62, name="lithium_ion_string")
class Model_804 {
   @SunSpecPoint(id="Idx", label="String Index", offset=0, len=1, type="uint16",
                 description="Index of the string within the bank.",
                 notes="Index of the string within the bank.")
            
   var Idx: Int? = null

   @SunSpecPoint(id="NMod", label="Module Count", offset=1, len=1, type="uint16",
                 description="Count of modules in the string.",
                 notes="Count of modules in the string.")
            
   var NMod: Int? = null

   @SunSpecPoint(id="St", label="String Status", offset=2, len=2, type="bitfield32",
                 description="Current status of the string.",
                 notes="Current status of the string.")
            
   var St: Int? = null

   @SunSpecPoint(id="ConFail", label="Connection Failure Reason", offset=4, len=0, type="enum16",
                 description="",
                 notes="")
            
   var ConFail: Any? = null

   @SunSpecPoint(id="NCellBal", label="String Cell Balancing Count", offset=5, len=1, type="uint16",
                 description="Number of cells currently being balanced in the string.",
                 notes="Number of cells currently being balanced in the string.")
            
   var NCellBal: Int? = null

   @SunSpecPoint(id="SoC", label="String State of Charge", offset=6, len=1, type="uint16",
                 description="Battery string state of charge, expressed as a percentage.",
                 notes="Battery string state of charge, expressed as a percentage.")
            
   var SoC: Int? = null

   @SunSpecPoint(id="DoD", label="String Depth of Discharge", offset=7, len=1, type="uint16",
                 description="Depth of discharge for the string, expressed as a percentage.",
                 notes="Depth of discharge for the string, expressed as a percentage.")
            
   var DoD: Int? = null

   @SunSpecPoint(id="NCyc", label="String Cycle Count", offset=8, len=2, type="uint32",
                 description="Number of discharge cycles executed upon the string.",
                 notes="Number of discharge cycles executed upon the string.")
            
   var NCyc: Int? = null

   @SunSpecPoint(id="SoH", label="String State of Health", offset=10, len=1, type="uint16",
                 description="Battery string state of health, expressed as a percentage.",
                 notes="Battery string state of health, expressed as a percentage.")
            
   var SoH: Int? = null

   @SunSpecPoint(id="A", label="String Current", offset=11, len=1, type="int16",
                 description="String current measurement.",
                 notes="String current measurement.")
            
   var A: Short? = null

   @SunSpecPoint(id="V", label="String Voltage", offset=12, len=1, type="uint16",
                 description="String voltage measurement.",
                 notes="String voltage measurement.")
            
   var V: Int? = null

   @SunSpecPoint(id="CellVMax", label="Max Cell Voltage", offset=13, len=1, type="uint16",
                 description="Maximum voltage for all cells in the string.",
                 notes="Maximum voltage for all cells in the string.")
            
   var CellVMax: Int? = null

   @SunSpecPoint(id="CellVMaxMod", label="Max Cell Voltage Module", offset=14, len=1, type="uint16",
                 description="Module containing the cell with maximum cell voltage.",
                 notes="Module containing the cell with maximum cell voltage.")
            
   var CellVMaxMod: Int? = null

   @SunSpecPoint(id="CellVMin", label="Min Cell Voltage", offset=15, len=1, type="uint16",
                 description="Minimum voltage for all cells in the string.",
                 notes="Minimum voltage for all cells in the string.")
            
   var CellVMin: Int? = null

   @SunSpecPoint(id="CellVMinMod", label="Min Cell Voltage Module", offset=16, len=1, type="uint16",
                 description="Module containing the cell with minimum cell voltage.",
                 notes="Module containing the cell with minimum cell voltage.")
            
   var CellVMinMod: Int? = null

   @SunSpecPoint(id="CellVAvg", label="Average Cell Voltage", offset=17, len=1, type="uint16",
                 description="Average voltage for all cells in the string.",
                 notes="Average voltage for all cells in the string.")
            
   var CellVAvg: Int? = null

   @SunSpecPoint(id="ModTmpMax", label="Max Module Temperature", offset=18, len=1, type="int16",
                 description="Maximum temperature for all modules in the string.",
                 notes="Maximum temperature for all modules in the string.")
            
   var ModTmpMax: Short? = null

   @SunSpecPoint(id="ModTmpMaxMod", label="Max Module Temperature Module", offset=19, len=1, type="uint16",
                 description="Module with the maximum temperature.",
                 notes="Module with the maximum temperature.")
            
   var ModTmpMaxMod: Int? = null

   @SunSpecPoint(id="ModTmpMin", label="Min Module Temperature", offset=20, len=1, type="int16",
                 description="Minimum temperature for all modules in the string.",
                 notes="Minimum temperature for all modules in the string.")
            
   var ModTmpMin: Short? = null

   @SunSpecPoint(id="ModTmpMinMod", label="Min Module Temperature Module", offset=21, len=1, type="uint16",
                 description="Module with the minimum temperature.",
                 notes="Module with the minimum temperature.")
            
   var ModTmpMinMod: Int? = null

   @SunSpecPoint(id="ModTmpAvg", label="Average Module Temperature", offset=22, len=1, type="int16",
                 description="Average temperature for all modules in the string.",
                 notes="Average temperature for all modules in the string.")
            
   var ModTmpAvg: Short? = null

   @SunSpecPoint(id="Pad1", label="Pad", offset=23, len=1, type="pad",
                 description="Pad register.",
                 notes="Pad register.")
            
   var Pad1: Any? = null

   @SunSpecPoint(id="ConSt", label="Contactor Status", offset=24, len=2, type="bitfield32",
                 description="Status of the contactor(s) for the string.",
                 notes="Status of the contactor(s) for the string.")
            
   var ConSt: Int? = null

   @SunSpecPoint(id="Evt1", label="String Event 1", offset=26, len=2, type="bitfield32",
                 description="Alarms, warnings and status values.  Bit flags.",
                 notes="Alarms, warnings and status values.  Bit flags.")
            
   var Evt1: Int? = null

   @SunSpecPoint(id="Evt2", label="String Event 2", offset=28, len=2, type="bitfield32",
                 description="Alarms, warnings and status values.  Bit flags.",
                 notes="Alarms, warnings and status values.  Bit flags.")
            
   var Evt2: Int? = null

   @SunSpecPoint(id="EvtVnd1", label="Vendor Event Bitfield 1", offset=30, len=2, type="bitfield32",
                 description="Vendor defined events.",
                 notes="Vendor defined events.")
            
   var EvtVnd1: Int? = null

   @SunSpecPoint(id="EvtVnd2", label="Vendor Event Bitfield 2", offset=32, len=2, type="bitfield32",
                 description="Vendor defined events.",
                 notes="Vendor defined events.")
            
   var EvtVnd2: Int? = null

   @SunSpecPoint(id="SetEna", label="Enable/Disable String", offset=34, len=0, type="enum16",
                 description="Enables and disables the string.  Should reset to 0 upon completion.",
                 notes="Enables and disables the string.  Should reset to 0 upon completion.")
            
   var SetEna: Any? = null

   @SunSpecPoint(id="SetCon", label="Connect/Disconnect String", offset=35, len=0, type="enum16",
                 description="Connects and disconnects the string.",
                 notes="Connects and disconnects the string.")
            
   var SetCon: Any? = null

   @SunSpecPoint(id="SoC_SF", label="", offset=36, len=1, type="sunssf",
                 description="Scale factor for string state of charge.",
                 notes="Scale factor for string state of charge.")
            
   var SoC_SF: Any? = null

   @SunSpecPoint(id="SoH_SF", label="", offset=37, len=1, type="sunssf",
                 description="Scale factor for string state of health.",
                 notes="Scale factor for string state of health.")
            
   var SoH_SF: Any? = null

   @SunSpecPoint(id="DoD_SF", label="", offset=38, len=1, type="sunssf",
                 description="Scale factor for string depth of discharge.",
                 notes="Scale factor for string depth of discharge.")
            
   var DoD_SF: Any? = null

   @SunSpecPoint(id="A_SF", label="", offset=39, len=1, type="sunssf",
                 description="Scale factor for string current.",
                 notes="Scale factor for string current.")
            
   var A_SF: Any? = null

   @SunSpecPoint(id="V_SF", label="", offset=40, len=1, type="sunssf",
                 description="Scale factor for string voltage.",
                 notes="Scale factor for string voltage.")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="CellV_SF", label="", offset=41, len=1, type="sunssf",
                 description="Scale factor for cell voltage.",
                 notes="Scale factor for cell voltage.")
            
   var CellV_SF: Any? = null

   @SunSpecPoint(id="ModTmp_SF", label="", offset=42, len=1, type="sunssf",
                 description="Scale factor for module temperature.",
                 notes="Scale factor for module temperature.")
            
   var ModTmp_SF: Any? = null

   @SunSpecPoint(id="Pad2", label="Pad", offset=43, len=1, type="pad",
                 description="Pad register.",
                 notes="Pad register.")
            
   var Pad2: Any? = null

   @SunSpecPoint(id="Pad3", label="Pad", offset=44, len=1, type="pad",
                 description="Pad register.",
                 notes="Pad register.")
            
   var Pad3: Any? = null

   @SunSpecPoint(id="Pad4", label="Pad", offset=45, len=1, type="pad",
                 description="Pad register.",
                 notes="Pad register.")
            
   var Pad4: Any? = null

}

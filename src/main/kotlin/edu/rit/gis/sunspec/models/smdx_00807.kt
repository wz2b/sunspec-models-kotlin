/*
 * Flow Battery String Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=807, len=58, name="flow_battery_string")
class Model_807 {
   @SunSpecPoint(id="Idx", label="String Index", offset=0, len=1, type="uint16",
                 description="Index of the string within the bank.",
                 notes="Index of the string within the bank.")
            
   var Idx: UShort? = null

   @SunSpecPoint(id="NMod", label="Module Count", offset=1, len=1, type="uint16",
                 description="Number of modules in this string.",
                 notes="Number of modules in this string.")
            
   var NMod: UShort? = null

   @SunSpecPoint(id="NModCon", label="Connected Module Count", offset=2, len=1, type="uint16",
                 description="Number of electrically connected modules in this string.",
                 notes="Number of electrically connected modules in this string.")
            
   var NModCon: UShort? = null

   @SunSpecPoint(id="ModVMax", label="Max Module Voltage", offset=3, len=1, type="uint16",
                 description="Maximum voltage for all modules in the string.",
                 notes="Maximum voltage for all modules in the string.")
            
   var ModVMax: UShort? = null

   @SunSpecPoint(id="ModVMaxMod", label="Max Module Voltage Module", offset=4, len=1, type="uint16",
                 description="Module with the maximum voltage.",
                 notes="Module with the maximum voltage.")
            
   var ModVMaxMod: UShort? = null

   @SunSpecPoint(id="ModVMin", label="Min Module Voltage", offset=5, len=1, type="uint16",
                 description="Minimum voltage for all modules in the string.",
                 notes="Minimum voltage for all modules in the string.")
            
   var ModVMin: UShort? = null

   @SunSpecPoint(id="ModVMinMod", label="Min Module Voltage Module", offset=6, len=1, type="uint16",
                 description="Module with the minimum voltage.",
                 notes="Module with the minimum voltage.")
            
   var ModVMinMod: UShort? = null

   @SunSpecPoint(id="ModVAvg", label="Average Module Voltage", offset=7, len=1, type="uint16",
                 description="Average voltage for all modules in the string.",
                 notes="Average voltage for all modules in the string.")
            
   var ModVAvg: UShort? = null

   @SunSpecPoint(id="CellVMax", label="Max Cell Voltage", offset=8, len=1, type="uint16",
                 description="Maximum voltage for all cells in the string.",
                 notes="Maximum voltage for all cells in the string.")
            
   var CellVMax: UShort? = null

   @SunSpecPoint(id="CellVMaxMod", label="Max Cell Voltage Module", offset=9, len=1, type="uint16",
                 description="Module containing the cell with the maximum voltage.",
                 notes="Module containing the cell with the maximum voltage.")
            
   var CellVMaxMod: UShort? = null

   @SunSpecPoint(id="CellVMaxStk", label="Max Cell Voltage Stack", offset=10, len=1, type="uint16",
                 description="Stack containing the cell with the maximum voltage.",
                 notes="Stack containing the cell with the maximum voltage.")
            
   var CellVMaxStk: UShort? = null

   @SunSpecPoint(id="CellVMin", label="Min Cell Voltage", offset=11, len=1, type="uint16",
                 description="Minimum voltage for all cells in the string.",
                 notes="Minimum voltage for all cells in the string.")
            
   var CellVMin: UShort? = null

   @SunSpecPoint(id="CellVMinMod", label="Min Cell Voltage Module", offset=12, len=1, type="uint16",
                 description="Module containing the cell with the minimum voltage.",
                 notes="Module containing the cell with the minimum voltage.")
            
   var CellVMinMod: UShort? = null

   @SunSpecPoint(id="CellVMinStk", label="Min Cell Voltage Stack", offset=13, len=1, type="uint16",
                 description="Stack containing the cell with the minimum voltage.",
                 notes="Stack containing the cell with the minimum voltage.")
            
   var CellVMinStk: UShort? = null

   @SunSpecPoint(id="CellVAvg", label="Average Cell Voltage", offset=14, len=1, type="uint16",
                 description="Average voltage for all cells in the string.",
                 notes="Average voltage for all cells in the string.")
            
   var CellVAvg: UShort? = null

   @SunSpecPoint(id="TmpMax", label="Max Temperature", offset=15, len=1, type="int16",
                 description="Maximum electrolyte temperature for all modules in the string.",
                 notes="Maximum electrolyte temperature for all modules in the string.")
            
   var TmpMax: Short? = null

   @SunSpecPoint(id="TmpMaxMod", label="Max Temperature Module", offset=16, len=1, type="uint16",
                 description="Module with the maximum temperature.",
                 notes="Module with the maximum temperature.")
            
   var TmpMaxMod: UShort? = null

   @SunSpecPoint(id="TmpMin", label="Min Temperature", offset=17, len=1, type="int16",
                 description="Minimum electrolyte temperature for all modules in the string.",
                 notes="Minimum electrolyte temperature for all modules in the string.")
            
   var TmpMin: Short? = null

   @SunSpecPoint(id="TmpMinMod", label="Min Temperature Module", offset=18, len=1, type="uint16",
                 description="Module with the minimum temperature.",
                 notes="Module with the minimum temperature.")
            
   var TmpMinMod: UShort? = null

   @SunSpecPoint(id="TmpAvg", label="Average Temperature", offset=19, len=1, type="int16",
                 description="Average electrolyte temperature for all modules in the string.",
                 notes="Average electrolyte temperature for all modules in the string.")
            
   var TmpAvg: Short? = null

   @SunSpecPoint(id="Evt1", label="String Event 1", offset=20, len=2, type="bitfield32",
                 description="Alarms, warnings and status values.  Bit flags.",
                 notes="Alarms, warnings and status values.  Bit flags.")
            
   var Evt1: UInt? = null

   @SunSpecPoint(id="Evt2", label="String Event 2", offset=22, len=2, type="bitfield32",
                 description="Alarms, warnings and status values.  Bit flags.",
                 notes="Alarms, warnings and status values.  Bit flags.")
            
   var Evt2: UInt? = null

   @SunSpecPoint(id="EvtVnd1", label="Vendor Event Bitfield 1", offset=24, len=2, type="bitfield32",
                 description="Vendor defined events.",
                 notes="Vendor defined events.")
            
   var EvtVnd1: UInt? = null

   @SunSpecPoint(id="EvtVnd2", label="Vendor Event Bitfield 2", offset=26, len=2, type="bitfield32",
                 description="Vendor defined events.",
                 notes="Vendor defined events.")
            
   var EvtVnd2: UInt? = null

   @SunSpecPoint(id="ModV_SF", label="", offset=28, len=1, type="sunssf",
                 description="",
                 notes="")
            
   var ModV_SF: Any? = null

   @SunSpecPoint(id="CellV_SF", label="", offset=29, len=1, type="sunssf",
                 description="Scale factor for voltage.",
                 notes="Scale factor for voltage.")
            
   var CellV_SF: Any? = null

   @SunSpecPoint(id="Tmp_SF", label="", offset=30, len=1, type="sunssf",
                 description="Scale factor for temperature.",
                 notes="Scale factor for temperature.")
            
   var Tmp_SF: Any? = null

   @SunSpecPoint(id="SoC_SF", label="", offset=31, len=1, type="sunssf",
                 description="Scale factor for state of charge.",
                 notes="Scale factor for state of charge.")
            
   var SoC_SF: Any? = null

   @SunSpecPoint(id="OCV_SF", label="", offset=32, len=1, type="sunssf",
                 description="Scale factor for open circuit voltage.",
                 notes="Scale factor for open circuit voltage.")
            
   var OCV_SF: Any? = null

   @SunSpecPoint(id="Pad1", label="Pad", offset=33, len=1, type="pad",
                 description="Pad register.",
                 notes="Pad register.")
            
   var Pad1: Any? = null

}

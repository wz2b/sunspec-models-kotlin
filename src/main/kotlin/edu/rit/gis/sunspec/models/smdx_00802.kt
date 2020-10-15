/*
 * Battery Base Model
 *
 * 
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=802, len=62, name="battery")
class Model_802 {
   @SunSpecPoint(id="AHRtg", label="Nameplate Charge Capacity", offset=0, len=1, type="uint16",
                 description="Nameplate charge capacity in amp-hours.",
                 notes="Nameplate charge capacity in amp-hours.")
            
   var AHRtg: UShort? = null

   @SunSpecPoint(id="WHRtg", label="Nameplate Energy Capacity", offset=1, len=1, type="uint16",
                 description="Nameplate energy capacity in DC watt-hours.",
                 notes="Nameplate energy capacity in DC watt-hours.")
            
   var WHRtg: UShort? = null

   @SunSpecPoint(id="WChaRteMax", label="Nameplate Max Charge Rate", offset=2, len=1, type="uint16",
                 description="Maximum rate of energy transfer into the storage device in DC watts.",
                 notes="Maximum rate of energy transfer into the storage device in DC watts.")
            
   var WChaRteMax: UShort? = null

   @SunSpecPoint(id="WDisChaRteMax", label="Nameplate Max Discharge Rate", offset=3, len=1, type="uint16",
                 description="Maximum rate of energy transfer out of the storage device in DC watts.",
                 notes="Maximum rate of energy transfer out of the storage device in DC watts.")
            
   var WDisChaRteMax: UShort? = null

   @SunSpecPoint(id="DisChaRte", label="Self Discharge Rate", offset=4, len=1, type="uint16",
                 description="Self discharge rate.  Percentage of capacity (WHRtg) discharged per day.",
                 notes="Self discharge rate.  Percentage of capacity (WHRtg) discharged per day.")
            
   var DisChaRte: UShort? = null

   @SunSpecPoint(id="SoCMax", label="Nameplate Max SoC", offset=5, len=1, type="uint16",
                 description="Manufacturer maximum state of charge, expressed as a percentage.",
                 notes="Manufacturer maximum state of charge, expressed as a percentage.")
            
   var SoCMax: UShort? = null

   @SunSpecPoint(id="SoCMin", label="Nameplate Min SoC", offset=6, len=1, type="uint16",
                 description="Manufacturer minimum state of charge, expressed as a percentage.",
                 notes="Manufacturer minimum state of charge, expressed as a percentage.")
            
   var SoCMin: UShort? = null

   @SunSpecPoint(id="SocRsvMax", label="Max Reserve Percent", offset=7, len=1, type="uint16",
                 description="Setpoint for maximum reserve for storage as a percentage of the nominal maximum storage.",
                 notes="Setpoint for maximum reserve for storage as a percentage of the nominal maximum storage.")
            
   var SocRsvMax: UShort? = null

   @SunSpecPoint(id="SoCRsvMin", label="Min Reserve Percent", offset=8, len=1, type="uint16",
                 description="Setpoint for maximum reserve for storage as a percentage of the nominal maximum storage.",
                 notes="Setpoint for maximum reserve for storage as a percentage of the nominal maximum storage.")
            
   var SoCRsvMin: UShort? = null

   @SunSpecPoint(id="SoC", label="State of Charge", offset=9, len=1, type="uint16",
                 description="State of charge, expressed as a percentage.",
                 notes="State of charge, expressed as a percentage.")
            
   var SoC: UShort? = null

   @SunSpecPoint(id="DoD", label="Depth of Discharge", offset=10, len=1, type="uint16",
                 description="Depth of discharge, expressed as a percentage.",
                 notes="Depth of discharge, expressed as a percentage.")
            
   var DoD: UShort? = null

   @SunSpecPoint(id="SoH", label="State of Health", offset=11, len=1, type="uint16",
                 description="Percentage of battery life remaining.",
                 notes="Percentage of battery life remaining.")
            
   var SoH: UShort? = null

   @SunSpecPoint(id="NCyc", label="Cycle Count", offset=12, len=2, type="uint32",
                 description="Number of cycles executed in the battery.",
                 notes="Number of cycles executed in the battery.")
            
   var NCyc: UInt? = null

   @SunSpecPoint(id="ChaSt", label="Charge Status", offset=14, len=0, type="enum16",
                 description="Charge status of storage device. Enumeration.",
                 notes="Charge status of storage device. Enumeration.")
            
   var ChaSt: Any? = null

   @SunSpecPoint(id="LocRemCtl", label="Control Mode", offset=15, len=0, type="enum16",
                 description="Battery control mode. Enumeration.",
                 notes="Battery control mode. Enumeration.")
            
   var LocRemCtl: Any? = null

   @SunSpecPoint(id="Hb", label="Battery Heartbeat", offset=16, len=1, type="uint16",
                 description="Value is incremented every second with periodic resets to zero.",
                 notes="Value is incremented every second with periodic resets to zero.")
            
   var Hb: UShort? = null

   @SunSpecPoint(id="CtrlHb", label="Controller Heartbeat", offset=17, len=1, type="uint16",
                 description="Value is incremented every second with periodic resets to zero.",
                 notes="Value is incremented every second with periodic resets to zero.")
            
   var CtrlHb: UShort? = null

   @SunSpecPoint(id="AlmRst", label="Alarm Reset", offset=18, len=1, type="uint16",
                 description="Used to reset any latched alarms.  1 = Reset.",
                 notes="Used to reset any latched alarms.  1 = Reset.")
            
   var AlmRst: UShort? = null

   @SunSpecPoint(id="Typ", label="Battery Type", offset=19, len=0, type="enum16",
                 description="Type of battery. Enumeration.",
                 notes="Type of battery. Enumeration.")
            
   var Typ: Any? = null

   @SunSpecPoint(id="State", label="State of the Battery Bank", offset=20, len=0, type="enum16",
                 description="State of the battery bank.  Enumeration.",
                 notes="State of the battery bank.  Enumeration.")
            
   var State: Any? = null

   @SunSpecPoint(id="StateVnd", label="Vendor Battery Bank State", offset=21, len=0, type="enum16",
                 description="Vendor specific battery bank state.  Enumeration.",
                 notes="Vendor specific battery bank state.  Enumeration.")
            
   var StateVnd: Any? = null

   @SunSpecPoint(id="WarrDt", label="Warranty Date", offset=22, len=2, type="uint32",
                 description="Date the device warranty expires.",
                 notes="Date the device warranty expires.")
            
   var WarrDt: UInt? = null

   @SunSpecPoint(id="Evt1", label="Battery Event 1 Bitfield", offset=24, len=2, type="bitfield32",
                 description="Alarms and warnings.  Bit flags.",
                 notes="Alarms and warnings.  Bit flags.")
            
   var Evt1: UInt? = null

   @SunSpecPoint(id="Evt2", label="Battery Event 2 Bitfield", offset=26, len=2, type="bitfield32",
                 description="Alarms and warnings.  Bit flags.",
                 notes="Alarms and warnings.  Bit flags.")
            
   var Evt2: UInt? = null

   @SunSpecPoint(id="EvtVnd1", label="Vendor Event Bitfield 1", offset=28, len=2, type="bitfield32",
                 description="Vendor defined events.",
                 notes="Vendor defined events.")
            
   var EvtVnd1: UInt? = null

   @SunSpecPoint(id="EvtVnd2", label="Vendor Event Bitfield 2", offset=30, len=2, type="bitfield32",
                 description="Vendor defined events.",
                 notes="Vendor defined events.")
            
   var EvtVnd2: UInt? = null

   @SunSpecPoint(id="V", label="External Battery Voltage", offset=32, len=1, type="uint16",
                 description="DC Bus Voltage.",
                 notes="DC Bus Voltage.")
            
   var V: UShort? = null

   @SunSpecPoint(id="VMax", label="Max Battery Voltage", offset=33, len=1, type="uint16",
                 description="Instantaneous maximum battery voltage.",
                 notes="Instantaneous maximum battery voltage.")
            
   var VMax: UShort? = null

   @SunSpecPoint(id="VMin", label="Min Battery Voltage", offset=34, len=1, type="uint16",
                 description="Instantaneous minimum battery voltage.",
                 notes="Instantaneous minimum battery voltage.")
            
   var VMin: UShort? = null

   @SunSpecPoint(id="CellVMax", label="Max Cell Voltage", offset=35, len=1, type="uint16",
                 description="Maximum voltage for all cells in the bank.",
                 notes="Maximum voltage for all cells in the bank.")
            
   var CellVMax: UShort? = null

   @SunSpecPoint(id="CellVMaxStr", label="Max Cell Voltage String", offset=36, len=1, type="uint16",
                 description="String containing the cell with maximum voltage.",
                 notes="String containing the cell with maximum voltage.")
            
   var CellVMaxStr: UShort? = null

   @SunSpecPoint(id="CellVMaxMod", label="Max Cell Voltage Module", offset=37, len=1, type="uint16",
                 description="Module containing the cell with maximum voltage.",
                 notes="Module containing the cell with maximum voltage.")
            
   var CellVMaxMod: UShort? = null

   @SunSpecPoint(id="CellVMin", label="Min Cell Voltage", offset=38, len=1, type="uint16",
                 description="Minimum voltage for all cells in the bank.",
                 notes="Minimum voltage for all cells in the bank.")
            
   var CellVMin: UShort? = null

   @SunSpecPoint(id="CellVMinStr", label="Min Cell Voltage String", offset=39, len=1, type="uint16",
                 description="String containing the cell with minimum voltage.",
                 notes="String containing the cell with minimum voltage.")
            
   var CellVMinStr: UShort? = null

   @SunSpecPoint(id="CellVMinMod", label="Min Cell Voltage Module", offset=40, len=1, type="uint16",
                 description="Module containing the cell with minimum voltage.",
                 notes="Module containing the cell with minimum voltage.")
            
   var CellVMinMod: UShort? = null

   @SunSpecPoint(id="CellVAvg", label="Average Cell Voltage", offset=41, len=1, type="uint16",
                 description="Average cell voltage for all cells in the bank.",
                 notes="Average cell voltage for all cells in the bank.")
            
   var CellVAvg: UShort? = null

   @SunSpecPoint(id="A", label="Total DC Current", offset=42, len=1, type="int16",
                 description="Total DC current flowing to/from the battery bank.",
                 notes="Total DC current flowing to/from the battery bank.")
            
   var A: Short? = null

   @SunSpecPoint(id="AChaMax", label="Max Charge Current", offset=43, len=1, type="uint16",
                 description="Instantaneous maximum DC charge current.",
                 notes="Instantaneous maximum DC charge current.")
            
   var AChaMax: UShort? = null

   @SunSpecPoint(id="ADisChaMax", label="Max Discharge Current", offset=44, len=1, type="uint16",
                 description="Instantaneous maximum DC discharge current.",
                 notes="Instantaneous maximum DC discharge current.")
            
   var ADisChaMax: UShort? = null

   @SunSpecPoint(id="W", label="Total Power", offset=45, len=1, type="int16",
                 description="Total power flowing to/from the battery bank.",
                 notes="Total power flowing to/from the battery bank.")
            
   var W: Short? = null

   @SunSpecPoint(id="ReqInvState", label="Inverter State Request", offset=46, len=0, type="enum16",
                 description="Request from battery to start or stop the inverter.  Enumeration.",
                 notes="Request from battery to start or stop the inverter.  Enumeration.")
            
   var ReqInvState: Any? = null

   @SunSpecPoint(id="ReqW", label="Battery Power Request", offset=47, len=1, type="int16",
                 description="AC Power requested by battery.",
                 notes="AC Power requested by battery.")
            
   var ReqW: Short? = null

   @SunSpecPoint(id="SetOp", label="Set Operation", offset=48, len=0, type="enum16",
                 description="Instruct the battery bank to perform an operation such as connecting.  Enumeration.",
                 notes="Instruct the battery bank to perform an operation such as connecting.  Enumeration.")
            
   var SetOp: Any? = null

   @SunSpecPoint(id="SetInvState", label="Set Inverter State", offset=49, len=0, type="enum16",
                 description="Set the current state of the inverter.",
                 notes="Set the current state of the inverter.")
            
   var SetInvState: Any? = null

   @SunSpecPoint(id="AHRtg_SF", label="", offset=50, len=1, type="sunssf",
                 description="Scale factor for charge capacity.",
                 notes="Scale factor for charge capacity.")
            
   var AHRtg_SF: Any? = null

   @SunSpecPoint(id="WHRtg_SF", label="", offset=51, len=1, type="sunssf",
                 description="Scale factor for energy capacity.",
                 notes="Scale factor for energy capacity.")
            
   var WHRtg_SF: Any? = null

   @SunSpecPoint(id="WChaDisChaMax_SF", label="", offset=52, len=1, type="sunssf",
                 description="Scale factor for maximum charge and discharge rate.",
                 notes="Scale factor for maximum charge and discharge rate.")
            
   var WChaDisChaMax_SF: Any? = null

   @SunSpecPoint(id="DisChaRte_SF", label="", offset=53, len=1, type="sunssf",
                 description="Scale factor for self discharge rate.",
                 notes="Scale factor for self discharge rate.")
            
   var DisChaRte_SF: Any? = null

   @SunSpecPoint(id="SoC_SF", label="", offset=54, len=1, type="sunssf",
                 description="Scale factor for state of charge values.",
                 notes="Scale factor for state of charge values.")
            
   var SoC_SF: Any? = null

   @SunSpecPoint(id="DoD_SF", label="", offset=55, len=1, type="sunssf",
                 description="Scale factor for depth of discharge.",
                 notes="Scale factor for depth of discharge.")
            
   var DoD_SF: Any? = null

   @SunSpecPoint(id="SoH_SF", label="", offset=56, len=1, type="sunssf",
                 description="Scale factor for state of health.",
                 notes="Scale factor for state of health.")
            
   var SoH_SF: Any? = null

   @SunSpecPoint(id="V_SF", label="", offset=57, len=1, type="sunssf",
                 description="Scale factor for DC bus voltage.",
                 notes="Scale factor for DC bus voltage.")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="CellV_SF", label="", offset=58, len=1, type="sunssf",
                 description="Scale factor for cell voltage.",
                 notes="Scale factor for cell voltage.")
            
   var CellV_SF: Any? = null

   @SunSpecPoint(id="A_SF", label="", offset=59, len=1, type="sunssf",
                 description="Scale factor for DC current.",
                 notes="Scale factor for DC current.")
            
   var A_SF: Any? = null

   @SunSpecPoint(id="AMax_SF", label="", offset=60, len=1, type="sunssf",
                 description="Scale factor for instantaneous DC charge/discharge current.",
                 notes="Scale factor for instantaneous DC charge/discharge current.")
            
   var AMax_SF: Any? = null

   @SunSpecPoint(id="W_SF", label="", offset=61, len=1, type="sunssf",
                 description="Scale factor for AC power request.",
                 notes="Scale factor for AC power request.")
            
   var W_SF: Any? = null

}

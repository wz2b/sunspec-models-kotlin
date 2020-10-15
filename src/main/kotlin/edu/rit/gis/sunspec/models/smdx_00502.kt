/*
 * Solar Module
 *
 * A solar module model supporting DC-DC converter
 *
 * Integer
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=502, len=28, name="solar_module")
class Model_502 {
   @SunSpecPoint(id="A_SF", label="", offset=0, len=1, type="sunssf",
                 description="Current scale factor",
                 notes="Current scale factor")
            
   var A_SF: Any? = null

   @SunSpecPoint(id="V_SF", label="", offset=1, len=1, type="sunssf",
                 description="Voltage scale factor",
                 notes="Voltage scale factor")
            
   var V_SF: Any? = null

   @SunSpecPoint(id="W_SF", label="", offset=2, len=1, type="sunssf",
                 description="Power scale factor",
                 notes="Power scale factor")
            
   var W_SF: Any? = null

   @SunSpecPoint(id="Wh_SF", label="", offset=3, len=1, type="sunssf",
                 description="Energy scale factor",
                 notes="Energy scale factor")
            
   var Wh_SF: Any? = null

   @SunSpecPoint(id="Stat", label="Status", offset=4, len=0, type="enum16",
                 description="Enumerated value.  Module Status Code",
                 notes="Enumerated value.  Module Status Code")
            
   var Stat: Any? = null

   @SunSpecPoint(id="StatVend", label="Vendor Status", offset=5, len=0, type="enum16",
                 description="Module Vendor Status Code",
                 notes="Module Vendor Status Code")
            
   var StatVend: Any? = null

   @SunSpecPoint(id="Evt", label="Events", offset=6, len=2, type="bitfield32",
                 description="Bitmask value.  Module Event Flags",
                 notes="Bitmask value.  Module Event Flags")
            
   var Evt: UInt? = null

   @SunSpecPoint(id="EvtVend", label="Vendor Module Event Flags", offset=8, len=2, type="bitfield32",
                 description="Vendor specific flags",
                 notes="Vendor specific flags")
            
   var EvtVend: UInt? = null

   @SunSpecPoint(id="Ctl", label="Control", offset=10, len=0, type="enum16",
                 description="Module Control",
                 notes="Module Control")
            
   var Ctl: Any? = null

   @SunSpecPoint(id="CtlVend", label="Vendor Control", offset=11, len=0, type="enum32",
                 description="Vendor Module Control",
                 notes="Vendor Module Control")
            
   var CtlVend: Any? = null

   @SunSpecPoint(id="CtlVal", label="Control Value", offset=13, len=2, type="int32",
                 description="Module Control Value",
                 notes="Module Control Value")
            
   var CtlVal: Int? = null

   @SunSpecPoint(id="Tms", label="Timestamp", offset=15, len=2, type="uint32",
                 description="Time in seconds since 2000 epoch",
                 notes="Time in seconds since 2000 epoch")
            
   var Tms: UInt? = null

   @SunSpecPoint(id="OutA", label="Output Current", offset=17, len=1, type="int16",
                 description="Output Current",
                 notes="Output Current")
            
   var OutA: Short? = null

   @SunSpecPoint(id="OutV", label="Output Voltage", offset=18, len=1, type="int16",
                 description="Output Voltage",
                 notes="Output Voltage")
            
   var OutV: Short? = null

   @SunSpecPoint(id="OutWh", label="Output Energy", offset=19, len=2, type="acc32",
                 description="Output Energy",
                 notes="Output Energy")
            
   var OutWh: UInt? = null

   @SunSpecPoint(id="OutPw", label="Output Power", offset=21, len=1, type="int16",
                 description="Output Power",
                 notes="Output Power")
            
   var OutPw: Short? = null

   @SunSpecPoint(id="Tmp", label="Temp", offset=22, len=1, type="int16",
                 description="Module Temperature",
                 notes="Module Temperature")
            
   var Tmp: Short? = null

   @SunSpecPoint(id="InA", label="Input Current", offset=23, len=1, type="int16",
                 description="Input Current",
                 notes="Input Current")
            
   var InA: Short? = null

   @SunSpecPoint(id="InV", label="Input Voltage", offset=24, len=1, type="int16",
                 description="Input Voltage",
                 notes="Input Voltage")
            
   var InV: Short? = null

   @SunSpecPoint(id="InWh", label="Input Energy", offset=25, len=2, type="acc32",
                 description="Input Energy",
                 notes="Input Energy")
            
   var InWh: UInt? = null

   @SunSpecPoint(id="InW", label="Input Power", offset=27, len=1, type="int16",
                 description="Input Power",
                 notes="Input Power")
            
   var InW: Short? = null

}

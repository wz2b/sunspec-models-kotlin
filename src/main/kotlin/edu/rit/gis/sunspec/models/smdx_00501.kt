/*
 * Solar Module
 *
 * A solar module model supporting DC-DC converter
 *
 * Float
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=501, len=31, name="solar_module")
class Model_501 {
   @SunSpecPoint(id="Stat", label="Status", offset=0, len=0, type="enum16",
                 description="Enumerated value.  Module Status Code",
                 notes="Enumerated value.  Module Status Code")
            
   var Stat: Any? = null

   @SunSpecPoint(id="StatVend", label="Vendor Status", offset=1, len=0, type="enum16",
                 description="Module Vendor Status Code",
                 notes="Module Vendor Status Code")
            
   var StatVend: Any? = null

   @SunSpecPoint(id="Evt", label="Events", offset=2, len=2, type="bitfield32",
                 description="Bitmask value.  Module Event Flags",
                 notes="Bitmask value.  Module Event Flags")
            
   var Evt: UInt? = null

   @SunSpecPoint(id="EvtVend", label="Vendor Module Event Flags", offset=4, len=2, type="bitfield32",
                 description="Vendor specific flags",
                 notes="Vendor specific flags")
            
   var EvtVend: UInt? = null

   @SunSpecPoint(id="Ctl", label="Control", offset=6, len=0, type="enum16",
                 description="Module Control",
                 notes="Module Control")
            
   var Ctl: Any? = null

   @SunSpecPoint(id="CtlVend", label="Vendor Control", offset=7, len=0, type="enum32",
                 description="Vendor Module Control",
                 notes="Vendor Module Control")
            
   var CtlVend: Any? = null

   @SunSpecPoint(id="CtlVal", label="Control Value", offset=9, len=2, type="int32",
                 description="Module Control Value",
                 notes="Module Control Value")
            
   var CtlVal: Int? = null

   @SunSpecPoint(id="Tms", label="Timestamp", offset=11, len=2, type="uint32",
                 description="Time in seconds since 2000 epoch",
                 notes="Time in seconds since 2000 epoch")
            
   var Tms: UInt? = null

   @SunSpecPoint(id="OutA", label="Output Current", offset=13, len=2, type="float32",
                 description="Output Current",
                 notes="Output Current")
            
   var OutA: Float? = null

   @SunSpecPoint(id="OutV", label="Output Voltage", offset=15, len=2, type="float32",
                 description="Output Voltage",
                 notes="Output Voltage")
            
   var OutV: Float? = null

   @SunSpecPoint(id="OutWh", label="Output Energy", offset=17, len=2, type="float32",
                 description="Output Energy",
                 notes="Output Energy")
            
   var OutWh: Float? = null

   @SunSpecPoint(id="OutW", label="Output Power", offset=19, len=2, type="float32",
                 description="Output Power",
                 notes="Output Power")
            
   var OutW: Float? = null

   @SunSpecPoint(id="Tmp", label="Temp", offset=21, len=2, type="float32",
                 description="Module Temperature",
                 notes="Module Temperature")
            
   var Tmp: Float? = null

   @SunSpecPoint(id="InA", label="Input Current", offset=23, len=2, type="float32",
                 description="Input Current",
                 notes="Input Current")
            
   var InA: Float? = null

   @SunSpecPoint(id="InV", label="Input Voltage", offset=25, len=2, type="float32",
                 description="Input Voltage",
                 notes="Input Voltage")
            
   var InV: Float? = null

   @SunSpecPoint(id="InWh", label="Input Energy", offset=27, len=2, type="float32",
                 description="Input Energy",
                 notes="Input Energy")
            
   var InWh: Float? = null

   @SunSpecPoint(id="InW", label="Input Power", offset=29, len=2, type="float32",
                 description="Input Power",
                 notes="Input Power")
            
   var InW: Float? = null

}

/*
 * Interface Counters Model
 *
 * Interface counters
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=15, len=24, name="model_15")
class Model_15 {
   @SunSpecPoint(id="Clr", label="Clear", offset=0, len=1, type="uint16",
                 description="Write a \"1\" to clear all counters",
                 notes="Write a \"1\" to clear all counters")
            
   var Clr: UShort? = null

   @SunSpecPoint(id="InCnt", label="Input Count", offset=1, len=2, type="acc32",
                 description="Number of bytes received",
                 notes="Number of bytes received")
            
   var InCnt: UInt? = null

   @SunSpecPoint(id="InUcCnt", label="Input Unicast Count", offset=3, len=2, type="acc32",
                 description="Number of Unicast packets received",
                 notes="Number of Unicast packets received")
            
   var InUcCnt: UInt? = null

   @SunSpecPoint(id="InNUcCnt", label="Input Non-Unicast Count", offset=5, len=2, type="acc32",
                 description="Number of non-Unicast packets received",
                 notes="Number of non-Unicast packets received")
            
   var InNUcCnt: UInt? = null

   @SunSpecPoint(id="InDscCnt", label="Input Discarded Count", offset=7, len=2, type="acc32",
                 description="Number of inbound packets received on the interface but discarded",
                 notes="Number of inbound packets received on the interface but discarded")
            
   var InDscCnt: UInt? = null

   @SunSpecPoint(id="InErrCnt", label="Input Error Count", offset=9, len=2, type="acc32",
                 description="Number of inbound packets that contain errors (excluding discards)",
                 notes="Number of inbound packets that contain errors (excluding discards)")
            
   var InErrCnt: UInt? = null

   @SunSpecPoint(id="InUnkCnt", label="Input Unknown Count", offset=11, len=2, type="acc32",
                 description="Number of inbound packets with unknown protocol",
                 notes="Number of inbound packets with unknown protocol")
            
   var InUnkCnt: UInt? = null

   @SunSpecPoint(id="OutCnt", label="Output Count", offset=13, len=2, type="acc32",
                 description="Total number of bytes transmitted on this interface",
                 notes="Total number of bytes transmitted on this interface")
            
   var OutCnt: UInt? = null

   @SunSpecPoint(id="OutUcCnt", label="Output Unicast Count", offset=15, len=2, type="acc32",
                 description="Number of Unicast packets transmitted",
                 notes="Number of Unicast packets transmitted")
            
   var OutUcCnt: UInt? = null

   @SunSpecPoint(id="OutNUcCnt", label="Output Non-Unicast Count", offset=17, len=2, type="acc32",
                 description="Number of Non-Unicast packets transmitted",
                 notes="Number of Non-Unicast packets transmitted")
            
   var OutNUcCnt: UInt? = null

   @SunSpecPoint(id="OutDscCnt", label="Output Discarded Count", offset=19, len=2, type="acc32",
                 description="Number of Discarded output packets",
                 notes="Number of Discarded output packets")
            
   var OutDscCnt: UInt? = null

   @SunSpecPoint(id="OutErrCnt", label="Output Error Count", offset=21, len=2, type="acc32",
                 description="Number of outbound error packets",
                 notes="Number of outbound error packets")
            
   var OutErrCnt: UInt? = null

   @SunSpecPoint(id="Pad", label="", offset=23, len=1, type="pad",
                 description="",
                 notes="")
            
   var Pad: Any? = null

}

/*
 * Secure Dataset Read Request
 *
 * Request a digital signature over a specified set of data registers
 *
 * Used in conjunction with Secure Dataset Read Response Model
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=3, len=59, name="model_3")
class Model_3 {
   @SunSpecPoint(id="X", label="X", offset=0, len=1, type="uint16",
                 description="Number of registers being requested",
                 notes="Number of registers being requested")
            
   var X: UShort? = null

   @SunSpecPoint(id="Off1", label="Offset1", offset=1, len=1, type="uint16",
                 description="Offset of value to read",
                 notes="Offset of value to read")
            
   var Off1: UShort? = null

   @SunSpecPoint(id="Off2", label="", offset=2, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off2: UShort? = null

   @SunSpecPoint(id="Off3", label="", offset=3, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off3: UShort? = null

   @SunSpecPoint(id="Off4", label="", offset=4, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off4: UShort? = null

   @SunSpecPoint(id="Off5", label="", offset=5, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off5: UShort? = null

   @SunSpecPoint(id="Off6", label="", offset=6, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off6: UShort? = null

   @SunSpecPoint(id="Off7", label="", offset=7, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off7: UShort? = null

   @SunSpecPoint(id="Off8", label="", offset=8, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off8: UShort? = null

   @SunSpecPoint(id="Off9", label="", offset=9, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off9: UShort? = null

   @SunSpecPoint(id="Off10", label="", offset=10, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off10: UShort? = null

   @SunSpecPoint(id="Off11", label="", offset=11, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off11: UShort? = null

   @SunSpecPoint(id="Off12", label="", offset=12, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off12: UShort? = null

   @SunSpecPoint(id="Off13", label="", offset=13, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off13: UShort? = null

   @SunSpecPoint(id="Off14", label="", offset=14, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off14: UShort? = null

   @SunSpecPoint(id="Off15", label="", offset=15, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off15: UShort? = null

   @SunSpecPoint(id="Off16", label="", offset=16, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off16: UShort? = null

   @SunSpecPoint(id="Off17", label="", offset=17, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off17: UShort? = null

   @SunSpecPoint(id="Off18", label="", offset=18, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off18: UShort? = null

   @SunSpecPoint(id="Off19", label="", offset=19, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off19: UShort? = null

   @SunSpecPoint(id="Off20", label="", offset=20, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off20: UShort? = null

   @SunSpecPoint(id="Off21", label="", offset=21, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off21: UShort? = null

   @SunSpecPoint(id="Off22", label="", offset=22, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off22: UShort? = null

   @SunSpecPoint(id="Off23", label="", offset=23, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off23: UShort? = null

   @SunSpecPoint(id="Off24", label="", offset=24, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off24: UShort? = null

   @SunSpecPoint(id="Off25", label="", offset=25, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off25: UShort? = null

   @SunSpecPoint(id="Off26", label="", offset=26, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off26: UShort? = null

   @SunSpecPoint(id="Off27", label="", offset=27, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off27: UShort? = null

   @SunSpecPoint(id="Off28", label="", offset=28, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off28: UShort? = null

   @SunSpecPoint(id="Off29", label="", offset=29, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off29: UShort? = null

   @SunSpecPoint(id="Off30", label="", offset=30, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off30: UShort? = null

   @SunSpecPoint(id="Off31", label="", offset=31, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off31: UShort? = null

   @SunSpecPoint(id="Off32", label="", offset=32, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off32: UShort? = null

   @SunSpecPoint(id="Off33", label="", offset=33, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off33: UShort? = null

   @SunSpecPoint(id="Off34", label="", offset=34, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off34: UShort? = null

   @SunSpecPoint(id="Off35", label="", offset=35, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off35: UShort? = null

   @SunSpecPoint(id="Off36", label="", offset=36, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off36: UShort? = null

   @SunSpecPoint(id="Off37", label="", offset=37, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off37: UShort? = null

   @SunSpecPoint(id="Off38", label="", offset=38, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off38: UShort? = null

   @SunSpecPoint(id="Off39", label="", offset=39, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off39: UShort? = null

   @SunSpecPoint(id="Off40", label="", offset=40, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off40: UShort? = null

   @SunSpecPoint(id="Off41", label="", offset=41, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off41: UShort? = null

   @SunSpecPoint(id="Off42", label="", offset=42, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off42: UShort? = null

   @SunSpecPoint(id="Off43", label="", offset=43, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off43: UShort? = null

   @SunSpecPoint(id="Off44", label="", offset=44, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off44: UShort? = null

   @SunSpecPoint(id="Off45", label="", offset=45, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off45: UShort? = null

   @SunSpecPoint(id="Off46", label="", offset=46, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off46: UShort? = null

   @SunSpecPoint(id="Off47", label="", offset=47, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off47: UShort? = null

   @SunSpecPoint(id="Off48", label="", offset=48, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off48: UShort? = null

   @SunSpecPoint(id="Off49", label="", offset=49, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off49: UShort? = null

   @SunSpecPoint(id="Off50", label="", offset=50, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off50: UShort? = null

   @SunSpecPoint(id="Ts", label="Timestamp", offset=51, len=2, type="uint32",
                 description="Timestamp value is the number of seconds since January 1, 2000",
                 notes="Timestamp value is the number of seconds since January 1, 2000")
            
   var Ts: UInt? = null

   @SunSpecPoint(id="Ms", label="Milliseconds", offset=53, len=1, type="uint16",
                 description="Millisecond counter 0-999",
                 notes="Millisecond counter 0-999")
            
   var Ms: UShort? = null

   @SunSpecPoint(id="Seq", label="Sequence", offset=54, len=1, type="uint16",
                 description="Sequence number of request",
                 notes="Sequence number of request")
            
   var Seq: UShort? = null

   @SunSpecPoint(id="Role", label="Role", offset=55, len=1, type="uint16",
                 description="Digital Signature ID",
                 notes="Digital Signature ID")
            
   var Role: UShort? = null

   @SunSpecPoint(id="Alg", label="Algorithm", offset=56, len=0, type="enum16",
                 description="Algorithm used to compute the digital signature",
                 notes="Algorithm used to compute the digital signature")
            
   var Alg: Any? = null

   @SunSpecPoint(id="N", label="N", offset=57, len=1, type="uint16",
                 description="Number of registers comprising the digital signature.",
                 notes="Number of registers comprising the digital signature.")
            
   var N: UShort? = null

}

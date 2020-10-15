/*
 * Secure Write Request
 *
 * Include a digital signature along with the control data
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=5, len=89, name="model_5")
class Model_5 {
   @SunSpecPoint(id="X", label="X", offset=0, len=1, type="uint16",
                 description="Number of (offset, value) pairs being written",
                 notes="Number of (offset, value) pairs being written")
            
   var X: UShort? = null

   @SunSpecPoint(id="Off1", label="Offset1", offset=1, len=1, type="uint16",
                 description="Offset of control register to write value to",
                 notes="Offset of control register to write value to")
            
   var Off1: UShort? = null

   @SunSpecPoint(id="Val1", label="Value1", offset=2, len=1, type="uint16",
                 description="Value to write to control register at offset",
                 notes="Value to write to control register at offset")
            
   var Val1: UShort? = null

   @SunSpecPoint(id="Off2", label="", offset=3, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off2: UShort? = null

   @SunSpecPoint(id="Val2", label="", offset=4, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val2: UShort? = null

   @SunSpecPoint(id="Off3", label="", offset=5, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off3: UShort? = null

   @SunSpecPoint(id="Val3", label="", offset=6, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val3: UShort? = null

   @SunSpecPoint(id="Off4", label="", offset=7, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off4: UShort? = null

   @SunSpecPoint(id="Val4", label="", offset=8, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val4: UShort? = null

   @SunSpecPoint(id="Off5", label="", offset=9, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off5: UShort? = null

   @SunSpecPoint(id="Val5", label="", offset=10, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val5: UShort? = null

   @SunSpecPoint(id="Off6", label="", offset=11, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off6: UShort? = null

   @SunSpecPoint(id="Val6", label="", offset=12, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val6: UShort? = null

   @SunSpecPoint(id="Off7", label="", offset=13, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off7: UShort? = null

   @SunSpecPoint(id="Val7", label="", offset=14, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val7: UShort? = null

   @SunSpecPoint(id="Off8", label="", offset=15, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off8: UShort? = null

   @SunSpecPoint(id="Val8", label="", offset=16, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val8: UShort? = null

   @SunSpecPoint(id="Off9", label="", offset=17, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off9: UShort? = null

   @SunSpecPoint(id="Val9", label="", offset=18, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val9: UShort? = null

   @SunSpecPoint(id="Off10", label="", offset=19, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off10: UShort? = null

   @SunSpecPoint(id="Val10", label="", offset=20, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val10: UShort? = null

   @SunSpecPoint(id="Off11", label="", offset=21, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off11: UShort? = null

   @SunSpecPoint(id="Val11", label="", offset=22, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val11: UShort? = null

   @SunSpecPoint(id="Off12", label="", offset=23, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off12: UShort? = null

   @SunSpecPoint(id="Val12", label="", offset=24, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val12: UShort? = null

   @SunSpecPoint(id="Off13", label="", offset=25, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off13: UShort? = null

   @SunSpecPoint(id="Val13", label="", offset=26, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val13: UShort? = null

   @SunSpecPoint(id="Off14", label="", offset=27, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off14: UShort? = null

   @SunSpecPoint(id="Val14", label="", offset=28, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val14: UShort? = null

   @SunSpecPoint(id="Off15", label="", offset=29, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off15: UShort? = null

   @SunSpecPoint(id="Val15", label="", offset=30, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val15: UShort? = null

   @SunSpecPoint(id="Off16", label="", offset=31, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off16: UShort? = null

   @SunSpecPoint(id="Val16", label="", offset=32, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val16: UShort? = null

   @SunSpecPoint(id="Off17", label="", offset=33, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off17: UShort? = null

   @SunSpecPoint(id="Val17", label="", offset=34, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val17: UShort? = null

   @SunSpecPoint(id="Off18", label="", offset=35, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off18: UShort? = null

   @SunSpecPoint(id="Val18", label="", offset=36, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val18: UShort? = null

   @SunSpecPoint(id="Off19", label="", offset=37, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off19: UShort? = null

   @SunSpecPoint(id="Val19", label="", offset=38, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val19: UShort? = null

   @SunSpecPoint(id="Off20", label="", offset=39, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off20: UShort? = null

   @SunSpecPoint(id="Val20", label="", offset=40, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val20: UShort? = null

   @SunSpecPoint(id="Off21", label="", offset=41, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off21: UShort? = null

   @SunSpecPoint(id="Val21", label="", offset=42, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val21: UShort? = null

   @SunSpecPoint(id="Off22", label="", offset=43, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off22: UShort? = null

   @SunSpecPoint(id="Val22", label="", offset=44, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val22: UShort? = null

   @SunSpecPoint(id="Off23", label="", offset=45, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off23: UShort? = null

   @SunSpecPoint(id="Val23", label="", offset=46, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val23: UShort? = null

   @SunSpecPoint(id="Off24", label="", offset=47, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off24: UShort? = null

   @SunSpecPoint(id="Val24", label="", offset=48, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val24: UShort? = null

   @SunSpecPoint(id="Off25", label="", offset=49, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off25: UShort? = null

   @SunSpecPoint(id="Val25", label="", offset=50, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val25: UShort? = null

   @SunSpecPoint(id="Off26", label="", offset=51, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off26: UShort? = null

   @SunSpecPoint(id="Val26", label="", offset=52, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val26: UShort? = null

   @SunSpecPoint(id="Off27", label="", offset=53, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off27: UShort? = null

   @SunSpecPoint(id="Val27", label="", offset=54, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val27: UShort? = null

   @SunSpecPoint(id="Off28", label="", offset=55, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off28: UShort? = null

   @SunSpecPoint(id="Val28", label="", offset=56, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val28: UShort? = null

   @SunSpecPoint(id="Off29", label="", offset=57, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off29: UShort? = null

   @SunSpecPoint(id="Val29", label="", offset=58, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val29: UShort? = null

   @SunSpecPoint(id="Off30", label="", offset=59, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off30: UShort? = null

   @SunSpecPoint(id="Val30", label="", offset=60, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val30: UShort? = null

   @SunSpecPoint(id="Off31", label="", offset=61, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off31: UShort? = null

   @SunSpecPoint(id="Val31", label="", offset=62, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val31: UShort? = null

   @SunSpecPoint(id="Off32", label="", offset=63, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off32: UShort? = null

   @SunSpecPoint(id="Val32", label="", offset=64, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val32: UShort? = null

   @SunSpecPoint(id="Off33", label="", offset=65, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off33: UShort? = null

   @SunSpecPoint(id="Val33", label="", offset=66, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val33: UShort? = null

   @SunSpecPoint(id="Off34", label="", offset=67, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off34: UShort? = null

   @SunSpecPoint(id="Val34", label="", offset=68, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val34: UShort? = null

   @SunSpecPoint(id="Off35", label="", offset=69, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off35: UShort? = null

   @SunSpecPoint(id="Val35", label="", offset=70, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val35: UShort? = null

   @SunSpecPoint(id="Off36", label="", offset=71, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off36: UShort? = null

   @SunSpecPoint(id="Val36", label="", offset=72, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val36: UShort? = null

   @SunSpecPoint(id="Off37", label="", offset=73, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off37: UShort? = null

   @SunSpecPoint(id="Val37", label="", offset=74, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val37: UShort? = null

   @SunSpecPoint(id="Off38", label="", offset=75, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off38: UShort? = null

   @SunSpecPoint(id="Val38", label="", offset=76, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val38: UShort? = null

   @SunSpecPoint(id="Off39", label="", offset=77, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off39: UShort? = null

   @SunSpecPoint(id="Val39", label="", offset=78, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val39: UShort? = null

   @SunSpecPoint(id="Off40", label="", offset=79, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Off40: UShort? = null

   @SunSpecPoint(id="Val40", label="", offset=80, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val40: UShort? = null

   @SunSpecPoint(id="Ts", label="Timestamp", offset=81, len=2, type="uint32",
                 description="Timestamp value is the number of seconds since January 1, 2000",
                 notes="Timestamp value is the number of seconds since January 1, 2000")
            
   var Ts: UInt? = null

   @SunSpecPoint(id="Ms", label="Milliseconds", offset=83, len=1, type="uint16",
                 description="Millisecond counter 0-999",
                 notes="Millisecond counter 0-999")
            
   var Ms: UShort? = null

   @SunSpecPoint(id="Seq", label="Sequence", offset=84, len=1, type="uint16",
                 description="Sequence number of request",
                 notes="Sequence number of request")
            
   var Seq: UShort? = null

   @SunSpecPoint(id="Role", label="Role", offset=85, len=1, type="uint16",
                 description="Signing key used 0-5",
                 notes="Signing key used 0-5")
            
   var Role: UShort? = null

   @SunSpecPoint(id="Alg", label="Algorithm", offset=86, len=0, type="enum16",
                 description="Algorithm used to compute the digital signature",
                 notes="Algorithm used to compute the digital signature")
            
   var Alg: Any? = null

   @SunSpecPoint(id="N", label="N", offset=87, len=1, type="uint16",
                 description="Number of registers comprising the digital signature.",
                 notes="Number of registers comprising the digital signature.")
            
   var N: UShort? = null

}

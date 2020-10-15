/*
 * Secure Dataset Read Response
 *
 * Compute a digital signature over a specified set of data registers
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=4, len=61, name="model_4")
class Model_4 {
   @SunSpecPoint(id="RqSeq", label="Request Sequence", offset=0, len=1, type="uint16",
                 description="Sequence number from the request",
                 notes="Sequence number from the request")
            
   var RqSeq: UShort? = null

   @SunSpecPoint(id="Sts", label="Status", offset=1, len=0, type="enum16",
                 description="Status of last read operation",
                 notes="Status of last read operation")
            
   var Sts: Any? = null

   @SunSpecPoint(id="X", label="X", offset=2, len=1, type="uint16",
                 description="Number of values from the request",
                 notes="Number of values from the request")
            
   var X: UShort? = null

   @SunSpecPoint(id="Val1", label="Value1", offset=3, len=1, type="uint16",
                 description="Copy of value from register Off1.",
                 notes="Copy of value from register Off1.")
            
   var Val1: UShort? = null

   @SunSpecPoint(id="Val2", label="", offset=4, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val2: UShort? = null

   @SunSpecPoint(id="Val3", label="", offset=5, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val3: UShort? = null

   @SunSpecPoint(id="Val4", label="", offset=6, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val4: UShort? = null

   @SunSpecPoint(id="Val5", label="", offset=7, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val5: UShort? = null

   @SunSpecPoint(id="Val6", label="", offset=8, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val6: UShort? = null

   @SunSpecPoint(id="Val7", label="", offset=9, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val7: UShort? = null

   @SunSpecPoint(id="Val8", label="", offset=10, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val8: UShort? = null

   @SunSpecPoint(id="Val9", label="", offset=11, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val9: UShort? = null

   @SunSpecPoint(id="Val10", label="", offset=12, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val10: UShort? = null

   @SunSpecPoint(id="Val11", label="", offset=13, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val11: UShort? = null

   @SunSpecPoint(id="Val12", label="", offset=14, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val12: UShort? = null

   @SunSpecPoint(id="Val13", label="", offset=15, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val13: UShort? = null

   @SunSpecPoint(id="Val14", label="", offset=16, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val14: UShort? = null

   @SunSpecPoint(id="Val15", label="", offset=17, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val15: UShort? = null

   @SunSpecPoint(id="Val16", label="", offset=18, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val16: UShort? = null

   @SunSpecPoint(id="Val17", label="", offset=19, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val17: UShort? = null

   @SunSpecPoint(id="Val18", label="", offset=20, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val18: UShort? = null

   @SunSpecPoint(id="Val19", label="", offset=21, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val19: UShort? = null

   @SunSpecPoint(id="Val20", label="", offset=22, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val20: UShort? = null

   @SunSpecPoint(id="Val21", label="", offset=23, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val21: UShort? = null

   @SunSpecPoint(id="Val22", label="", offset=24, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val22: UShort? = null

   @SunSpecPoint(id="Val23", label="", offset=25, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val23: UShort? = null

   @SunSpecPoint(id="Val24", label="", offset=26, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val24: UShort? = null

   @SunSpecPoint(id="Val25", label="", offset=27, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val25: UShort? = null

   @SunSpecPoint(id="Val26", label="", offset=28, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val26: UShort? = null

   @SunSpecPoint(id="Val27", label="", offset=29, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val27: UShort? = null

   @SunSpecPoint(id="Val28", label="", offset=30, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val28: UShort? = null

   @SunSpecPoint(id="Val29", label="", offset=31, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val29: UShort? = null

   @SunSpecPoint(id="Val30", label="", offset=32, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val30: UShort? = null

   @SunSpecPoint(id="Val31", label="", offset=33, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val31: UShort? = null

   @SunSpecPoint(id="Val32", label="", offset=34, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val32: UShort? = null

   @SunSpecPoint(id="Val33", label="", offset=35, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val33: UShort? = null

   @SunSpecPoint(id="Val34", label="", offset=36, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val34: UShort? = null

   @SunSpecPoint(id="Val35", label="", offset=37, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val35: UShort? = null

   @SunSpecPoint(id="Val36", label="", offset=38, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val36: UShort? = null

   @SunSpecPoint(id="Val37", label="", offset=39, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val37: UShort? = null

   @SunSpecPoint(id="Val38", label="", offset=40, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val38: UShort? = null

   @SunSpecPoint(id="Val39", label="", offset=41, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val39: UShort? = null

   @SunSpecPoint(id="Val40", label="", offset=42, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val40: UShort? = null

   @SunSpecPoint(id="Val41", label="", offset=43, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val41: UShort? = null

   @SunSpecPoint(id="Val42", label="", offset=44, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val42: UShort? = null

   @SunSpecPoint(id="Val43", label="", offset=45, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val43: UShort? = null

   @SunSpecPoint(id="Val44", label="", offset=46, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val44: UShort? = null

   @SunSpecPoint(id="Val45", label="", offset=47, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val45: UShort? = null

   @SunSpecPoint(id="Val46", label="", offset=48, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val46: UShort? = null

   @SunSpecPoint(id="Val47", label="", offset=49, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val47: UShort? = null

   @SunSpecPoint(id="Val48", label="", offset=50, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val48: UShort? = null

   @SunSpecPoint(id="Val49", label="", offset=51, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val49: UShort? = null

   @SunSpecPoint(id="Val50", label="", offset=52, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val50: UShort? = null

   @SunSpecPoint(id="Ts", label="Timestamp", offset=53, len=2, type="uint32",
                 description="Timestamp value is the number of seconds since January 1, 2000",
                 notes="Timestamp value is the number of seconds since January 1, 2000")
            
   var Ts: UInt? = null

   @SunSpecPoint(id="Ms", label="Milliseconds", offset=55, len=1, type="uint16",
                 description="Millisecond counter 0-999",
                 notes="Millisecond counter 0-999")
            
   var Ms: UShort? = null

   @SunSpecPoint(id="Seq", label="Sequence", offset=56, len=1, type="uint16",
                 description="Sequence number of response",
                 notes="Sequence number of response")
            
   var Seq: UShort? = null

   @SunSpecPoint(id="Alm", label="Alarm", offset=57, len=0, type="enum16",
                 description="Bitmask alarm code",
                 notes="Bitmask alarm code")
            
   var Alm: Any? = null

   @SunSpecPoint(id="Alg", label="Algorithm", offset=58, len=0, type="enum16",
                 description="Algorithm used to compute the digital signature",
                 notes="Algorithm used to compute the digital signature")
            
   var Alg: Any? = null

   @SunSpecPoint(id="N", label="N", offset=59, len=1, type="uint16",
                 description="Number of registers comprising the digital signature.",
                 notes="Number of registers comprising the digital signature.")
            
   var N: UShort? = null

}

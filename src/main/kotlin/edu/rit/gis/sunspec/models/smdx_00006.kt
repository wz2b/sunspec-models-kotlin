/*
 * Secure Write Sequential Request
 *
 * Include a digital signature along with the control data
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=6, len=91, name="model_6")
class Model_6 {
   @SunSpecPoint(id="X", label="X", offset=0, len=1, type="uint16",
                 description="Number of (offset, value) pairs being written",
                 notes="Number of (offset, value) pairs being written")
            
   var X: UShort? = null

   @SunSpecPoint(id="Off", label="Offset", offset=1, len=1, type="uint16",
                 description="Starting offset for write operation",
                 notes="Starting offset for write operation")
            
   var Off: UShort? = null

   @SunSpecPoint(id="Val1", label="Value1", offset=2, len=1, type="uint16",
                 description="Value to write to control register at offset",
                 notes="Value to write to control register at offset")
            
   var Val1: UShort? = null

   @SunSpecPoint(id="Val2", label="", offset=3, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val2: UShort? = null

   @SunSpecPoint(id="Val3", label="", offset=4, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val3: UShort? = null

   @SunSpecPoint(id="Val4", label="", offset=5, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val4: UShort? = null

   @SunSpecPoint(id="Val5", label="", offset=6, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val5: UShort? = null

   @SunSpecPoint(id="Val6", label="", offset=7, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val6: UShort? = null

   @SunSpecPoint(id="Val7", label="", offset=8, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val7: UShort? = null

   @SunSpecPoint(id="Val8", label="", offset=9, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val8: UShort? = null

   @SunSpecPoint(id="Val9", label="", offset=10, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val9: UShort? = null

   @SunSpecPoint(id="Val10", label="", offset=11, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val10: UShort? = null

   @SunSpecPoint(id="Val11", label="", offset=12, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val11: UShort? = null

   @SunSpecPoint(id="Val12", label="", offset=13, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val12: UShort? = null

   @SunSpecPoint(id="Val13", label="", offset=14, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val13: UShort? = null

   @SunSpecPoint(id="Val14", label="", offset=15, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val14: UShort? = null

   @SunSpecPoint(id="Val15", label="", offset=16, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val15: UShort? = null

   @SunSpecPoint(id="Val16", label="", offset=17, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val16: UShort? = null

   @SunSpecPoint(id="Val17", label="", offset=18, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val17: UShort? = null

   @SunSpecPoint(id="Val18", label="", offset=19, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val18: UShort? = null

   @SunSpecPoint(id="Val19", label="", offset=20, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val19: UShort? = null

   @SunSpecPoint(id="Val20", label="", offset=21, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val20: UShort? = null

   @SunSpecPoint(id="Val21", label="", offset=22, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val21: UShort? = null

   @SunSpecPoint(id="Val22", label="", offset=23, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val22: UShort? = null

   @SunSpecPoint(id="Val23", label="", offset=24, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val23: UShort? = null

   @SunSpecPoint(id="Val24", label="", offset=25, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val24: UShort? = null

   @SunSpecPoint(id="Val25", label="", offset=26, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val25: UShort? = null

   @SunSpecPoint(id="Val26", label="", offset=27, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val26: UShort? = null

   @SunSpecPoint(id="Val27", label="", offset=28, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val27: UShort? = null

   @SunSpecPoint(id="Val28", label="", offset=29, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val28: UShort? = null

   @SunSpecPoint(id="Val29", label="", offset=30, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val29: UShort? = null

   @SunSpecPoint(id="Val30", label="", offset=31, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val30: UShort? = null

   @SunSpecPoint(id="Val31", label="", offset=32, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val31: UShort? = null

   @SunSpecPoint(id="Val32", label="", offset=33, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val32: UShort? = null

   @SunSpecPoint(id="Val33", label="", offset=34, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val33: UShort? = null

   @SunSpecPoint(id="Val34", label="", offset=35, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val34: UShort? = null

   @SunSpecPoint(id="Val35", label="", offset=36, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val35: UShort? = null

   @SunSpecPoint(id="Val36", label="", offset=37, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val36: UShort? = null

   @SunSpecPoint(id="Val37", label="", offset=38, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val37: UShort? = null

   @SunSpecPoint(id="Val38", label="", offset=39, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val38: UShort? = null

   @SunSpecPoint(id="Val39", label="", offset=40, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val39: UShort? = null

   @SunSpecPoint(id="Val40", label="", offset=41, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val40: UShort? = null

   @SunSpecPoint(id="Val41", label="", offset=42, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val41: UShort? = null

   @SunSpecPoint(id="Val42", label="", offset=43, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val42: UShort? = null

   @SunSpecPoint(id="Val43", label="", offset=44, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val43: UShort? = null

   @SunSpecPoint(id="Val44", label="", offset=45, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val44: UShort? = null

   @SunSpecPoint(id="Val45", label="", offset=46, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val45: UShort? = null

   @SunSpecPoint(id="Val46", label="", offset=47, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val46: UShort? = null

   @SunSpecPoint(id="Val47", label="", offset=48, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val47: UShort? = null

   @SunSpecPoint(id="Val48", label="", offset=49, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val48: UShort? = null

   @SunSpecPoint(id="Val49", label="", offset=50, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val49: UShort? = null

   @SunSpecPoint(id="Val50", label="", offset=51, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val50: UShort? = null

   @SunSpecPoint(id="Val51", label="", offset=52, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val51: UShort? = null

   @SunSpecPoint(id="Val52", label="", offset=53, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val52: UShort? = null

   @SunSpecPoint(id="Val53", label="", offset=54, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val53: UShort? = null

   @SunSpecPoint(id="Val54", label="", offset=55, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val54: UShort? = null

   @SunSpecPoint(id="Val55", label="", offset=56, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val55: UShort? = null

   @SunSpecPoint(id="Val56", label="", offset=57, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val56: UShort? = null

   @SunSpecPoint(id="Val57", label="", offset=58, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val57: UShort? = null

   @SunSpecPoint(id="Val58", label="", offset=59, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val58: UShort? = null

   @SunSpecPoint(id="Val59", label="", offset=60, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val59: UShort? = null

   @SunSpecPoint(id="Val60", label="", offset=61, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val60: UShort? = null

   @SunSpecPoint(id="Val61", label="", offset=62, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val61: UShort? = null

   @SunSpecPoint(id="Val62", label="", offset=63, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val62: UShort? = null

   @SunSpecPoint(id="Val63", label="", offset=64, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val63: UShort? = null

   @SunSpecPoint(id="Val64", label="", offset=65, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val64: UShort? = null

   @SunSpecPoint(id="Val65", label="", offset=66, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val65: UShort? = null

   @SunSpecPoint(id="Val66", label="", offset=67, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val66: UShort? = null

   @SunSpecPoint(id="Val67", label="", offset=68, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val67: UShort? = null

   @SunSpecPoint(id="Val68", label="", offset=69, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val68: UShort? = null

   @SunSpecPoint(id="Val69", label="", offset=70, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val69: UShort? = null

   @SunSpecPoint(id="Val70", label="", offset=71, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val70: UShort? = null

   @SunSpecPoint(id="Val71", label="", offset=72, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val71: UShort? = null

   @SunSpecPoint(id="Val72", label="", offset=73, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val72: UShort? = null

   @SunSpecPoint(id="Val73", label="", offset=74, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val73: UShort? = null

   @SunSpecPoint(id="Val74", label="", offset=75, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val74: UShort? = null

   @SunSpecPoint(id="Val75", label="", offset=76, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val75: UShort? = null

   @SunSpecPoint(id="Val76", label="", offset=77, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val76: UShort? = null

   @SunSpecPoint(id="Val77", label="", offset=78, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val77: UShort? = null

   @SunSpecPoint(id="Val78", label="", offset=79, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val78: UShort? = null

   @SunSpecPoint(id="Val79", label="", offset=80, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val79: UShort? = null

   @SunSpecPoint(id="Val80", label="", offset=81, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Val80: UShort? = null

   @SunSpecPoint(id="Ts", label="Timestamp", offset=82, len=2, type="uint32",
                 description="Timestamp value is the number of seconds since January 1, 2000",
                 notes="Timestamp value is the number of seconds since January 1, 2000")
            
   var Ts: UInt? = null

   @SunSpecPoint(id="Ms", label="Milliseconds", offset=84, len=1, type="uint16",
                 description="Millisecond counter 0-999",
                 notes="Millisecond counter 0-999")
            
   var Ms: UShort? = null

   @SunSpecPoint(id="Seq", label="Sequence", offset=85, len=1, type="uint16",
                 description="Sequence number of request",
                 notes="Sequence number of request")
            
   var Seq: UShort? = null

   @SunSpecPoint(id="Role", label="Role", offset=86, len=1, type="uint16",
                 description="Signing key used 0-5",
                 notes="Signing key used 0-5")
            
   var Role: UShort? = null

   @SunSpecPoint(id="Rsrvd", label="", offset=87, len=1, type="pad",
                 description="",
                 notes="")
            
   var Rsrvd: Any? = null

   @SunSpecPoint(id="Alg", label="Algorithm", offset=88, len=0, type="enum16",
                 description="Algorithm used to compute the digital signature",
                 notes="Algorithm used to compute the digital signature")
            
   var Alg: Any? = null

   @SunSpecPoint(id="N", label="N", offset=89, len=1, type="uint16",
                 description="Number of registers comprising the digital signature.",
                 notes="Number of registers comprising the digital signature.")
            
   var N: UShort? = null

}

/*
 * Secure Write Response Model (DRAFT 1)
 *
 * Include a digital signature over the response
 *
 * Used in conjunction with a Secure Write Request
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=7, len=11, name="model_7")
class Model_7 {
   @SunSpecPoint(id="RqSeq", label="Request Sequence", offset=0, len=1, type="uint16",
                 description="Sequence number from the request",
                 notes="Sequence number from the request")
            
   var RqSeq: Int? = null

   @SunSpecPoint(id="Sts", label="Status", offset=1, len=0, type="enum16",
                 description="Status of last write operation",
                 notes="Status of last write operation")
            
   var Sts: Any? = null

   @SunSpecPoint(id="Ts", label="Timestamp", offset=2, len=2, type="uint32",
                 description="Timestamp value is the number of seconds since January 1, 2000",
                 notes="Timestamp value is the number of seconds since January 1, 2000")
            
   var Ts: Int? = null

   @SunSpecPoint(id="Ms", label="Milliseconds", offset=4, len=1, type="uint16",
                 description="Millisecond counter 0-999",
                 notes="Millisecond counter 0-999")
            
   var Ms: Int? = null

   @SunSpecPoint(id="Seq", label="Sequence", offset=5, len=1, type="uint16",
                 description="Sequence number of response",
                 notes="Sequence number of response")
            
   var Seq: Int? = null

   @SunSpecPoint(id="Alm", label="Alarm", offset=6, len=0, type="enum16",
                 description="Bitmask alarm code",
                 notes="Bitmask alarm code")
            
   var Alm: Any? = null

   @SunSpecPoint(id="Rsrvd", label="", offset=7, len=1, type="pad",
                 description="",
                 notes="")
            
   var Rsrvd: Any? = null

   @SunSpecPoint(id="Alg", label="Algorithm", offset=8, len=0, type="enum16",
                 description="Algorithm used to compute the digital signature",
                 notes="Algorithm used to compute the digital signature")
            
   var Alg: Any? = null

   @SunSpecPoint(id="N", label="N", offset=9, len=1, type="uint16",
                 description="Number of registers comprising the digital signature.",
                 notes="Number of registers comprising the digital signature.")
            
   var N: Int? = null

}

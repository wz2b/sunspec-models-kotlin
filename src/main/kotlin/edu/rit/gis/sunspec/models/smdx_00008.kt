/*
 * Get Device Security Certificate
 *
 * Security model for PKI
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=8, len=3, name="model_8")
class Model_8 {
   @SunSpecPoint(id="Fmt", label="Format", offset=0, len=0, type="enum16",
                 description="X.509 format of the certificate. DER or PEM.",
                 notes="X.509 format of the certificate. DER or PEM.")
            
   var Fmt: Any? = null

   @SunSpecPoint(id="N", label="N", offset=1, len=1, type="uint16",
                 description="Number of registers to follow for the certificate",
                 notes="Number of registers to follow for the certificate")
            
   var N: UShort? = null

}

/*
 * Set Operator Security Certificate
 *
 * Security model for PKI
 *
 * 
 */
package edu.rit.gis.sunspec.models

import edu.rit.gis.sunspec.annotations.*

@SunSpecModel(id=9, len=93, name="model_9")
class Model_9 {
   @SunSpecPoint(id="CertUID", label="Cert_UID", offset=0, len=1, type="uint16",
                 description="User ID for this certificate",
                 notes="User ID for this certificate")
            
   var CertUID: UShort? = null

   @SunSpecPoint(id="CertRole", label="Cert_Role", offset=1, len=1, type="uint16",
                 description="Role for this certificate",
                 notes="Role for this certificate")
            
   var CertRole: UShort? = null

   @SunSpecPoint(id="Fmt", label="Format", offset=2, len=0, type="enum16",
                 description="X.509 format of the certificate. DER or PEM.",
                 notes="X.509 format of the certificate. DER or PEM.")
            
   var Fmt: Any? = null

   @SunSpecPoint(id="Typ", label="Type", offset=3, len=0, type="enum16",
                 description="Type of this certificate",
                 notes="Type of this certificate")
            
   var Typ: Any? = null

   @SunSpecPoint(id="TotLn", label="Total Length", offset=4, len=1, type="uint16",
                 description="Total Length of the Certificate",
                 notes="Total Length of the Certificate")
            
   var TotLn: UShort? = null

   @SunSpecPoint(id="FrgLn", label="Fragment length", offset=5, len=1, type="uint16",
                 description="Length of this fragment",
                 notes="Length of this fragment")
            
   var FrgLn: UShort? = null

   @SunSpecPoint(id="Frg1", label="Frag1", offset=6, len=1, type="uint16",
                 description="First word of this fragment",
                 notes="First word of this fragment")
            
   var Frg1: UShort? = null

   @SunSpecPoint(id="Frg2", label="", offset=7, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg2: UShort? = null

   @SunSpecPoint(id="Frg3", label="", offset=8, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg3: UShort? = null

   @SunSpecPoint(id="Frg4", label="", offset=9, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg4: UShort? = null

   @SunSpecPoint(id="Frg5", label="", offset=10, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg5: UShort? = null

   @SunSpecPoint(id="Frg6", label="", offset=11, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg6: UShort? = null

   @SunSpecPoint(id="Frg7", label="", offset=12, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg7: UShort? = null

   @SunSpecPoint(id="Frg8", label="", offset=13, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg8: UShort? = null

   @SunSpecPoint(id="Frg9", label="", offset=14, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg9: UShort? = null

   @SunSpecPoint(id="Frg10", label="", offset=15, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg10: UShort? = null

   @SunSpecPoint(id="Frg11", label="", offset=16, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg11: UShort? = null

   @SunSpecPoint(id="Frg12", label="", offset=17, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg12: UShort? = null

   @SunSpecPoint(id="Frg13", label="", offset=18, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg13: UShort? = null

   @SunSpecPoint(id="Frg14", label="", offset=19, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg14: UShort? = null

   @SunSpecPoint(id="Frg15", label="", offset=20, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg15: UShort? = null

   @SunSpecPoint(id="Frg16", label="", offset=21, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg16: UShort? = null

   @SunSpecPoint(id="Frg17", label="", offset=22, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg17: UShort? = null

   @SunSpecPoint(id="Frg18", label="", offset=23, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg18: UShort? = null

   @SunSpecPoint(id="Frg19", label="", offset=24, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg19: UShort? = null

   @SunSpecPoint(id="Frg20", label="", offset=25, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg20: UShort? = null

   @SunSpecPoint(id="Frg21", label="", offset=26, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg21: UShort? = null

   @SunSpecPoint(id="Frg22", label="", offset=27, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg22: UShort? = null

   @SunSpecPoint(id="Frg23", label="", offset=28, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg23: UShort? = null

   @SunSpecPoint(id="Frg24", label="", offset=29, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg24: UShort? = null

   @SunSpecPoint(id="Frg25", label="", offset=30, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg25: UShort? = null

   @SunSpecPoint(id="Frg26", label="", offset=31, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg26: UShort? = null

   @SunSpecPoint(id="Frg27", label="", offset=32, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg27: UShort? = null

   @SunSpecPoint(id="Frg28", label="", offset=33, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg28: UShort? = null

   @SunSpecPoint(id="Frg29", label="", offset=34, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg29: UShort? = null

   @SunSpecPoint(id="Frg30", label="", offset=35, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg30: UShort? = null

   @SunSpecPoint(id="Frg31", label="", offset=36, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg31: UShort? = null

   @SunSpecPoint(id="Frg32", label="", offset=37, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg32: UShort? = null

   @SunSpecPoint(id="Frg33", label="", offset=38, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg33: UShort? = null

   @SunSpecPoint(id="Frg34", label="", offset=39, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg34: UShort? = null

   @SunSpecPoint(id="Frg35", label="", offset=40, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg35: UShort? = null

   @SunSpecPoint(id="Frg36", label="", offset=41, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg36: UShort? = null

   @SunSpecPoint(id="Frg37", label="", offset=42, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg37: UShort? = null

   @SunSpecPoint(id="Frg38", label="", offset=43, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg38: UShort? = null

   @SunSpecPoint(id="Frg39", label="", offset=44, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg39: UShort? = null

   @SunSpecPoint(id="Frg40", label="", offset=45, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg40: UShort? = null

   @SunSpecPoint(id="Frg41", label="", offset=46, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg41: UShort? = null

   @SunSpecPoint(id="Frg42", label="", offset=47, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg42: UShort? = null

   @SunSpecPoint(id="Frg43", label="", offset=48, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg43: UShort? = null

   @SunSpecPoint(id="Frg44", label="", offset=49, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg44: UShort? = null

   @SunSpecPoint(id="Frg45", label="", offset=50, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg45: UShort? = null

   @SunSpecPoint(id="Frg46", label="", offset=51, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg46: UShort? = null

   @SunSpecPoint(id="Frg47", label="", offset=52, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg47: UShort? = null

   @SunSpecPoint(id="Frg48", label="", offset=53, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg48: UShort? = null

   @SunSpecPoint(id="Frg49", label="", offset=54, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg49: UShort? = null

   @SunSpecPoint(id="Frg50", label="", offset=55, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg50: UShort? = null

   @SunSpecPoint(id="Frg51", label="", offset=56, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg51: UShort? = null

   @SunSpecPoint(id="Frg52", label="", offset=57, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg52: UShort? = null

   @SunSpecPoint(id="Frg53", label="", offset=58, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg53: UShort? = null

   @SunSpecPoint(id="Frg54", label="", offset=59, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg54: UShort? = null

   @SunSpecPoint(id="Frg55", label="", offset=60, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg55: UShort? = null

   @SunSpecPoint(id="Frg56", label="", offset=61, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg56: UShort? = null

   @SunSpecPoint(id="Frg57", label="", offset=62, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg57: UShort? = null

   @SunSpecPoint(id="Frg58", label="", offset=63, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg58: UShort? = null

   @SunSpecPoint(id="Frg59", label="", offset=64, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg59: UShort? = null

   @SunSpecPoint(id="Frg60", label="", offset=65, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg60: UShort? = null

   @SunSpecPoint(id="Frg61", label="", offset=66, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg61: UShort? = null

   @SunSpecPoint(id="Frg62", label="", offset=67, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg62: UShort? = null

   @SunSpecPoint(id="Frg63", label="", offset=68, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg63: UShort? = null

   @SunSpecPoint(id="Frg64", label="", offset=69, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg64: UShort? = null

   @SunSpecPoint(id="Frg65", label="", offset=70, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg65: UShort? = null

   @SunSpecPoint(id="Frg66", label="", offset=71, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg66: UShort? = null

   @SunSpecPoint(id="Frg67", label="", offset=72, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg67: UShort? = null

   @SunSpecPoint(id="Frg68", label="", offset=73, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg68: UShort? = null

   @SunSpecPoint(id="Frg69", label="", offset=74, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg69: UShort? = null

   @SunSpecPoint(id="Frg70", label="", offset=75, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg70: UShort? = null

   @SunSpecPoint(id="Frg71", label="", offset=76, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg71: UShort? = null

   @SunSpecPoint(id="Frg72", label="", offset=77, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg72: UShort? = null

   @SunSpecPoint(id="Frg73", label="", offset=78, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg73: UShort? = null

   @SunSpecPoint(id="Frg74", label="", offset=79, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg74: UShort? = null

   @SunSpecPoint(id="Frg75", label="", offset=80, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg75: UShort? = null

   @SunSpecPoint(id="Frg78", label="", offset=81, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg78: UShort? = null

   @SunSpecPoint(id="Frg79", label="", offset=82, len=1, type="uint16",
                 description="",
                 notes="")
            
   var Frg79: UShort? = null

   @SunSpecPoint(id="Frg80", label="Frag80", offset=83, len=1, type="uint16",
                 description="Last word of this fragment",
                 notes="Last word of this fragment")
            
   var Frg80: UShort? = null

   @SunSpecPoint(id="Ts", label="Timestamp", offset=84, len=2, type="uint32",
                 description="Timestamp value is the number of seconds since January 1, 2000",
                 notes="Timestamp value is the number of seconds since January 1, 2000")
            
   var Ts: UInt? = null

   @SunSpecPoint(id="Ms", label="Milliseconds", offset=86, len=1, type="uint16",
                 description="Millisecond counter 0-999",
                 notes="Millisecond counter 0-999")
            
   var Ms: UShort? = null

   @SunSpecPoint(id="Seq", label="Sequence", offset=87, len=1, type="uint16",
                 description="Sequence number of request",
                 notes="Sequence number of request")
            
   var Seq: UShort? = null

   @SunSpecPoint(id="UID", label="UID", offset=88, len=1, type="uint16",
                 description="User ID for the request signature",
                 notes="User ID for the request signature")
            
   var UID: UShort? = null

   @SunSpecPoint(id="Role", label="Role", offset=89, len=1, type="uint16",
                 description="Signing key used 0-5",
                 notes="Signing key used 0-5")
            
   var Role: UShort? = null

   @SunSpecPoint(id="Alg", label="Algorithm", offset=90, len=0, type="enum16",
                 description="Algorithm used to compute the digital signature",
                 notes="Algorithm used to compute the digital signature")
            
   var Alg: Any? = null

   @SunSpecPoint(id="N", label="N", offset=91, len=1, type="uint16",
                 description="Number of registers to follow for the certificate",
                 notes="Number of registers to follow for the certificate")
            
   var N: UShort? = null

}

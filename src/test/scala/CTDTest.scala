package com.bb94.ctd
import org.scalatest._

class CTDTest extends FlatSpec with ShouldMatchers {
  "CTD.arTrespo" should "Necarasso Cryssesa mavar cenvon nema cenvosorenan eas trespo cenvosorenan ar doesgenyd" in {
    CTD.arTrespo("ener") should equal("ener")
    CTD.arTrespo("riala") should equal("jala")
    CTD.arTrespo("sia") should equal("ša")
    CTD.arTrespo("sylsire") should equal("šylšire")
    CTD.arTrespo("tia") should equal("ča")
    CTD.arTrespo("ytyr") should equal("yčyr")
    CTD.arTrespo("semiä") should equal("semia")
    CTD.arTrespo("mioros") should equal("mjoros")
    CTD.arTrespo("Eon ar syno nesmerio esmerto") should equal("Eon ar šyno nesmejo esmerto")
  }
}

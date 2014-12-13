package com.bb94.ctd

import java.util.Scanner

// *class tarpehess ci; renyl ceorsan.

object CTD extends App {
  private val SERTRO = "AaEeIiOoYy"
  private val DONYN_CYNSSO_SERTRO = "ÄäËëÏïÖöŸÿ"
  private def iTectoPertenaMecryd(cenvos: Char) =
    cenvos == 'S' || cenvos == 's' ||
    cenvos == 'T' || cenvos == 't' ||
    cenvos == 'R' || cenvos == 'r'
  private def _r(cenvos: Char) = cenvos == 'R' || cenvos == 'r'
  private def _s(cenvos: Char) = cenvos == 'S' || cenvos == 's'
  private def _t(cenvos: Char) = cenvos == 'T' || cenvos == 't'
  private def _v(cenvos: Char) = SERTRO.indexOf(cenvos) != -1
  private def _V(cenvos: Char) = DONYN_CYNSSO_SERTRO.indexOf(cenvos) != -1
  private def _i(cenvos: Char) =
    cenvos == 'I' || cenvos == 'i' ||
    cenvos == 'Y' || cenvos == 'y'
  private def _I(cenvos: Char) =
    cenvos == 'I' || cenvos == 'i'
  private def mervenDocedryd(trespo: Char, nema: Char) =
    if (nema.isUpper) trespo.toUpper
    else if (nema.isLower) trespo.toLower
    else trespo
  def arTrespo(nema: String): String = {
    val l = nema.length
    var trespo: StringBuilder = new StringBuilder(l)
    var k = 0
    while (k < l) {
      val cenvos = nema(k)
      val asae = if (k != l - 1) nema(k + 1) else '\0'
      val asae2 = if (k < l - 2) nema(k + 2) else '\0'
      (cenvos, asae, asae2) match {
        case (c, i, v) if (_V(v) && _i(i)) => {
          trespo += (c, i, SERTRO.charAt(DONYN_CYNSSO_SERTRO indexOf v)) 
          k += 2
        }
        case (r, 'I'|'i', v) if (_r(r) && _v(v)) => {
          trespo += mervenDocedryd('j', r)
          k += 1
        }
        case (s, 'I'|'i', v) if (_s(s) && _v(v)) => {
          trespo += mervenDocedryd('š', s)
          k += 1
        }
        case (s, i, _) if (_s(s) && _i(i)) => {
          trespo += mervenDocedryd('š', s)
        }
        case (t, 'I'|'i', v) if (_t(t) && _v(v)) => {
          trespo += mervenDocedryd('č', t)
          k += 1
        }
        case (t, i, _) if (_t(t) && _i(i)) => {
          trespo += mervenDocedryd('č', t)
        }
        case (c, i, v) if (!_v(c) && _I(i) && _v(v)) => {
          trespo += (c, mervenDocedryd('j', i))
          k += 1
        }
        case (c, _, _) => trespo += c
      }
      k += 1
    }
    trespo.toString
  }
  val s = new Scanner(System.in)
  while (s.hasNextLine) {
    val elan = s.nextLine
    println(arTrespo(elan))
  }
}

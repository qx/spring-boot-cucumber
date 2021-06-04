package io.tpd.springbootcucumber.sar

import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext


//class RunCukesTest
class BeforeAllTests : BeforeAllCallback {
//    var seat: NnSeat = NnSeat(0, 3)
//    var seat1: NnSeat = NnSeat(3, 2)
//    var seat2: NnSeat = NnSeat(2, 1)
//    var seat3: NnSeat = NnSeat(1, 0)
//    var seats = arrayListOf<NnSeat>(seat, seat1, seat2, seat3)
    var focus = 1
    var has_no_chi_peng_gang: Boolean = false
    var in_card = 0
    override fun beforeAll(context: ExtensionContext?) {
//        HuUtil.load(this.javaClass.classLoader)
//        seat.chi_list = mutableListOf();
////        seat.nn_an_gang_list = mapOf();
////        seat.nn_dian_gang_list = mapOf();
////        seat.nn_wan_gang_list = mapOf();
//        has_no_chi_peng_gang = NnAlgorithm.get_is_no_peng_gang_from_seat(seat)
    }
}

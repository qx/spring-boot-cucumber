package io.tpd.springbootcucumber.sar

import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext


//class RunCukesTest
class BeforeAllTests : BeforeAllCallback {
//    var seat: SarSeat = SarSeat(0, 3)
//    var seat1: SarSeat = SarSeat(3, 2)
//    var seat2: SarSeat = SarSeat(2, 1)
//    var seat3: SarSeat = SarSeat(1, 0)
//    var seats = arrayListOf<SarSeat>(seat, seat1, seat2, seat3)
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

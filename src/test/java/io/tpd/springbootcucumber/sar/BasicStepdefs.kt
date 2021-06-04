package io.tpd.springbootcucumber.sar

import io.cucumber.datatable.DataTable
import io.cucumber.java8.En
import io.cucumber.java8.Scenario
import org.junit.jupiter.api.Assertions

var lastInstance: SarStepdefs? = null

open class BasicStepdefs : En {
    //
    protected fun initData() {
    }
//    protected fun string2PokerNames(arg0: String): MutableList<String> = arg0.split(",") as MutableList<String>
//    fun string2SeatIndex(arg0: String): Int {
//        return arg0.split(",").get(1).toInt()
//    }
}

//
class SarStepdefs : BasicStepdefs() {
    //    private lateinit var seat: SarSeat
    init {
        DataTableType { entry: Map<String, Any?> ->
            var ma = entry["ma"]
            var base = entry["base"]
            var win = entry["win"]
            var players = entry["players"]
            var lian_gang = entry["lian_gang"]
            if (ma == null) {
                ma = 0
            }
            if (base == null) {
                base = 0
            }
            if (win == null) {
                win = 0
            }
            if (players == null) {
                players = 0
            }
            if (lian_gang == null) {
                lian_gang = 1
            }
//
            SarScore(
                entry["param1"] as String,
                (entry["param2"] as String).toInt(),
                (entry["param3"] as String).toInt(),
                (entry["param4"] as String).toInt(),
                (entry["param5"] as String).toInt(),
                (entry["result"] as String).toInt(),
                (entry["winner"] as String).toInt(),
                (entry["winPoint"] as String).toInt(),
            )
        }
//
        Before { scenario: Scenario ->
            Assertions.assertNotSame(this, lastInstance)
            lastInstance = this
//            seat = SarSeat(0, 1)
        }
//
        BeforeStep { scenario: Scenario ->
            Assertions.assertSame(this, lastInstance)
            lastInstance = this
        }
//
        AfterStep { scenario: Scenario ->
            Assertions.assertSame(this, lastInstance)
            lastInstance = this
        }
        After { scenario: Scenario ->
            Assertions.assertSame(this, lastInstance)
            lastInstance = this
        }
        Given("mm:") { majangTable: DataTable ->
//            HuUtil.load(this.javaClass.classLoader)
            val SarScore: List<SarScore> = majangTable.asList(SarScore::class.java)
            SarScore.forEach { majang ->
//                seat.cards = majang.hand_cards
//                val fan = majang.fan
//                val result = NnAlgorithm.check_nn_hu(
//                    seat, 0, true
//                )
//                val fanscore = fan?.let {
////                    NnAlgorithm.fan_string_to_score(
//                        it,
//                        majang.ma,
//                        majang.base,
//                        majang.players,
//                        majang.lian_gang
//                    )
//                }

//                Assertions.assertEquals(majang.win, fanscore)

            }
        }
    }
}


data class SarScore(
    val param1: String,
    val param2: Int,
    val param3: Int,
    val param4: Int,
    val param5: Int,
    val result: Int,
    val winner: Int,
    val winPoint: Int,
)
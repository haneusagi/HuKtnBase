import com.github.haneusagi.sample.HuCommon1
import com.github.haneusagi.sample.HuCommon2

fun main(args: Array<String>) {
    // プログラムに渡されたパラメータを表示する。
    println("パラメータの一覧を表示します。")
    args.forEach {
        println(it)
    }
    println("パラメータは以上です。")

    // hello world を評する。
    println("hello world.")
    HuCommon1.outMessage("hello world by HuCommon1.")
    HuCommon2.outMessage("hello world by HuCommon2.")
}
